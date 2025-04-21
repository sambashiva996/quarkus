package com.temparatureservice.model;

import javax.persistence.*;

@Entity(name = "TEMPERATURE")
public class Temperature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEMP_SEQ_ID")
	private int id;
	private int temperatureId;
	private String temperatureValue;
	private String temperatureLevel;
}