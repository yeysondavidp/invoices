package com.smartsoft.bills.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @Getter @Setter
    @Column(name = "invoice_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceNumber;

    @Getter @Setter
    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Client clientId;

    @Getter @Setter
    private Date date;

}
