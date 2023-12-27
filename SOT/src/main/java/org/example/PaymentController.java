package org.example;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Payment> processPayment(@RequestBody Passenger passenger,
                                                  @RequestParam String paymentType) {
        Payment payment = paymentService.processPayment(passenger.getLastName(),
                passenger.getFirstName(),
                passenger.getDestination(),
                paymentType);
        return ResponseEntity.ok(payment);
    }
}