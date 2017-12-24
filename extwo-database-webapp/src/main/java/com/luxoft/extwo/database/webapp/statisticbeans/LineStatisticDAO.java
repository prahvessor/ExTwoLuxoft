package com.luxoft.extwo.database.webapp.statisticbeans;

import com.luxoft.extwo.database.webapp.hiberutils.HiberUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.sql.SQLException;
import java.util.List;

public class LineStatisticDAO {
    private static int id;

    public static List<LineStatistic> getLineStatistic() throws SQLException, ClassNotFoundException {

        SessionFactory sessionFactory = HiberUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<LineStatistic> lineStatistic = null;

        try {
            session.beginTransaction();

            Criteria criteriaLine = session.createCriteria(LineStatistic.class);
            lineStatistic = criteriaLine.add(Restrictions.eq("idFile", id)).list();

            session.getTransaction().commit();

        }catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        return lineStatistic;

    }

    public static void setId(int id) {
        LineStatisticDAO.id = id;
    }
}
