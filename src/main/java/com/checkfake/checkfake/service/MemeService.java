package com.checkfake.checkfake.service;

import com.checkfake.checkfake.entity.Meme;
import com.checkfake.checkfake.exceptions.BadRequestMeme;
import com.checkfake.checkfake.repository.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {

    @Autowired
    private MemeRepository memeRepository;

    public Meme salvar(Meme meme){
        return memeRepository.save(meme);
    }

    public Meme obterMeme(Meme meme){
        return memeRepository.findById(meme.getId()).orElseThrow(() -> new BadRequestMeme("Não encontrado id mencionado"));
    }

    public List<Meme> obterTodos(){
        return memeRepository.findAll();
    }

}
