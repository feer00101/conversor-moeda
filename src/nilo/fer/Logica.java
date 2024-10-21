package nilo.fer;

import nilo.fer.api.ApiClient;
import nilo.fer.model.ExchangeRate;
import nilo.fer.service.ListService;
import nilo.fer.util.JsonParser;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Logica {

    DecimalFormat df = new DecimalFormat("0.00");
    Scanner sc = new Scanner(System.in);
    ListService service = new ListService();
    ApiClient client = new ApiClient();

    public void yesorno() throws Exception {

        //variaveis para comparaçao da resposta
        String y = "sim";
        String n = "nao";

        //variavel irá receber os dados do usuário
        String input;
        System.out.println("Deseja Continuar?");

        //recebendo os dados do usuario na variavel input
        input = sc.nextLine();

        //testando a resposta do usuario
        if(input.equals("sim")){

            //inicializando o metodo que mostra o menu do sistema
            launch();

        }
        //finaliza o sistema caso a resposta seja diferente de sim
        else{
            System.out.println("FIM :D");
        }
    }




    public void launch() throws Exception {
        System.out.println("Bem Vindo");

        System.out.println("Digite a primeira moeda: ");
        String input1 = sc.nextLine();
        System.out.println("Digite a segunda moeda: ");
        String input2 = sc.nextLine();


        String dadosApi = client.goToSearch(input1, input2);
        JsonParser parser = new JsonParser();
        ExchangeRate exchangeRate = parser.parse(dadosApi);
        service.addData(exchangeRate.toString());
        System.out.println(service);
        yesorno();
    }


}

