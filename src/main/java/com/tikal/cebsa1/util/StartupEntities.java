package com.tikal.cebsa1.util;

import org.springframework.stereotype.Component;

import com.googlecode.objectify.ObjectifyService;
import com.tikal.cebsa1.modelo.login.Perfil;
import com.tikal.cebsa1.modelo.login.SessionEntity;
import com.tikal.cebsa1.modelo.login.Sucursal;
import com.tikal.cebsa1.modelo.login.Usuario;




@Component
public class StartupEntities  {
	
	
	public StartupEntities() {
		
		
		
		ObjectifyService.register(Perfil.class);
		ObjectifyService.register(SessionEntity.class);
		ObjectifyService.register(Sucursal.class);
		ObjectifyService.register(Usuario.class);

		
	}
	  
    
    
}
