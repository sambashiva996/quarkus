package com.temparatureservice.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.temparatureservice.model.Temperature;

import org.springframework.data.jpa.repository.JpaRepository;

@ApplicationScoped
public interface TemperatureRepository extends JpaRepository<Temperature, Integer> {

	public List<Temperature> findByTemparatureId(Integer temparatureId);

}
