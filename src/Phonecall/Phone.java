package Phonecall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phone implements PhoneInterface {

    private String name;
    private String brand;
    private String password;
    private List<Contact> contacts;


    public Phone() {
    }

    public Phone(String name, String brand, String password, List<Contact> contacts) {
        this.name = name;
        this.brand = brand;
        this.password = password;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public boolean turnOn(String password,Phone phone) {

        try {
            if (phone.getPassword().equalsIgnoreCase(password)) {
                System.out.println("Welcome ! ");
                return true;
            } else throw new Exception("This not password !");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void call(int phoneNumber) {
        try {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getPhoneNumber() == (phoneNumber)){
                    System.out.println("Контакттын аты :"+contacts.get(i).getFullName());
                    System.out.println("Соединение 📳");
                   return;
                }
                if(i == contacts.size()) throw new Exception("Мындай номер жок ! ");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void call(String name) {

        try {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getFullName().equalsIgnoreCase(name)){
                    System.out.println("Ушул номерге "+contacts.get(i).getPhoneNumber()  +"   чалып жатасыз !");
                    System.out.println("Соединение 📳");
                }
                if (i == contacts.size())throw new Exception("Mындай Person жок !");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void searchContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().equalsIgnoreCase(name)){
                System.out.println("Сиз издеген адам : "+contacts.get(i));
            }
        }
    }

    @Override
    public void updateName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : ");
        String name = scanner.nextLine();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().equalsIgnoreCase(name)){
                System.out.println("New name : ");
                String newName = scanner.nextLine();
                contacts.get(i).setFullName(newName);
            }
        }
    }

    @Override
    public void getAllContacts() {
        for (Contact contact : contacts) {
            System.out.println("Баардык контакттар : "+contact);
        }
    }

    @Override
    public void addContact(Contact contact,Phone phone) {
        contacts.add(contact);
        System.out.println("Ийгиликтуу контакт кошулду ! ");

    }

    @Override
    public String toString() {
        return "<<<<<<<<< Phone >>>>>>>> " + "\n" +
                "name  :" + name + "\n" +
                " brand  :" + brand + "\n" +
                " password  :" + password + "\n" +
                " Баардык контакттар   >>>>>>>"+"\n" + contacts ;

    }
}
