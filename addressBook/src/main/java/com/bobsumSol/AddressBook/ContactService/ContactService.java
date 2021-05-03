package com.bobsumSol.AddressBook.ContactService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobsumSol.AddressBook.ContactRepository.ContactRepository;
import com.bobsumSol.AddressBook.Contacts.Contacts;

@Service
public class ContactService {
	@Autowired
	private ContactRepository repo;
	
	public Contacts saveContact(Contacts contact) {
		return repo.save(contact);
	}
	
	public List<Contacts> saveContacts(List<Contacts> contacts) {
		return repo.saveAll(contacts);
	}
	
	public List<Contacts> getContacts() {
		return repo.findAll();
		
	}
	
	public Contacts getContactById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public Contacts getContactByfirstname(String fName) {
		return repo.findByfirstname(fName).orElse(null);
		
	}
	
	public String deleteContactById(int id) {
		repo.deleteById(id);
		return "Deleted" + id;
		
	}
	
	public Contacts updateContacts(Contacts contact) {
		Contacts existingContact = repo.findById(contact.getId()).orElse(null);
		existingContact.setFirstname(contact.getFirstname());
		existingContact.setLastname(contact.getLastname());
		existingContact.setPhoneNumber(contact.getPhoneNumber());
		existingContact.setEmail(contact.getEmail());
		existingContact.setAddress(contact.getAddress());
		existingContact.setCity(contact.getCity());
		return repo.save(existingContact);
	}
}
