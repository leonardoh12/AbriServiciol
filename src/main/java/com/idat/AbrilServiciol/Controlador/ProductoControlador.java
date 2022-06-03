package com.idat.AbrilServiciol.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.AbrilServiciol.modelo.Productos;
import com.idat.AbrilServiciol.servicio.ProductoServicio;

@RestController
@RequestMapping("/producto/v1")
public class ProductoControlador {

	@Autowired
	private ProductoServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public List<Productos> listarProducto() {
		
		return servicio.listarProductos();	
	
	}
	
	
}
