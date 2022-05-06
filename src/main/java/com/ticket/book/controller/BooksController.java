package com.ticket.book.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.book.model.Books;
import com.ticket.book.service.BooksService;
//mark class as Controller
@RestController
public class BooksController 
{
//autowire the BooksService class
@Autowired
BooksService booksService;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/book")
private List<Books> getAllPassengerDetails() 
{
return booksService.getAllPng();
}
//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/book/{bookid}")
private Books getPassengerDetail(@PathVariable("bookid") int bookid) 
{
return booksService.getPngById(bookid);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/book/{bookid}")
private void deleteReservation(@PathVariable("bookid") int bookid) 
{
booksService.delete(bookid);
}
//creating post mapping that post the book detail in the database
@PostMapping("/books")
private int createReservation(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books.getBookid();
}
//creating put mapping that updates the book detail 
@PutMapping("/books")
private Books updateReservation(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books;
}
}
