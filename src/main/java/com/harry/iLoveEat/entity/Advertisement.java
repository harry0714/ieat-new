package com.harry.iLoveEat.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "ADVERTISEMENT")
public class Advertisement implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4716284201017124904L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adv_seq")
    @GenericGenerator(name = "adv_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "A"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "AD_NO")
    private String ad_no;

    @Lob
    @Column(name = "AD_IMAGE", columnDefinition = "BLOB")
    private byte[] ad_image;

    @Column(name = "AD_IMAGETITLE")
    private String ad_imagetitle;

    @Column(name = "AD_STARTDATE")
    private Date ad_startdate;

    @Column(name = "AD_ENDDATE")
    private Date AD_ENDDATE;

    @Column(name = "STORE_NO")
    private String store_no;

}
