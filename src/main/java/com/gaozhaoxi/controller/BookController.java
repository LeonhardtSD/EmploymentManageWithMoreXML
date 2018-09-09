package com.gaozhaoxi.controller;

import com.gaozhaoxi.entity.Book;
import com.gaozhaoxi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Leon
 */
@Controller
public class BookController {
    //自动注入
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    //处理main请求
    @RequestMapping(value = "/main")
    public String main(Model model){
        //获得图书集合
        List<Book> book_list=bookService.getAll();
        //将图书集合提交到model当中
        model.addAttribute("book_list",book_list);
        return "main";
    }
}
