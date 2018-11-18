package com.github.marcosrafaellsousa.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Vinculo")
public class VinculoDTO {

    private String identificadorId;
    private String individuo;
    private String relacionamentoDescricao;
    private Date dataInicio;
    private Date dataFinal;

    public String getIdentificadorId() {
        return identificadorId;
    }

    public void setIdentificadorId(String identificadorId) {
        this.identificadorId = identificadorId;
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getRelacionamentoDescricao() {
        return relacionamentoDescricao;
    }

    public void setRelacionamentoDescricao(String relacionamentoDescricao) {
        this.relacionamentoDescricao = relacionamentoDescricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
