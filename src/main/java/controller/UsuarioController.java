package controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.modelo.Usuario;
import controller.dto.UsuarioDto;
import controller.form.UsuarioForm;
import repository.UsuarioRepository;

@RestController
public class UsuarioController extends PersonalController{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Faz o cadastro de um usuario
	@RequestMapping(value="/Usuario", method = RequestMethod.POST)
	public ResponseEntity<UsuarioDto> cadastrarUsuario(@RequestBody UsuarioForm form, UriComponentsBuilder uriBuilder) {
		Usuario usuario = form.converter(usuarioRepository);
		usuarioRepository.save(usuario);
		
		URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();
		return ResponseEntity.created(uri).body(new UsuarioDto(usuario));
	}
}
