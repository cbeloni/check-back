package com.checkfake.checkfake.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@Table(name="meme")
public class Meme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="imagem_nome")
    private String imagemNome;

    @Lob
    @Column(name="imagem")
    private byte[] imagem;

    @Column(name="fake", columnDefinition = "boolean default false")
    private Boolean fake;

    @Column (name="data")
    private Date date;
}
