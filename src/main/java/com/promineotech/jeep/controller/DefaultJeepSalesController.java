package com.promineotech.jeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.service.JeepSalesService;

import lombok.extern.slf4j.Slf4j;

//Have to have RestController annotation inside implementing class otherwise it won't work in interface
@RestController	
// Slf4j is a lombok logger annotation
@Slf4j
public class DefaultJeepSalesController implements JeepSalesController {
	
	@Autowired
	private JeepSalesService jeepSalesService;

	@Override
	public List<Jeep> fetchJeeps(JeepModel model, String trim) {
		log.info("model={}, trim={}", model, trim);
		return jeepSalesService.fetchJeeps(model, trim);
	}

}
