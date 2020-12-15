package com.harry.iLoveEat.entity;

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
@Table(name = "MEAL")
public class Meal implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -9012157379537795695L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ml_seq")
    @GenericGenerator(name = "ml_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "ML"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d") })
    @Id
    @Column(name = "MEAL_NO")
    private String meal_no;

    @Column(name = "STORE_NO")
    private String store_no;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "MEAL_PHOTO", columnDefinition = "BLOB")
    private byte[] meal_photo;

    @Column(name = "MEAL_NAME")
    private String meal_name;

    @Column(name = "MEAL_DESCR")
    private String meal_descr;

    @Column(name = "MEAL_PRICE")
    private Integer meal_price;

    @Column(name = "MEAL_STATUS")
    private Integer meal_status;

    @Column(name = "MEAL_DISCOUNT")
    private Integer meal_discount;

}
