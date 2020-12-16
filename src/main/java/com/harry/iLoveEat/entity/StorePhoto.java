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
@Table(name = "STORE_PHOTO")
public class StorePhoto implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -77450970292859741L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stor_photo_seq")
    @GenericGenerator(name = "stor_photo_seq", strategy = "generators.StringPrefixedSequenceIdGenerator", parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "P"), @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d") })
    @Id
    @Column(name = "PHOTO_NO")
    private String photo_no;

    @Column(name = "STORE_NO")
    private String store_no;

    @Column(name = "PHOTO_NAME")
    private String photo_name;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "PHOTO", columnDefinition = "BLOB")
    private byte[] photo;

    @Column(name = "PHOTO_DES")
    private String photo_des;

}
