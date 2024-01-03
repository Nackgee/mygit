package jp.ken.hotel.model;

import java.io.Serializable;

public class HotelDTO implements Serializable {
	
	private int hotel_id;
	
	private String name;
	private String address;
	private String phone_num;
	private String hotel_cat;
	
	private String originalfile1;
	private String savedfile1;
	
	private String originalfile2;
	private String savedfile2;
	
	private String originalfile3;
	private String savedfile3;
	
	private String short_com1;
	private String short_com2;
	private String long_com;
	
	
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getHotel_cat() {
		return hotel_cat;
	}
	public void setHotel_cat(String hotel_cat) {
		this.hotel_cat = hotel_cat;
	}
	public String getOriginalfile1() {
		return originalfile1;
	}
	public void setOriginalfile1(String originalfile1) {
		this.originalfile1 = originalfile1;
	}
	public String getSavedfile1() {
		return savedfile1;
	}
	public void setSavedfile1(String savedfile1) {
		this.savedfile1 = savedfile1;
	}
	public String getOriginalfile2() {
		return originalfile2;
	}
	public void setOriginalfile2(String originalfile2) {
		this.originalfile2 = originalfile2;
	}
	public String getSavedfile2() {
		return savedfile2;
	}
	public void setSavedfile2(String savedfile2) {
		this.savedfile2 = savedfile2;
	}
	public String getOriginalfile3() {
		return originalfile3;
	}
	public void setOriginalfile3(String originalfile3) {
		this.originalfile3 = originalfile3;
	}
	public String getSavedfile3() {
		return savedfile3;
	}
	public void setSavedfile3(String savedfile3) {
		this.savedfile3 = savedfile3;
	}
	public String getShort_com1() {
		return short_com1;
	}
	public void setShort_com1(String short_com1) {
		this.short_com1 = short_com1;
	}
	public String getShort_com2() {
		return short_com2;
	}
	public void setShort_com2(String short_com2) {
		this.short_com2 = short_com2;
	}
	public String getLong_com() {
		return long_com;
	}
	public void setLong_com(String long_com) {
		this.long_com = long_com;
	}
	
	
	
}