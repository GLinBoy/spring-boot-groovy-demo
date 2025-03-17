package com.glinboy.demo.book.service.impl

import com.glinboy.demo.book.entity.Book
import com.glinboy.demo.book.repository.BookRepository
import com.glinboy.demo.book.service.BookService
import com.glinboy.demo.book.service.dto.BookDTO
import lombok.RequiredArgsConstructor
import org.modelmapper.ModelMapper
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class BookServiceImpl implements BookService {

    private final BookRepository bookRepository
    private final ModelMapper mapper;

    @Override
    Page<BookDTO> getBooks(Pageable pageable) {
        return bookRepository.findAll(pageable)
            .map { b -> mapper.map(b, BookDTO.class) }
    }

    @Override
    Optional<BookDTO> getBook(Long id) {
        return bookRepository.findById(id)
            .map { b -> mapper.map(b, BookDTO.class) }
    }

    @Override
    BookDTO saveBook(BookDTO bookDTO) {
        Book book = mapper.map(bookDTO, Book.class)
        bookRepository.save(book)
        return mapper.map(book, BookDTO.class)
    }

    @Override
    void deleteBook(Long id) {
        bookRepository.deleteById(id)
    }
}
