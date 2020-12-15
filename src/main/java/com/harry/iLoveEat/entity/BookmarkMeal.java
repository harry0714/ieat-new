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
@Table(name = "BOOKMARK_MEAL")
public class BookmarkMeal implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5135130342308993158L;

    @Id
    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "MEAL_NO")
    private String meal_no;

}
