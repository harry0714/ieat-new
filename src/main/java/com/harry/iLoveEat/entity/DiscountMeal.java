package com.harry.iLoveEat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "DISCOUNT_MEAL")
public class DiscountMeal implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 6587767703532478858L;

    @Id
    @Column(name = "DISCOUNT_NO")
    private String discount_no;

    @Column(name = "MEAL_NO")
    private String meal_no;

    @Column(name = "DISCOUNT_MEAL_PRICE")
    private Integer discount_meal_price;

}
