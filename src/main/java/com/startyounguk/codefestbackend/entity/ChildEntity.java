package com.startyounguk.codefestbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "child_master")
public class ChildEntity {

    @Id
    @Column(name = "child_id")
    private Integer childId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "school_id")
    private Integer schoolId;

    @Column(name = "added_by")
    private Integer addedBy;

    @Column(name = "added_on")
    private Date addedOn;

    @Column(name = "child_interest")
    private String childInterests;

}
