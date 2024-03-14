package br.com.jardelpraxedes.ordemservico.departamento.resources;

import br.com.jardelpraxedes.ordemservico.departamento.domain.Departamento;
import br.com.jardelpraxedes.ordemservico.departamento.service.DepartamentoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoResource {


    @Autowired
    private DepartamentoServico departamentoServico;

    @PostMapping
    public ResponseEntity<Departamento> criarDepartamento(@RequestBody Departamento departamento) {
       var novoDepartamento = departamentoServico.criarDepartamento(departamento);
       return new ResponseEntity<>(novoDepartamento, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamento(){
        var departamentos = departamentoServico.listarDepartamento();
        return new ResponseEntity<>(departamentos, HttpStatus.OK);
    }

    @DeleteMapping("/idDepartamento")
    public ResponseEntity<void> deletarDeártamento(@PathVariable Integer idDepartamento){
        departamentoServico.deletarDepartamento(idDepartamento);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
