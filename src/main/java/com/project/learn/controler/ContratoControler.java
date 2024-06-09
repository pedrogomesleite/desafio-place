package com.project.learn.controler;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.learn.domain.ContratoVO;
import com.project.learn.domain.VeiculoVO;
import com.project.learn.service.ContratoService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("contratos")
@RequiredArgsConstructor
public class ContratoControler {
    
    private final ContratoService contratoService;

    @GetMapping("list")
    public ResponseEntity<List<ContratoVO>> list() {
        return ResponseEntity.ok(contratoService.listAll());
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<ContratoVO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(contratoService.findById(id));
    }

    @PostMapping("save")
    public ResponseEntity<ContratoVO> save(@RequestBody ContratoVO Contrato) {
        return new ResponseEntity<>(contratoService.save(Contrato), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        contratoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping()
    public ResponseEntity<Void> replace(@RequestBody ContratoVO Contrato) {
        contratoService.replace(Contrato);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Void> addVeiculo(@RequestBody VeiculoVO veiculo, @PathVariable Long id) {
        contratoService.addVeiculo(id, veiculo);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
