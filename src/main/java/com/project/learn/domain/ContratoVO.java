package com.project.learn.domain;

import java.sql.Date;
import java.util.List;

public class ContratoVO {
    private Long id;
    private String devNome;
    private Date devNascimentoDate;
    private Long numRegistro;
    private List<VeiculoVO> veiculos;

    
    public ContratoVO() {
    }
    

    public ContratoVO(Long id, String devNome, Date devNascimentoDate, Long numRegistro, List<VeiculoVO> veiculos) {
        this.id = id;
        this.devNome = devNome;
        this.devNascimentoDate = devNascimentoDate;
        this.numRegistro = numRegistro;
        this.veiculos = veiculos;
    }
    

    public ContratoVO(Long id, String devNome) {
        this.id = id;
        this.devNome = devNome;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getDevNome() {
        return devNome;
    }


    public void setDevNome(String devNome) {
        this.devNome = devNome;
    }


    public Date getDevNascimentoDate() {
        return devNascimentoDate;
    }


    public void setDevNascimentoDate(Date devNascimentoDate) {
        this.devNascimentoDate = devNascimentoDate;
    }


    public Long getNumRegistro() {
        return numRegistro;
    }


    public void setNumRegistro(Long numRegistro) {
        this.numRegistro = numRegistro;
    }


    public List<VeiculoVO> getVeiculos() {
        return veiculos;
    }


    public void setVeiculos(List<VeiculoVO> veiculos) {
        this.veiculos = veiculos;
    }
    
    
}
