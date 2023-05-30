package pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.AlumnoDTO;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.LoginRequest;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.service.AlumnoService;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/login")
    public String login(){
        return "Auth/frmLogin";
    }
    @GetMapping("/registrar")
    public String registrar(){
        return "Auth/frmRegistroUsuario";
    }

    @GetMapping("/error")
    public String error(){
        return "Auth/frmError";
    }

    @PostMapping("/ingresar")
    public String ingresar(LoginRequest loginRequest, Model model){
        System.out.println("LoginController - ingresar ");
        System.out.println("Login : " +  loginRequest.getUsuario());
        System.out.println("PWDDD : " +  loginRequest.getPassword());


        AlumnoDTO alu =alumnoService.findByUsernameAndPassword(loginRequest.getUsuario(), loginRequest.getPassword());

        if (alu == null){
            model.addAttribute("rpta", "CREDENCIALES INCORRECTAS");
            return "Auth/frmLogin";
        }else{
            return "redirect:/auth/exito";
        }



    }


    @GetMapping("/exito")
    public String exito(){
        return "Auth/frmExito";
    }

}
