package com.malkoc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1,"Necip Fazıl"),
            new Author(2,"Sait Faik")
    );

    public static Optional<Author> authorById(Integer id){
        return authors.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }

}
