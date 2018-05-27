package org.starrier.ishare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.starrier.ishare.entity.Article;
import org.starrier.ishare.service.ArticleService;

import java.util.List;

/**
 * Created by lenovo on 2018/5/23.
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/home")
    public String article(Model model){
        List<Article> articles = articleService.showArticle();
        model.addAttribute("articles",articles);
        return "home";
    }
}
