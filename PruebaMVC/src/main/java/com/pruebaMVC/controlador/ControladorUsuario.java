package com.pruebaMVC.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pruebaMVC.modelo.entidad.Usuario;
import com.pruebaMVC.modelo.negocio.GestorUsuario;

//ESTA ANOTACION SIRVE PARA DAR DE ALTA UN OBJETO CONTROLADOR EN NUESTA APLIACION
//ES PARECIDA A LA ANOTACION RESCONTROLLER, PERO TIENE DIFERENCIAS

//COSAS IGUALES:
//AMBAS ANOTACION SIRVEN PARA MAPEAR URLS CON METODOS Y AMBAS PROCESAN PERITCIONES HTTP

//COSAS DIFERENTES:
//CUANDO HACIAMOS REST EL INTECAMBIO D INFORMACION EN EL BODY DEL HTTP SE HACIA CON JSON, EN ESTE CASO
//LO QUE DEVOLVERAN LOS METODOS SERAN PAGINAS WEB
@Controller
public class ControladorUsuario {

	@Autowired
	private GestorUsuario gestorUsuario;
	
	//SI LA PAGINA WEB NOS MANDA LOS DATOS POR GET, ENTONCES LOS DATOS IRAN COMO PARTE DE LA URL
	//DE PETICION
	
	//SI LA PAGINA WEB NOS MANDA LOS DATOS POR POST, ENTONCES LOS DATOS IRAN DENTRO DEL BODY
	//DEL MENSAJE HTTP
	
	//CREAMOS UN METODO QUE MAPEE UNA URL POR POST, Y LO QUE VAMOS A DEVOLDER VA A SER EL NOMBRE DE UNA PAGINA
	//WEB LOCALIZADA EN SRC/MAIN/REOSURCE/TEMPLATES O SRC/MAIN/RESOURCES/STATIC
	
	//EN LA PRIMER CARPETA PONDREMOS AQUELLAS PAGINAS QUE SEAN DINAMICAS, ES DECIR, AQUELLAS PAGINAS WEB QUE
	//LA INFORMACION A MOSTRAR DEPENDE DE ALGUN OTRO PARAMETRO, POR EJEMPLO, LA PAGINA WEB DE UNA TIENDA
	//QUE DEPENDE DE QUIEN SE CONECTA 
	
	//EN LA SEGUNDA CARPETA PONEMOS AQUELLAS PAGINAS QUE SEAN ESTATICAS, ES DECIR, NUNCA CAMBIA.
	
	//TAMBIEN DEBEMOS RECOGER LOS PARAMETOS QUE NOS ENVIA EL CLIENTE Y LO HAREMOS POR LOS PARAMETROS
	//DEN ENTRADA DE ESTE METODO, ANOTADOS CON LA @
	 @PostMapping("doLogin")
	 public String logarse(@RequestParam("nombre_usuario") String nombre, @RequestParam("pass") String password) {
		 
		 Usuario usuario = new Usuario();
		 
		 usuario.setNombre(nombre);
		 usuario.setPassword(password);
		 
		 boolean validado = gestorUsuario.validarUsuario(usuario);
		 
		 //EN FUNCION DE LO QUE DEVUELVA NEGOCIO, TOMAMOS LA DECISION DE QUE PAGINA MOSTRAMOS AL USUARIO
		 if (validado) {
			 //VAMOS A INICIO.HTML
			 return "inicio";
			 
		 }else {
			 //VAMOS A ERROR.HTML
			 return "error";
			 
		 }
		 
	 }
	
}
