
package com.tienda.service;


import com.tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
 // Se obtiene un listado de categorias en un list
    public List<Producto> getProductos(boolean activos);
    
    //se obtiene una categoria, a partir del id de un categoria
    public Producto getProducto(Producto producto);
    
    //se inserta un nuevo categoria si el id del categoria esta vacio 
    //se actualiza un categoria si el id del categoria no esta vacio
    public void save(Producto producto);
    
    //se elimina el categoria que tiene el id pasado por parametro
    public void delete (Producto producto);
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
