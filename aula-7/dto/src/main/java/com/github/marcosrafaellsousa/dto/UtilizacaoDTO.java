package com.github.marcosrafaellsousa.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Utilizacao")
public class UtilizacaoDTO {

    private String nomeId;
    private String usoDescricao;
    private String usoAlternativo;
    private String identificadorId;
    private Date dataInicial;
    private Date dataFinal;

    public String getNomeId() {
        return nomeId;
    }

    public void setNomeId(String nomeId) {
        this.nomeId = nomeId;
    }

    public String getUsoDescricao() {
        return usoDescricao;
    }

    public void setUsoDescricao(String usoDescricao) {
        this.usoDescricao = usoDescricao;
    }

    public String getUsoAlternativo() {
        return usoAlternativo;
    }

    public void setUsoAlternativo(String usoAlternativo) {
        this.usoAlternativo = usoAlternativo;
    }

    public String getIdentificadorId() {
        return identificadorId;
    }

    public void setIdentificadorId(String identificadorId) {
        this.identificadorId = identificadorId;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
