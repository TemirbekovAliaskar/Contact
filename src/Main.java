import Phonecall.Contact;
import Phonecall.Phone;
import Phonecall.PhoneInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        List<Contact> list = new ArrayList<>(Arrays.asList(
                new Contact(500505050,"Mirlan"),
                new Contact(700505050,"Erlan"),
                new Contact(700777777,"Argen"),
                new Contact(777777777,"Adis"),
                new Contact(200505050,"Jigit")
        ));

        Phone phone =  new Phone("Samsung","S23","1010",list);

        while (true){
            System.out.print("Password : ");
            if (phone.turnOn(new Scanner(System.in).nextLine(), phone)){
                System.out.println(phone);
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
                method(phone);
            }
        }
        }
        public static void method(Phone phone){
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("""
                     
                    1. Номер аркылуу чалуу
                    2. Аты аркылуу чалуу
                    3. Контакт издоо
                    4. Атын озгортуу
                    5. Баардык контакттар
                    6. Контакт кошуу
                    0. Контакттан чыгуу
                     """);

            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Номер менен чалуу : ");
                    phone.call(new Scanner(System.in).nextInt());
                }
                case "2" -> {
                    System.out.println("Аты менен чалуу  : ");
                    phone.call(new Scanner(System.in).nextLine());
                }
                case "3" ->{
                    System.out.println("Аты менен контакт издоо  А до Я : ");
                    phone.searchContact(new Scanner(System.in).nextLine());
                }
                case "4" ->{
                    phone.updateName();
                }
                case "5" ->{
                    phone.getAllContacts();
                }
                case "6" ->{
                    System.out.println("Жаны контакт кошуу аты жана номери ");
                    System.out.println("Аты :");
                    String name= scanner.nextLine();
                    System.out.println("Number : ");
                    int num = scanner.nextInt();
                    Contact contact = new Contact(num,name);
                    phone.addContact(contact,phone);
                }
                case "0" -> {return;}

            }
        }
        }
    }
