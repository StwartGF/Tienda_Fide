
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    // Se obtiene un listado de categorias en un list
    public List<Categoria> getCategorias(boolean activos);
    
    //se obtiene una categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    //se inserta un nuevo categoria si el id del categoria esta vacio 
    //se actualiza un categoria si el id del categoria no esta vacio
    public void save(Categoria categoria);
    
    //se elimina el categoria que tiene el id pasado por parametro
    public void delete (Categoria categoria);
    
}
