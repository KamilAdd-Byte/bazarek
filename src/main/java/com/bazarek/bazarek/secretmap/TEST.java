package com.bazarek.bazarek.secretmap;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Stream;

public class TEST {
    public static void main(String[] args) {
        //utworzenie instancji klasy UserKamilSecretMap
        UserKamilSecretMap u = new UserKamilSecretMap();
        //dodanie filmu
        int size = u.myMoviesToMap().size();
        System.out.println("Ilość filmów: " + size);
        u.addMovieToMap("WWW",new Movies("Nowt",2021,6.99,"Poland",new Movies.TypeMovies("Horror",false)));
        int size2 = u.myMoviesToMap().size();
        System.out.println(size2);
       //klucze
        System.out.println("--------------------------KLUCZE-------------------------");
        Set<String> keySet = u.myMoviesToMap().keySet();
        for (String s : keySet) {
            System.out.print(s + " ");
        }
        System.out.println("");

        //utworzenie kolekcji
        Collection<Movies> values = u.myMoviesToMap().values();


        //utworzenie strumienia
        Stream<Movies> stream = values.stream();
        stream
                .filter(movies -> movies.getRating() > 5)
                .filter(m -> m.getCountry().equalsIgnoreCase("Usa"))
                .forEach(System.out::println);
        }
    }



