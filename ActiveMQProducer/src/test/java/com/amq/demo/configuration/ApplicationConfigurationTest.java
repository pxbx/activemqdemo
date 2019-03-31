package com.amq.demo.configuration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationConfigurationTest {

	@TestConfiguration
	static class ContextConfig {
		@Bean
		public ApplicationConfiguration applicationConfiguration() {
			return new ApplicationConfiguration();
		}
	}
	
	@Autowired
	ApplicationConfiguration applicationConfiguration;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		//do nothing
	}

	@Test
	public final void test() {
		assertNotNull(applicationConfiguration.getBrokerURL());
		applicationConfiguration.setBrokerURL("http://dummy.url:1111");
		assertEquals("http://dummy.url:1111", applicationConfiguration.getBrokerURL());
	}

}
