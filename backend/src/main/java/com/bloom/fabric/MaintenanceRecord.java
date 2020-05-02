package com.bloom.fabric;

public class MaintenanceRecord {
	private String num;
	private String address;
	private String dong;
	private String ho;
	private String latitude;
	private String longitude;
	private String category; // 카테고리 [시설, 환경, 유지]
	private String details; // 상세 내용
	private String cost; // 발생 비용
	private String startDate; // 시작 날짜
	private String endDate; // 종료 날짜
	private String license;
	private String image; // 건물 사진 파일명
	private String createdAt;
	private String expiredAt;

	public MaintenanceRecord() {
	}

	public MaintenanceRecord(String num, String address, String dong, String ho, String latitude, String longitude,
			String category, String details, String cost, String startDate, String endDate, String license,
			String image, String createdAt, String expiredAt) {
		this.num = num;
		this.address = address;
		this.dong = dong;
		this.ho = ho;
		this.latitude = latitude;
		this.longitude = longitude;
		this.category = category;
		this.details = details;
		this.cost = cost;
		this.startDate = startDate;
		this.endDate = endDate;
		this.license = license;
		this.image = image;
		this.createdAt = createdAt;
		this.expiredAt = expiredAt;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getExpiredAt() {
		return expiredAt;
	}

	public void setExpiredAt(String expiredAt) {
		this.expiredAt = expiredAt;
	}

	@Override
	public String toString() {
		return "MaintenanceRecord{" + "num='" + num + '\'' + ", address='" + address + '\'' + ", dong='" + dong + '\''
				+ ", ho='" + ho + '\'' + ", latitude='" + latitude + '\'' + ", longitude='" + longitude + '\''
				+ ", category='" + category + '\'' + ", details='" + details + '\'' + ", cost='" + cost + '\''
				+ ", startDate='" + startDate + '\'' + ", endDate='" + endDate + '\'' + ", license='" + license + '\''
				+ ", image='" + image + '\'' + ", createdAt='" + createdAt + '\'' + ", expiredAt='" + expiredAt + '\''
				+ '}';
	}
}