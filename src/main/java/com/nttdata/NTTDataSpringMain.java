package com.nttdata;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.models.NTTDataClient;
import com.nttdata.services.NTTDataClientManagementServiceI;

@SpringBootApplication
public class NTTDataSpringMain implements CommandLineRunner{
	
	@Autowired
	private NTTDataClientManagementServiceI clientService;
	
	public static void main(String[] args) {
		SpringApplication.run(NTTDataSpringMain.class, args);
	}
	
	
	//Crear cliente
	@Override
	public void run(String... args) throws Exception {
		final NTTDataClient client1 = new NTTDataClient();
		client1.setName("Luis");
		client1.setSurname1("Fernandez");
		client1.setSurname2("Gonzalez");
		client1.setBirthDate(new Date());
		client1.setDni("65987412C");
		
		//Insertar cliente
		clientService.saveNTTDataClient(client1);
		
		//Buscar por nombre completo
		List<NTTDataClient> customersList = clientService.findByFullName("Luis", "Fernandez", "Gonzalez");
		System.out.println(customersList);
		
		//Actualizar cliente
		client1.setName("Federico");
		clientService.updateNTTDataClient(client1);
		
		//Buscar por id
		final Optional<NTTDataClient> clientByID = clientService.findById(client1.getId());
		System.out.println(clientByID);
		
		
		
	}

}
