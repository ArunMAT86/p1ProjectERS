package com.revature.p1projectERS.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Reimbursement {

    @Id

    private Long reimbId;

    private String description;

    private Long amount;

    private String status;








}
