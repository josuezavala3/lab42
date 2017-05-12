package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binario b=new binario();
        System.out.println(b.binario("hola"));
        System.out.println(b.decoBinario(b.binario("hola")));
        /*
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
                            System.out.println("4. Agrgar almacen temporal");
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

                            } else if (opcion2 == 2) {

                            } else if (opcion2 == 3) {

                            } else if (opcion2 == 4) {
                            } else {
                                entro2 = false;
                            }

                        }
                    } else if (opealmace == 3) {

                        boolean entro2 = true;
                        while (entro2) {
                            System.out.println("1. eliminar almacen de planta");
                            System.out.println("2. eliminar almacen regional");
                            System.out.println("3. eliminar alamacen de plataforma");
                            System.out.println("4. eliminar almacen temporal");
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
                        System.out.println("1. Agregar persona");
                        System.out.println("2. Agregar empleado");
                        System.out.println("3. Agregar cliente");
                        System.out.println("4. volver al menu");
                        int opc = sc.nextInt();
                        if (opc == 1) {

                        } else if (opc == 2) {

                        } else if (opc == 3) {

                        } else {

                        }

                    } else if (opcio == 2) {
                        System.out.println("1. Modificar persona");
                        System.out.println("2. Modifciar empleado");
                        System.out.println("3.Modificar cliente");
                        System.out.println("4. volver al menu");
                        int opc = sc.nextInt();
                        if (opc == 1) {

                        } else if (opc == 2) {

                        } else if (opc == 3) {

                        } else {

                        }
                    } else if (opcio == 3) {
                        System.out.println("1. Eliminar persona");
                        System.out.println("2. Eliminar empleado");
                        System.out.println("3. Eliminar cliente");
                        System.out.println("4. volver al menu");
                        int opc = sc.nextInt();
                        if (opc == 1) {

                        } else if (opc == 2) {

                        } else if (opc == 3) {

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

                    } else if (opc == 2) {

                    } else if (opc == 3) {

                    } else {

                    }
                }
            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {
                r = 'T';
            }

        }
        */
    }

}
