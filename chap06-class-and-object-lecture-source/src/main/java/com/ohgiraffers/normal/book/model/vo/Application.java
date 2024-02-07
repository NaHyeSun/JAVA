package com.ohgiraffers.normal.book.model.vo;

public class Application {
    public static void main(String[] args) {
    BookVO book1 = new BookVO();
    book1.printInformation();

    BookVO book2 = new BookVO("자바의 정석", "도우출판", "남궁성");
    book2.printInformation();

    BookVO book3 = new BookVO("홍길동전", "활빈당", "허균", 5000000,0.5);
    book3.printInformation();


    }
}
