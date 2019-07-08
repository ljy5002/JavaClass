package org.dimigo.oop;

public class Book {
    private String title = "수학의 정석";
    private String author = "홍성대";
    private int page = 350;
    //기본 생성자, 값 리턴 X, 생성자를 사용자가 임의로 만들었을 경우 기본 생성자를 컴파일러가 넣어주지 않는다.
    public Book(){
        System.out.println("기본 생성자 호출");
    }
//generate에서 생성 가능
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title, author, 0 );
    }

    public Book(String title) {
        this(title, "작자미상");
    }

    //메소드 선언
    //GETTER 메소드 : 값을 리턴해주는 메소드
    public String getTitle(){
    return title;
    }

    public String getAuthor(){
        return author;
    }
    public int getPage(){
        return page;
    }

     public void setTitle(String title){
        this.title = title;
     }
     public void setAuthor(String author){
        this.author = author;
     }
     public void setPage(int page){
        this.page = page;
     }

    @Override
    public String toString() {
        return
                "title=" + title +
                ", author=" + author +
                ", page=" + page;
    }
}
