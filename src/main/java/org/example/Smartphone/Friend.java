package org.example.Smartphone;

public class Friend extends Contact{
    private long phoneNumber;

    Friend(){
        super();
    }
    public Friend(String name, long phoneNumber){
        this.phoneNumber = phoneNumber;
        super.name = name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
