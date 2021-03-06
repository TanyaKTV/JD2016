package by.it.kust.jd03_04.my_project.java.beans;

/**
 * Created by Tanya Kust.
 */
public class User {
    private int id;
    private String name;
    private String login;
    private String password;
    private String email;
    private String address;
    private int discount;
    private int fk_Role;

    public User() {
    }

    public User(int id, String name, String login, String password, String email, String address, int discount, int fk_Role) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.address = address;
        this.discount = discount;
        this.fk_Role = fk_Role;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getFk_Role() {
        return fk_Role;
    }

    public void setFk_Role(int fk_Role) {
        this.fk_Role = fk_Role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (discount != user.discount) return false;
        if (fk_Role != user.fk_Role) return false;
        if (!name.equals(user.name)) return false;
        if (!login.equals(user.login)) return false;
        if (!password.equals(user.password)) return false;
        if (!email.equals(user.email)) return false;
        return address.equals(user.address);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + discount;
        result = 31 * result + fk_Role;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", discount=" + discount +
                ", fk_Role=" + fk_Role +
                '}';
    }
}
