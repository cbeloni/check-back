package com.checkfake.checkfake.controller;

import com.checkfake.checkfake.entity.Meme;
import com.checkfake.checkfake.exceptions.BadRequestMeme;
import com.checkfake.checkfake.service.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/meme")
public class MemeController {

    @Autowired
    private MemeService memeService;

    @GetMapping("obter")
    public Meme obter(Meme meme){
        if (false){
            throw new BadRequestMeme("Deu alguma falha!");
        }


        return memeService.obterMeme(meme);
    }

    @GetMapping("listar")
    public List<Meme> obterTodos(){
        return memeService.obterTodos();
    }


    @PostMapping("salvar")
    public Meme salvar(Meme meme){
        return memeService.salvar(meme);
    }

}
