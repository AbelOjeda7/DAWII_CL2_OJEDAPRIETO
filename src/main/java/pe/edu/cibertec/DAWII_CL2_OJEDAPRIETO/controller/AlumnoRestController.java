package pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.Alumno;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoRestController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Alumno> lista(){
        return alumnoService.listar();
    }


    @PostMapping("/registrar")
    @ResponseBody
    public String registrar( @RequestBody Alumno alumno){

        System.out.println(alumno.getNombres());
        try{
            Alumno alu = alumnoService.registrar(alumno);
        }catch(Exception ex){
            return "Error";
        }
        return "Exito";
    }

    @PutMapping("/editar")
    @ResponseBody
    public String editar( @RequestBody Alumno alumno){
        try{
            Alumno alu = alumnoService.registrar(alumno);
        }catch(Exception ex){
            return "Error";
        }
        return "Exito";
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseBody
    public String eliminar(@PathVariable Integer id){
        try{
            alumnoService.eliminar(id);
        }catch(Exception ex){
            return "Error";
        }
        return "Exito";
    }




}