package jp.ken.hotel.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<UserDTO> dtoMapper = new BeanPropertyRowMapper<UserDTO>(UserDTO.class);
	
	public UserDTO login(UserDTO userDto) {
		String sql = "select * from user where email=? and phone_num=?";
		Object[] parameter = {userDto.getEmail(), userDto.getPhone_num()};
		
		try {
			UserDTO user = jdbcTemplate.queryForObject(sql, parameter, dtoMapper);
			
			return user;
			
		} catch (Exception e) {
			return null;
		}
	}
	
	public UserDTO join(UserDTO dto) {
		String sql = "insert into user (email, name, gender, birthday, phone_num) "
				+ "values(?,?,?,?,?)";
		
		Object[] parameter = {dto.getEmail(), dto.getName(), dto.getGender(), dto.getBirthday(), dto.getPhone_num()};
		
		UserDTO empty = new UserDTO();
		
		// 공부를 위해서 일부러 더 어렵고 복잡하게 작성
		
		try {
			int result = jdbcTemplate.update(sql, parameter);
			
			if(result == 1) {
				String sql2 = "select * from user where email=?";
				Object[] parameter2 = {dto.getEmail()};
				empty = jdbcTemplate.queryForObject(sql2, parameter2, dtoMapper);
				
				return empty;
				
			}
		} catch (DuplicateKeyException e) {
			return empty;
		}
		return empty;
	}
	
	
	public int modify(UserDTO dto) {
		String sql = "update user set email=?, name=?, gender=?, birthday=?, phone_num=? "
				+ "where user_id=?";
		Object[] parameter = {dto.getEmail(), dto.getName(), dto.getGender(), dto.getBirthday(), 
							  dto.getPhone_num(), dto.getUser_id()};
		try {
			int result = jdbcTemplate.update(sql, parameter);	
			return result;
		}
		catch (Exception e) {
			return 0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
