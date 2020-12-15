package com.harry.iLoveEat.entity;

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
@Table(name = "DISCOUNT")
public class Discount implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7779368167159427382L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "d_seq")
    @GenericGenerator(name = "d_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "D"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "DISCOUNT_NO")
    private String discount_no;

    @Column(name = "DISCOUNT_TITLE")
    private String discount_title;

    @Column(name = "DISCOUNT_STARTDATE")
    private Date discount_startdate;

    @Column(name = "DISCOUNT_ENDDATE")
    private Date discount_enddate;

    @Column(name = "STORE_NO")
    private String store_no;

}
