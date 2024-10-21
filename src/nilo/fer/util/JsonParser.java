package nilo.fer.util;

import com.google.gson.Gson;
import nilo.fer.model.ExchangeRate;

public class JsonParser {
    public ExchangeRate parse(String json ) {
        Gson gson = new Gson();
        return gson.fromJson(json, ExchangeRate.class);
    }

}
