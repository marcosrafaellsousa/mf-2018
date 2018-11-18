package com.github.marcosrafaellsousa.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DadoDemografico")
public class DadoDemograficoDTO {
    private String individuo;
    private Date nascimento;
    private String nascimentoAcuracia;
    private String nascimentoSeguimentoDescricao;
    private String nascimentoPlurarlidadeDecricao;
    private String nascimentoOrdemDescricao;
    private String obito;
    private String obitoAcuracia;
    private String obitoFonteDescricao;
    private String sexoDescricao;
    private char sexoAlternativo;
    private String mae;
    private String pai;
    private String situacaoFamiliarDescricao;
    private String racaDescricao;
    private String comentario;
    private String nacionalidadeDescricao;
    private String municipio;
    private String estadoNome;
    private String paisNome;
    private Date dataEntradaPais;

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNascimentoAcuracia() {
        return nascimentoAcuracia;
    }

    public void setNascimentoAcuracia(String nascimentoAcuracia) {
        this.nascimentoAcuracia = nascimentoAcuracia;
    }

    public String getNascimentoSeguimentoDescricao() {
        return nascimentoSeguimentoDescricao;
    }

    public void setNascimentoSeguimentoDescricao(String nascimentoSeguimentoDescricao) {
        this.nascimentoSeguimentoDescricao = nascimentoSeguimentoDescricao;
    }

    public String getNascimentoPlurarlidadeDecricao() {
        return nascimentoPlurarlidadeDecricao;
    }

    public void setNascimentoPlurarlidadeDecricao(String nascimentoPlurarlidadeDecricao) {
        this.nascimentoPlurarlidadeDecricao = nascimentoPlurarlidadeDecricao;
    }

    public String getNascimentoOrdemDescricao() {
        return nascimentoOrdemDescricao;
    }

    public void setNascimentoOrdemDescricao(String nascimentoOrdemDescricao) {
        this.nascimentoOrdemDescricao = nascimentoOrdemDescricao;
    }

    public String getObito() {
        return obito;
    }

    public void setObito(String obito) {
        this.obito = obito;
    }

    public String getObitoAcuracia() {
        return obitoAcuracia;
    }

    public void setObitoAcuracia(String obitoAcuracia) {
        this.obitoAcuracia = obitoAcuracia;
    }

    public String getObitoFonteDescricao() {
        return obitoFonteDescricao;
    }

    public void setObitoFonteDescricao(String obitoFonteDescricao) {
        this.obitoFonteDescricao = obitoFonteDescricao;
    }

    public String getSexoDescricao() {
        return sexoDescricao;
    }

    public void setSexoDescricao(String sexoDescricao) {
        this.sexoDescricao = sexoDescricao;
    }

    public char getSexoAlternativo() {
        return sexoAlternativo;
    }

    public void setSexoAlternativo(char sexoAlternativo) {
        this.sexoAlternativo = sexoAlternativo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getSituacaoFamiliarDescricao() {
        return situacaoFamiliarDescricao;
    }

    public void setSituacaoFamiliarDescricao(String situacaoFamiliarDescricao) {
        this.situacaoFamiliarDescricao = situacaoFamiliarDescricao;
    }

    public String getRacaDescricao() {
        return racaDescricao;
    }

    public void setRacaDescricao(String racaDescricao) {
        this.racaDescricao = racaDescricao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNacionalidadeDescricao() {
        return nacionalidadeDescricao;
    }

    public void setNacionalidadeDescricao(String nacionalidadeDescricao) {
        this.nacionalidadeDescricao = nacionalidadeDescricao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstadoNome() {
        return estadoNome;
    }

    public void setEstadoNome(String estadoNome) {
        this.estadoNome = estadoNome;
    }

    public String getPaisNome() {
        return paisNome;
    }

    public void setPaisNome(String paisNome) {
        this.paisNome = paisNome;
    }

    public Date getDataEntradaPais() {
        return dataEntradaPais;
    }

    public void setDataEntradaPais(Date dataEntradaPais) {
        this.dataEntradaPais = dataEntradaPais;
    }
}
