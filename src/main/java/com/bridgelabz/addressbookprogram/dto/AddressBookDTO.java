package com.bridgelabz.addressbookprogram.dto;

import lombok.Data;

@Data
public class AddressBookDTO {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long phoneNumber;
    private int zip;
    private String emailId;
    private String password;
}

