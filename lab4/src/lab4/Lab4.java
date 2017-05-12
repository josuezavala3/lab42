package lab4;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4 {

<<<<<<< HEAD
    static ArrayList<persona> persona = new ArrayList();
    static ArrayList<almacen> almacenes = new ArrayList();
    static ArrayList<producto> pro = new ArrayList();
=======
    static ArrayList<empleado> empleados = new ArrayList();
    static ArrayList<almacen> almacenes = new ArrayList();
>>>>>>> 29d8ed493fe262e1325e3b6b4f8962c152eb868f

    public static void main(String[] args) {
        char r = 's';
        while (r == 's' || r == 'S') {
            System.out.println("1. Almacenes");
            System.out.println("2. Personas");
            System.out.println("3. productos");
            System.out.println("4. reportes");
            System.out.println("5 ventas");
            System.out.println("6. Salir del sistema");
            Scanner sc = new Scanner(System.in);
            boolean entro = true;
            int opcion = 0;
            while (entro) {
                try {
                    System.out.println("Ingrese numero de opcion: ");
                    opcion = sc.nextInt();
                    entro = false;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese opcion correcta");
                    sc = new Scanner(System.in);
                }

            }
            if (opcion == 1) {

                if (entro) {
                    System.out.println("1. Agregar ");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Tranferir");
                    System.out.println("5. Volver al menu");
                    int opealmace = sc.nextInt();
                    if (opealmace == 1) {

                        boolean entro2 = true;
                        while (entro2) {

                            System.out.println("1. Agregar almacen de planta");
                            System.out.println("2. Agregar almacen regional");
                            System.out.println("3. Agreagar alamacen de plataforma");
                            System.out.println("4. Agregar almacen temporal");
                            System.out.println("5. Volver al menu");
                            int opcion2 = sc.nextInt();
                            if (opcion2 == 1) {
                                System.out.println("tamaño?");
                                double tamamo = sc.nextInt();
                                System.out.println("Altuta");
                                int altura = sc.nextInt();
                                System.out.println("Numero de plantas");
                                int numero = sc.nextInt();
                                almacenes.add(new almacenplanta(numero, tamamo, altura));
                            } else if (opcion2 == 2) {
                                System.out.println("tamaño?");
                                double tamamo = sc.nextInt();
                                System.out.println("Altuta");
                                int altura = sc.nextInt();
                                System.out.println("Departamento?");
                                String departamento = sc.nextLine();
                                almacenes.add(new almacenregiio(departamento, tamamo, altura));
                            } else if (opcion2 == 3) {
                                System.out.println("tamaño?");
                                double tamamo = sc.nextInt();
                                System.out.println("Altuta");
                                int altura = sc.nextInt();
                                System.out.println("numero mayor de clientes?");
                                int numeroma = sc.nextInt();
                                almacenes.add(new almacenplata(numeroma, tamamo, altura));
                            } else if (opcion2 == 4) {
                                System.out.println("Almacen en mantenimiento");
                            } else {
                                entro2 = false;
                            }

                        }
                    } else if (opealmace == 2) {

                        boolean entro2 = true;
                        while (entro2) {
                            System.out.println("1. modificar almacen de planta");
                            System.out.println("2. modificar almacen regional");
                            System.out.println("3. modificar alamacen de plataforma");
                            System.out.println("4. modificar almacen temporal");
                            System.out.println("5. Volver al menu");
                            int opcion2 = sc.nextInt();

                            if (opcion2 == 1) {
                                System.out.println("Posicion a modificar ?");
                                int posi = sc.nextInt();
                                System.out.println("numero de plantas");
                                int nume = sc.nextInt();
                                ((almacenplanta) almacenes.get(posi)).setPlant(posi);
                            } else if (opcion2 == 2) {
                                System.out.println("Posicion a modificar ?");
                                int posi = sc.nextInt();
                                System.out.println("departamento");
                                String nume = sc.nextLine();
                                ((almacenregiio) almacenes.get(posi)).setNombredep(nume);
                            } else if (opcion2 == 3) {
                                System.out.println("Posicion a modificar ?");
                                int posi = sc.nextInt();
                                System.out.println("numero de mayor de clientes");
                                int nume = sc.nextInt();
                                ((almacenplata) almacenes.get(posi)).getMayorclientes();
                            } else if (opcion2 == 4) {
                                System.out.println("En Mmantenimiento");
                            } else {
                                entro2 = false;
                            }

                        }
                    } else if (opealmace == 3) {

                        boolean entro2 = true;
                        while (entro2) {
                            System.out.println("1. eliminar almacenes");
                            System.out.println("5. Volver al menu");
                            int opcion2 = sc.nextInt();

                            if (opcion2 == 1) {
                                System.out.println("Posicion");
                                int posicion3 = sc.nextInt();
                            } else {
                                entro2 = false;
                            }
                        }
                    } else if (opealmace == 4) {
                        boolean entro2 = true;
                        while (entro2) {
                            System.out.println("1. tranferir almacen de planta");
                            System.out.println("2. tranferir almacen regional");
                            System.out.println("3. tranferir alamacen de plataforma");
                            System.out.println("4. tranferir almacen temporal");
                            System.out.println("5. Volver al menu");
                            int opcion2 = sc.nextInt();

                            if (opcion2 == 1) {

                            } else if (opcion2 == 2) {

                            } else if (opcion2 == 3) {

                            } else if (opcion2 == 4) {
                            } else {
                                entro2 = false;
                            }
                        }
                    } else {
                        entro = false;
                    }

                } else {
                    System.out.println("Alerta Datos incorrectos");
                }
            } else if (opcion == 2) {
                boolean persona = true;
                while (persona) {
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. volver al menu");
                    entro = true;
                    int opcio = 0;
                    while (entro) {
                        try {
                            opcio = sc.nextInt();
                            System.out.println("Ingrese numero de opcion: ");
                            entro = false;
                        } catch (InputMismatchException e) {
                            System.out.println("Ingrese opcion correcta");
                            sc = new Scanner(System.in);
                        }
                    }
                    if (opcio == 1) {
                        System.out.println("1. Agregar empleado");
                        System.out.println("2. Agregar cliente");
                        System.out.println("3. volver al menu");
                        int opc = sc.nextInt();
                        if (opc == 1) {
<<<<<<< HEAD
                            System.out.println("1. Empleado de seguridad");
                            System.out.println("2. Empleado de carga");

=======
                            System.out.println("1. Seguridad");
                            System.out.println("2. Carga");
                            int op = sc.nextInt();
                            if (op == 1) {
                                boolean bandera = false;
                                do {
                                    try {
                                        System.out.println("Ingrese nombre:");
                                        String nombre = sc.next();
                                        System.out.println("Ingrese ID");
                                        int ID = sc.nextInt();
                                        System.out.println("Ingrese edad:");
                                        int edad = sc.nextInt();
                                        System.out.println("Ingrese altura");
                                        int altura = sc.nextInt();
                                        System.out.println("Ingrese peso");
                                        int peso = sc.nextInt();
                                        System.out.println("Ingrese redidencia");
                                        String residencia = sc.next();
                                        System.out.println("Ingrese contraseña");
                                        sc.nextLine();
                                        String contraseña = sc.nextLine();
                                        System.out.println("Ingrese clave");
                                        sc.nextLine();
                                        String clave = sc.nextLine();
                                        Date dia = new Date();
                                        System.out.println("Ingrese sueldo");
                                        int sueldo=sc.nextInt();
                                        validar(edad);
                                        empleados.add(new empleadosegu(contraseña, clave, dia, sueldo, nombre, ID, edad, altura, peso, residencia));
                                    } catch (Excepciones e) {
                                        bandera = true;
                                    }
                                } while (bandera);
                            } else if (op == 2) {
                                
                            } else {

                            }
>>>>>>> 29d8ed493fe262e1325e3b6b4f8962c152eb868f
                        } else if (opc == 2) {

                        } else {

                        }

                    } else if (opcio == 2) {
                        System.out.println("1. Modifciar empleado");
                        System.out.println("2.Modificar cliente");
                        System.out.println("3. volver al menu");
                        int opc = sc.nextInt();
                        if (opc == 1) {

                        } else if (opc == 2) {

                        } else {

                        }
                    } else if (opcio == 3) {
                        System.out.println("1. Eliminar empleado");
                        System.out.println("2. Eliminar cliente");
                        System.out.println("3. volver al menu");
                        int opc = sc.nextInt();
                        if (opc == 1) {

                        } else if (opc == 2) {

                        } else {

                        }
                    } else {
                        persona = false;
                    }
                }
            } else if (opcion == 3) {
                boolean product = true;
                while (product) {
                    System.out.println("1. Agregar producto");
                    System.out.println("2. Modificar producto");
                    System.out.println("3. ELiminar producto");
                    System.out.println("4. volver al menu");
                    int opc = sc.nextInt();
                    if (opc == 1) {
                        System.out.println("Vida util en años");
                        int vida = sc.nextInt();
                        System.out.println("Presio $?");
                        int precio = sc.nextInt();
                        System.out.println("tamaño");
                        int tamano = sc.nextInt();
                        System.out.println("Descripcion");
                        String des = sc.nextLine();
                        System.out.println("Nombre");
                        String nombre = sc.nextLine();
                        System.out.println("numero de producto");
                        int numerodeproducto = sc.nextInt();
                        pro.add(new producto(new Date(), vida, precio, tamano, des, nombre, numerodeproducto));
                        System.out.println("Agregado con exito");
                    } else if (opc == 2) {
                        System.out.println("Posicionque desea agregar");
                        int posicion = sc.nextInt();
                        System.out.println("nuevo precio");
                        int nuevo = sc.nextInt();
                        System.out.println("numero de producto");
                        int numero = sc.nextInt();
                        pro.get(posicion).setPrecio(nuevo);
                        pro.get(posicion).setNumeroProductos(numero);

                    } else if (opc == 3) {
                        System.out.println("posicion a eliminar");
                        int final3 = sc.nextInt();
                        pro.remove(final3);
                    } else {

                    }
                }
            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {
                r = 'T';
            }

        }

    }

    public static void validar(int edad) throws Excepciones {
        if (edad < 18) {
            throw new Excepciones("La edad debe ser mayor o igual a 18.");
        }
    }
}
