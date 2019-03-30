package com.amq.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amq.demo.object.QueueObject;
import com.amq.demo.senderservice.JMSSenderService;
import com.amq.demo.util.ApplicationUtil;

@RestController
@RequestMapping("/application")
public class ApplicationController {

	@Autowired
	JMSSenderService jmsSenderService;

	@GetMapping(value = "/demo1", produces = MediaType.APPLICATION_JSON_VALUE)
	public String demoSendtoQ1() {
		System.out.println("CALLING DEMO 1");

		QueueObject object = ApplicationUtil.createQueueObject();

		System.out.println("SENDING QUEUEOBJECT -> " + object);

		jmsSenderService.sendMessage(object, "demo1");

		return "ENQUEUED -> ".concat("\n").concat(object.toString());
	}

	@GetMapping(value = "/demo2", produces = MediaType.APPLICATION_JSON_VALUE)
	public String demoSendtoQ2() {
		System.out.println("CALLING DEMO 2");

		QueueObject object = ApplicationUtil.createQueueObject();

		System.out.println("SENDING QUEUEOBJECT -> " + object);

		jmsSenderService.sendMessage(object, "demo2");

		return "ENQUEUED -> ".concat("\n").concat(object.toString());
	}
}
