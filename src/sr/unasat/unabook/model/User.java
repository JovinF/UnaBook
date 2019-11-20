package sr.unasat.unabook.model;

import java.time.LocalDateTime;

public class User {
    private long id;
    private String email;
    private String password;
    private String lastname;
    private String firtname;
    private LocalDateTime lastlogin;

    public User(long id, String email, String password,String lastname, String firtname, LocalDateTime lastlogin ){
        this.id = id;
        this.email = email;
        this.password = password;
        this.firtname = firtname;
        this.lastname = lastname;
        this.lastlogin = lastlogin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public LocalDateTime getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(LocalDateTime lastlogin) {
        this.lastlogin = lastlogin;
    }

    public void info(){

    }

    public void fullname(){

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firtname='" + firtname + '\'' +
                ", lastlogin=" + lastlogin +
                '}';
    }
}
