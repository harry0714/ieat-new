package com.harry.iLoveEat.entity;

import java.sql.Timestamp;

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
@Table(name = "ORD")
public class Ord implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7341750327202347572L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ord_seq")
    @GenericGenerator(name = "ord_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "O"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "ORD_NO")
    private String ord_no;

    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "STORE_NO")
    private String store_no;

    @Column(name = "ORD_DATE")
    private Timestamp ord_date;

    @Column(name = "ORD_PICKUP")
    private Timestamp ord_pickup;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ORD_QRCODE", columnDefinition = "BLOB")
    private byte[] ord_qrcode;

    @Column(name = "ORD_QRCODE_STATUS")
    private String ord_qrcode_status;

    @Column(name = "ORD_PAID")
    private Integer ord_paid;

    @Column(name = "ORD_REPORT")
    private String ord_report;

    @Column(name = "ORD_REPORT_STATUS")
    private String ord_report_status;

}
