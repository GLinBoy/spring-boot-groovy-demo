package com.glinboy.demo.book.service

import com.glinboy.demo.book.service.dto.BookDTO
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface BookService {
    Page<BookDTO> getBooks(Pageable pageable)
    Optional<BookDTO> getBook(Long id)
    BookDTO saveBook(BookDTO bookDTO)
    void deleteBook(Long id)
}
