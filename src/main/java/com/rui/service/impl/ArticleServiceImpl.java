package com.rui.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rui.dao.ArticleMapper;
import com.rui.domain.Article;
import com.rui.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleMapper articleMapper;
	
	@Override
	public List<Article> list(Article article) {
		return articleMapper.list(article);
	}
	
}
