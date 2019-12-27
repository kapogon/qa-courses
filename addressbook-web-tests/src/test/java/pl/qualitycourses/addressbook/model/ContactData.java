package pl.qualitycourses.addressbook.model;

public class ContactData {
    private String firstName;
    private String lastName;
    private String address;
    private String mobilePhone;
    private String email;

    public ContactData(String firstName, String lastName, String address, String mobilePhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }
}
