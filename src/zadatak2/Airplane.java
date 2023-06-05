package zadatak2;

import java.util.ArrayList;
import java.util.List;

class Airplane {
    private String name;
    private int currentSpeed;
    private List<Cargo> cargo;
    private String from;
    private String to;

    public Airplane(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.cargo = new ArrayList<>();
    }

    public void addCargo(Cargo item) {
        cargo.add(item);
    }

    private void increaseSpeed(int increment) {
        currentSpeed += increment;
    }

    private int getOverallCargoWeight() {
        int totalWeight = 0;
        for (Cargo item : cargo) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    private void flyAround(Pair<Double, Double>... airportsCoord) {
        if (airportsCoord.length < 2) {
            System.out.println("Please provide at least two airport coordinates.");
            return;
        }

        Pair<Double, Double> start = airportsCoord[0];
        Pair<Double, Double> end = airportsCoord[airportsCoord.length - 1];

        class Distance {
            private double distance;

            public Distance(Pair<Double, Double> start, Pair<Double, Double> end) {
                double lat1 = start.getFirst();
                double lon1 = start.getSecond();
                double lat2 = end.getFirst();
                double lon2 = end.getSecond();

                final int R = 6371; // Radius of the Earth

                double latDistance = Math.toRadians(lat2 - lat1);
                double lonDistance = Math.toRadians(lon2 - lon1);
                double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                        + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                        * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
                double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                distance = R * c;
            }

            public double getDistance() {
                return distance;
            }
        }

        Distance distance = new Distance(start, end);
        System.out.printf("%.2f km", distance.getDistance());
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public class Captain {
        private String name;

        public Captain(String name) {
            this.name = name;
        }

        public void sayWelcomeAndPilot(String from, String to) {
            this.name = "Sully";
            this.name = name;

            Airplane.this.setFrom(from);
            Airplane.this.setTo(to);

            Cargo mail = new Cargo("mail", 50);
            mail.checkCargo();
            Airplane.this.addCargo(mail);

            Cargo luggage = new Cargo("luggage", 500);
            luggage.checkCargo();
            Airplane.this.addCargo(luggage);

            Airplane.this.increaseSpeed(200);

            Pair<Double, Double> rijeckaZracnaLuka = new Pair<>(45.2167, 14.5700);
            Pair<Double, Double> zracnaLukaVenecija = new Pair<>(45.5050, 12.3519);


            System.out.println("This is your captain speaking.");
            System.out.println("The " + name + " plane on flight from " + from + " to " + to + " is loaded with " +
                    getOverallCargoWeight() + " kg.");
            System.out.println("Enjoy your flight. Currently, our speed is " + currentSpeed);
            System.out.print("We have approx ");
            Airplane.this.flyAround(rijeckaZracnaLuka, zracnaLukaVenecija);
            System.out.println(" km to our end destination.");
        }
    }

    public static class Cargo {
        private String type;
        private int weight;

        public Cargo(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }

        public void checkCargo() {
            System.out.println(type + ", " + weight + " kg, checked.");
        }

        public int getWeight() {
            return weight;
        }
    }

}