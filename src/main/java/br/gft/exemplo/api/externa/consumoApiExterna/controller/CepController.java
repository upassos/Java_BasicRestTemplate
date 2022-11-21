package br.gft.exemplo.api.externa.consumoApiExterna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gft.exemplo.api.externa.consumoApiExterna.response.CepResponse;
import br.gft.exemplo.api.externa.consumoApiExterna.service.CepService;

@RestController
@RequestMapping("/CEP")
public class CepController {
	
	@Autowired
	private CepService cepService;

	@CrossOrigin
	@GetMapping("/endereco")
	public ResponseEntity<CepResponse> getEndereco(@RequestParam("cep") String cep ) throws Exception{
		CepResponse retorno = cepService.getCep(cep);
		return new ResponseEntity<CepResponse>(retorno, HttpStatus.OK);
	} 
}
