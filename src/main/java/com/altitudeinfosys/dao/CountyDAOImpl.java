package com.altitudeinfosys.dao;

import com.altitudeinfosys.model.RcCounty;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by tarek on 3/21/2017.
 */
public class CountyDAOImpl implements CountyDAO {

        private SessionFactory sf;

        public CountyDAOImpl(SessionFactory sf) {
                this.sf = sf;
        }

        @Override
        public RcCounty getCountyByCountyCode(String code) {
                Session session = sf.openSession();
                Transaction tx = session.beginTransaction();
                Query query = session.createQuery("from RcCounty where cntyCd=:code");
                query.setString("code", code);
                RcCounty county = (RcCounty) query.uniqueResult();

                if (county != null) {
                        System.out.println("County Retrieved from DB::" + county.getRegionCity());
                }

                tx.commit();
                session.close();

                return county;
        }

        public boolean saveCounty(RcCounty county){
                Session session = sf.openSession();
                Transaction tx = session.beginTransaction();
                session.save(county);
                tx.commit();
                session.close();
                return true;

        }

        @Override
        public boolean deleteCountyByCountyCode(String code) {
                Session session = sf.openSession();
                Transaction tx = session.beginTransaction();
                Query query = session.createQuery("from RcCounty where cntyCd=:code");
                query.setString("code", code);
                RcCounty county = (RcCounty) query.uniqueResult();
                session.delete(county);

                System.out.println("County deleted from DB::" + code);


                tx.commit();
                session.close();

                return true;
        }


        @Override
        public boolean updateCountyByCountyCode(String code, String name) {
                Session session = sf.openSession();
                Transaction tx = session.beginTransaction();
                Query query = session.createQuery("from RcCounty where cntyCd=:code");
                query.setString("code", code);
                RcCounty county = (RcCounty) query.uniqueResult();
                county.setCnty(name);
                session.update(county);

                System.out.println("County updated from DB::" + code);


                tx.commit();
                session.close();

                return true;
        }


}
