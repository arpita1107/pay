package org.example;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Passenger passenger;

    private String paymentType;

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Long getId() {
        return id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public Payment(Long id, Passenger passenger, String paymentType) {
        this.id = id;
        this.passenger = passenger;
        this.paymentType = paymentType;
    }
    // Constructors, getters, and setters
}
