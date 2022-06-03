package com.idat.AbrilServiciol.repositorio;

import java.util.List;



import com.idat.AbrilServiciol.modelo.Productos;

	
public interface ProductoRepositorio  {

	public void guardarProducto(Productos producto);
	public void editarProducto(Productos producto);
	public void eliminarProducto(Integer id);
	public List<Productos> listarProductos();
	public Productos obtenerProductoId(Integer id);

	
	
}
