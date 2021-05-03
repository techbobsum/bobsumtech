package com.bobsumSol.AddressBook.ContactController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bobsumSol.AddressBook.ContactService.ContactService;
import com.bobsumSol.AddressBook.Contacts.Contacts;

@RestController
public class ContactController {
	@Autowired
	private ContactService service;
	
	@GetMapping("/allContacts")
	public List<Contacts> getContacts(){
		return service.getContacts();
	}
	
	@GetMapping("/Contact/{id}")
	public Contacts getContact(@PathVariable Integer id) {
		return service.getContactById(id);
	}
	
	@GetMapping("/Contacts/{fName}")
	public Contacts get(@PathVariable String fName) {
		return service.getContactByfirstname(fName);
		}
	@PostMapping("/addContact")
	public Contacts addContact(@RequestBody Contacts contact){
		return service.saveContact(contact);
		
	}
	
	@PostMapping("/addContacts")
	public List<Contacts> addContacts(@RequestBody List<Contacts> contacts){
		return service.saveContacts(contacts);
	}
	
	@PutMapping("/update/{id}")
	public Contacts updateContact(@RequestBody Contacts contact) {
		return service.updateContacts(contact);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteContacts(@PathVariable Integer id) {
		return service.deleteContactById(id);
	}
		
	
}
