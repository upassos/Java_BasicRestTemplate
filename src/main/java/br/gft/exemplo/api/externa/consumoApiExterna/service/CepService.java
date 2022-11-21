package br.gft.exemplo.api.externa.consumoApiExterna.service;

import br.gft.exemplo.api.externa.consumoApiExterna.response.CepResponse;

public interface CepService {

	public CepResponse getCep(String CEP) throws Exception;
	
}
