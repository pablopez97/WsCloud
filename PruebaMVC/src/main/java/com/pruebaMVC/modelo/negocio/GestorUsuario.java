package com.pruebaMVC.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaMVC.modelo.entidad.Usuario;
import com.pruebaMVC.modelo.persistencia.DaoUsuario;

//TENEMOS QUE DAR DE ALTA ESTE OBJETO EN EL CONTEXTO DE SPRING
//PARA DARLO DE ALTA UTILIZAMOS LO SIGUIENTE
@Service
public class GestorUsuario {
	
	@Autowired
	private DaoUsuario daoUsuario;
	
	//ESTA CAPA SE ENCARGA DE LOGICA DE LA APLCIACION, DE VALIDACIONES
	//DE APLICAR REQUISITOS DEL CLIENTE
	
	public boolean validarUsuario(Usuario usuario) {
		
		//CON JPA PODEMOS CREAR BUSQUEDAS USANDO CONVENCIONES DE CREACION DE METODOS
		
		Usuario usuarioAux = daoUsuario.findByNombreAndPassword(usuario.getNombre(), usuario.getPassword());
		
		//EN EL CASO DE QUE EL USUARIOAUX ES NULL -- ESTE USUARIO NO SE ENCONTRARA EN LA BASE DE DATOS
		
		if(usuarioAux == null) {
			
			return false;
			
		}else {
			
			return true;
			
		}
		
	}
	
}
