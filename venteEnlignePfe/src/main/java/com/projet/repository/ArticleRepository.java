package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entites.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
