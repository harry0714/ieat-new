package com.harry.iLoveEat.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import generators.StringPrefixedSequenceIdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "STORE")
public class Store implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6001603356566870657L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "store_no_seq")
    @GenericGenerator(name = "store_no_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "S"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "STORE_NO")
    private String store_no;

    @Column(name = "STORE_ID")
    private String store_id;

    @Column(name = "STORE_PSW")
    private String store_psw;

    @Column(name = "STORE_NAME")
    private String store_name;

    @Column(name = "STORE_PHONE")
    private String store_phone;

    @Column(name = "STORE_OWNER")
    private String store_owner;

    @Column(name = "STORE_INTRO")
    private String store_intro;

    @Column(name = "STORE_ADS")
    private String store_ads;

    @Column(name = "STORE_TYPE_NO")
    private String store_type_no;

    @Column(name = "STORE_BOOKING")
    private String store_booking;

    @Column(name = "STORE_OPEN")
    private String store_open;

    @Column(name = "STORE_BOOK_AMT")
    private String store_book_amt;

    @Column(name = "STORE_EMAIL")
    private String store_email;

    @Column(name = "STORE_STATUS")
    private String store_status;

    @Column(name = "STORE_VALIDATE")
    private Date store_validate;

    @Column(name = "STORE_STAR")
    private Double store_star;

    @Column(name = "STORE_LATLNG")
    private String store_latlng;

}
