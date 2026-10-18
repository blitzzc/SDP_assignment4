public class Security {
    private int pin;

    public Security(int pin) {
        this.pin = pin;
    }

    public boolean checkPin(int enteredPin) {
        return pin == enteredPin;
    }
}
