package com.harry.iLoveEat.entity;

import java.io.Serializable;
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
@Table(name = "ADMINISTRATOR")
public class Administrator implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8065397553963458905L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adm_seq")
    @GenericGenerator(name = "adm_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "A"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "ADM_NO")
    private String adm_no;

    @Column(name = "ADM_USER")
    private String adm_user;

    @Column(name = "ADM_PSD")
    private String adm_psd;

    @Column(name = "ADM_NAME")
    private String adm_name;

    @Column(name = "ADM_SEX")
    private String adm_sex;

    @Column(name = "ADM_BD")
    private Date adm_bd;

    @Column(name = "ADM_EMAIL")
    private String adm_email;

    @Column(name = "ADM_PHONE")
    private String adm_phone;

    @Column(name = "ADM_LEVEL")
    private String adm_level;

    @Column(name = "ADM_ADDR")
    private String adm_addr;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ADM_PHOTO", columnDefinition = "BLOB")
    private byte[] adm_photo;

}
