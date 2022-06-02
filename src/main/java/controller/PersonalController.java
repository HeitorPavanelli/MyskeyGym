package controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.modelo.Personal;
import controller.dto.PersonalDto;
import controller.form.PersonalForm;
import repository.PersonalRepository;

@RestController
public class PersonalController extends TreinoController{

	@Autowired
	private PersonalRepository personalRepository;
	//para fazer o cadastro de um personal
	@RequestMapping(value="/Personal", method = RequestMethod.POST)
	public ResponseEntity<PersonalDto> cadastrarPersonal(@RequestBody PersonalForm form, UriComponentsBuilder uriBuilder) {
		Personal personal = form.converter(personalRepository);
		personalRepository.save(personal);
		//esse {id} talveza tenha que trocar
		URI uri = uriBuilder.path("/Personal/{id}").buildAndExpand(personal.getId()).toUri();
		return ResponseEntity.created(uri).body(new PersonalDto(personal));
	}
}
