/**
 * 
 */
package com.vyom.rdo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vyomrastogi
 *
 */
@RestController
public class RemoteDevOpsController {

	/**
	 * Hello world.
	 *
	 * @param username the username
	 * @return the string
	 */
	@RequestMapping(value = "/helloWorld/{username}", method = RequestMethod.GET)
	public String helloWorld(@PathVariable String username) {
		return "Hello " + username + "! - sample spring-boot-app-engine-contract.";

	}

}
