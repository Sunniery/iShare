package org.starrier.ishare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.starrier.ishare.dao.IArticleDao;
import org.starrier.ishare.entity.Article;

import java.util.List;

/**
 * Created by lenovo on 2018/5/23.
 */
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private IArticleDao articleDao;

    @Override
    public List<Article> showArticle() {
        return null;
    }
}
