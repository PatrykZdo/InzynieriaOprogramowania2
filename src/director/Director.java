package director;

import builders.Builder;
import components.*;

public class Director {

        public void mustang(Builder builder){
            builder.setType(Type.MUSCLE_CAR);
            builder.setModel("Mustang");
            builder.setBrand(Brand.FORD);
            builder.setEngine(new Engine("V8",450, Fuel.Gas,5000, 8));
            builder.setTransmission(Transmission.AUTOMATIC);
            builder.setSeats(4);
            builder.setV_Max(259);
            builder.setFromZeroToHundred(4.80);
            builder.setYear(2017);

        }

    public void lamborgini_aventador(Builder builder){
        builder.setType(Type.SUPER_CAR);
        builder.setModel("Aventador-S");
        builder.setBrand(Brand.LAMBORGHINI);
        builder.setEngine(new Engine("V12",740, Fuel.Gas,6498, 12));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(2);
        builder.setV_Max(350);
        builder.setFromZeroToHundred(2.90);
        builder.setYear(2019);

    }

    public void bmw_m5 (Builder builder){
        builder.setType(Type.SPORT_CAR);
        builder.setModel("M5");
        builder.setBrand(Brand.BMW);
        builder.setEngine(new Engine("V8",450, Fuel.Gas,4395, 8));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(5);
        builder.setV_Max(250);
        builder.setFromZeroToHundred(3.4);
        builder.setYear(2020);

    }


    public void porsche_panamera(Builder builder){
        builder.setType(Type.SPORT_CAR);
        builder.setModel("Panamera II");
        builder.setBrand(Brand.PORSCHE);
        builder.setEngine(new Engine("V8",460, Fuel.Gas,3996, 8));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(4);
        builder.setV_Max(289);
        builder.setFromZeroToHundred(4.1);
        builder.setYear(2020);

    }


    public void supra_mk4(Builder builder){
        builder.setType(Type.SPORT_CAR);
        builder.setModel("Supra-MK4");
        builder.setBrand(Brand.TOYOTA);
        builder.setEngine(new Engine("in_line_6",450, Fuel.Gas,2997, 6));
        builder.setTransmission(Transmission.MANUAL);
        builder.setSeats(4);
        builder.setV_Max(250);
        builder.setFromZeroToHundred(5.1);
        builder.setYear(1997);

    }


    public void rs6_c8(Builder builder){
        builder.setType(Type.SPORT_CAR);
        builder.setModel("rs6_c8");
        builder.setBrand(Brand.AUDI);
        builder.setEngine(new Engine("V8",450, Fuel.Gas,3996, 8));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(5);
        builder.setV_Max(250);
        builder.setFromZeroToHundred(3.0);
        builder.setYear(2019);

    }


    public void skyline_r34(Builder builder){
        builder.setType(Type.SPORT_CAR);
        builder.setModel("Skyline_r34");
        builder.setBrand(Brand.NISSAN);
        builder.setEngine(new Engine("in_line_6",332, Fuel.Gas,2800, 8));
        builder.setTransmission(Transmission.MANUAL);
        builder.setSeats(4);
        builder.setV_Max(230);
        builder.setFromZeroToHundred(5.1);
        builder.setYear(2001);

    }


    public void ram(Builder builder){
        builder.setType(Type.PICKUP);
        builder.setModel("DODGE_RAM");
        builder.setBrand(Brand.RAM);
        builder.setEngine(new Engine("V8",501, Fuel.Gas,5654, 8));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(5);
        builder.setV_Max(200);
        builder.setFromZeroToHundred(6.6);
        builder.setYear(2019);

    }

    public void mBenz(Builder builder){
        builder.setType(Type.SUV);
        builder.setModel("G63");
        builder.setBrand(Brand.MERCEDES_BENZ);
        builder.setEngine(new Engine("V8",585, Fuel.Gas,3982, 8));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(5);
        builder.setV_Max(220);
        builder.setFromZeroToHundred(4.5);
        builder.setYear(2018);

    }

    public void octavia_rs(Builder builder){
        builder.setType(Type.SEDAN);
        builder.setModel("Octavia III RS");
        builder.setBrand(Brand.SKODA);
        builder.setEngine(new Engine("inline_4",230, Fuel.Gas,1984, 4));
        builder.setTransmission(Transmission.MANUAL);
        builder.setSeats(5);
        builder.setV_Max(250);
        builder.setFromZeroToHundred(6.7);
        builder.setYear(2015);

    }

    public void corvette_c7(Builder builder){
        builder.setType(Type.SPORT_CAR);
        builder.setModel("Corvette c7");
        builder.setBrand(Brand.CHEVROLET);
        builder.setEngine(new Engine("V8",659, Fuel.Gas,6152, 8));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(2);
        builder.setV_Max(315);
        builder.setFromZeroToHundred(3.8);
        builder.setYear(2014);

    }

    public void camaro_3(Builder builder){
        builder.setType(Type.MUSCLE_CAR);
        builder.setModel("Camaro III");
        builder.setBrand(Brand.CHEVROLET);
        builder.setEngine(new Engine("V8",243, Fuel.Gas,5733, 8));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(4);
        builder.setV_Max(240);
        builder.setFromZeroToHundred(6.5);
        builder.setYear(1991);

    }

}
