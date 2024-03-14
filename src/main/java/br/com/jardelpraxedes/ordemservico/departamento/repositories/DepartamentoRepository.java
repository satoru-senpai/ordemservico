package br.com.jardelpraxedes.ordemservico.departamento.repositories;

import br.com.jardelpraxedes.ordemservico.departamento.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
