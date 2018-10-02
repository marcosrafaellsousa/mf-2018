package com.github.marcosrafaellsousa.cnes;
/**
 * INF - UFG
 */
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class cnes {
    public static void main(String[] args) {

        String fileURL = cnes.getURLAtual(0);

        try {
            DownloadDoArquivoHttp.downloadFile(fileURL);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Este método pega a data atual (ano + mes) e tenta formar a url, caso não seja possível o download, ele sera
     * chamado como tentativa 1,2 etc. cada tentativa diminui um mês da url, para o caso do mes referenciado não ter
     * arquivo ainda.
     * Considerando que o site nunca vai ficar mais de 1 ano sem atualizar
     * @param tentativa o numero da tentiva (começando no 0)
     * @return a tentavida de um url
     */
    public static String getURLAtual(int tentativa) {
    String baseURL = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_";

    //criar lógica aqui
    LocalDate dataAtual = LocalDate.now();
    int mesAtual = dataAtual.get(ChronoField.MONTH_OF_YEAR);
    int anoAtual =  dataAtual.get(ChronoField.YEAR);

    if (mesAtual > tentativa) {
    String dataURL = ((Integer.toString(anoAtual) + (Integer.toString(mesAtual - tentativa))));
    } else {
        String dataURL = ((Integer.toString(anoAtual - 1) + Integer.toString( 12 - (tentativa - 1))));
    }
    String extencaoURL = ".ZIP";

    String urlConstruida = "https://drive.google.com/uc?export=download&confirm=kWH_&id=1TZgw_rTTsFm46yYZXKxfAuPkiIc2jtj1";
    return urlConstruida;
    }

    //construir um teste para verificar se a URL está ativa
}
