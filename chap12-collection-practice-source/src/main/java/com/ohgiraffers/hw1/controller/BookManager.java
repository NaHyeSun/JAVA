package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class BookManager {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<BookDTO> booklist;

    public BookManager(){
        this.booklist = new ArrayList<BookDTO>();

    }


    public void addBook(BookDTO book){

        booklist.add(new BookDTO());

    }

    public void deleteBook(int key){

        booklist.remove(key);

    }

    public void searchBook(String title){


        for(int i = 0; i < booklist.size(); i++ ){
           if(booklist.contains(title)){

               System.out.println(booklist);
           }else{
               System.out.println("조회된 도서가 목록에 없습니다.");
           }
        }


    }
    public void displayAll(){
        System.out.println(booklist);
        if (booklist.size() == 0){
            System.out.println("조회 결과가 없습니다.");
        }


    }
    public List<BookDTO> sortedBookList(int type){

        switch (type){
            case 1:booklist.sort(new AscBookNo());break;

            case 2:booklist.sort(new DescBookNo());break;

            case 3:booklist.sort(new AscBookTitle());break;

            default:booklist.sort(new DescBookTitle());break;


        }
        return booklist;
    }

    public void printBookList(List<BookDTO>printList){





    }

}
