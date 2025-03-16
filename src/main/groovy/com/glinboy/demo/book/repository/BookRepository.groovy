package com.glinboy.demo.book.repository

import com.glinboy.demo.book.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository extends JpaRepository<Book, Long>{

}
