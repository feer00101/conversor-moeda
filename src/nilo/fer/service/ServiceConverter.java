package nilo.fer.service;

import nilo.fer.model.ExchangeRate;

import java.text.DecimalFormat;

public class ServiceConverter {


    public double converter(ExchangeRate exchangeRate, double quantity) {



        return exchangeRate.conversion_rate() * quantity;


    }

}