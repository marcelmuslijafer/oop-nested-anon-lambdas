package zadatak2;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Croatia airlines");
        Airplane.Captain captain = airplane.new Captain("Sully");
        captain.sayWelcomeAndPilot("Rijeka", "Venice");
    }
}