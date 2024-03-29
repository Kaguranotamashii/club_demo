package com.example.demo.service.impl;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.pojo.Article;
import com.example.demo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    @Override
    public void addArticle(Article article) {
        System.out.println("Service层"+article.toString());
        articleMapper.insert(article);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleMapper.deleteById(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleMapper.update(article);
    }

    @Override
    public List<Article> selectArticle() {
        return articleMapper.selectAllArticles();
    }

    @Override
    public Article selectArticleById(Integer id) {
        return articleMapper.selectById(id);
    }

    @Override
    public List<Article> selectArticleByType(String type) {
        return articleMapper.selectByType(type);
    }
}
