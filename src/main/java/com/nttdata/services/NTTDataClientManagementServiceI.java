package com.nttdata.services;

import java.util.List;
import java.util.Optional;

import com.nttdata.models.NTTDataClient;
/**
 * Hibernate - Spring - Taller 3
 * 
 * @author David C�sar Fern�ndez Aliseda
 *
 */
public interface NTTDataClientManagementServiceI {
	
	public List<NTTDataClient> findByFullName(String name, String surname1, String surname2);
	
	public void saveNTTDataClient(NTTDataClient client);
	
	public List<NTTDataClient> findAllNTTDataClient();
	
	public Optional<NTTDataClient> findById(Long id);
	
	public void deleteNTTDataClient(NTTDataClient client);
	
	public void updateNTTDataClient(NTTDataClient client);
	
	
	
}
