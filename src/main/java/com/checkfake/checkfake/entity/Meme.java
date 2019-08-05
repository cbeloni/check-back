package com.checkfake.checkfake.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name="meme")
public class Meme {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @Lob
    @Column(name="file")
    private byte[] file;

}
