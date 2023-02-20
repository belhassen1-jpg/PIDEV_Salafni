package com.example.azizapi.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="detailsloan")
public class detailsloan  implements Serializable  {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private Number amountborrowed;
    private Date LoanDate;
    private Date RefundDate;
    private Number RefundAmount;
    private String BorrowedName;
    @Enumerated(EnumType.STRING)
    private status Status;

    @OneToMany(mappedBy = "Detailsloan")
    private Set<loanproject> Loanprojects;


}