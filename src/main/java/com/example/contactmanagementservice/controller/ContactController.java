package com.example.contactmanagementservice.controller;

import com.example.contactmanagementservice.model.Contact;
import com.example.contactmanagementservice.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        logger.info("Received request to fetch all contacts");
        List<Contact> contacts = contactService.getAllContacts();
        logger.debug("Fetched {} contacts", contacts.size());
        return contacts;
    }

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        logger.info("Received request to create a new contact: {}", contact);
        Contact createdContact = contactService.createContact(contact);
        logger.debug("Contact created successfully with ID: {}", createdContact.getId());
        return createdContact;
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable Long id, @RequestBody Contact contact) {
        logger.info("Received request to update contact with ID: {}", id);
        Contact updatedContact = contactService.updateContact(id, contact);
        logger.debug("Contact updated successfully with ID: {}", updatedContact.getId());
        return updatedContact;
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        logger.info("Received request to delete contact with ID: {}", id);
        contactService.deleteContact(id);
        logger.debug("Contact with ID: {} deleted successfully", id);
    }
}
