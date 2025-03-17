package com.glinboy.demo.book.web.rest

import com.glinboy.demo.book.service.BookService
import com.glinboy.demo.book.service.dto.BookDTO
import lombok.RequiredArgsConstructor
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
class BookResource {
    private final BookService bookService

    @GetMapping
    ResponseEntity<Page<BookDTO>> getBooks(Pageable pageable) {
        return ResponseEntity.ok(bookService.getBooks(pageable))
    }

    @GetMapping("/{id}")
    ResponseEntity<BookDTO> getBook(Long id) {
        return ResponseEntity.ok(bookService.getBook(id).orElse(null))
    }

    @PostMapping
    ResponseEntity<BookDTO> saveBook(@RequestBody BookDTO bookDTO) {
        return ResponseEntity.ok(bookService.saveBook(bookDTO))
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteBook(Long id) {
        bookService.deleteBook(id)
        return ResponseEntity.noContent().build()
    }
}
