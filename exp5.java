//Aryan 2400320100285
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class exp5 {

    static void checkAmount(int amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative!");
        } else {
            System.out.println("Amount is valid: " + amount);
        }
    }

    public static void main(String[] args) {
        try {
            int amount = -200;
            checkAmount(amount);
        } catch (NegativeAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}