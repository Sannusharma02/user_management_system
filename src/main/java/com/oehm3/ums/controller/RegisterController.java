package com.oehm3.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping(value ="register")
	public ModelAndView register(RegisterDTO registerDTO) {
		registerService.register(registerDTO);
		return new ModelAndView("login","responseMsg","Registeration Successful");
	}

}
