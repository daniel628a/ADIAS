package com.example.principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {

	 @GetMapping("/hola")
	    public String holaMundo() {
	        return "Hola Mundo";
	    }
	
}
