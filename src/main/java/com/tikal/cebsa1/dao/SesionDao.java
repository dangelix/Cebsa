package com.tikal.cebsa1.dao;

import java.util.List;

import com.tikal.cebsa1.modelo.login.Usuario;


public interface SesionDao {
	
	public boolean crearUsuario(Usuario usuario);
	public boolean eliminarUsuario(String usuario);
	public Usuario consultarUsuario(String usuario);
	public List<Usuario> consultarUsuarios();
	public boolean actualizarUsuario(Usuario usuario);
	public boolean eliminarUsuario(Usuario usuario);
	public boolean actualizarUsuarios(String nombrePerfilviejo, String nombrePerfilNuevo);
	public Usuario consultarPorEmail(String email);
	
}