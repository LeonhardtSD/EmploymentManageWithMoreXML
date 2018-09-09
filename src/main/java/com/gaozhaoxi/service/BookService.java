package com.gaozhaoxi.service;

import com.gaozhaoxi.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Leon
 */

//Book服务的接口
public interface BookService {
    //查找所有图书
    List<Book> getAll();
}
