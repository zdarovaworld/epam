package homework1234.travelagency_v1;

public class User {
    private Long id;
    private String name;
    private String lastName;
    private int serial;
    private int number;

    public User(String name, String lastName, int serial, int number) {
        this.name = name;
        this.lastName = lastName;
        this.serial = serial;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", serial=" + serial +
                ", number=" + number +
                '}';
    }
}
