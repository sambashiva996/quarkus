package com.temparatureservice.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.temparatureservice.model.Temperature;

@ApplicationScoped
public interface TemperatureService {

	public Temperature saveTemperature(Temperature temperature);

	public List<Temperature> getTemperature(Integer temperatureId);

}
