package com.project.learn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.project.learn.domain.ContratoVO;
import com.project.learn.domain.VeiculoVO;

@Service
public class VeiculoService {

    private List<VeiculoVO> lista = new ArrayList<VeiculoVO>(List.of(new VeiculoVO(1L, "ABCD"), new VeiculoVO(2L, "DCBA")));

    public List<VeiculoVO> listAll() {
        return lista;
    }

    public VeiculoVO findById(Long id) {
        return lista.stream().filter(VeiculoVO -> VeiculoVO.getId().equals(id)).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Veiculo not fund"));
    }

    public VeiculoVO save(VeiculoVO veiculo) {
        veiculo.setId(ThreadLocalRandom.current().nextLong(10, 10000));
        lista.add(veiculo);
        return veiculo;
    }

    public void delete(Long id) {
        lista.remove(findById(id));
    }

    public void replace(VeiculoVO veiculo) {
        delete(veiculo.getId());
        lista.add(veiculo);
    }

    public void setContrato(Long id, ContratoVO contratoVO) {
        findById(id).setContrato(contratoVO);
    }
}
