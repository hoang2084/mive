package de.fantavier.j2ee;


import de.fantavier.j2ee.model.Adress;
import de.fantavier.j2ee.service.AdressDAOImpl;

public class Main {

    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setCity("essen");
        adress.setPlz("45326");
        adress.setStreet("Ghettostreet. 3");

        AdressDAOImpl adressDAO = new AdressDAOImpl();
        adressDAO.saveAdress(adress);
    }

}
