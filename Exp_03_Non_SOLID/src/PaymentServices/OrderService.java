package PaymentServices;

public interface OrderService {
    void orderRegister(String customerName);

    void orderPayment(int foodPrice);
}
