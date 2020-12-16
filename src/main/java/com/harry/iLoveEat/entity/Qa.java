package com.harry.iLoveEat.entity;

import java.io.Serializable;

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
@Table(name = "QA")
public class Qa implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -9164492474609370434L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "new_qa_seq")
    @GenericGenerator(name = "new_qa_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "Q"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "QA_NO")
    private String qa_no;

    @Column(name = "QA_TYPE_NO")
    private String qa_type_no;

    @Column(name = "Q_CONTEXT")
    private String q_context;

    @Column(name = "A_CONTEXT")
    private String a_context;

}
