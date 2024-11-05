package Service;


import entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<Contact> contactList = new ArrayList<>();

    public void AddContact(int id,String name,String email,String PhoneNo){
        Contact contact = new Contact();
        contact.setId(id);
        contact.setName(name);
        contact.setEmail(email);
        contact.setPhoneNo(PhoneNo);

        contactList.add(contact);
        System.out.println("Contact created successfully !! "+contact.getName());
    }


    public void updateContact(String name,String email,String PhoneNo){
        boolean contactFound = false;

        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setEmail(email);  // Update the email
                contact.setPhoneNo(PhoneNo);  // Update the phone number
                contactFound = true;
                System.out.println("Contact updated successfully! Name: " + contact.getName());
                break;
            }
        }

        if (!contactFound) {
            System.out.println("Contact with the name \"" + name + "\" not found.");
        }
    }


    public void deleteContact(String name) {
        boolean isRemoved = contactList.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        if (isRemoved) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }


    public List<Contact> searchContacts(String query) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getName().contains(query) || contact.getEmail().contains(query) || String.valueOf(contact.getPhoneNo()).contains(query)) {
                results.add(contact);
            }
        }
        return results;
    }


    public void ShowAllContact(){
        if(contactList.isEmpty()){
            System.out.println("No contact Available");
        }
        else{
            for(Contact contact : contactList){
                System.out.println(contact);
            }
        }
    }




}
