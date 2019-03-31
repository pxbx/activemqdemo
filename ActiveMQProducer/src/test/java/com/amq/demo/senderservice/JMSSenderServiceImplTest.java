/**
 * 
 */
package com.amq.demo.senderservice;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import javax.jms.JMSException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amq.demo.configuration.MessagingConfiguration;
import com.amq.demo.object.QueueObject;
import com.amq.demo.sender.MessageSender;

// TODO: Auto-generated Javadoc
/**
 * The Class JMSSenderServiceImplTest.
 *
 * @author pinak
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class JMSSenderServiceImplTest {
	
	/**
	 * The Class ContextConfig.
	 */
	@TestConfiguration
	static class ContextConfig {
		
		/**
		 * Jms sender service impl.
		 *
		 * @return the JMS sender service impl
		 */
		@Bean
		public JMSSenderServiceImpl jmsSenderServiceImpl() {
			return new JMSSenderServiceImpl();
		}
	}

	/** The jms sender service impl. */
	@Autowired
	JMSSenderServiceImpl jmsSenderServiceImpl;
	
	/** The message sender. */
	@MockBean
	MessageSender messageSender;
	
	/** The messaging configuration. */
	@MockBean
	MessagingConfiguration messagingConfiguration;

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		when(messagingConfiguration.jmsTemplate(any(String.class))).thenReturn(new JmsTemplate());
	}

	/**
	 * Test method for
	 * {@link com.amq.demo.senderservice.JMSSenderServiceImpl#sendMessage(com.amq.demo.object.QueueObject, java.lang.String)}.
	 */
	@Test(expected = Test.None.class)
	public final void testSendMessagePass() {
		doNothing().when(messageSender).sendMessage(any(QueueObject.class), any(String.class));
		jmsSenderServiceImpl.sendMessage(new QueueObject("id", "text"), "dummy.name");
	}

	/**
	 * Test send message fail.
	 */
	@Test(expected = Exception.class)
	public final void testSendMessageFail() {
		doThrow(JMSException.class).when(messageSender).sendMessage(any(QueueObject.class), any(String.class));
		jmsSenderServiceImpl.sendMessage(new QueueObject("id", "text"), "dummy.name");
	}
}
