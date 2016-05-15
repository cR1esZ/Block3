package com.epam.traine.model;

import java.util.Date;

/**
 * Created by andreyholovan on 5/15/16.
 */
public class User {

    private String surname;
    private String name;
    private String patronymic;
    private String nickName;
    private String comment;
    private Group group;
    private String homePhone;
    private String mobilePhone;
    private String email;
    private String skype;
    private Address address;
    private Date dateCreation;
    private Date dateLastUpdate;

    public User(String surname, String name, String patronymic, String nickName, String comment,
                Group group, String homePhone, String mobilePhone, String email, String skype,
                Address address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.dateCreation = new Date();
        this.dateLastUpdate = dateCreation;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateLastUpdate() {
        return dateLastUpdate;
    }

    public void setDateLastUpdate(Date dateLastUpdate) {
        this.dateLastUpdate = dateLastUpdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", dateCreation=" + dateCreation +
                ", dateLastUpdate=" + dateLastUpdate +
                '}';
    }
}
