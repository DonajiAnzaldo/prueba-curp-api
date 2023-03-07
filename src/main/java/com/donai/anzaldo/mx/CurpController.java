package com.donai.anzaldo.mx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//importaciones de la API
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Controller
public class CurpController {

	@GetMapping("/curp")
	public String consultarCurp() {
		return "index";
	}

	@GetMapping("/curpAPI")
	public String consultarAPI() {
		return "curpAPI";
	}
}
