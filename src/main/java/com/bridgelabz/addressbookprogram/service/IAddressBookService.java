package com.bridgelabz.addressbookprogram.service;

import com.bridgelabz.addressbookprogram.dto.AddressBookDTO;
import com.bridgelabz.addressbookprogram.model.AddressBookModel;
import com.bridgelabz.addressbookprogram.util.ResponseUtil;

import java.util.List;

public interface IAddressBookService {

    AddressBookModel addContact(AddressBookDTO addressBookDTO);

    AddressBookModel updateContact(Long id, AddressBookDTO addressBookDTO, String token);

    List<AddressBookModel> getContacts(String token);

    AddressBookModel deleteContact(Long id, String token);

    AddressBookModel getContact(Long id, String token);

    ResponseUtil login(String emailId, String password);
}