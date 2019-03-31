/**
 * 
 */
package com.amq.demo.sender;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amq.demo.configuration.MessagingConfiguration;
import com.amq.demo.object.QueueObject;

@RunWith(SpringJUnit4ClassRunner.class)
public class MessageSenderTest {

	/**
	 * Test method for
	 * {@link com.amq.demo.sender.MessageSender#sendMessage(com.amq.demo.object.QueueObject, java.lang.String)}.
	 */

	@TestConfiguration
	static class ContextConfig {
		@Bean
		public MessageSender messageSender() {
			return new MessageSender();
		}
	}

	/** The message sender. */
	@Autowired
	MessageSender messageSender;
	@MockBean
	MessagingConfiguration messagingConfiguration;
	@Mock
	JmsTemplate jmsTemplate;

	@Test
	public final void testSendMessage() {
		when(messagingConfiguration.jmsTemplate(any(String.class))).thenReturn(jmsTemplate);
		messageSender.sendMessage(new QueueObject("id", "text"), "dummy.name");
	}

}
