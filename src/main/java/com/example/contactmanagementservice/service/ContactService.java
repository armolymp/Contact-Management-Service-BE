package com.example.contactmanagementservice.service;

import com.example.contactmanagementservice.model.Contact;
import com.example.contactmanagementservice.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Long id, Contact updatedContact) {
        Optional<Contact> optionalContact = contactRepository.findById(id);

        if (optionalContact.isPresent()) {
            Contact contact = optionalContact.get();
            contact.setFirstName(updatedContact.getFirstName());
            contact.setLastName(updatedContact.getLastName());
            contact.setEmail(updatedContact.getEmail());
            contact.setPhoneNumber(updatedContact.getPhoneNumber());
            return contactRepository.save(contact);
        } else {
            throw new RuntimeException("Contact not found with id: " + id);
        }
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
