package nilo.fer.model;

import java.text.DecimalFormat;
import java.util.Map;

public record ExchangeRate(String base_code, String target_code, double conversion_rate) {

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");
        return
                "-----------------------------------------"+System.lineSeparator() +
                "Moeda origem: "+base_code + System.lineSeparator() +
                "Moeda destino: "+target_code + System.lineSeparator() +
                "1 "+base_code()+"= "+df.format(conversion_rate ) + target_code()+System.lineSeparator()+"-----------------------------------------";

    }
}

