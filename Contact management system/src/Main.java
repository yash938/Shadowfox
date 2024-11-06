import Service.ContactService;
import entity.Contact;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactService contactService = new ContactService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. update Contacts");
            System.out.println("3. delete Contact");
            System.out.println("4. view Contact");
            System.out.println("5. Search Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice){
                case 1:
                    System.out.println("Enter your id");
                    int id = sc.nextInt();

                    System.out.println("Enter your name");
                    String name = sc.next();

                    System.out.println("Enter your email");
                    String email = sc.next();

                    System.out.println("Enter your phone no");
                    String PhoneNo = sc.next();


                    contactService.AddContact(id,name,email,PhoneNo);

                    break;

                case 2:
                    System.out.println("Enter the name in your contact to update");
                    String newName = sc.next();

                    System.out.println("Enter your email id");
                    String newEmail = sc.next();

                    System.out.println("Enter your phone no");
                    String newPhoneNo = sc.next();


                    contactService.updateContact(newName,newEmail,newPhoneNo);
                    break;



                case 3:
                    System.out.print("Enter the name of the contact to delete: ");
                    String deleteName = sc.nextLine();
                    contactService.deleteContact(deleteName);
                    break;


                case 4:
                    contactService.ShowAllContact();
                    break;

                case 5:
                    System.out.print("Enter search query: ");
                    String query = sc.nextLine();
                    List<Contact> foundContacts = contactService.searchContacts(query); // Implement this method
                    for (Contact contact : foundContacts) {
                        System.out.println(contact);
                    }
                    break;


                case 6:
                    System.out.println("Exiting ....");
                    break;


                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice != 5);

          sc.close();
    }
}