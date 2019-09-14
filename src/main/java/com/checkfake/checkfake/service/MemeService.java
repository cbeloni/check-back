package com.checkfake.checkfake.service;

import com.checkfake.checkfake.dto.MemeDto;
import com.checkfake.checkfake.entity.Meme;
import com.checkfake.checkfake.exceptions.BadRequestMeme;
import com.checkfake.checkfake.repository.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class MemeService {

    @Autowired
    private MemeRepository memeRepository;

    public Meme salvar(MultipartFile file, MemeDto memeDto){
        try {
            Meme meme = Meme.builder().nome(memeDto.getNome())
                    .imagem(file.getBytes())
                    .imagemNome(file.getOriginalFilename())
                    .build();

            return memeRepository.save(meme);
        } catch (Exception e){
            throw new BadRequestMeme("Falha carregar image: " + e.getMessage() + " tracer: " +  e.getStackTrace());
        }
    }

    public Meme obterMeme(Meme meme){
        return memeRepository.findById(meme.getId()).orElseThrow(() -> new BadRequestMeme("Não encontrado id mencionado"));
    }

    public List<Meme> obterTodos(){
        return memeRepository.findAll();
    }

    public void remover(Meme meme){
        memeRepository.delete(meme);
    }
}
