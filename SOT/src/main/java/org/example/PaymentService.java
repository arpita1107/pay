package org.example;
@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final PassengerRepository passengerRepository;

    public PaymentService(PaymentRepository paymentRepository, PassengerRepository passengerRepository) {
        this.paymentRepository = paymentRepository;
        this.passengerRepository = passengerRepository;
    }

    public Payment processPayment(String lastName, String firstName, String destination, String paymentType) {
        Passenger passenger = new Passenger(lastName, firstName, destination);

        passengerRepository.save(passenger);

        Payment payment = new Payment(passenger, paymentType);
        return paymentRepository.save(payment);
    }
}