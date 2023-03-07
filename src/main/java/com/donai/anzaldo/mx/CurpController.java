package com.donai.anzaldo.mx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurpController {

	@GetMapping("/curp")
	public String consultarCurp() {
		return "index";
	}
}
