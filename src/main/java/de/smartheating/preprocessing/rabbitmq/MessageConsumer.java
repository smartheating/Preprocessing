package de.smartheating.preprocessing.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.smartheating.SmartHeatingCommons.persistedData.Event;
import de.smartheating.preprocessing.services.PreprocessingService;

@Component
public class MessageConsumer {
	
	Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
	
	@Autowired
	PreprocessingService processingService;

	public void consumeEvent(Event event) {
		System.out.println("Consumed event with id: " + event.getId());
		processingService.processEvent(event);
	}
}
