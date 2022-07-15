package com.example.demo.entity;


public class AirLineEntity {
	
	private Long id;
	
	//@Column(name="airline_name")
	private String name;
	
	//@Column(name="code")
	private String code;
	
	private String operationType;  //Domestic / International
	
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AirLineEntity [id=" + id + ", name=" + name + ", code=" + code + ", operationType=" + operationType
				+ ", country=" + country + "]";
	}

}
