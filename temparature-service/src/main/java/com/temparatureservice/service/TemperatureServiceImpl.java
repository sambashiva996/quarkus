package com.temparatureservice.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.temparatureservice.model.Temperature;
import com.temparatureservice.repository.TemperatureRepository;
import com.temparatureservice.service.TemperatureService;

@ApplicationScoped
@Transactional
public class TemperatureServiceImpl implements TemperatureService {

	@Inject
	public TemperatureRepository temperatureRepository;
	
	public Temperature saveTemperature(Temperature temperature) {
		
		Temperature saveTemp = temperatureRepository.save(temperature);
		return saveTemp;
	}
	
	public List<Temperature> getTemperature(Integer temperatureId) {
		
		List<Temperature> findByTemperatureId = temperatureRepository.findByTemparatureId(temperatureId);
		return findByTemperatureId;
	}

}
