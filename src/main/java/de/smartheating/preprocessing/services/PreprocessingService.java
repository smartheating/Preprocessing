package de.smartheating.preprocessing.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.smartheating.SmartHeatingCommons.persistedData.Event;
import de.smartheating.preprocessing.rabbitmq.MessageProducer;

@Service
public class PreprocessingService {
	
	Logger logger = LoggerFactory.getLogger(PreprocessingService.class);
	
	@Autowired
	MessageProducer messageProducer;

	public void processEvent(Event event) {
		logger.info("Preprocessing event with id: " + event.getId());
		// TODO: Do some preprocessing
		logger.info("Sending preprocessed event to planing via RabbitMQ");
		messageProducer.sendEvent(event);
	}
}
