package com.restapibest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CoolieController {

	@RequestMapping(value = "/coolies", method = RequestMethod.GET)
	@ResponseBody
	public String getAllCoolies() {
		return "OK";
	}

	@RequestMapping(value = "/coolies/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getCoolie(@PathVariable("id") long coolieID,@RequestParam("name") String coolieName) {
		return "OK" + coolieID + " name " + coolieName;
	}

	@RequestMapping(value = "/coolies", method = RequestMethod.POST)
	@ResponseBody
	public String postCoolie() {
		return "OK";
	}

	@RequestMapping(value = "/coolies", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteCoolie() {
		return "OK";
	}

	@RequestMapping(value = "/coolies", method = RequestMethod.PUT)
	@ResponseBody
	public String putCoolie() {
		return "OK";
	}

	@RequestMapping(value = "*")
	@ResponseBody
	public String invalidRequest() {
		return "Invalid Request";
	}

}
