package com.nttdata.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.NTTDataClient;
import com.nttdata.persistence.NTTDataClientRepositoryI;
/**
 * Hibernate - Spring - Taller 3
 * 
 * @author David C�sar Fern�ndez Aliseda
 *
 */
@Service
public class NTTDataClientManagementServiceImpl implements NTTDataClientManagementServiceI{
	
	@Autowired
	NTTDataClientRepositoryI repositoryI;
	
	
	@Override
	public List<NTTDataClient> findByFullName(String name, String surname1, String surname2) {
		List<NTTDataClient> clientList = new ArrayList<NTTDataClient>();
		
		clientList= repositoryI.findByNameAndSurname1AndSurname2(name, surname1, surname2);
		return clientList;
		
	}


	@Override
	public void deleteNTTDataClient(NTTDataClient client) {
		repositoryI.delete(client);
		
	}

	@Override
	public void updateNTTDataClient(NTTDataClient client) {
		repositoryI.save(client);
		
	}

	@Override
	public void saveNTTDataClient(NTTDataClient client) {
		repositoryI.save(client);
		
	}



	@Override
	public List<NTTDataClient> findAllNTTDataClient() {
		List<NTTDataClient> clientList = new ArrayList<NTTDataClient>();
		clientList = repositoryI.findAll();
		
		return clientList;
	}



	@Override
	public Optional<NTTDataClient> findById(Long id) {
		Optional<NTTDataClient> client = repositoryI.findById(id);
		
		return client;
	}

}
