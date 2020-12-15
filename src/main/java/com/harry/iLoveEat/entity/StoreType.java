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
@Table(name = "STORE_TYPE")
public class StoreType implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7041359883844343912L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "store_type_seq")
    @GenericGenerator(name = "store_type_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = ""),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%01d") })
    @Id
    @Column(name = "STORE_TYPE_NO")
    private String store_type_no;

    @Column(name = "STORE_TYPE_NAME")
    private String store_type_name;

}
