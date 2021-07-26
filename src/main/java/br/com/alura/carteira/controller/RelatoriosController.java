package br.com.alura.carteira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.carteira.dto.ItemCarteiraDto;
import br.com.alura.carteira.service.RelatorioService;

@RestController
@RequestMapping("/relatorios")
public class RelatoriosController {

	@Autowired
	private RelatorioService service;

	@GetMapping("/carteira")
	public List<ItemCarteiraDto> relatorioCarteiraDeInvestimentos() {
		return service.carteiraDeInvestimentos();
	}

}
