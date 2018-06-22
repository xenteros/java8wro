package com.github.xenteros.mapper;

import com.github.xenteros.dto.BookDTO;
import com.github.xenteros.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface BookMapper {

    @Mappings({
        @Mapping(target = "authorFirstName", source = "author.firstName"),
        @Mapping(target = "authorLastName", source = "author.lastName"),
        @Mapping(target = "authorId", source = "author.id")
    })
    BookDTO toBookDTO(Book book);
}
