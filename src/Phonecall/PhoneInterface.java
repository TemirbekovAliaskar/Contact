package Phonecall;

import java.util.ArrayList;
import java.util.List;

public interface PhoneInterface {

    boolean turnOn(String pass,Phone phone);
    void call(int phoneNumber );
    void call(String name);
    void searchContact(String name);
    void updateName();
    void getAllContacts();
    void addContact(Contact contact,Phone phone);
}
