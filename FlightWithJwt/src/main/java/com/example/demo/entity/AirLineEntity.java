package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AirLineEntity {
	

	

		@Id
		//@Column
		//@GeneratedValue(strategy = GenerationType.AUTO)
		private Long aid;
		
		@Column(name="airline_name")
		private String name;
		
		@Column(name="code")
		private String code;
		
		private String operationType;  //Domestic / International
		
		private String country;

		public Long getAId() {
			return aid;
		}

		public void setAId(Long aid) {
			this.aid = aid;
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
			return "AirLineEntity [aid=" + aid + ", name=" + name + ", code=" + code + ", operationType=" + operationType
					+ ", country=" + country + "]";
		}

	}


