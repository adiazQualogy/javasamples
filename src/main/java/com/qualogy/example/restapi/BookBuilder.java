package com.qualogy.example.restapi;

import java.util.Random;

class BookBuilder {
  private String name;
  private String isbn;
  private String author;

  BookBuilder withName(String name) {
    this.name = name;
    return this;
  }

  BookBuilder withIsbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  BookBuilder withAuthor(String author) {
    this.author = author;
    return this;
  }

  Book build() {
    int r = new Random().nextInt(Integer.MAX_VALUE) + 1;
    return new Book(name, isbn, author, String.valueOf(r));
  }
}
