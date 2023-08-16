
package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El buketName es el id_del_proyecto + ".appspot.com#"
    final String BucketName ="techshop-a711c.appspot.com";
    
    //Esta es la ruta basica de este proyecto TechShop
    final String rutaSuperiorStorage="techshop";
    
    //Ubicacion donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile="firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile="techshop-a711c-firebase-adminsdk-6v7je-92eff73baa";
}
