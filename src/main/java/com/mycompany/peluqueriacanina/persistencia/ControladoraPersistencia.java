
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController(); //instanciar dueno y mascota
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Usamos los metodos de JpaController -- Creamos al dueño
        duenioJpa.create(duenio);
        
        //Creamos en la BD la mascota
        mascoJpa.create(masco);
        
    }
}
