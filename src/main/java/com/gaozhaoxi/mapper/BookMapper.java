package com.gaozhaoxi.mapper;

import com.gaozhaoxi.entity.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Leon
 */
@Repository
public interface BookMapper {
    /*
    * 查询所有图书
    * @return 图书对象集合
    * */
    @Select("select * from tb_book")
    List<Book> findBookByAll();
}
