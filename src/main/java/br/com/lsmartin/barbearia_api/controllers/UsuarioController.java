package br.com.lsmartin.barbearia_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsmartin.barbearia_api.dto.UsuarioDTO;
import br.com.lsmartin.barbearia_api.dto.UsuarioRepostaDTO;
import br.com.lsmartin.barbearia_api.model.Usuario;
import br.com.lsmartin.barbearia_api.services.UsuarioService;


@RestController
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		
		this.usuarioService = usuarioService;
	}
	
	@PostMapping("/salvar")
	@ResponseBody
	public ResponseEntity<UsuarioRepostaDTO> salvar(@RequestBody UsuarioDTO dto ){
		
		Usuario user = usuarioService.salvar(dto.transformaParObjeto());
		
		return new ResponseEntity<>(UsuarioRepostaDTO.transformaEmDTO(user), HttpStatus.CREATED);
	}

}
