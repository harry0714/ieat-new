package com.harry.iLoveEat.entity;

import java.io.Serializable;
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
@Table(name = "ARTICLE")
public class Article implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7769105342231710216L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ar_seq")
    @GenericGenerator(name = "ar_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "AR"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d") })
    @Id
    @Column(name = "ART_NO")
    private String art_no;

    @Column(name = "ART_NAME")
    private String art_name;

    @Column(name = "ART_DATE")
    private Timestamp art_date;

    @Column(name = "ART_CONTEXT")
    private String art_context;

    @Column(name = "MEM_NO")
    private String mem_no;

}
