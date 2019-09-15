package com.checkfake.checkfake.controller;

import com.checkfake.checkfake.dto.MemeDto;
import com.checkfake.checkfake.entity.Meme;
import com.checkfake.checkfake.exceptions.BadRequestMeme;
import com.checkfake.checkfake.service.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;

@RestController("/meme")
@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    public Meme salvar(@RequestParam("file") MultipartFile file, MemeDto meme) {
        return memeService.salvar(file, meme);
    }

    @DeleteMapping("remover")
    public String remover(Meme meme) {
        memeService.remover(meme);
        return "Removido com sucesso!!";
    }

}
