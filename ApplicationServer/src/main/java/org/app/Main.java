package org.app;// For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import java.sql.*;
import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;

import static org.jooq.sources.tables.Users.USERS;


import java.sql.Connection;
import java.sql.DriverManager;

public  class Main {
    public static void main(String[] args) {
        String user = "fcd";
        String pass = "up201810097";
        String url = "jdbc:postgresql://localhost:5432/postgres";

        try {
            Connection con = DriverManager.getConnection(url,user,pass);
            DSLContext dsl = DSL.using(con, SQLDialect.POSTGRES);

            Result<Record> result;
            result = dsl.select().from(USERS).fetch();

            for (Record r : result) {
                Integer id = r.getValue(USERS.USER_ID);
                String name = r.getValue(USERS.USERNAME);

                System.out.println("id: " + id + " Name: " + name );
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}