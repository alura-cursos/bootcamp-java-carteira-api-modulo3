package br.com.alura.carteira.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.carteira.dto.TransacaoDto;
import br.com.alura.carteira.dto.TransacaoFormDto;
import br.com.alura.carteira.service.TransacaoService;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

	@Autowired
	private TransacaoService service;

	@GetMapping
	public List<TransacaoDto> listar() {
		return service.listar();
	}

	@PostMapping
	public void cadastrar(@RequestBody @Valid TransacaoFormDto dto) {
		service.cadastrar(dto);
	}

}
