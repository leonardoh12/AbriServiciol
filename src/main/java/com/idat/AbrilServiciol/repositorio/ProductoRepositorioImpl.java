package com.idat.AbrilServiciol.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.AbrilServiciol.modelo.Productos;

@Repository
public class ProductoRepositorioImpl implements ProductoRepositorio {


	public List<Productos> listar = new ArrayList<Productos>();		
	
	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.add(producto);
		
	}

	@Override
	public void editarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.remove(obtenerProductoId(producto.getIdProducto()));
		listar.add(producto);
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerProductoId(id));
	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return listar;
		
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
//estructura clasica
//		if(id !=null) {
//		for (Productos productos : listar) {
//			if(productos.getIdProducto()== id)
//				return productos;
//			else
//				return null;
//		}
//	}
//
//	return null;
//}
	
		return listar.stream().filter(p-> p.getIdProducto()== id).findFirst().orElse(null);
		 
	} 
}