package merveozer.multipledb.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import merveozer.multipledb.secondary.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
