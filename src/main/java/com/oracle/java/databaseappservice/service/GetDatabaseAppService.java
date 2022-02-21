package com.oracle.java.databaseappservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.java.databaseappservice.entity.Passagem;
import com.oracle.java.databaseappservice.model.response.GetDatabaseAppServiceResponse;
import com.oracle.java.databaseappservice.model.vo.GroupDatabaseAppServiceResponse;
import com.oracle.java.databaseappservice.repository.IDatabaseAppServiceRepository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class GetDatabaseAppService {
	
	@Autowired
	private IDatabaseAppServiceRepository repository;
	
	
	public GetDatabaseAppServiceResponse execute () {
		log.info("Executando Busca ...");
		GetDatabaseAppServiceResponse response = new GetDatabaseAppServiceResponse();
		try {
		List<Passagem> entities = repository.findAll();
		
		if (entities.size() > 0) {
			response.setItems(new ArrayList<GroupDatabaseAppServiceResponse>());
			GroupDatabaseAppServiceResponse item = null;
			for (Passagem entity : entities) {
				item = new GroupDatabaseAppServiceResponse();
				item.setANO_FABRICACAO(entity.getANO_FABRICACAO());
				item.setATUALIZACAO(entity.getATUALIZACAO());
				item.setBAIRRO(entity.getBAIRRO());
				item.setCEP(entity.getCEP());
				item.setCHASSI(entity.getCHASSI());
				item.setCIDADE(entity.getCIDADE());
				item.setCODIGO_CONCESSIONARIA(entity.getCODIGO_CONCESSIONARIA());
				item.setCPF_CLIENTE(entity.getCPF_CLIENTE());
				item.setCPF_CONSULTOR_TECNICO(entity.getCPF_CONSULTOR_TECNICO());
				item.setDATA_ABERTURA_OS(entity.getDATA_ABERTURA_OS());
				item.setDATA_FECHAMENTO_OS(entity.getDATA_FECHAMENTO_OS());
				item.setDATA_NASCIMENTO(entity.getDATA_NASCIMENTO());
				item.setEMAIL(entity.getEMAIL());
				item.setENDERECO(entity.getENDERECO());
				item.setESTADO(entity.getESTADO());
				item.setGENERO_CLIENTE(entity.getGENERO_CLIENTE());
				item.setID_PESQUISA(entity.getID_PESQUISA());
				item.setLINHA(entity.getLINHA());
				item.setMODELO(entity.getMODELO());
				item.setMODELO_NM(entity.getMODELO_NM());
				item.setNOME_CLIENTE(entity.getNOME_CLIENTE());
				item.setNOME_CONSULTOR_TECNICO(entity.getNOME_CONSULTOR_TECNICO());
				item.setNOME_FANTASIA_CONCESSIONARIA(entity.getNOME_FANTASIA_CONCESSIONARIA());
				item.setNUMERO_OS(entity.getNUMERO_OS());
				item.setPCD(entity.getPCD());
				item.setQUILOMETRAGEM(entity.getQUILOMETRAGEM());
				item.setSTATUS_OS(entity.getSTATUS_OS());
				item.setTELEFONE_CELULAR(entity.getTELEFONE_CELULAR());
				item.setTELEFONE_COMERCIAL(entity.getTELEFONE_COMERCIAL());
				item.setTELEFONE_RESIDENCIAL(entity.getTELEFONE_RESIDENCIAL());
				item.setTIPO_OS(entity.getTIPO_OS());
				response.getItems().add(item);
			}
		}
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
