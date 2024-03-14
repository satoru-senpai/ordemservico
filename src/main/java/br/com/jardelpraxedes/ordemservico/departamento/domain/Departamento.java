package br.com.jardelpraxedes.ordemservico.departamento.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DEPARTAMENTO")
    private Integer inDepartamento;
    @Column(name = "NOME_DEPARTAMENTO")
    private String nomeDepartamento;

    public Departamento() {
    }

    public Departamento(Integer inDepartamento, String nomeDepartamento) {
        this.inDepartamento = inDepartamento;
        this.nomeDepartamento = nomeDepartamento;
    }
}
