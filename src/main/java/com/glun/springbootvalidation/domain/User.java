package com.glun.springbootvalidation.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class User {
    @NotNull
    @Max(value=10000)
    private long id;
    private String name;
  //卡号
    private String cardNumber;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
