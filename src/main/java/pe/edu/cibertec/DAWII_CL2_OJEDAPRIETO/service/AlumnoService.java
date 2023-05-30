package pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.Alumno;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.AlumnoDTO;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.repository.AlumnoRepository;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;
    
    public List<Alumno> listar(){
        return alumnoRepository.findAll();
    }

    public Alumno registrar(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public void eliminar(Integer id){
        alumnoRepository.deleteById(id);
    }

    public Alumno editar(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public AlumnoDTO findByUsernameAndPassword(String usuario, String password) {
        AlumnoDTO objUser = alumnoRepository.findByUsernameAndPassword(usuario, password);
        return objUser;
    }


}
