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

import com.project.learn.domain.VeiculoVO;
import com.project.learn.service.VeiculoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("veiculos")
@RequiredArgsConstructor
public class VeiculoControler {
    private final VeiculoService veiculoService;

    @GetMapping("list")
    public ResponseEntity<List<VeiculoVO>> list() {
        return ResponseEntity.ok(veiculoService.listAll());
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<VeiculoVO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(veiculoService.findById(id));
    }

    @PostMapping("save")
    public ResponseEntity<VeiculoVO> save(@RequestBody VeiculoVO veiculo) {
        return new ResponseEntity<>(veiculoService.save(veiculo), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        veiculoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping()
    public ResponseEntity<Void> replace(@RequestBody VeiculoVO veiculo) {
        veiculoService.replace(veiculo);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
