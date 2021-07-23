package br.com.alura.carteira.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString(exclude = {"senha"})
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	private String nome;
	private String login;
	private String senha;

}
