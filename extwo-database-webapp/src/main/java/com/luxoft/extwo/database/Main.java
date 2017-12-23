package com.luxoft.extwo.database;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.luxoft.extwo.database.webapp.hiberutils.HiberUtil;
import com.luxoft.extwo.database.webapp.statisticbeans.FileStatistic;
import com.luxoft.extwo.database.webapp.statisticbeans.LineStatistic;

public class Main {
    
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = HiberUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<FileStatistic> fStatistic = null;
        List<LineStatistic> lStatistic = null;
        
        try {
            session.beginTransaction();

            Criteria criteriaFile = session.createCriteria(FileStatistic.class);
            fStatistic = criteriaFile.list();

            for (FileStatistic nextFLine:fStatistic) {

                System.out.println("File statistic:");
                System.out.println(nextFLine.toString());
                
                System.out.println("\tLines Statistic:");
                Criteria criteriaLine = session.createCriteria(LineStatistic.class);
                lStatistic = criteriaLine.add(Restrictions.eq("idFile", nextFLine.getIdFile())).list();
                for (LineStatistic nextLine:lStatistic) {
                    System.out.println("\t" + nextLine.toString());
                }

            }
            session.getTransaction().commit();

        }catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
            sessionFactory.close();
        }
    }

}
