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
@Table(name = "STORE_COMMENT")
public class StoreComment implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7642338278412611072L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_no_seq")
    @GenericGenerator(name = "comment_no_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "C"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "COMMENT_NO")
    private String comment_no;

    @Column(name = "STORE_NO")
    private String store_no;

    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "COMMENT_CONECT")
    private String comment_conect;

    @Column(name = "COMMENT_TIME")
    private Timestamp comment_time;

    @Column(name = "COMMENT_LEVEL")
    private Double comment_level;

}
