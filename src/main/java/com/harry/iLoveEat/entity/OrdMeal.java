package com.harry.iLoveEat.entity;

import javax.persistence.Entity;
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
@Table(name = "ORD_MEAL")
public class OrdMeal {

    private String ord_meal_no;

    private String ord_no;

    private String meal_no;

    private Integer ord_meal_qty;

    private Integer ord_meal_price;

}
