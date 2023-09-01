/*
Por supuesto, aquí tienes todo el contenido en un solo archivo Markdown:


# Requerimiento Técnico para API de Registro, Edición, Listado y Eliminación de Cotización del Dólar

## 1. Descripción:
Desarrollar un API que permita registrar, editar, listar y eliminar la cotización del dólar en diferentes 
tipos de cambio, 
incluyendo la fecha y hora de cada registro.

## 2. Requerimientos Funcionales:

### 2.1 Registro de Cotización:
El API debe permitir a los usuarios registrar la cotización del dólar con la siguiente información:
- Fecha y hora de la cotización.
- Precio del dólar en moneda local.
- Tipo de cambio al que corresponde la cotización (por ejemplo: tipo de cambio oficial, paralelo, etc.).

### 2.2 Edición de Cotización:
El API debe permitir la edición de una cotización existente, identificada por su ID único. Los usuarios podrán modificar la fecha, hora, precio y tipo de cambio.

### 2.3 Listado de Cotizaciones:
El API debe ofrecer la posibilidad de listar las cotizaciones existentes con la opción de aplicar filtros y ordenamientos:
- Rango de fechas para filtrar las cotizaciones.
- Tipo de cambio específico.
- Ordenamiento por fecha, precio o tipo de cambio.

### 2.4 Eliminación de Cotización:
El API debe permitir la eliminación de una cotización existente mediante su ID único.

## 3. Requerimientos Técnicos:

### 3.1 Endpoints:
El API debe implementar los siguientes endpoints:

- `POST /cotizaciones`: Para registrar una nueva cotización del dólar. Los datos deberán enviarse en el cuerpo de la solicitud en formato JSON.
  Ejemplo de datos a enviar:
  ```json
  {
    "fecha": "2023-08-31T15:30:00",
    "precio": 75.25,
    "tipo_cambio": "oficial"
  }
  ```

- `PUT /cotizaciones/{id}`: Para editar una cotización existente. Se debe proporcionar el ID de la cotización en la URL y los nuevos datos en el cuerpo de la solicitud en formato JSON.
  Ejemplo de datos a enviar:
  ```json
  {
    "fecha": "2023-08-31T16:00:00",
    "precio": 76.00,
    "tipo_cambio": "paralelo"
  }
  ```

- `GET /cotizaciones`: Para obtener la lista de cotizaciones según los parámetros de consulta. Se pueden proporcionar parámetros de consulta en la URL para filtrar y ordenar los resultados.
  Ejemplo de consulta:
  ```
  GET /cotizaciones?fecha_inicio=2023-08-01&fecha_fin=2023-08-31&tipo_cambio=paralelo&orden=precio
  ```

- `DELETE /cotizaciones/{id}`: Para eliminar una cotización existente. Se debe proporcionar el ID de la cotización en la URL.
```
Este documento contiene las especificaciones técnicas y funcionales para el desarrollo de la API de cotización del dólar.
 */
package dolar;

import dolar.Services.CotizacionServices;

/**
 *
 * @author JesusNjo
 */
public class Dolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CotizacionServices s = new CotizacionServices();
        
        s.createCotizacion();
    }
    
}
