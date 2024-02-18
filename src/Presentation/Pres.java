package Presentation;

import DAO.IDao;
import METIER.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Pres {
    public static void main(String[] args) throws Exception {
        //MetierImlp metier=new MetierImlp();

        /* DI Instanciation statique */

        // DaoImpl dao=new DaoImpl();

/*        DaoImpl2 dao=new DaoImpl2();
        metier.setDao(dao);
        int c=metier.calcul();
        System.out.println(c);*/

        /* DI Instanciation Dynamique */
        Scanner file=new Scanner(new File("config.txt"));
        String daoClassName=file.nextLine();
        Class cDao=  Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();

        String metierClassName=file.nextLine();
        Class cMetier=  Class.forName(metierClassName);
        Imetier metier=(Imetier) cMetier.newInstance();
        Method method =cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println(metier.calcul());


    }
}