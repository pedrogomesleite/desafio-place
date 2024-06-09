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
public class ContratoService {
    private ArrayList<ContratoVO> lista = new ArrayList<ContratoVO>(List.of(new ContratoVO(1L, "Pedro"), new ContratoVO(2L, "Paulo")));

    public ArrayList<ContratoVO> listAll() {
        return lista;
    }

    public ContratoVO findById(Long id) {
        return lista.stream().filter(ContratoVO -> ContratoVO.getId().equals(id)).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Contrato not fund"));
    }

    public ContratoVO save(ContratoVO contrato) {
        contrato.setId(ThreadLocalRandom.current().nextLong(10, 10000));
        lista.add(contrato);
        return contrato;
    }

    public void delete(Long id) {
        lista.remove(findById(id));
    }

    public void replace(ContratoVO contrato) {
        delete(contrato.getId());
        lista.add(contrato);
    }

    public void addVeiculo(Long id,VeiculoVO veiculo) {
        ContratoVO contratoVO = findById(id);
        if(contratoVO.getVeiculos() == null) {
            contratoVO.setVeiculos(new ArrayList<VeiculoVO>());
            contratoVO.getVeiculos().add(veiculo);
        }
        else {
            contratoVO.getVeiculos().add(veiculo);
        }
        veiculo.setContrato(contratoVO);
    }
}
