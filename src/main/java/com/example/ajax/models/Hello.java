package com.example.ajax.models;

import java.net.UnknownHostException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hello {

	public String hello;

	public Hello() {
		java.net.InetAddress localMachine;
		try {
			localMachine = java.net.InetAddress.getLocalHost();
			hello = "Hostname of local machine: " + localMachine.getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			hello = "Hostname of local machine: null";
		}
	}

}
