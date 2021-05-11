package com.bobsumsol.equitex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobsumsol.equitex.models.Subscriber;
import com.bobsumsol.equitex.repository.SubscriberRepository;

@Service
public class SubscriberService {
	@Autowired
	private SubscriberRepository srepo;
	
	public Subscriber register(Subscriber subscriber) {
		srepo.save(subscriber);
		return subscriber;
	}
	
	public Subscriber login(Subscriber subscriber) {
		return subscriber;
	}
	
	public Subscriber updateContacts(Subscriber subscriber) {
		Subscriber existingContact = srepo.findById(subscriber.getId()).orElse(null);
		existingContact.setName(subscriber.getName());
		existingContact.setPhone(subscriber.getPhone());
		existingContact.setEmail(subscriber.getEmail());
		existingContact.setAddress(subscriber.getAddress());
		existingContact.setCity(subscriber.getCity());
		return srepo.save(existingContact);
	}

}
