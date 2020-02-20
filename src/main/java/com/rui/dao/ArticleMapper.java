package com.rui.dao;

import java.util.List;

import com.rui.domain.Article;

public interface ArticleMapper {

	List<Article> list(Article article) ;
}
