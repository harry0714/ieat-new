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
@Table(name = "ARTICLE_RESPONSE_REPORT")
public class ArticleResponseReport implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4582201482816210735L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "arrt_seq")
    @GenericGenerator(name = "arrt_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "ARRT"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%06d") })
    @Id
    @Column(name = "ART_RS_RE_NO")
    private String art_rs_re_no;

    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "ART_RS_RE_CON")
    private String art_rs_re_con;

    @Column(name = "ART_RS_RE_STA")
    private String art_rs_re_sta;

    @Column(name = "ART_RS_RE_DATE")
    private Timestamp art_rs_re_date;

    @Column(name = "ART_RS_NO")
    private String art_rs_no;

}
