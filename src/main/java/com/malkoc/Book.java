package com.malkoc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1,"Çalıkuşu",305,1),
            new Book(2,"Hayvan Çİftliği",569,2),
            new Book(3,"Şeker Portakalı",401,1),
            new Book(4,"Ben Kirke",401,2),
            new Book(5,"Kendine ait bir oda ",475,1),
            new Book(6,"Küçük Prens",578,1)
    );

    public static Optional<Book> bookById(Integer id){
        return books.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }


}
