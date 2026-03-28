import java.sql.*;

import alumnos.Alumno;
import connection.ConnectionPool;
import grupos.Grupo;
import services.AlumnosService;
import services.GruposService;

import java.util.ArrayList;

public class App {
    public static void listarGrupos(GruposService service) {
        try {
            ArrayList<Grupo> grupos = service.requestAll();
            if (grupos.size() == 0) {
                System.out.println("No hay grupos de alumnos");
            } else {
                for (Grupo g : grupos) {
                    System.out.println(g);
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void listarAlumnos(AlumnosService service){
        try {
            ArrayList<Alumno> alumnos = service.requestAll();
            if (alumnos.size() == 0) {
                System.out.println("No hay grupos de alumnos");
            } else {
                for (Alumno alumno : alumnos) {
                    System.out.println(alumno);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        
        // Configuración de la conexión a la base de datos
        String url = "jdbc:postgresql://aws-1-eu-west-3.pooler.supabase.com:6543/postgres"; // jdbc:mysql://{host}:{port}/{database}";
        String usuario = "postgres.odiadhlxfplykfsjxikv";
        String clave = "Nsqponer01.";

        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        try {
            pool.getConnection();
            System.out.println("Conección exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        GruposService gservice = new GruposService(pool.getConnection());
        AlumnosService aservice = new AlumnosService(pool.getConnection());

        String nombre, profesor, apellidos;
        long id, groupId;
        boolean salir = false;
        while (!salir) {
            String option = System.console().readLine("Elija alumnos o grupos: ");
            if (option.equals("grupos")) {
                try {
                    // Conexión a la base de datos
                    System.out.println("1. Crear un grupo de alumnos");
                    System.out.println("2. Editar un grupo de alumnos");
                    System.out.println("3. Borrar un grupo de alumnos");
                    System.out.println("4. Visualizar grupos de alumnos");
                    System.out.println("5. Visualiza un grupo");
                    System.out.println("6. Salir");
                    int opcion = Integer.parseInt(System.console().readLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("Introduzca el nombre del grupo: ");
                            nombre = System.console().readLine();
                            System.out.println("Introduzca el nombre del tutor: ");
                            profesor = System.console().readLine();
                            try {
                                id = gservice.create(new Grupo(0, nombre, profesor));
                                System.out.printf("Grupo creado correctamente (id: %d)\n", id);
                            } catch (SQLException e) {
                                if (e.getErrorCode() == 1062) {
                                    System.out.println("El grupo ya existe con ese nombre");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Elija el grupo a editar");
                            listarGrupos(gservice);
                            id = Integer.parseInt(System.console().readLine());
                            System.out.println("Introduzca el nombre del grupo: ");
                            nombre = System.console().readLine();
                            System.out.println("Introduzca el nombre del tutor: ");
                            profesor = System.console().readLine();
                            try {
                                int rowAffected = gservice.update(new Grupo(id, nombre, profesor));
                                if (rowAffected == 1)
                                    System.out.println("Grupo actualizado correctamente");
                                else
                                    System.out.println("No se ha podido actualizar el grupo");
                            } catch (SQLException e) {
                                System.out.println("No se ha podido actualizar el grupo");
                                System.out.println("Ocurrión una excepción: " + e.getMessage());
                            }
                            break;
                        case 3:
                            System.out.println("Elija el grupo a borrar");
                            listarGrupos(gservice);
                            id = Integer.parseInt(System.console().readLine());
                            try {
                                gservice.delete(id);
                            } catch (SQLException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 4:
                            listarGrupos(gservice);
                            break;
                        case 5:
                            System.out.println("Elija el grupo a visualizar");
                            listarGrupos(gservice);
                            id = Integer.parseInt(System.console().readLine());
                            Grupo grupo = gservice.requestById(id);
                            if (grupo != null)
                                System.out.println(grupo);
                            break;
                        case 6:
                            salir = true;
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (option.equals("alumnos")) {
                try {
                    System.out.println("1. Crear un alumno");
                    System.out.println("2. Editar un alumno");
                    System.out.println("3. Borrar un alumno");
                    System.out.println("4. Visualizar alumnos");
                    System.out.println("5. Visualiza un alumno");
                    System.out.println("6. Salir");
                    int casos = Integer.parseInt(System.console().readLine());
                    switch (casos) {
                        case 1:
                            System.out.println("Introduzca el nombre del alumno: ");
                            nombre = System.console().readLine();
                            System.out.println("Introduzca los apellidos del alumno: ");
                            apellidos = System.console().readLine();
                            System.out.println("Introduzca la clase en la que esta el alumno: ");
                            groupId = Long.parseLong(System.console().readLine());
                            try {
                                id = aservice.create(new Alumno(0, nombre, apellidos, groupId));
                                System.out.printf("Alumno creado correctamente (id: %d)\n", id);
                            } catch (SQLException e) {
                                if (e.getErrorCode() == 1062) {
                                    System.out.println("El alumno ya existe con ese nombre");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Elija el alumno a editar");
                            listarGrupos(gservice);
                            id = Integer.parseInt(System.console().readLine());
                            System.out.println("Introduzca el nombre del grupo: ");
                            nombre = System.console().readLine();
                            System.out.println("Introduzca los apellidos del alumno: ");
                            apellidos = System.console().readLine();
                            System.out.println("Introduzca la clase en la que esta el alumno: ");
                            groupId = Long.parseLong(System.console().readLine());
                            try {
                                int rowAffected = aservice.update(new Alumno(id, nombre, apellidos, groupId));
                                if (rowAffected == 1)
                                    System.out.println("Alumno actualizado correctamente");
                                else
                                    System.out.println("No se ha podido actualizar el alumno");
                            } catch (SQLException e) {
                                System.out.println("No se ha podido actualizar el alumno");
                                System.out.println("Ocurrión una excepción: " + e.getMessage());
                            }
                            break;
                        case 3:
                            System.out.println("Elija el alumno a borrar");
                            listarAlumnos(aservice);
                            id = Integer.parseInt(System.console().readLine());
                            try {
                                aservice.delete(id);
                            } catch (SQLException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 4:
                            listarAlumnos(aservice);
                            break;
                        case 5:
                            System.out.println("Elija el grupo a visualizar");
                            listarAlumnos(aservice);
                            id = Integer.parseInt(System.console().readLine());
                            Alumno alumno = aservice.requestById(id);
                            if (alumno != null)
                                System.out.println(alumno);
                            break;
                        case 6:
                            salir = true;
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else
                System.out.println("Porfavor, elija una de las opciones");

        }
    }
}
