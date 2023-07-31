import builders.CarBuilder;
import director.Director;
import objects.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int kindOfRace;
        int myCar,opponentsCar;

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        ArrayList<Car> cars = new ArrayList<>();

        director.mustang(builder);
        cars.add(builder.getResult());
        director.lamborgini_aventador(builder);
        cars.add(builder.getResult());
        director.bmw_m5(builder);
        cars.add(builder.getResult());
        director.porsche_panamera(builder);
        cars.add(builder.getResult());
        director.mBenz(builder);
        cars.add(builder.getResult());
        director.supra_mk4(builder);
        cars.add(builder.getResult());
        director.rs6_c8(builder);
        cars.add(builder.getResult());
        director.skyline_r34(builder);
        cars.add(builder.getResult());
        director.ram(builder);
        cars.add(builder.getResult());
        director.octavia_rs(builder);
        cars.add(builder.getResult());
        director.corvette_c7(builder);
        cars.add(builder.getResult());
        director.camaro_3(builder);
        cars.add(builder.getResult());


        System.out.println("Witam w grze wyścigowej w której możesz wybrać sobie samochód jakim chcesz się scigać, i tryb w jakim chcesz się scigać.");
        System.out.println("W trybie wyscigu na 1/4 mili porównywane jest przyspieszenie samochodów.");
        System.out.println("Natomias w wyscigu klasycznym, porównuje się który samochód jest szybszy.");


        System.out.println();
        System.out.println();

        System.out.println("1.Wyscig na 1/4 mili");
        System.out.println("2.Wyscig klasyczny");
        kindOfRace = scanner.nextInt();
        while(kindOfRace < 1 || kindOfRace >2){
            System.out.println("Wartosc poza skala.wybierz poprawny numer wyscigu.");
        }



        System.out.println();
        System.out.println();
        System.out.println("Wybierz samochod:");
        System.out.println("Nr. Marka Model   Pojemnosc   Konie   od 0 do 100");
        for(int i = 0 ; i<cars.size() ; i++){
            System.out.println((i+1)+". "+cars.get(i).getBrand()+" "+cars.get(i).getModel()+"    "+cars.get(i).getEnginDisplacement()+"cm^3      "+ cars.get(i).getHorsepowers()+"     "+ cars.get(i).getFromZeroToHundred());
        }

        System.out.println();
        System.out.println();
        System.out.println();



        myCar = scanner.nextInt();
        while (myCar <1 || myCar >12){
            System.out.println("Wartosc poza skala. Wpisz poprawny numer samochodu.");
            myCar = scanner.nextInt();
        }
        opponentsCar = random.nextInt(13);
        System.out.println("Wybrałeś: " + cars.get(myCar-1).getBrand() + " " + cars.get(myCar-1).getModel());
        System.out.println("Twoj przeciwnik to: " + cars.get(opponentsCar).getBrand() + " " + cars.get(opponentsCar).getModel());

        sleep(3000);

        if(kindOfRace == 1){
            if(cars.get(myCar-1).getFromZeroToHundred() < cars.get(opponentsCar).getFromZeroToHundred()){
                System.out.println();
                System.out.println();
                System.out.println("Gratuluje!!! Wygrałeś wyscig z " + cars.get(opponentsCar).getBrand() + " " + cars.get(opponentsCar).getModel());
                exit(0);
            } else if (cars.get(myCar-1).getFromZeroToHundred() == cars.get(opponentsCar).getFromZeroToHundred()) {
                System.out.println();
                System.out.println();
                System.out.println("Remis!!! Zacięta walka z " + cars.get(opponentsCar).getBrand() + " " + cars.get(opponentsCar).getModel());
            }
            else{
                System.out.println();
                System.out.println();
                System.out.println("Przegrana!!! przykro nam ale przegrałeś z " + cars.get(opponentsCar).getBrand() + " " + cars.get(opponentsCar).getModel());
            }
        }
        else{
            if(cars.get(myCar-1).getHorsepowers() > cars.get(opponentsCar).getHorsepowers()){
                System.out.println();
                System.out.println();
                System.out.println("Gratuluje!!! Wygrałeś wyscig z " + cars.get(opponentsCar).getBrand() + " " + cars.get(opponentsCar).getModel());
                exit(0);
            } else if (cars.get(myCar-1).getHorsepowers() == cars.get(opponentsCar).getHorsepowers()) {
                System.out.println();
                System.out.println();
                System.out.println("Remis!!! Zacięta walka z " + cars.get(opponentsCar).getBrand() + " " + cars.get(opponentsCar).getModel());
            }
            else{
                System.out.println();
                System.out.println();
                System.out.println("Przegrana!!! przykro nam ale przegrałeś z " + cars.get(opponentsCar).getBrand() + " " + cars.get(opponentsCar).getModel());
            }
        }
    }
}

