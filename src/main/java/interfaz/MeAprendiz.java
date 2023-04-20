package interfaz;

import Model.Aprendiz;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public interface MeAprendiz {
    public Aprendiz list(int id);
    public List listadoApre();
    public boolean registrarApre(Aprendiz ap);
    public boolean actualizarApre(Aprendiz ap);
    public boolean eliminarApre(Aprendiz ap);
}
