import java.util.InputMismatchException; import java.util.Scanner;

public class QuestaoProva {

    private static final double CELSIUS_FAHRENHEIT_KELVIN_CONVERTER_FACTOR = (9d / 5.0);

    private static final double FAHRENHEIT_CELSIUS_CONVERTER_FACTOR = 32.0;

    private static final double CELSIUS_KELVIN_CONVERTER_FACTOR = 273.15;

    private static final double FAHRENHEIT_KELVIN_CONVERTER_FACTOR = (5d/9);

    private static final int CELSIUS_TO_KELVIN = 1;
    private static final int CELSIUS_TO_FAHRENHEIT = 2;
    private static final int FAHRENHEIT_TO_CELSIUS = 3;
    private static final int FAHRENHEIT_TO_KELVIN = 4;
    private static final int KELVIN_TO_CELSIUS = 5;
    private static final int KELVIN_TO_FAHRENHEIT = 6;

    private static final String CELSIUS = "Celsius";
    private static final String KELVIN = "Kelvin";
    private static final String FAHRENHEIT = "Fahrenheit";


    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);
        System.out.print("Digite a quantidade de temperaturas a serem transformadas: ");
        Integer quantity = null;
        boolean isQuantityNull = true;
        while (isQuantityNull) {
            try {
                quantity = conversao.nextInt();
                isQuantityNull = false;
            } catch (Exception e) {
                conversao.next();
                System.out.println("A quantidade deve ser um inteiro.");

            }
        }
        System.out.println("Digite a conversão que você quer fazer: \n 1 - Celsius Para Kelvin;\n 2 - Celsius para Fahrenheit;\n 3 - Fahrenheit para Celsius;\n 4 - Fahrenheit para Kelvin;\n 5 - Kelvin para Celsius;\n 6 - Kelvin para Fahrenheit; ");
        Integer operation = null;
        boolean isOperationNull = true;
        while (isOperationNull) {
            try {
                operation = conversao.nextInt();
                isOperationNull = false;
            } catch (Exception e) {
                conversao.next();
                System.out.println("A operação deve ser um inteiro");

            }
        }


        switch (operation) {
            case CELSIUS_TO_KELVIN -> {
                executeConvertion(conversao, CELSIUS_TO_KELVIN, quantity, CELSIUS, KELVIN);
                break;
            }
            case CELSIUS_TO_FAHRENHEIT -> {
                executeConvertion(conversao, CELSIUS_TO_FAHRENHEIT, quantity, CELSIUS, FAHRENHEIT);
                break;
            }
            case FAHRENHEIT_TO_CELSIUS -> {
                executeConvertion(conversao, FAHRENHEIT_TO_CELSIUS, quantity, FAHRENHEIT, CELSIUS);
                break;
            }
            case FAHRENHEIT_TO_KELVIN -> {
                executeConvertion(conversao, FAHRENHEIT_TO_KELVIN, quantity, FAHRENHEIT, KELVIN);
                break;
            }
            case KELVIN_TO_CELSIUS -> {
                executeConvertion(conversao, KELVIN_TO_CELSIUS, quantity, KELVIN, CELSIUS);
                break;
            }
            case KELVIN_TO_FAHRENHEIT -> {
                executeConvertion(conversao, KELVIN_TO_FAHRENHEIT, quantity, KELVIN, FAHRENHEIT);
                break;
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }

    }


    private static void executeConvertion(Scanner conversao, int convertionType, int quantity, String tempFrom, String tempTo) {

        double[] temperature = new double[quantity];
        double[] newTemperature = new double[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite a temperatura #" + (i + 1) + " em "+tempFrom+": ");
            temperature[i] = conversao.nextDouble();
            double value = getConvertedValue(convertionType, temperature[i]);
            newTemperature[i] = value;
            System.out.println("A temperatura #" + (i + 1) + " em "+tempTo+" é dada por: " + value);
        }

        double oldAverage = summation(temperature)/quantity;
        double newAverage = summation(newTemperature)/quantity;

        System.out.println("A média das temperaturas em "+tempFrom+" é dada por: "+oldAverage);
        System.out.println("A média das temperaturas em "+tempTo+" é dada por:  "+newAverage);
    }

    public static double summation(double[] temperature) {
        double sum = 0;
        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
        }
        return sum;
    }

    private static double getConvertedValue(int convertionType, double temperature) {

        double convertedValue = 0;

        switch (convertionType) {
            case CELSIUS_TO_KELVIN -> {
                convertedValue = convertCelToKelvin(temperature);
            }
            case CELSIUS_TO_FAHRENHEIT -> {
                convertedValue = convertCelToFah(temperature);
            }
            case FAHRENHEIT_TO_CELSIUS -> {
                convertedValue = convertFahToCel(temperature);
            }
            case FAHRENHEIT_TO_KELVIN -> {
                convertedValue = convertFahtoKelvin(temperature);
            }
            case KELVIN_TO_CELSIUS -> {
                convertedValue = convertKelvinToCelsius(temperature);
            }
            case KELVIN_TO_FAHRENHEIT -> {
                convertedValue = convertKelvinToFah(temperature);
            }
            default -> convertedValue = 0;
        }

        return convertedValue;
    }

    private static double convertCelToFah(double celsius) {
        return ((celsius * CELSIUS_FAHRENHEIT_KELVIN_CONVERTER_FACTOR) + FAHRENHEIT_CELSIUS_CONVERTER_FACTOR);
    }

    private static double convertFahToCel(double fahrenheit) {
        return ((fahrenheit - FAHRENHEIT_CELSIUS_CONVERTER_FACTOR) / CELSIUS_FAHRENHEIT_KELVIN_CONVERTER_FACTOR);
    }

    private static double convertCelToKelvin(double celsius) {
        return (celsius + CELSIUS_KELVIN_CONVERTER_FACTOR);
    }

    private static double convertKelvinToCelsius(double kelvin) {
        return (kelvin - CELSIUS_KELVIN_CONVERTER_FACTOR);
    }

    private static double convertKelvinToFah(double kelvin) {
        return ((CELSIUS_FAHRENHEIT_KELVIN_CONVERTER_FACTOR * (kelvin - CELSIUS_KELVIN_CONVERTER_FACTOR)) + FAHRENHEIT_CELSIUS_CONVERTER_FACTOR);
    }

    private static double convertFahtoKelvin(double fahrenheit) {
        return (((fahrenheit - FAHRENHEIT_CELSIUS_CONVERTER_FACTOR) * FAHRENHEIT_KELVIN_CONVERTER_FACTOR) + CELSIUS_KELVIN_CONVERTER_FACTOR);
    }
}