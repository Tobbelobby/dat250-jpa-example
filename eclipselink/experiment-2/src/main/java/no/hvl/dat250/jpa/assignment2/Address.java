package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

    private int number;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Set<Person> owner;

    public String getStreet() {
        // TODO: implement method!
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Collection<Person> getOwners() {
        // TODO: implement method!
        return owner;
    }

    public void setOwner(Set<Person> owner) {
        this.owner = owner;
    }
}
