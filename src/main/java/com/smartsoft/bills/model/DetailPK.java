package com.smartsoft.bills.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class DetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "detail_number")
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailNumber;

    @Basic(optional = false)
    @Column(name = "invoice_id")
    @Getter @Setter
    private Integer invoiceId;
}
