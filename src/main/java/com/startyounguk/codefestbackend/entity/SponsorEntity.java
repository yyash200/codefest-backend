package com.startyounguk.codefestbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sponsorship_master")
public class SponsorEntity {

    @Id
    @Column(name = "sponsor_id")
    private Integer sponsorId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "frequency")
    private Character frequency;

    @Column(name = "active")
    private Character active;

    @Column(name = "sponsor_interest")
    private String sponsorInterests;

}
