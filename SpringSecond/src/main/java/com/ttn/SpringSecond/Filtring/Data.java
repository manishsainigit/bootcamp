package com.ttn.SpringSecond.Filtring;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//Static Filtering
//@JsonIgnoreProperties(value = {"data3"})
//Dynamic Filter
@JsonFilter("DataFilter")
public class Data {
    //Another way of Static filtering
    //@JsonIgnore
    private String name;
    private String email;
    private String password;

    public Data(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}