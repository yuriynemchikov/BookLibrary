package ru.nemchikov.spring.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.nemchikov.spring.models.Book;
import ru.nemchikov.spring.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book>{
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();

        book.setId(rs.getInt("id"));
        book.setTitle(rs.getString("title"));
        book.setAuthor(rs.getString("author"));
        book.setYear(rs.getInt("year"));

        return book;
    }
}
