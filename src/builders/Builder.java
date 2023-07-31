package builders;

import components.*;

public interface Builder {

        void setType(Type type);
        void setBrand(Brand brand);
        void setModel(String model);
        void setYear(int horsepowers);
        void setFuel(Fuel fuel);
        void setTransmission(Transmission transmission);
        void setFromZeroToHundred(double hundred);
        void setV_Max(double V_Max);
        void setEngine(Engine engine);
        void setSeats(int seats);
}
