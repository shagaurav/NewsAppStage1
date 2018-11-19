package com.example.android.newsappstage1;

public class News {
    private String articleTitle;
    private String articleCategory;
    private String articleDate;
    private String articleUrl;
    private String articleAuthor;

    public News(String articleTitle, String articleCategory, String articleDate, String articleUrl, String articleAuthor) {
        this.articleTitle = articleTitle;
        this.articleCategory = articleCategory;
        this.articleDate = articleDate;
        this.articleUrl = articleUrl;
        this.articleAuthor = articleAuthor;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }
}
