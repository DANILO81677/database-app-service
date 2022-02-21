package com.oracle.java.databaseappservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.java.databaseappservice.model.response.GetDatabaseAppServiceResponse;
import com.oracle.java.databaseappservice.service.GetDatabaseAppService;

@RestController
@RequestMapping(path = "/api/v1")
public class DatabaseAppServiceController {
	
	@Autowired
	private GetDatabaseAppService findDataBaseService;
	
	
	@RequestMapping(path = "/passagens/get", method = RequestMethod.POST)
	public GetDatabaseAppServiceResponse getPassagems (){
		GetDatabaseAppServiceResponse response = new GetDatabaseAppServiceResponse();
		try {
		response = findDataBaseService.execute();
		return response;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
