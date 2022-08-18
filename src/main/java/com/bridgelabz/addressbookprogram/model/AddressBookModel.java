package com.bridgelabz.addressbookprogram.model;

import com.bridgelabz.addressbookprogram.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "addressbook")
public class AddressBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;

    private LocalDateTime registerDate;
    private LocalDateTime updatedDate;
    private String emailId;
    private String password;

    public AddressBookModel(AddressBookDTO addressBookDTO) {
        this.firstName = addressBookDTO.getFirstName();
        this.lastName = addressBookDTO.getLastName();
        this.address = addressBookDTO.getAddress();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.phoneNumber = addressBookDTO.getPhoneNumber();
        this.zip = addressBookDTO.getZip();
        this.emailId = addressBookDTO.getEmailId();
        this.password = addressBookDTO.getPassword();
    }

    public AddressBookModel() {

    }
}
