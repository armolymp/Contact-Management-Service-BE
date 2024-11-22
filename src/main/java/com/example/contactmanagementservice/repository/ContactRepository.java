package com.example.contactmanagementservice.repository;

import com.example.contactmanagementservice.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
