import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int salir = 0;
        ArrayList<Gasto> listaGasto = new ArrayList<>();
        do {
            System.out.println(
                    "********Menu De opciones para administrar gastos********\n" +
                            "1.Mostrar lista de gastos\n" +
                            "2.Añadir Nuevo Gasto\n" +
                            "3.Actulizar Gasto\n" +
                            "4.Eliminar Gasto\n" +
                            "5.Total de Gastos\n" +
                            "6.Gastos por mes\n" +
                            "7.Salir\n" +
                            "***********************************************************\n" +
                            "Seleccion una opcion:");
            int opcion = en.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("********Lista de Gastos********");
                    System.out.println("******************************");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("| ID   | Mes        | Descripción         | Monto     |");
                    System.out.println("------------------------------------------------------------");

                    for (Gasto g : listaGasto) {
                        System.out.println(g);
                    }

                    System.out.println("------------------------------------------------------------");

                    break;
                case 2:
                    System.out.println("********Nuevo Registro********");
                    System.out.println("******************************");

                    en.nextLine();
                    System.out.println("Ingresa el mes");
                    String mes = en.nextLine();

                    System.out.println("Ingresa descripcion");
                    String descripcion = en.nextLine();

                    System.out.println("Ingresa monto");
                    Float monto = en.nextFloat();
                    en.nextLine();
                    int id = listaGasto.size() + 1;

                    Gasto newGasto = new Gasto(id, mes, descripcion, monto);

                    listaGasto.add(newGasto);

                    break;
                case 3:

                System.out.println("********Actualizacion de Registro********");
                    System.out.println("******************************");
                    System.out.println("Ingresa el id del registro a actualizar ");

                    int idgasto2 = en.nextInt();
                    for (Gasto liGastos : listaGasto) {

                        if (liGastos.getId() == idgasto2) {
                            System.out.println("¿Que atributo deses modificar?\n" +
                                    "1.Mes\n" +
                                    "2.Descripcion\n" +
                                    "3.Monto\n");
                            int opcionmod = en.nextInt();

                            en.nextLine();

                            switch (opcionmod) {
                                case 1:
                                    System.out.println("Ingresa el nuevo mes");
                                    String newmes = en.nextLine();

                                    liGastos.setMes(newmes);
                                    break;
                                case 2:
                                    System.out.println("Ingresa la nueva descripcion");
                                    String newdesc = en.nextLine();

                                    liGastos.setDescripcion(newdesc);
                                    break;
                                case 3:
                                    System.out.println("Ingresa el nuevo monto");
                                    Float newmonto = en.nextFloat();
                                    liGastos.setMonto(newmonto);
                                    break;

                                default:
                                    break;
                            }

                            break;
                        }

                    }

                    break;
                case 4:
                System.out.println("********Eliminacion de Registro********");
                    System.out.println("******************************");
                    System.out.println("Ingresa el id a eliminar");
                    int idgasto = en.nextInt();

                    boolean eliminado = false;
                    for (int i = 0; i < listaGasto.size(); i++) {
                        if (listaGasto.get(i).getId() == idgasto) {
                            listaGasto.remove(i);
                            eliminado = true;
                            break;
                        }
                    }

                    if (eliminado) {
                        System.out.println("Gasto eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró un gasto con ese id.");
                    }

                    break;

                case 5:
                System.out.println("********Suma total del monto de gastos********");
                    System.out.println("******************************");

                    Float total = 0f; 

                    for (int i = 0; i < listaGasto.size(); i++) {
                        Float montot = listaGasto.get(i).getMonto();
                        total += montot;

                    }
                    System.out.println("La suma total de los ingresos es: $" + total);

                    break;

                case 6:

                System.out.println("********Vizualizacion por mes de Registro********");
                    System.out.println("******************************");

                    en.nextLine();
                    System.out.println("Ingresa el mes que decesas vizualizar");
                    String MesGasto = en.nextLine();

                    for (Gasto ligGasto : listaGasto) {
                        if (ligGasto.getMes().equals(MesGasto)) {
                            System.out.println(ligGasto);
                        }
                    }

                    break;

                case 7:
                    System.out.println("Cerrando Sistema");
                    salir = 7;

                    break;

                default:
                    break;
            }

        } while (salir != 7);

    }

   
}
