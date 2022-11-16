package br.gft.exemplo.api.externa.consumoApiExterna.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import br.gft.exemplo.api.externa.consumoApiExterna.response.CepResponse;
import br.gft.exemplo.api.externa.consumoApiExterna.service.CepService;

@Service
@Transactional
public class CepServiceImpl implements CepService{

	@Override
	public CepResponse getCep(String CEP) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		String URLAPI = "https://viacep.com.br/ws/"+CEP+"/json/";
		CepResponse response = restTemplate.getForObject(URLAPI, CepResponse.class);
		return response;
	}

}
