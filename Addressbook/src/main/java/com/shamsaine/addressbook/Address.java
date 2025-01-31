package com.shamsaine.addressbook;


public class Address{
    private String id;
    private String email;
    private String phone;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getAddress1(){
        return address1;
    }

    public void setAddress1(String address1){
        this.address1 = address1;
    }
    public String getAddress2(){
        return address2;
    }

    public void setAddress2(String address2){
        this.address2 = address2;
    }
    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getZip(){
        return zip;
    }

    public void setZip(String zip){
        this.zip = zip;
    }
}
