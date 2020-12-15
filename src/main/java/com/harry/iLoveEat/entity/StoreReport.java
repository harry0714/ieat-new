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
@Table(name = "STORE_REPORT")
public class StoreReport implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 8855367788856570589L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "store_report_seq")
    @GenericGenerator(name = "store_report_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "SR"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d") })
    @Id
    @Column(name = "STORE_REPORT_NO")
    private String store_report_no;

    @Column(name = "STORE_NO")
    private String store_no;

    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "STORE_REPORT_CONTENT")
    private String store_report_content;

    @Column(name = "STORE_REPORT_DATE")
    private Date store_report_date;

    @Column(name = "STORE_REPORT_STATUS")
    private String store_report_status;

}
