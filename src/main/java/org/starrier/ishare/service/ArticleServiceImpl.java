package org.starrier.ishare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.starrier.ishare.dao.IArticleDao;
import org.starrier.ishare.entity.Article;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by lenovo on 2018/5/23.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private IArticleDao articleDao;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Override
    public List<Article> showArticle() {
        return articleDao.showArticle();
    }
}
