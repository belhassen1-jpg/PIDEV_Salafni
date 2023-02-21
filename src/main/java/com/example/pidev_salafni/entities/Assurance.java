package com.example.pidev_salafni.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Assurance")
public class Assurance  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long ID;
    private String LoanerName;
    private Number AmountRefund;
    private String Status;
    private Number ExchangeRate;
    private Number FinalRefundAmount;
    @ManyToMany(mappedBy="Assurances")
    private Set<Admin> admin;
}