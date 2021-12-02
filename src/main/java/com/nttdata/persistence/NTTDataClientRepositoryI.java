package com.nttdata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.models.NTTDataClient;
/**
 * Hibernate - Spring - Taller 3
 * 
 * @author David C�sar Fern�ndez Aliseda
 *
 */
@Repository
public interface NTTDataClientRepositoryI extends JpaRepository<NTTDataClient, Long>{
	
	public List<NTTDataClient> findByNameAndSurname1AndSurname2(String name, String surname1, String surname2);
	
}
