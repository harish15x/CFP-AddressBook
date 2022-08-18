package com.bridgelabz.addressbookprogram.controller;


import com.bridgelabz.addressbookprogram.dto.AddressBookDTO;
import com.bridgelabz.addressbookprogram.model.AddressBookModel;
import com.bridgelabz.addressbookprogram.service.IAddressBookService;
import com.bridgelabz.addressbookprogram.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    IAddressBookService addressBookService;

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to Address Book Spring application";
    }

    @PostMapping("addcontact")
    public AddressBookModel addContact(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.addContact(addressBookDTO);
    }

    @PutMapping("updatecontact/{id}")
    public AddressBookModel updateContact(@PathVariable Long id, @RequestBody AddressBookDTO addressBookDTO, @RequestHeader String token) {
        return addressBookService.updateContact(id, addressBookDTO, token);
    }

    @GetMapping("getcontacts")
    public List<AddressBookModel> getContacts(@RequestHeader String token) {
        return addressBookService.getContacts(token);
    }

    @DeleteMapping("deletecontact/{id}")
    public AddressBookModel deleteContact(@PathVariable Long id, @RequestHeader String token) {
        return addressBookService.deleteContact(id, token);
    }

    @GetMapping("getcontact/{id}")
    public AddressBookModel getContact(@PathVariable Long id, @RequestHeader String token) {
        return addressBookService.getContact(id, token);
    }

    @PostMapping("/login")
    public ResponseUtil login(@RequestParam String emailId, @RequestParam String password) {
        return addressBookService.login(emailId, password);
    }

}

