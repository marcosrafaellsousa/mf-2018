package br.ufg.inf.mf.pratica;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Nome {
    
    public static void main(String args[]){
        
        LocalDate hoje=LocalDate.now();
        DateTimeFormatter padraoDaData = DateTimeFormatter.ofPattern
            ("EEEE",Locale.getDefault());
        String dataNaLinguaPadrao = hoje.format(padraoDaData);
        System.out.println(dataNaLinguaPadrao);
        
    }
    
}