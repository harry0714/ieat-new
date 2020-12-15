package com.harry.iLoveEat.entity;

import java.sql.Timestamp;

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
@Table(name = "COMMENT_REPORT")
public class CommentReport implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 3207525989367178613L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cr_seq")
    @GenericGenerator(name = "cr_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CR"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d") })
    @Id
    @Column(name = "COMMENT_REPORT_NO")
    private String comment_report_no;

    @Column(name = "COMMENT_NO")
    private String comment_no;

    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "COMMENT_REPORT_CONTEXT")
    private String comment_report_context;

    @Column(name = "COMMENT_REPORT_DATE")
    private Timestamp comment_report_date;

    @Column(name = "COMMENT_REPORT_STATUS")
    private String comment_report_status;

}
