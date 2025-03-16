package com.glinboy.demo.book.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.UniqueConstraint
import lombok.Data

@Data
@Entity
@Table(
    uniqueConstraints = [
        @UniqueConstraint(name = "UNQ_BOOK_ISBN", columnNames = ["isbn"])
    ]
)
class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id

    @Column(nullable = false)
    private String title

    @Column(nullable = false)
    private String author

    @Column(nullable = false)
    private String isbn
}
