package homework34;

import java.util.Scanner;

public class Main {

    public static String getPlanetClass(SolarPlanets planet) {
        switch (planet) {
            case EARTH:
                return "Habitable";
            case MERCURY:
            case VENUS:
            case MARS:
                return "Lifeless stone";
            case JUPITER:
            case SATURN:
                return "Gas gigant";
            case URANUS:
            case NEPTUNE:
                return "Lifeless ice planet";
        }
        return "";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the planet number:");
        SolarPlanets[] planets = SolarPlanets.values();

        for (int i = 0; i < planets.length; i++) {
            System.out.println((i + 1) + ". " + planets[i].getName());
        }
        int n = scanner.nextInt();
            System.out.println("You choose planet: " + planets[n - 1].getName());
            System.out.println("Planet class: " + getPlanetClass(planets[n - 1]));
        }
    }

