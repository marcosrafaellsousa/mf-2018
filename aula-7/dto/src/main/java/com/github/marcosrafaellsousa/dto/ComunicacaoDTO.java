package com.github.marcosrafaellsousa.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Comunicacao")
public class ComunicacaoDTO {

    private String individuo;
    private String meioDescricao;
    private char meioAlternativo;
    private String preferenciaDescricao;
    private String detalhe;
    private String usoDecricao;
    private String usoAlternativo;

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getMeioDescricao() {
        return meioDescricao;
    }

    public void setMeioDescricao(String meioDescricao) {
        this.meioDescricao = meioDescricao;
    }

    public char getMeioAlternativo() {
        return meioAlternativo;
    }

    public void setMeioAlternativo(char meioAlternativo) {
        this.meioAlternativo = meioAlternativo;
    }

    public String getPreferenciaDescricao() {
        return preferenciaDescricao;
    }

    public void setPreferenciaDescricao(String preferenciaDescricao) {
        this.preferenciaDescricao = preferenciaDescricao;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getUsoDecricao() {
        return usoDecricao;
    }

    public void setUsoDecricao(String usoDecricao) {
        this.usoDecricao = usoDecricao;
    }

    public String getUsoAlternativo() {
        return usoAlternativo;
    }

    public void setUsoAlternativo(String usoAlternativo) {
        this.usoAlternativo = usoAlternativo;
    }
}
