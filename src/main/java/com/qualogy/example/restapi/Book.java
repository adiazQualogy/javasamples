package com.qualogy.example.restapi;

public class Book {
  private String title;
  private String isbn;
  private String author;
  private String id;

  public Book() {
  }

  Book(String title, String isbn, String author, String id) {
    this.title = title;
    this.isbn = isbn;
    this.author = author;
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getAuthor() {
    return author;
  }

  public String getId() {
    return id;
  }
}
