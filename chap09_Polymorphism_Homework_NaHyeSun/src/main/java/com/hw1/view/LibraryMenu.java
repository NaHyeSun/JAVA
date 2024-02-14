package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    Scanner sc = new Scanner(System.in);
    private LibraryManager lm = new LibraryManager();

    public void mainMenu() {
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요");
        char gender = sc.next().charAt(0);

        Member member = new Member(name,age,gender);
        lm.insertMember(member);

        while (true) {

            System.out.println("=============메뉴============");
            System.out.println("1.마이페이지");
            System.out.println("2.도서 전체 조회");
            System.out.println("3.도서 검색");
            System.out.println("4.도서 대여하기");
            System.out.println("0.프로그램 종료하기");

            int number = sc.nextInt();
            if (number == 1) {
                System.out.println((lm.myInfo()));
            }
            if (number == 2) {
                selectAll();
            }
            if (number == 3) {
                searchBook();
            }
            if (number == 4) {
                rentBook();
            }if (number == 0){
                break;
           }
        }
        System.out.println();


    }

    public void selectAll() {
    Book[] bList = lm.selectAll();

    for(int i=0; i < bList.length; i++){
        System.out.println(i+ "번도서는" + bList[i]);
//                bList[i].getTitle()+bList[i].getAuthor()+bList[i].getPublisher()+ bList[i]
       }
    }
    public void searchBook(){
        System.out.println("검색할 제목 키워드 : " + sc.nextLine());
        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);

        for(Book book : searchList){
            if (book == null){
                break;
            }else {
                System.out.println(book);
            }
        }
    }
    public void rentBook(){
        selectAll();
        System.out.println("대여할 도서 번호 선택 ");
        int index = sc.nextInt();

        lm.rentBook(index);

        int result = index;
        if(result == 0){
            System.out.println("성공적으로 대여되었습니다.");
        }else if(result == 1 ){
            System.out.println("나이 제한으로 대여 불가능입니다.");
        }else{
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요 ");
        }


    }

}

