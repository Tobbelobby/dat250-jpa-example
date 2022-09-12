package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.List;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cardNumber;
    private int cardBalance;

    private int cadLimit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Bank_id")
    private Bank bank_id;

    // Card
    @OneToOne
    private Pincode pincode;

    public Integer getNumber() {
        // TODO: implement method!
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getBalance() {
        // TODO: implement method!
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public Integer getLimit() {
        // TODO: implement method!
        return cadLimit;
    }

    public void setCadLimit(int cadLimit) {
        this.cadLimit = cadLimit;
    }

    public Pincode getPincode() {
        // TODO: implement method!
        return pincode;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }

    public Bank getOwningBank() {
        // TODO: implement method!
        return bank_id;
    }

    public void setBank_id(Bank bank_id) {
        this.bank_id = bank_id;
    }
}
