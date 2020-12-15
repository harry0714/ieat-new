package com.harry.iLoveEat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harry.iLoveEat.entity.Administrator;
import com.harry.iLoveEat.object.HttpResponseEntity;
import com.harry.iLoveEat.repository.AdmRepository;

@RestController
public class AdmimistratorController {
	@Autowired
	AdmRepository admRepository;

	@RequestMapping(value = "/administrators", method = { RequestMethod.GET })
	@ResponseBody
	public HttpResponseEntity getAllAdministrator() {

		return HttpResponseEntity.result(admRepository.findAll());
	}

	@RequestMapping(value = "/admimistrator", method = { RequestMethod.POST })
	@ResponseBody
	public String addAdministrator(@RequestBody Administrator entity) {

		admRepository.save(entity);
		return "ok";
	}
}
