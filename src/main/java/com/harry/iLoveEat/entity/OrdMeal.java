package com.harry.iLoveEat.entity;

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
@Table(name = "ORD_MEAL")
public class OrdMeal {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ord_seq")
	@GenericGenerator(name = "ord_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "O"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
	@Id
	@Column(name = "ORD_MEAL_NO")
	private String ord_meal_no;
	@Column(name = "ORD_NO")
	private String ord_no;
	@Column(name = "MEAL_NO")
	private String meal_no;
	@Column(name = "ORD_MEAL_QTY")
	private Integer ord_meal_qty;
	@Column(name = "ORD_MEAL_PRICE")
	private Integer ord_meal_price;

}
