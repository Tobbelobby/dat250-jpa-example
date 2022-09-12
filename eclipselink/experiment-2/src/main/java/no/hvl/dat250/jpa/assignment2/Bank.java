package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bank_id")
    private Set<CreditCard> cards;

    private String bankName;

    public Long getId() {
        return id;
    }

    public String getName() {
        // TODO: implement method!
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Set<CreditCard> getOwnedCards() {
        // TODO: implement method!
        return cards;
    }

    public void setCards(Set<CreditCard> cards) {
        this.cards = cards;
    }
}
