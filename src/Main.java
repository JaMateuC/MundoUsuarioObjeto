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
            System.out.println("5) Consultar objeto usuario: ");
            System.out.println("6) Eliminar objeto usuario: ");
            System.out.println("7) Transferir objeto: ");
            System.out.println("8) Exit");
            int opcion = scn.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Nombre de usuario:");
                    String nombre = scn.next();
                    System.out.println("Contrasena de usuario:");
                    String password = scn.next();
                    Usuario u = new Usuario(nombre, password);
                    if(mundo.crearUsuario(u)){
                        System.out.println("Usuario creado");
                    } else {
                        System.out.println("Usuario ya existe");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nombre de usuario: ");
                    String nombre = scn.next();
                    if(mundo.eliminarUsuario(nombre)){
                        System.out.println("Eliminado");
                    }else{
                        System.out.println("No existe este usuario");
                    }
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
                    Usuario u = mundo.consultarUsuario(nombre);
                    if(u != null){
                        mundo.anadirObjectoAUsuario(u, o);
                        System.out.println("Objeto anadido");
                    }else{
                        System.out.println("Usuario no existe");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Nombre del objeto a consultar: ");
                    String nombreObjeto = scn.next();
                    System.out.println("Nombre del anadir propietario: ");
                    String nombre = scn.next();
                    Usuario u = mundo.consultarUsuario(nombre);
                    if(u != null){
                        Objeto o = mundo.consultarObjetoDeUsuario(u, nombreObjeto);
                        System.out.println("Nombre: " + nombreObjeto);
                        System.out.println("Tipo: " + o.getTipo());
                        System.out.println("Descripcion: " + o.getDescripcion());
                        System.out.println("Valor: " + o.getValor());
                        System.out.println("Coste: " + o.getCoste());
                    } else {
                        System.out.println("Usuario no existe");
                    }

                    break;
                }
                case 6: {
                    System.out.println("Nombre del objeto a eliminar: ");
                    String nombreObjeto = scn.next();
                    System.out.println("Nombre del usuario al cual extraer objeto: ");
                    String nombre = scn.next();
                    Usuario u = mundo.consultarUsuario(nombre);
                    Objeto o = mundo.consultarObjetoDeUsuario(u, nombreObjeto);
                    if(null != u){
                        if (mundo.eliminarObjetosDeUsuario(u, o)) {
                            System.out.println("Objeto eliminado");
                        } else {
                            System.out.println("Objeto no encontrado");
                        }
                    } else {
                        System.out.println("Usuario no existe");
                    }

                    break;
                }
                case 7: {
                    System.out.println("Usuario origen:");
                    String nombre = scn.next();
                    Usuario origen = mundo.consultarUsuario(nombre);
                    if(null != origen){
                        System.out.println("Usuario destino:");
                        nombre = scn.next();
                        Usuario destino = mundo.consultarUsuario(nombre);
                        if(null != destino) {
                            System.out.println("Objeto a intercambiar:");
                            String nombreObjeto = scn.next();
                            Objeto o = mundo.consultarObjetoDeUsuario(origen, nombreObjeto);
                            if(null != o){
                                mundo.transferirObjetoEntreUsuarios(origen, destino, o);
                                System.out.println("Objeto intercambiado");
                            }else{
                                System.out.println("Objeto no existe");
                            }
                        }else{
                            System.out.println("Usuario no existe");
                        }
                    }else{
                        System.out.println("Usuario no existe");
                    }

                    break;
                }
                case 8:
                    break central;
                default:
                    System.out.println("Opcion invalida");

            }
        }while(true);
        System.out.println("------------------------End-------------------------");
    }
}
