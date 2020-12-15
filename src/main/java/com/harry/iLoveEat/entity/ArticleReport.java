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
@Table(name = "ARTICLE_REPORT")
public class ArticleReport implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5016338478251899889L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "art_seq")
    @GenericGenerator(name = "art_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "AR"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d") })
    @Id
    @Column(name = "ART_RE_NO")
    private String art_re_no;

    @Column(name = "ART_NO")
    private String art_no;

    @Column(name = "MEM_NO")
    private String mem_no;

    @Column(name = "ART_RE_CONTEXT")
    private String art_re_context;

    @Column(name = "ART_RE_DATE")
    private Timestamp art_re_date;

    @Column(name = "ART_RE_STATUS")
    private String art_re_status;

}
