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
@Table(name = "QA_TYPE")
public class QaType implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4621958109875017915L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "qt_seq")
    @GenericGenerator(name = "qt_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "QT"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%04d") })
    @Id
    @Column(name = "QA_TYPE_NO")
    private String qa_type_no;

    @Column(name = "QA_TYPE_NAME")
    private String qa_type_name;

}
