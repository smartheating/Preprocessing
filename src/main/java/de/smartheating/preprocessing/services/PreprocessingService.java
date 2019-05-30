package de.smartheating.preprocessing.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import de.smartheating.SmartHeatingCommons.persistedData.Event;

@Service
public class PreprocessingService {
	
	Logger logger = LoggerFactory.getLogger(PreprocessingService.class);

	public void processEvent(Event event) {
		logger.info("Preprocessing event with id: " + event.getId());
	}
}
