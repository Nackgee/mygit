package jp.ken.hotel.model;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class HotelDAO {
	@Autowired JdbcTemplate jdbcTemplate;
	
	private RowMapper<HotelDTO> dtoMapper = new BeanPropertyRowMapper<HotelDTO>(HotelDTO.class);
	
	public List<HotelDTO> masterList(){
		String sql = "select * from hotel";
		List<HotelDTO> Hlist = jdbcTemplate.query(sql, dtoMapper);
		
		return Hlist;
	}
	
	public List<HotelDTO> cateList(String cate){
		String sql = "select * from hotel where hotel_cat=?";
		Object[] parameters = {cate};
		
		try {
			List<HotelDTO> caList = jdbcTemplate.query(sql, parameters, dtoMapper);
			return caList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
	}
	
	   public HotelDTO hotelPage(String name) {
		      String sql = "select * from hotel where name = ?";
		      Object[] parameters = { name };
		      try {
		         HotelDTO hotelDTO = jdbcTemplate.queryForObject(sql, parameters, dtoMapper);
		         return hotelDTO;
		      } catch (Exception e) {
		         return null;
		      }
		   }
	

}
