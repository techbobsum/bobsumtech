package com.bobsumSol.AddressBook.ContactRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobsumSol.AddressBook.Contacts.Contacts;


public interface ContactRepository extends JpaRepository<Contacts, Integer> {

	Optional<Contacts> findByfirstname(String fName);
	

}
