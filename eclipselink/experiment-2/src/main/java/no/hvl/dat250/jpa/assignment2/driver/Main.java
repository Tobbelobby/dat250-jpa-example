package no.hvl.dat250.jpa.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        EntityTransaction emt = em.getTransaction();

        emt.begin();

        Address address1 = new Address();
        address1.setStreet("Inndalsveien");
        address1.setNumber(28);

        Person person = new Person();
        person.setName("Max Mustermann");

        // person.getAddresses().add(address1);

        Bank bank = new Bank();
        bank.setBankName("Pengebank");

        Pincode pincode = new Pincode();
        pincode.setPincode("123");
        pincode.setCount(1);

        CreditCard card1 = new CreditCard();
        card1.setCardBalance(-5000);
        card1.setCardNumber(12345);
        card1.setCadLimit(-10000);
        card1.setPincode(pincode);

        CreditCard card2 = new CreditCard();
        card2.setCardBalance(1);
        card2.setCardNumber(123);
        card2.setCadLimit(2000);
        card2.setPincode(pincode);

        card1.setBank_id(bank);
        card2.setBank_id(bank);

        List<Address> address = new ArrayList<Address>();
        address.add(address1);

        person.setAddress(address);

        Set<Person> personList = new HashSet<Person>();
        personList.add(person);
        address1.setOwner(personList);

        List<CreditCard> cardList = new ArrayList<CreditCard>();
        cardList.add(card1);
        cardList.add(card2);
        person.setCards(cardList);

        Set<CreditCard> owning = new HashSet<CreditCard>();
        owning.add(card1);
        owning.add(card2);

        bank.setCards(owning);

        em.persist(person);
        em.persist(address1);
        em.persist(bank);
        em.persist(pincode);
        em.persist(card1);
        em.persist(card2);
        emt.commit();

        em.close();
        factory.close();

    }
}
