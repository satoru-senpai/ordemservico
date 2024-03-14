package br.com.jardelpraxedes.ordemservico.departamento.service;


import br.com.jardelpraxedes.ordemservico.departamento.domain.Departamento;
import br.com.jardelpraxedes.ordemservico.departamento.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServico {

    @Autowired
    private DepartamentoRepository departamentoRepository;
    public Departamento criarDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public List<Departamento> listarDepartamento(){
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> buscarDepartamento(Integer idDepartamento) {
        return departamentoRepository.findById(idDepartamento);

    }

    public void deletarDepartamento(Integer idDepartamento) {
        departamentoRepository.deleteById(idDepartamento);

    }

}
