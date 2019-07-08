package com.tikal.cebsa1.dao;

import com.tikal.cebsa1.modelo.login.Sucursal;

public interface SucursalDao {
	
	public void save(Sucursal s);

	public void delete(Sucursal s);

	public void update(Sucursal s);
	
	public Sucursal consult(Long id);
	
	//public static AeronaveEntity consult(String numeroSerie);
	
    
	public void findAll(Sucursal s);	

}
