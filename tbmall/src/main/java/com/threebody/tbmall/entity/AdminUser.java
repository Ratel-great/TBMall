package com.threebody.tbmall.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdminUser implements Serializable {
    private static final long serialVersionUID = 1646172072866475066L;

    private String id;

    private String userAccount;

    private String password;
}
