package br.com.alura.carteira.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alura.carteira.dto.TransacaoDto;
import br.com.alura.carteira.dto.TransacaoFormDto;
import br.com.alura.carteira.modelo.Transacao;
import br.com.alura.carteira.modelo.Usuario;
import br.com.alura.carteira.repository.TransacaoRepository;
import br.com.alura.carteira.repository.UsuarioRepository;

@Service
public class TransacaoService {

	@Autowired
	private TransacaoRepository repository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private ModelMapper modelMapper = new ModelMapper();

	public List<TransacaoDto> listar() {
		return repository.findAll().stream().map(t -> modelMapper.map(t, TransacaoDto.class)).collect(Collectors.toList());
	}

	@Transactional
	public void cadastrar(TransacaoFormDto dto) {
		Long idUsuario = dto.getUsuarioId();
		Usuario usuario = usuarioRepository.getById(idUsuario);
		
		Transacao transacao = modelMapper.map(dto, Transacao.class);
		transacao.setUsuario(usuario);
		
		repository.save(transacao);
	}

}
