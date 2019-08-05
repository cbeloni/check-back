package com.checkfake.checkfake.repository;

import com.checkfake.checkfake.entity.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<Meme,Long> {
}
