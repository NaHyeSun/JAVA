package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm;

    public BookMenu() {
    }

    public void mainMenu() {


        while (true) {

            System.out.println("*** 도서 관리 프로그램***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");

            int selectNo = sc.nextInt();


            switch (selectNo) {
                case 1:
                    bm.addBook(new BookDTO());
                    break;
                case 2:
                    bm.printBookList(selectSortedBook());
                    break;
                case 3:
                    bm.deleteBook(inputBookNo());
                    break;
                case 4:
                    bm.searchBook(inputBookTitle());
                    break;
                case 5:
                    bm.displayAll();
                    break;
                default:
                    return;

            }
            System.out.println();
        }

    }


    public BookDTO inputBook() {
        System.out.println("도서 제목을 입력하세요");
        String title = sc.nextLine();
        System.out.println("도서 장르 (1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타 ) : ");
        int category = sc.nextInt();
        System.out.println("도서 저자를 입력하세요");
        String author = sc.nextLine();

        BookDTO bookDTO = new BookDTO(title, category, author);
        return new BookDTO();


    }


    public int inputBookNo() {
        System.out.println("도서 번호를 입력하세요");
        int key = sc.nextInt();
        return key;
    }

    public String inputBookTitle() {
        System.out.println("도서 제목을 입력하세요");
        String bookT = sc.nextLine();
        return bookT;


    }

    public List<BookDTO> selectSortedBook(){

        System.out.println("도서 정렬방식 번호를 선택하세요");
        int type = sc.nextInt();

        bm.sortedBookList(type);


        return null;
    }
}



