package com.project.learn.domain;

public class VeiculoVO {
    private Long id;
    private Long numGrevame;
    private Long numRenavam;
    private Long numChassi;
    private String placa;
    private ContratoVO contrato;

    
    
    public VeiculoVO(Long id, String placa) {
        this.id = id;
        this.placa = placa;
    }

    public VeiculoVO(Long id, Long numGrevame, Long numRenavam, String placa, Long numChassi, ContratoVO contrato) {
        this.id = id;
        this.numGrevame = numGrevame;
        this.numRenavam = numRenavam;
        this.placa = placa;
        this.numChassi = numChassi;
        this.contrato = contrato;
    }

    public VeiculoVO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumGrevame() {
        return numGrevame;
    }

    public void setNumGrevame(Long numGrevame) {
        this.numGrevame = numGrevame;
    }

    public Long getNumRenavam() {
        return numRenavam;
    }

    public void setNumRenavam(Long numRenavam) {
        this.numRenavam = numRenavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(Long numChassi) {
        this.numChassi = numChassi;
    }

    public ContratoVO getContrato() {
        return contrato;
    }

    public void setContrato(ContratoVO contrato) {
        this.contrato = contrato;
    }

    
}
