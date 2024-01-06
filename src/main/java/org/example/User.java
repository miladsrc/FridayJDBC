package org.example;

public class User {

    private int id;
    private String firstName;
    private String astName;
    private String username;
    private String password;

    public User() {
    }

    public User(int id, String firstName, String astName, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.astName = astName;
        this.username = username;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAstName() {
        return astName;
    }

    public void setAstName(String astName) {
        this.astName = astName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", astName='" + astName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
