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
@Table(name = "BOOKMARK_STORE")
public class BookmarkStore implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1344683538675332640L;

    @Id
    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "STORE_NO")
    private String store_no;

}
