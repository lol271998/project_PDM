package org.app;// For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.sources.tables.Movie;
import org.jooq.sources.tables.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;

public  class Main {
    public static void main(String[] args) {
        String user = "fcd";
        String pass = "up201810097";
        String url = "jdbc:postgresql://localhost:5432/twitchflixdb";

        System.out.println(user);

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Connected");
            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);
            Result<Record> result = create.select().from(Movie.MOVIE).fetch();

            for (Record r : result) {
                Integer id = r.getValue(Movie.MOVIE.MOVIE_ID);
                String username = r.getValue(Movie.MOVIE.TITLE);

                System.out.println("ID: " + id + " title: " + username );
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}