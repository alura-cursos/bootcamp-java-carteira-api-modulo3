package br.com.alura.carteira.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	public Page<TransacaoDto> listar(Pageable paginacao) {
		return repository
				.findAll(paginacao)
				.map(t -> modelMapper.map(t, TransacaoDto.class));
	}

	@Transactional
	public TransacaoDto cadastrar(TransacaoFormDto dto) {
		Long idUsuario = dto.getUsuarioId();
		Usuario usuario = usuarioRepository.getById(idUsuario);

		Transacao transacao = modelMapper.map(dto, Transacao.class);
		transacao.setId(null);
		transacao.setUsuario(usuario);

		repository.save(transacao);

		return modelMapper.map(transacao, TransacaoDto.class);
	}

}
