import java.io.Serializable;

public class Subscriber implements Serializable {

    private String fName;
    private String lName;
    private String city;
    private String phone;

    public Subscriber(String fName, String lName, String city, String phone) {
        this.fName = fName;
        this.lName = lName;
        this.city = city;
        this.phone = phone;
    }

    public Subscriber(String text, String text1, String name, int parseInt) {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
