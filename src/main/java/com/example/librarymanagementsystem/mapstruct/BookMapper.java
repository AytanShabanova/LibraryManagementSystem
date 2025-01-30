package com.example.librarymanagementsystem.mapstruct;

import com.example.librarymanagementsystem.model.dto.request.BookRequest;
import com.example.librarymanagementsystem.model.dto.response.BookResponse;
import com.example.librarymanagementsystem.model.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface BookMapper {

    BookResponse bookToBookResponse(Book book);
    @Mapping(target = "id", ignore = true)
    Book bookRequestToBook(BookRequest bookRequest);

    List<BookResponse> bookListToBookResponse(List<Book> bookList);



}
