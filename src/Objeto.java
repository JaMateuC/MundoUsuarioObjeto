public class Objeto {

    private String nombre;
    private String tipo;
    private String descripcion;
    private int valor;
    private int coste;

    public Objeto(String nombre, String tipo, String descripcion, int valor, int coste) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.valor = valor;
        this.coste = coste;
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
        this.tipo = "espada";
        this.descripcion = "...";
        this.valor = 0;
        this.coste = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}
