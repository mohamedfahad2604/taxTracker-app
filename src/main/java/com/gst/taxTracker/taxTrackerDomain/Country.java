package com.gst.taxTracker.taxTrackerDomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String name;
	private double exchangeRate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", name=" + name + ", exchangeRate=" + exchangeRate + "]";
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(Long id, String code, String name, double exchangeRate) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.exchangeRate = exchangeRate;
	}
	
	

}
