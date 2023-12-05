package Phonecall;

import java.util.List;

public class Contact {

    private int phoneNumber ;
    private String fullName;

    public Contact(int phoneNumber, String fullName) {
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
        public String toString() {
            return
                    "📞phoneNumber   :" + phoneNumber + "\n"+
                    "👨 fullName  +996 :" + fullName  +
                    '}';
        }
    }
