package com.msdt.totodoe.Model;

public class Register {
    private String userName;
    private String gender;
    private String phNo;
    private String password;

    public Register(String userName, String gender, String phNo, String password)
    {
        this.userName = userName;
        this.gender = gender;
        this.phNo = phNo;
        this.password = password;
    }
    public Register(){

    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(){
        this.userName = userName;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(){
        this.gender = gender;
    }
    public String getPhNo(){
        return phNo;
    }
    public void setPhNo(){
        this.phNo = phNo;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
    }
    public String toString(){
        return "User Name:"+getUserName()+"\n"+"Phone Number:"+getPhNo()+"\n"+
        "Gender:"+getGender();
    }
}
