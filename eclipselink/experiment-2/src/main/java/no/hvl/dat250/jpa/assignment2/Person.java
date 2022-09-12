package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "owner")
    private List<Address> address;

    @OneToMany
    private List<CreditCard> cards;

    public String getName() {
        // TODO: implement method!
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Address> getAddresses() {
        // TODO: implement method!
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Collection<CreditCard> getCreditCards() {
        // TODO: implement method!
        return cards;
    }

    public void setCards(List<CreditCard> cards) {
        this.cards = cards;
    }
}
