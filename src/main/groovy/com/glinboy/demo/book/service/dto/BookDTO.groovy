package com.glinboy.demo.book.service.dto

import lombok.Data

@Data
class BookDTO {
    private Long id
    private String title
    private String author
    private String isbn
}
