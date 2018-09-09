package com.gaozhaoxi.serviceImpl;

import com.gaozhaoxi.entity.Book;
import com.gaozhaoxi.mapper.BookMapper;
import com.gaozhaoxi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leon
 */

@Service("bookService")  //用于将当前类注释为一个Spring的bean，名为bookService
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.findBookByAll();
    }
}
