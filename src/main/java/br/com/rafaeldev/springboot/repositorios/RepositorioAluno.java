package br.com.rafaeldev.springboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaeldev.springboot.entidades.Aluno;

public interface RepositorioAluno extends JpaRepository<Aluno, Long> {

}
