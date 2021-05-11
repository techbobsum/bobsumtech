package com.bobsumsol.equitex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobsumsol.equitex.models.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
	public Subscriber findByEmail(String email);
}
