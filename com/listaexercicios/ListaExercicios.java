package com.listaexercicios;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaExercicios {
    private static final Logger LOGGER = Logger.getLogger(ListaExercicios.class.getName());
    protected void exercicio1() {
        Scanner leitor = new Scanner(System.in);
        LOGGER.log(Level.INFO, "Digite o valor de n:\n");
        int n = leitor.nextInt();
    }

    protected void exercicio2() {

    }

    protected void exercicio3() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite o primeiro valor:\n");
        int primeiro = leitor.nextInt();

        LOGGER.log(Level.INFO, "Digite o segundo valor:\n");
        int segundo = leitor.nextInt();

        LOGGER.log(Level.INFO, "Digite o terceiro valor:\n");
        int terceiro = leitor.nextInt();

        LOGGER.log(Level.INFO, (getSomaTres(primeiro, segundo, terceiro)));
    }

    private String getSomaTres(int primeiro, int segundo, int terceiro) {
        return String.valueOf(primeiro + segundo + terceiro);
    }

    protected void exercicio4() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite um numero:\n");

        getPosNeg(leitor.nextInt());
    }

    private void getPosNeg(int num) {
        if (num > 0) {
            LOGGER.log(Level.INFO, "P");
        } else {
            LOGGER.log(Level.INFO, "N");
        }
    }

    protected void exercicio5() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite a taxa de imposto:\n");
        int taxaImposto = leitor.nextInt();

        LOGGER.log(Level.INFO, "Digite o custo:\n");
        int custo = leitor.nextInt();

        LOGGER.log(Level.INFO, somaImposto(taxaImposto * 0.01, custo));
    }

    private String somaImposto(double taxaImposto, int custo) {
        // Taxa sobre custo + custo inicial
        return String.valueOf(taxaImposto * custo + custo);
    }

    protected void exercicio6() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite uma data no formato 24 horas (dd-MM-yyyy HH:mm:ss):\n");

        printDataConvertida(convertData24to12(leitor.next()));
    }
    
    private String convertData24to12(String data) {
        // Pattern 24 horas
        String pattern24 = "dd-MM-yyyy HH:mm:ss";

        // Pattern 12 horas
        String pattern12 = "dd/MM/yyyy hh:mm:ss";

        Locale local = new Locale("pt", "BR");
        SimpleDateFormat df = new SimpleDateFormat(pattern24, local);
        Date dataParseada = new Date();

        try {
            dataParseada = (df.parse(data));
            df.applyPattern(pattern12);
        } catch (Exception ex) {
            LOGGER.log(Level.INFO, "Erro");
        }
        return df.format(dataParseada);
    }

    private void printDataConvertida(String data) {
        LOGGER.log(Level.INFO, data);
    }
    
    protected void exercicio7() {

    }

    protected void exercicio8() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite um numero:\n");

        coundDigits(leitor.nextInt());
    }

    private void coundDigits(int num) {
        LOGGER.log(Level.INFO, String.valueOf(String.valueOf(num).length()));
    }

    protected void exercicio9() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite um numero:\n");

        StringBuilder sb = new StringBuilder(leitor.next());

        LOGGER.log(Level.INFO, String.valueOf(sb.reverse()));
    }

    protected void exercicio10() {
        Random random = new Random();

        int dado = random.nextInt(12 - 2 + 1) + 2;

        while (true) {
            switch (dado) {
                case 7, 11:
                    LOGGER.log(Level.INFO, "Natural, ganhou!");
                    break;
                case 2, 3, 12:
                    LOGGER.log(Level.INFO, "Craps, perdeu!");
                    break;
                case 4, 5, 6, 8, 9, 10:
                    LOGGER.log(Level.INFO, "Ponto!");
                    break;
                default:
            }
            break;
        }
    }

    protected void exercicio11() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite uma data no formato DD/MM/YYYY:\n");

        printDataConvertida(convertDataMesExtenso(leitor.next()));
    }

    private String convertDataMesExtenso(String data) {
        // Pattern DD/MM/YYYY
        String patternNormal = "DD/MM/YYYY";

        // Pattern mes por extenso
        String patternMesExtenso = "DD/MMM/YYYY";

        Locale local = new Locale("pt", "BR");
        SimpleDateFormat df = new SimpleDateFormat(patternNormal, local);
        Date dataParseada = new Date();

        try {
            dataParseada = (df.parse(data));
            df.applyPattern(patternMesExtenso);
        } catch (Exception ex) {
            LOGGER.log(Level.INFO, "Erro");
        }
        return df.format(dataParseada);
    }

    protected void exercicio12() {
        Scanner leitor = new Scanner(System.in);

        LOGGER.log(Level.INFO, "Digite uma string:\n");

        String strNormal = leitor.next();

        List<String> letras = Arrays.asList(strNormal.split(""));

        Collections.shuffle(letras);

        String strEmbaralhada = "";

        StringBuilder sb = new StringBuilder();

        for (String letra : letras) {
            strEmbaralhada = String.valueOf(sb.append(letra));
        }
        LOGGER.log(Level.INFO, strEmbaralhada.toUpperCase());
    }

    protected void exercicio13() {

    }

    protected void exercicio14() {

    }
}
