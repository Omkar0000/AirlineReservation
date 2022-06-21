package com.morningstar.model;

 

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

 // commenting
//mahesh comment

@Component
@Scope(scopeName="prototype")
public class User {
private int userId;
private String title;
private String fName;
private String lName;
private String emailId;
private String password;
private String dob;
private long mobile;
private int roleId;

 

public User() {
    
}
public User(int userId, String title, String fName, String lName, String emailId, String password, String dob,
        long mobile) {
    super();
    this.userId = userId;
    this.title = title;
    this.fName = fName;
    this.lName = lName;
    this.emailId = emailId;
    this.password = password;
    this.dob = dob;
    this.mobile = mobile;
}
public int getUserId() {
    return userId;
}
public void setUserId(int userId) {
    this.userId = userId;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
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
public String getEmailId() {
    return emailId;
}
public void setEmailId(String emailId) {
    this.emailId = emailId;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getDob() {
    return dob;
}
public void setDob(String dob) {
    this.dob = dob;
}
public long getMobile() {
    return mobile;
}
public void setMobile(long mobile) {
    this.mobile = mobile;
}
public int getRoleId() {
    return roleId;
}
public void setRoleId(int roleId) {
    this.roleId = roleId;
}
@Override
public String toString() {
    return "User [userId=" + userId + ", title=" + title + ", fName=" + fName + ", lName=" + lName + ", emailId="
            + emailId + ", password=" + password + ", dob=" + dob + ", mobile=" + mobile + ", roleId=" + roleId + "]";
}

 


}