package com.example.Test.controllers;

import com.example.Test.models.Contacts;
import com.example.Test.service.ContactsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping(path = "v1/atelier/contacts")
public class ContactsController {
    private final ContactsService contactsService;

    public ContactsController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @GetMapping(path = "/list")
    public List<Contacts> list() {
        return contactsService.list();
    }

    @PostMapping(path = "/item")
    public void add(@RequestBody Contacts contacts) {
        contactsService.add(contacts);
    }

    @DeleteMapping(path = "/item/{contactsId}")
    public void delete(@PathVariable Long contactsId) {
        contactsService.delete(contactsId);
    }

    @PutMapping(path = "/item")
    public void update(@RequestBody Contacts contacts) {
        contactsService.update(contacts);
    }

}
