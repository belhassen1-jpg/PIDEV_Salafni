package com.example.pidev_bk.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Client_Account")
public class Client_Account {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="IDClient")
    private Integer IDClient ; // clé primaire
    private Integer Solde ;
    private Boolean Subscription ;
    private Date ExpirationDate ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="client_account")
    private Set<Transaction> Transactions;

}
