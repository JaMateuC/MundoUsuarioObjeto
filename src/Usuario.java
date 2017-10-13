import java.util.HashMap;
import java.util.List;

public class Usuario {

    private String nombre;
    private String password;
    private int nivell;
    private int ataque;
    private int defensa;
    private int resistencia;
    private List<Objeto> objetos;


    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.nivell = 1;
        this.ataque = 1;
        this.defensa = 1;
        this.resistencia = 1;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        objetos = objetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
