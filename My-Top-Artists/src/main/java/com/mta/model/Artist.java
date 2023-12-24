package com.mta.model;

import java.util.List;

public class Artist {
	
	private String artistName;
	private String age;
	private String location;
	private String country;
	private List<String> topAlbumNames;
	private String netWorth;

	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getTopAlbumNames() {
		return topAlbumNames;
	}
	public void setTopAlbumNames(List<String> topAlbumNames) {
		this.topAlbumNames = topAlbumNames;
	}
	public String getNetWorth() {
		return netWorth;
	}
	public void setNetWorth(String netWorth) {
		this.netWorth = netWorth;
	}
}
