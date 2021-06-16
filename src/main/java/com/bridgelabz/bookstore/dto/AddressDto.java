package com.bridgelabz.bookstore.dto;

import lombok.Data;

@Data
public class AddressDto {
		private String address;
		private String locality;
		private String name;
		private String city;
		private String landmark;
		private String state;
		private String pincode;
		private String country;
		private String type;
		private String phoneNumber;
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getLocality() {
			return locality;
		}
		public void setLocality(String locality) {
			this.locality = locality;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
		/*public void setCity(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setCountry(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setState(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setType(String string) {
			// TODO Auto-generated method stub
			
		}
		public String getLocality() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getAddress() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getCountry() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getState() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getPincode() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getType() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getPhoneNumber() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getLandmark() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setLandmark(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setLocality(String string) {
			// TODO Auto-generated method stub
			
		}*/
}