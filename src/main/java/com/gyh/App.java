package com.gyh;

import com.gyh.service.BookService;
import com.gyh.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
