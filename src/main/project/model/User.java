package project.model;

/**
 * Created by Miracle on 2017/3/9.
 */
public class User {

    private int age;
    private String username;
    private String password;
    private String lastLoginTime;
    private String phone;
    private String photopath;
    private int userid;

    public User(int age, String username, String password, String phone) {
        this.age = age;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public User(){}
    public String getPhone() {return phone;}

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int user_id) {
        this.userid = user_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

}
