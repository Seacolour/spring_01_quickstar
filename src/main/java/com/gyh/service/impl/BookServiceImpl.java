package com.gyh.service.impl;

import com.gyh.dao.BookDao;
import com.gyh.dao.impl.BookDaoImpl;
import com.gyh.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao =new BookDaoImpl();

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

}
