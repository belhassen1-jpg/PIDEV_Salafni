package com.example.pidev_bk.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "bank_account")
public class bank_account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDbank")
    private Integer IDbank ; // clé primaire
    private Long RIB ;
    private Float solde ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="Bank_account")
    private Set<Transaction> Transactions;
}
