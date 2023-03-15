
package com.miaplicacion.primerproyecto.Controller;

import com.miaplicacion.primerproyecto.model.Persona;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    List<Persona> listaPersonas = new ArrayList();
    
    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre) {
        return "Hola Mundo " + nombre;
    }
    
    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre) {
        return "Chau mundo " + nombre;
    }
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        listaPersonas.add(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody 
    public List<Persona> verPersonas () {
        return listaPersonas;
    }   
}
