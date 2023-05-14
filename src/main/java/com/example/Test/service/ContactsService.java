package com.example.Test.service;

import com.example.Test.models.Contacts;

import com.example.Test.repository.ContactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactsService {

    public final ContactsRepository contactsRepository;

    public ContactsService(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public List<Contacts> list() {
        return contactsRepository.findAll();
    }

    public void add(Contacts contacts) {
//        if (orderRepository.findUserByEmail(contacts.getEmail()).isPresent()){
//            throw new RestApiException("this email is already taken!");
//        }
        contactsRepository.save(contacts);
    }

    public void delete(Long projectId) {
        contactsRepository.deleteById(projectId);
    }

    public void update(Contacts contacts) {
        Optional<Contacts> row = contactsRepository.findById(contacts.getId());
        if (row.isPresent()) {
            Contacts item = row.get();
            if (!contacts.getName().isEmpty()){
                item.setName(contacts.getName());
            }
            if (!contacts.getEmail().isEmpty()){
                item.setEmail(contacts.getEmail());
            }
            if (contacts.getMessage() != null){
                item.setMessage(contacts.getMessage());
            }
            contactsRepository.save(item);
        }
    }
}
