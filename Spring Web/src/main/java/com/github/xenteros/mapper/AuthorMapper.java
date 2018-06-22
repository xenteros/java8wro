package com.github.xenteros.mapper;


import com.github.xenteros.dto.AuthorDTO;
import com.github.xenteros.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN, uses = BookMapper.class)
public interface AuthorMapper {

    @Mappings({
        @Mapping(source = "address.country", target = "country"),
        @Mapping(source = "books", target = "bookDTOs")
    })
    AuthorDTO toAuthorDTO(Author author);

    List<AuthorDTO> toAuthorDTO(Collection<Author> authors);
}
