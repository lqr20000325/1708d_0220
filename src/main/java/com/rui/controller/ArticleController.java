package com.rui.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rui.domain.Article;
import com.rui.service.ArticleService;

@Controller
public class ArticleController {

	@Resource
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(Model model,Article article) {
		System.out.println("===============>>   t1= "+article.getT1());
		System.out.println("===============>>   t2= "+article.getT2());
		System.out.println("===============>>   type1= "+article.getType1());
		List<Article> list = articleService.list(article);
		model.addAttribute("list", list);
		return "list";
	}
}
