package nilo.fer.service;

import java.util.ArrayList;
import java.util.List;

public class ListService {

    private List<String> data;

    public ListService() {
        this.data = new ArrayList<>();
    }

    public void addData(String info) {
        data.add(info);
    }

    public List<String> obterInformacoes() {
        return data;
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Informações:\n");
        for (String info : data) {
            sb.append(info).append("\n");
        }
        return sb.toString();
    }
}

