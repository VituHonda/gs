package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.exception.DBException;
import br.com.fiap.model.Usuario;

public interface UsuarioDAO {

	void cadastrar(Usuario usuario) throws DBException;
	void atualizar(Usuario usuario) throws DBException; 
	void remover(int id) throws DBException;
	Usuario buscar(int id);
	List<Usuario> listar();
	
}