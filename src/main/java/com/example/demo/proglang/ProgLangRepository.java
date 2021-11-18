package com.example.demo.proglang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgLangRepository extends JpaRepository <ProgLang, Long> {

//
    @Query("SELECT s FROM ProgLang s WHERE s.langName = ?1")
    Optional<ProgLang> findProgLangByLangName(String langName);
}
