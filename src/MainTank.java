public class MainTank {
    public static void main(String[] args) {
        tank justTank = new tank();
        tank anywaretank = new tank(10, 10);
        tank customTank = new tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywaretank.goBackward(-200);
        anywaretank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
