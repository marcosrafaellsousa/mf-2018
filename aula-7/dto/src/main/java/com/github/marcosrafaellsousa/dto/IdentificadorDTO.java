package com.github.marcosrafaellsousa.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Identificador")
public class IdentificadorDTO {

    private String id;
    private String idividuo;
    private String designacao;
    private String areaGeograficaDescricao;
    private char areaGeograficaAlternativo;
    private String emissor;
    private Date data;
    private String tipoDescricao;
    private String certidaoTipoDescricao;
    private String certidaoCartorio;
    private String certidaoLivro;
    private String certidaoFolha;
    private String certidaoTermo;
    private String tituloEleitoralZona;
    private String tituloEleitoralSessao;

    public String getIdividuo() {
        return idividuo;
    }

    public void setIdividuo(String idividuo) {
        this.idividuo = idividuo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getAreaGeograficaDescricao() {
        return areaGeograficaDescricao;
    }

    public void setAreaGeograficaDescricao(String areaGeograficaDescricao) {
        this.areaGeograficaDescricao = areaGeograficaDescricao;
    }

    public char getAreaGeograficaAlternativo() {
        return areaGeograficaAlternativo;
    }

    public void setAreaGeograficaAlternativo(char areaGeograficaAlternativo) {
        this.areaGeograficaAlternativo = areaGeograficaAlternativo;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoDescricao() {
        return tipoDescricao;
    }

    public void setTipoDescricao(String tipoDescricao) {
        this.tipoDescricao = tipoDescricao;
    }

    public String getCertidaoTipoDescricao() {
        return certidaoTipoDescricao;
    }

    public void setCertidaoTipoDescricao(String certidaoTipoDescricao) {
        this.certidaoTipoDescricao = certidaoTipoDescricao;
    }

    public String getCertidaoCartorio() {
        return certidaoCartorio;
    }

    public void setCertidaoCartorio(String certidaoCartorio) {
        this.certidaoCartorio = certidaoCartorio;
    }

    public String getCertidaoLivro() {
        return certidaoLivro;
    }

    public void setCertidaoLivro(String certidaoLivro) {
        this.certidaoLivro = certidaoLivro;
    }

    public String getCertidaoFolha() {
        return certidaoFolha;
    }

    public void setCertidaoFolha(String certidaoFolha) {
        this.certidaoFolha = certidaoFolha;
    }

    public String getCertidaoTermo() {
        return certidaoTermo;
    }

    public void setCertidaoTermo(String certidaoTermo) {
        this.certidaoTermo = certidaoTermo;
    }

    public String getTituloEleitoralZona() {
        return tituloEleitoralZona;
    }

    public void setTituloEleitoralZona(String tituloEleitoralZona) {
        this.tituloEleitoralZona = tituloEleitoralZona;
    }

    public String getTituloEleitoralSessao() {
        return tituloEleitoralSessao;
    }

    public void setTituloEleitoralSessao(String tituloEleitoralSessao) {
        this.tituloEleitoralSessao = tituloEleitoralSessao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
