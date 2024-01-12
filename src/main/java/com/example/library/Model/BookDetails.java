package com.example.library.Model;

import java.util.Date;

public class BookDetails {

    private int bookId;
    private String bookName;
    private String publisher;
    private Date publicationDate;
    private boolean isBorrowed;
    private Integer borrowerId;
    private Date startDate;
    private Date dueDate;
    private int bookInfoId;

    public BookDetails(int bookId, String bookName, String publisher, Date publicationDate,
                       boolean isBorrowed, Integer borrowerId, Date startDate, Date dueDate, int bookInfoId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.isBorrowed = isBorrowed;
        this.borrowerId = borrowerId;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.bookInfoId = bookInfoId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Integer getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Integer borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getBookInfoId() {
        return bookInfoId;
    }

    public void setBookInfoId(int bookInfoId) {
        this.bookInfoId = bookInfoId;
    }
}
