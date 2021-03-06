package com.smartsoft.bills.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Integer clientId;

    @Getter @Setter
    private String name;

    @Getter @Setter
    @Column(name = "last_name")
    private String lastName;

    @Getter @Setter
    private String address;

    @Getter @Setter
    @Column(name = "date_birth")
    private Date dateBirth;

    @Getter @Setter
    private String phone;

    @Getter @Setter
    private String email;
}
