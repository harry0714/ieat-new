package com.harry.iLoveEat.entity;

import java.sql.Date;
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
@Table(name = "RESERVATION")
public class Reservation implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -2451680468879772660L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "new_reservation_seq")
    @GenericGenerator(name = "new_reservation_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "R"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "RESERVATION_NO")
    private String reservation_no;

    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "STORE_NO")
    private String store_no;

    @Column(name = "RESERVATION_DATE")
    private Date reservation_date;

    @Column(name = "RESERVATION_HOUR")
    private String reservation_hour;

    @Column(name = "RESERVATION_GUESTS")
    private Integer reservation_guests;

    @Column(name = "RESERVATION_time")
    private Timestamp reservation_time;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "RESERVATION_QRCODE", columnDefinition = "BLOB")
    private byte[] reservation_qrcode;

    @Column(name = "RESERVATION_QRCODE_STATUS")
    private String reservation_qrcode_status;

    @Column(name = "RESERVATION_REPORT")
    private String reservation_report;

    @Column(name = "RESERVATION_REPORT_STATUS")
    private String reservation_report_status;

}
