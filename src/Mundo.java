import java.util.HashMap;
import java.util.List;

public class Mundo {

    HashMap<String,Usuario> Usuarios = new HashMap<String,Usuario>();

    public Boolean crearUsuario(Usuario u){

        if(Usuarios.containsKey(u.getNombre())){
            return false;
        }

        Usuarios.put(u.getNombre(),u);
        return true;

    }

    public Boolean eliminarUsuario(String nombre){

        if(Usuarios.containsKey(nombre)){

            Usuarios.remove(nombre);
            return true;
        }

        return false;

    }

    public Usuario consultarUsuario(String nombre){

        return Usuarios.get(nombre);

    }

    public void anadirObjectoAUsuario(Usuario u, Objeto o){

        u.getObjetos().add(o);

    }

    public List<Objeto> consultarObjetosDeUsuario(Usuario u){

        return consultarUsuario(u.getNombre()).getObjetos();

    }

    public Objeto consultarObjetoDeUsuario(Usuario u, String nombreObjeto){

        for (Objeto o : u.getObjetos()){
            if(o.getNombre() == nombreObjeto){
                return o;
            }
        }

        return null;

    }

    public Boolean eliminarObjetosDeUsuario(Usuario u, Objeto o){

        return consultarUsuario(u.getNombre()).getObjetos().remove(o);

    }

    public void transferirObjetoEntreUsuarios(Usuario origen, Usuario destino, Objeto o){

        eliminarObjetosDeUsuario(origen, o);
        anadirObjectoAUsuario(destino, o);

    }
}
