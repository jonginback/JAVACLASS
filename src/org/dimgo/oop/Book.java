package org.dimgo.oop;

public class Book {
    //필드선언
    private String title ;
    private String author = "ㅇㅇ"  ;
    private int page;

    // 기본 생성자
    public Book(){
    }

    public Book(String title, String author)
    {
        this(title,author,0);
    }

    public Book(String title, String author, int page)
    {
        this.title = title;
        this.author = author ;
        this.page = page;
    }

    public Book(String author,int page,String title) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    public Book(String title){
        this(title, "저자미상");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;

    }

    public String toStirng(){
        return "책제목:"+ title
                +", 저자명:"+author
                +", 페이지수:"+page;

    }
}
