/*
 * 
 */
package com.amq.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * The Class ApplicationConfiguration.
 */
@Configuration
@EnableConfigurationProperties
public class ApplicationConfiguration {
	
	/** The broker URL. */
	@Value("${application.configuration.activemq.url:http://some.dummy/burl}")
	String brokerURL;

	/**
	 * Gets the broker URL.
	 *
	 * @return the broker URL
	 */
	public String getBrokerURL() {
		return brokerURL;
	}

	/**
	 * Sets the broker URL.
	 *
	 * @param brokerURL the new broker URL
	 */
	public void setBrokerURL(String brokerURL) {
		this.brokerURL = brokerURL;
	}
}
