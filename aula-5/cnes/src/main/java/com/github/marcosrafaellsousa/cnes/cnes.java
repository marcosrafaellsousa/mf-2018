package com.github.marcosrafaellsousa.cnes;
/**
 * INF - UFG
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class cnes {
    public static void main(String[] args) throws IOException {

        String fileURL = cnes.getURLAtual(0);
        System.out.println(fileURL);

    }

    /**
     * Este método pega a data atual (ano + mes) e tenta formar a url, caso não seja possível o download, ele sera
     * chamado como tentativa 1,2 etc. cada tentativa diminui um mês da url, para o caso do mes referenciado não ter
     * arquivo ainda.
     * Considerando que o site nunca vai ficar mais de 1 ano sem atualizar
     *
     * @param tentativa o numero da tentiva (começando no 0)
     * @return a tentavida de um url
     */
    public static String getURLAtual(int tentativa) throws Exception {
        String BASEURL = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_";

        //criar lógica aqui
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataTentativa = dataAtual.minusMonths(tentativa);
        String mesURL = Integer.toString(dataTentativa.get(ChronoField.MONTH_OF_YEAR));
        String anoURL = Integer.toString(dataTentativa.get(ChronoField.YEAR));

        LocalDate dataMinima = LocalDate.of(2016, 06, 01);

        if (dataTentativa.isBefore(dataMinima)) throw new Exception("URL não encontrada para nenhuma data");

        String EXTENCAOURL = ".ZIP";

        //String urlConstruida = BASEURL + anoURL + mesURL + EXTENCAOURL;
        String urlConstruida = "https://drive.google.com/uc?export=download&confirm=kWH_&id=1TZgw_rTTsFm46yYZXKxfAuPkiIc2jtj1";
        return urlConstruida;

        //construir um teste para verificar se a URL está ativa
        URL url = new URL(urlConstruida);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();

        // always check HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) return urlConstruida;
    }

}