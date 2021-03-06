package com.smartsoft.bills.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "detail")
public class Detail {

    @EmbeddedId
    @Getter @Setter
    protected DetailPK detailPK;

    @Getter @Setter
    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Product productId;

    @Getter @Setter
    private Date date;

    @Getter @Setter
    private Integer quantity;

    @Getter @Setter
    private Double price;

}
