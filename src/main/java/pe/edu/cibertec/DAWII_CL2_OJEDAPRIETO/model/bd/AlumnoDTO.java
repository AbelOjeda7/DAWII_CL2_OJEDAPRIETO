package pe.edu.cibertec.DAWII_CL2_OJEDAPRIETO.model.bd;

public class AlumnoDTO {

    private String usuario;
    private String password;


    public AlumnoDTO(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
