package com.luxoft.extwo.database.webapp.statisticdao;

import com.luxoft.extwo.database.webapp.hiberutils.HiberUtil;
import com.luxoft.extwo.database.webapp.statisticbeans.FileStatistic;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class FileStatisticDAO {

    public static List<FileStatistic> getFileStatistic() throws SQLException, ClassNotFoundException {

        SessionFactory sessionFactory = HiberUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<FileStatistic> fileStatistic = null;

        try {
            session.beginTransaction();

            Criteria criteriaFile = session.createCriteria(FileStatistic.class);
            fileStatistic = criteriaFile.list();
            
            session.getTransaction().commit();

        }catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        return fileStatistic;
    }
}
