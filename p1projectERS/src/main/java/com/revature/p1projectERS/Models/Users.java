package com.revature.p1projectERS.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Users {


    @Id
    private Long userId;

    private String firstname;

    private String lastname;





}
