package com.gaozhaoxi.entity;

import java.util.Date;

/**
 * @author Leon
 */
public class Book {
    private Integer id;
    private String bookname;
    private String author;
    private Date publicationdate;
    private String publication;
    private double price;
    private String image;
    private String remark;

    public Book(){

    }

    public Book(Integer id, String bookname, String author, Date publicationdate, String publication, double price,
                String image, String remark) {
        super();
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.publicationdate = publicationdate;
        this.publication = publication;
        this.price = price;
        this.image = image;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getPublicationdate() {
        return publicationdate;
    }
    public void setPublicationdate(Date publicationdate) {
        this.publicationdate = publicationdate;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
