package com.sbs.jsp.board.article;

import com.sbs.jsp.board.Rq;

public class ArticleController {
  public void showList(Rq rq) {
    rq.appendBody("게시물 리스트");
  }
}
