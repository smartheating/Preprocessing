package de.smartheating.preprocessing.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.smartheating.SmartHeatingCommons.persistedData.Event;
import de.smartheating.preprocessing.configuration.RabbitMQConfig;
import de.smartheating.preprocessing.rabbitmq.MessageProducer;

@Component
public class MessageProducer {

	Logger logger = LoggerFactory.getLogger(MessageProducer.class);
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendEvent(Event event) {
		logger.info("Publishing event to rabbitmq");
		rabbitTemplate.convertAndSend(RabbitMQConfig.RABBITMQ_SENDING_EXCHANGE, RabbitMQConfig.RABBITMQ_SENDING_ROUTINGKEY, event);
	}
}
