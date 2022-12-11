
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    
    //Instanciar ControladoraPersistencia en controladora para poder llamar a los metodos
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String Observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        //Creamos el dueño y seteamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y seteamos sus valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(Observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco); //Llamamos de la logica a la base de datos persistencia
    }
    
}
