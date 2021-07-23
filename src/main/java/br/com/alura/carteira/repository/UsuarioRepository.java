package br.com.alura.carteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.carteira.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}