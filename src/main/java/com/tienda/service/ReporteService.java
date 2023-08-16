
package com.tienda.service;

import jakarta.mail.Quota.Resource;
import java.io.IOException;
import java.util.Map;
import org.springframework.http.ResponseEntity;


public interface ReporteService {
    public ResponseEntity<Resource> generaReporte(
       String reporte,
       Map<String, Object> parametros,
       String tipo
    ) throws IOException;
}
