package com.github.marcosrafaellsousa.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Nome")
public class NomeDTO {

    private String id;
    private String individuo;
    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private String nomePreferidoDescricao;
    private String usoCondicionalDescricao;
    private String representacaoUtilizacao;
    private String represetacaoAlternativa;

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String getSufixos() {
        return sufixos;
    }

    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public String getNomePreferidoDescricao() {
        return nomePreferidoDescricao;
    }

    public void setNomePreferidoDescricao(String nomePreferidoDescricao) {
        this.nomePreferidoDescricao = nomePreferidoDescricao;
    }

    public String getUsoCondicionalDescricao() {
        return usoCondicionalDescricao;
    }

    public void setUsoCondicionalDescricao(String usoCondicionalDescricao) {
        this.usoCondicionalDescricao = usoCondicionalDescricao;
    }

    public String getRepresentacaoUtilizacao() {
        return representacaoUtilizacao;
    }

    public void setRepresentacaoUtilizacao(String representacaoUtilizacao) {
        this.representacaoUtilizacao = representacaoUtilizacao;
    }

    public String getRepresetacaoAlternativa() {
        return represetacaoAlternativa;
    }

    public void setRepresetacaoAlternativa(String represetacaoAlternativa) {
        this.represetacaoAlternativa = represetacaoAlternativa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
