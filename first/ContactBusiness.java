package com.example.demo;



import java.util.ArrayList;
import java.util.List;
 
public class ContactBusiness {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("101","abc","abc@gmail.com"));
        listContact.add(new Contact("102","def","def@outlook.com"));
        listContact.add(new Contact("103", "ghi","ghi@yahoo.com"));
        listContact.add(new Contact("104","jkl", "jkl@gmail.com"));
         
        return listContact;
    }
}
