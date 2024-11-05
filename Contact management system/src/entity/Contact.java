package entity;

public class Contact {

    private int id;
    private String name;
    private String email;
    private String PhoneNo;

    public Contact(int id, String name, String email, String phoneNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        PhoneNo = phoneNo;
    }

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", PhoneNo=" + PhoneNo +
                '}';
    }
}

