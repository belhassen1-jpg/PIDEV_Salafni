package com.example.pidev_bk.entities;

import javax.persistence.*;
import java.util.Date;


    @Entity
    @Table(name = "Transaction")
    public class Transaction {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="IDtransaction")
        private Integer IDtransaction ; // clé primaire
        private Float Amount ;
        private Date date ;
        private String Transaction_type ;

        @ManyToOne
        private Client_Account client_account;
        @ManyToOne
        private bank_account Bank_account;
    }

