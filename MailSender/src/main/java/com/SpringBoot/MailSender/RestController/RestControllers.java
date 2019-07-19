package com.SpringBoot.MailSender.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

	@Autowired
	private MailSenders sendMail;

	@RequestMapping("/send")
	public String homePage() {
		sendMail.sendingMail("kajanan16@gmail.com", "Welcome Gajanan Siva",
				"I drop a message for checking email features");
		return "Your email has been sent now";
	}
}
