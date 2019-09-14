package com.checkfake.checkfake.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name="meme")
public class Meme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nome")
    private String nome;

    //@Lob
    @Column(name="file")
    private String file;

}
