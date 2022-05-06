package com.ticket.book.repository;
import org.springframework.data.repository.CrudRepository;

import com.ticket.book.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
