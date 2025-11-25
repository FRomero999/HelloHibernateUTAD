package org.example;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try(Session session = DataProvider.getSessionFactory().openSession()){
/*            Query<Game> q = session.createQuery("from Game where year<:año",Game.class);
            q.setParameter("año",2000);
            List<Game> juegos = q.list();
            for(Game g : juegos){
                System.out.println(g);
            }

 */


        }


    }
}