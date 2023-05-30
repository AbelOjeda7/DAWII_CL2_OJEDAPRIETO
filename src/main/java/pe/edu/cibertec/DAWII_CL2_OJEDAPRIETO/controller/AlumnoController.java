package pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.Alumno;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.service.AlumnoService;

import java.util.List;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/registrarAlumno")
    public String registrar(Alumno alumno, Model model){
        System.out.println(alumno.getNombres());
        try{
            Alumno alu = alumnoService.registrar(alumno);
            model.addAttribute("rpta", "Se registro correctamente");
        }catch(Exception ex){
            return "Auth/error";
        }
        return "Auth/frmRegistroUsuario";
    }





}
