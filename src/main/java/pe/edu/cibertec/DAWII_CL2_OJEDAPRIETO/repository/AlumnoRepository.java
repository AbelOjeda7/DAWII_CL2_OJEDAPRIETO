package pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.Alumno;
import pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.AlumnoDTO;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {


    @Query(
            value= "select new pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd.AlumnoDTO(u.usuario, u.password) " +
                    "from alumno u where u.usuario=?1 and u.password=?2"
    )
    public AlumnoDTO findByUsernameAndPassword(String username, String password);

}
