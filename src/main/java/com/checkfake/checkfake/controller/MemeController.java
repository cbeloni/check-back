package com.checkfake.checkfake.controller;

import com.checkfake.checkfake.exceptions.BadRequestMeme;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController("/meme")
public class MemeController {

    @GetMapping("get")
    public ResponseEntity<String> get(){
        if (false){
            throw new BadRequestMeme("Deu alguma falha!");
        }
        return new ResponseEntity<String>("Oi ao back-end!!!", HttpStatus.OK);
    }

}
