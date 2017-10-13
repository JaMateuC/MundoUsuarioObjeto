import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Mundo mundo = new Mundo();
        Scanner scn = new Scanner(System.in);
        central : do {
            System.out.println("1) Crear nuevo usario: ");
            System.out.println("2) Eliminar usario: ");
            System.out.println("3) Consultar usario: ");
            System.out.println("4) Anadir objeto a usario: ");
            System.out.println("5) Consultar objetos usuario: ");
            System.out.println("6) Consultar objeto usuario: ");
            System.out.println("7) Eliminar objeto usuario: ");
            System.out.println("8) Transferir objeto: ");
            System.out.println("9) Exit");
            int opcion = scn.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Nombre de usuario:");
                    String nombre = scn.next();
                    System.out.println("Contrasena de usuario:");
                    String password = scn.next();
                    Usuario u = new Usuario(nombre, password);
                    mundo.crearUsuario(u);
                    break;
                }
                case 2: {
                    System.out.println("Nombre de usuario: ");
                    String nombre = scn.next();
                    mundo.eliminarUsuario(nombre);
                    break;
                }
                case 3: {
                    System.out.println("Nombre de usuario: ");
                    String nombre = scn.next();
                    Usuario u = mundo.consultarUsuario(nombre);
                    if (u != null) {
                        System.out.println("Nombre: " + u.getNombre());
                        System.out.println("Nivel: " + u.getNivell());
                        System.out.println("Ataque: " + u.getAtaque());
                        System.out.println("Defensa: " + u.getDefensa());
                        System.out.println("Resistencia: " + u.getResistencia());
                    } else {
                        System.out.println("Este usuario no existe");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Usuario al que anadir objeto: ");
                    String nombre = scn.next();
                    System.out.println("Nombre del objeto a anadir: ");
                    String nombreObjeto = scn.next();
                    Objeto o = new Objeto(nombreObjeto);
                    mundo.anadirObjectoAUsuario(mundo.consultarUsuario(nombre), o);
                    break;
                }
                case 5: {
                    System.out.println("");
                    break;
                }
                case 6: {
                    System.out.println("Nombre del objeto a consultar: ");
                    String nombreObjeto = scn.next();
                    System.out.println("Nombre del anadir propietario: ");
                    String nombre = scn.next();
                    Objeto o = mundo.consultarObjetoDeUsuario(mundo.consultarUsuario(nombre), nombreObjeto);
                    System.out.println("Nombre: " + nombreObjeto);

                    System.out.println("Tipo: " + o.getTipo());
                    System.out.println("Descripcion: " + o.getDescripcion());
                    System.out.println("Valor: " + o.getValor());
                    System.out.println("Coste: " + o.getCoste());
                    break;
                }
                case 7: {
                    System.out.println("Nombre del objeto a eliminar: ");
                    String nombreObjeto = scn.next();
                    System.out.println("Nombre del usuario al cual extraer objeto: ");
                    String nombre = scn.next();
                    Usuario u = mundo.consultarUsuario(nombre);
                    Objeto o = mundo.consultarObjetoDeUsuario(u, nombreObjeto);
                    if (mundo.eliminarObjetosDeUsuario(u, o)) {
                        System.out.println("Objeto eliminado");
                    } else {
                        System.out.println("Objeto no encontrado");
                    }
                    break;
                }
                case 8: {
                    System.out.println("Usuario origen:");
                    String nombre = scn.next();
                    Usuario origen = mundo.consultarUsuario(nombre);
                    System.out.println("Usuario destino:");
                    nombre = scn.next();
                    Usuario destino = mundo.consultarUsuario(nombre);
                    System.out.println("Objeto a intercambiar:");
                    String nombreObjeto = scn.next();
                    Objeto o = mundo.consultarObjetoDeUsuario(origen, nombreObjeto);
                    mundo.transferirObjetoEntreUsuarios(origen, destino, o);
                    break;
                }
                case 9:
                    break central;
                default:
                    System.out.println("Opcion invalida");

            }
        }while(true);
        System.out.println("------------------------End-------------------------");
    }
}
