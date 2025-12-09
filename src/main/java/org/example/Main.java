package org.example;

import org.example.data.DataProvider;
import org.example.models.Game;
import org.example.models.User;
import org.hibernate.Session;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        User u;

        try(Session session = DataProvider.getSessionFactory().openSession()){
            session.beginTransaction();
            u = session.find(User.class, 1);

            Game g = new Game();
            g.setTitle("UTADGame");
            g.setUser(u);
            u.getGames().add(g);
            session.persist(g);
            session.merge(u);

            session.getTransaction().commit();
        }

        System.out.println(u);
        /* Detached */
        u.setPassword("ppppppppppp");
        System.out.println(u);

        for(Game g : u.getGames()){
            System.out.println(g);
        }


    }
}