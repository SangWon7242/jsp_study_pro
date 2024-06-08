package com.sbs.jsp.board.article;

import com.sbs.jsp.board.Rq;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
  public void showList(Rq rq) {
    List<Article> articles = new ArrayList<>();

    for(int i = 5; i >= 1; i--) {
      articles.add(new Article(i, "제목" + i, "내용" + i));
    }

    rq.setAttr("articles", articles);
    rq.view("usr/article/list");
  }
}
