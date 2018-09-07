package de.fantavier.j2ee.service;

import de.fantavier.j2ee.model.Adress;
import org.hibernate.Session;

public class AdressDAOImpl implements IAdressDAO {
    Session session = HibernateUtil.getCurrentSession();

    @Override
    public Adress saveAdress(Adress adress) {
        session.beginTransaction();
        session.save(adress);
        session.getTransaction().commit();
        return adress;
    }

    @Override
    public Adress readAdress(long id) {
        session.beginTransaction();
        Adress adress = session.get(Adress.class, id);
        session.getTransaction().commit();
        return adress;
    }

    @Override
    public Adress updateAdress(Adress adress) {
        session.beginTransaction();
        session.merge(adress);
        session.getTransaction().commit();
        return adress;
    }

    @Override
    public void deleteAdress(Adress adress) {
        session.beginTransaction();
        session.delete(adress);
        session.getTransaction().commit();
    }
}