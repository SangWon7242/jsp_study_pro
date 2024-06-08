<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.sbs.jsp.board.article.Article" %>

<%
List<Article> articles = (List<Article>)request.getAttribute("articles");
%>

<h1>게시물 리스트</h1>

<ul>
  <% for (Article article : articles) { %>
  <li><%=article.getId()%>. <%=article.getTitle()%></li>
  <% } %>
</ul>