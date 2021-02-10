package com.pruebaMVC.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaMVC.modelo.entidad.Usuario;

//CON ESTA LINEA HACEMOS TODA LA CONEXION A BASE DE DATOS QUE HARIA FALTA
//CON ESTO CREAMOS OBJETOS EN EL CONTEXTO SPRIN CON ID LA MISMA QUE EL NOMBRE DE ESTA CLASE
//PERO EN LOWER CAMEL CASE

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer>{
	
	//TODOS LOS METODOS QUE EMPIECEN CON LAS PALABRAS FINDBY + ATRIBUTO, JPA DATA TE CREARA LA CONSULTA 
	//AUTOMATICAMENTE
	
	//findByPassword(String password);
	
	//EN EL CASO DE QUE NOS FUERA A DEVOLVER MAS DE UN OBJETO EL METODO SE PODRIA CREAR DE FORMA QUE NOS
	//DEVOLVIERA UNA LISTA CON LOS OBJETOS SOLICITADOS
	
	public Usuario findByNombre(String nombre); 
	
	public Usuario findByNombreAndPassword(String nombre, String password); 
	
	
	
}
