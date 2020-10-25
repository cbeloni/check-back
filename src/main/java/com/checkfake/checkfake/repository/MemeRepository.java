package com.checkfake.checkfake.repository;

import com.checkfake.checkfake.entity.Meme;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemeRepository extends JpaRepository<Meme,Long>, PagingAndSortingRepository<Meme, Long> {
  

}
