package com.example.pidev_salafni.entities;
import java.io.Serializable;


import javax.persistence.*;


@Entity
@Table( name = "RequestPartnership")
public class RequestPartnership implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private Long idRequest; // Clé primaire
    private String partnerName;
    private Long amountPayed;
    private String description;
    private String request;
    @Enumerated(EnumType.STRING)
    private Act act;

    @ManyToOne
    PartnershipProject partnershipProjects;
}
