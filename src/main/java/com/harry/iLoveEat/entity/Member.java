package com.harry.iLoveEat.entity;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "MEMBER")
public class Member implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6983035157527987084L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mem_seq")
    @GenericGenerator(name = "mem_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "M"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "MEM_NAME")
    private String mem_name;

    @Column(name = "MEM_ACCT")
    private String mem_acct;

    @Column(name = "MEM_PWD")
    private String mem_pwd;

    @Column(name = "MEM_SEX")
    private String mem_sex;

    @Column(name = "MEM_BD")
    private Date mem_bd;

    @Column(name = "MEM_EMAIL")
    private String mem_email;

    @Column(name = "MEM_PHONE")
    private String mem_phone;

    @Column(name = "MEM_ZIP")
    private String mem_zip;

    @Column(name = "MEM_ADDR")
    private String mem_addr;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "MEM_PHOTO", columnDefinition = "BLOB")
    private byte[] mem_photo;

    @Column(name = "MEM_VALIDATE")
    private Date mem_validate;

}
