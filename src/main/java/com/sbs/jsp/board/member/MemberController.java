package com.sbs.jsp.board.member;

import com.sbs.jsp.board.Rq;

public class MemberController {
  public void showLogin(Rq rq) {
    rq.appendBody("로그인");
  }
}
