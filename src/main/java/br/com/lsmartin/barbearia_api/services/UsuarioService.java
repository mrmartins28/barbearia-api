package br.com.lsmartin.barbearia_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lsmartin.barbearia_api.model.Usuario;
import br.com.lsmartin.barbearia_api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		
		this.usuarioRepository = usuarioRepository;
	}
	
	public Usuario salvar(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}

}
