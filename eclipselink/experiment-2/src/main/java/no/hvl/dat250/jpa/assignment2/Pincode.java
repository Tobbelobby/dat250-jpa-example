package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private int count;

    public Long getId() {
        return id;
    }

    public String getPincode() {
        // TODO: implement method!
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getCount() {
        // TODO: implement method!
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
