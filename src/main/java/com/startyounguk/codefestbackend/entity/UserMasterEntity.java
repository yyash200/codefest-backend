package com.startyounguk.codefestbackend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_master")
public class UserMasterEntity {

    @Id
    @GeneratedValue
    @Column(name = "entity_id")
    private Integer entityId;

    @Column(name = "locked")
    private Character locked;

    @Column(name = "password")
    private String password;

    @Column(name = "deleted")
    private Character deleted;

    @Column(name = "user_type_id")
    private Integer userTypeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private Integer contact;

    @Column(name = "password_changed_date")
    private Date passwordChangedDate;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_login_date")
    private Date lastLoginDate;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "nwsl_subscription")
    private Character nwslSubscription;

    @Column(name = "user_type")
    private String userType;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Character getLocked() {
        return locked;
    }

    public void setLocked(Character locked) {
        this.locked = locked;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getDeleted() {
        return deleted;
    }

    public void setDeleted(Character deleted) {
        this.deleted = deleted;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Date getPasswordChangedDate() {
        return passwordChangedDate;
    }

    public void setPasswordChangedDate(Date passwordChangedDate) {
        this.passwordChangedDate = passwordChangedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Character getNwslSubscription() {
        return nwslSubscription;
    }

    public void setNwslSubscription(Character nwslSubscription) {
        this.nwslSubscription = nwslSubscription;
    }
}
