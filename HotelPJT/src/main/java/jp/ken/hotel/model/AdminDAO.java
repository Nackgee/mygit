package jp.ken.hotel.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class AdminDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<AdminDTO> adminMapper = new BeanPropertyRowMapper<AdminDTO>(AdminDTO.class);
	private RowMapper<HotelDTO> hotelMapper = new BeanPropertyRowMapper<HotelDTO>(HotelDTO.class);

   public AdminDTO checkAdmin(AdminDTO admin) {
	  try {
		  String sql = "select * from admin where admin_id=? and password = ?";
	      Object[] parameter = { admin.getAdmin_id(), admin.getPassword() };
	      AdminDTO result = jdbcTemplate.queryForObject(sql, parameter, adminMapper);
	      return result;
		   
	  } catch (Exception e) {
		  return null;
	  }
      
   }
   
   public int delet(String name) {
	   String sql = "delete from hotel where name = ?";
	   Object[] parameter = {name};
	   
	   int result = jdbcTemplate.update(sql, parameter);
	   
	   return result;
   }
   
   
   
   public HotelDTO addHotel(HotelDTO hotelDTO, MultipartFile file1, MultipartFile file2,
	         MultipartFile file3) {
	      String sql = "INSERT INTO hotel (name, address, phone_num, hotel_cat, " +
	            "originalfile1, savedfile1, originalfile2, savedfile2, " +
	            "originalfile3, savedfile3, short_com1, short_com2, long_com) " +
	            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	      Object[] parameters = {
	            hotelDTO.getName(),
	            hotelDTO.getAddress(),
	            hotelDTO.getPhone_num(),
	            hotelDTO.getHotel_cat(),
	            hotelDTO.getOriginalfile1(),
	            hotelDTO.getSavedfile1(),
	            hotelDTO.getOriginalfile2(),
	            hotelDTO.getSavedfile2(),
	            hotelDTO.getOriginalfile3(),
	            hotelDTO.getSavedfile3(),
	            hotelDTO.getShort_com1(),
	            hotelDTO.getShort_com2(),
	            hotelDTO.getLong_com()
	      };
	      try {
	         int result = jdbcTemplate.update(sql, parameters);
	         if (result == 1) {
	            String sql2 = "SELECT * FROM hotel WHERE name = ?";
	            Object[] parameters2 = { hotelDTO.getName() };
	            HotelDTO dto2 = jdbcTemplate.queryForObject(sql2, parameters2, hotelMapper);

	            // 파일 업로드 처리
	            handleFileUpload(dto2, file1, file2, file3);
	            System.out.println(hotelDTO.getOriginalfile1());
	            return dto2;
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      return null;
	   }

	   private void handleFileUpload(HotelDTO hotelDTO, MultipartFile file1, MultipartFile file2,
	         MultipartFile file3) throws IOException {
	      System.out.println("file exist");
	      String uploadsDir = "/HotelPJT/src/main/webapp/resources/img/";

	      // 각 파일의 원본 파일 이름 및 저장 파일 이름 설정
	      String fileName1 = StringUtils.cleanPath(file1.getOriginalFilename());
	      String fileName2 = StringUtils.cleanPath(file2.getOriginalFilename());
	      String fileName3 = StringUtils.cleanPath(file3.getOriginalFilename());
	      System.out.println(fileName1);
	      System.out.println(fileName2);
	      System.out.println(fileName3);


	      String savedFileName1 = UUID.randomUUID().toString() + "_" + fileName1;
	      String savedFileName2 = UUID.randomUUID().toString() + "_" + fileName2;
	      String savedFileName3 = UUID.randomUUID().toString() + "_" + fileName3;

	      // 각 파일에 대해 따로 저장
	      OutputStream outputStream1 = new FileOutputStream(uploadsDir + savedFileName1);
	    	  IOUtils.copy(file1.getInputStream(), outputStream1);
	      
	      
	      OutputStream outputStream2 = new FileOutputStream(uploadsDir + savedFileName2);
	         IOUtils.copy(file2.getInputStream(), outputStream2);
	      

	      OutputStream outputStream3 = new FileOutputStream(uploadsDir + savedFileName3);
	         IOUtils.copy(file3.getInputStream(), outputStream3);
	      

	      // 각 파일의 정보를 DTO에 설정
	      hotelDTO.setOriginalfile1(fileName1);
	      hotelDTO.setSavedfile1(savedFileName1);

	      hotelDTO.setOriginalfile2(fileName2);
	      hotelDTO.setSavedfile2(savedFileName2);

	      hotelDTO.setOriginalfile3(fileName3);
	      hotelDTO.setSavedfile3(savedFileName3);
	   }
   
   
   


}
