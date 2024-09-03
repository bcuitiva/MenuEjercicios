import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Brayan David Cuitiva Umbarila
        // Codigo de menu para usar ley de ohm y calcular la nota final de un estudiante
        // 29-08-2024
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        int menu = 0;
        double v = 0, i = 0, r = 0, ta = 0, qu = 0, pa = 0, total = 0, notaP1 = 0, notaP2 = 0, notaP3 = 0;
        System.out.println("BIENVENIDO!\nQué deseas hacer?");
        System.out.println("1. Ejercicio Ley de ohm.\n2. Calcular nota definitiva.");
        menu = sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("Ahora ingresa que deseas calcular:");
                System.out.println("1. Voltaje\n2. Corriente\n3. Resistencia");
                menu = sc.nextInt();
                if(menu == 1){
                    System.out.println("Calcularas el voltaje - voltios:");
                    System.out.println("Ingresa el valor de la corriente - amperios:");
                    i = sc.nextDouble();
                    System.out.println("Ingresa el valor de la resistencia - ohms:");
                    r  = sc.nextDouble();
                    v = i * r;

                    System.out.println("El valor del voltaje es de " + d.format(v) + " voltios.");
                } else if(menu == 2){
                    System.out.println("Calcularas la corriente - amperios:");
                    System.out.println("Ingresa el valor del voltaje - voltios:");
                    v = sc.nextDouble();
                    System.out.println("Ingresa el valor de la resistencia - ohms:");
                    r  = sc.nextDouble();
                    i = v / r;
                    System.out.println("El valor de la corriente es de " + d.format(i) + " amperios.");
                } else if(menu == 3){
                    System.out.println("Calcularas la resistencia - ohms:");
                    System.out.println("Ingresa el valor del voltaje - voltios:");
                    v = sc.nextDouble();
                    System.out.println("Ingresa el valor de la corriente - amperios:");
                    i = sc.nextDouble();
                    r = v / i;
                    System.out.println("El valor de la resistencia es de " + d.format(r) + " ohms.");
                }
                break;
            case 2:
                System.out.println("Calcularas tu nota definitiva");
                System.out.println("Primero las notas del primer corte (35%):");
                System.out.println("Ingresa la nota de las tareas (10%):");
                ta = sc.nextDouble();
                while (ta < 0 || ta > 5) {
                    if (ta < 0 || ta > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    ta = sc.nextDouble();
                    if (ta >= 0 && ta <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                System.out.println("Ingresa la nota de quiz (10%):");
                qu = sc.nextDouble();
                while (qu < 0 || qu > 5) {
                    if (qu < 0 || qu > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    qu = sc.nextDouble();
                    if (qu >= 0 && qu <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                System.out.println("Ingresa la nota de parcial (15%):");
                pa = sc.nextDouble();
                while (pa < 0 || pa > 5) {
                    if (pa < 0 || pa > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    pa = sc.nextDouble();
                    if (pa >= 0 && pa <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                notaP1 = (ta * 0.1) + (qu * 0.1) + (pa * 0.15);
                total = total + notaP1;
                System.out.println("\nAhora las notas del segundo corte (35%):");
                System.out.println("Ingresa la nota de las tareas (10%):");
                ta = sc.nextDouble();
                while (ta < 0 || ta > 5) {
                    if (ta < 0 || ta > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    ta = sc.nextDouble();
                    if (ta >= 0 && ta <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                System.out.println("Ingresa la nota de quiz (10%):");
                qu = sc.nextDouble();
                while (qu < 0 || qu > 5) {
                    if (qu < 0 || qu > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    qu = sc.nextDouble();
                    if (qu >= 0 && qu <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                System.out.println("Ingresa la nota de parcial (15%):");
                pa = sc.nextDouble();
                notaP2 = (ta * 0.1) + (qu * 0.1) + (pa * 0.15);
                total = total + notaP2;
                System.out.println("\nAhora las notas del tercer corte (30%):");
                System.out.println("Ingresa la nota de las tareas (10%):");
                ta = sc.nextDouble();
                while (ta < 0 || ta > 5) {
                    if (ta < 0 || ta > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    ta = sc.nextDouble();
                    if (ta >= 0 && ta <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                System.out.println("Ingresa la nota de quiz (10%):");
                qu = sc.nextDouble();
                while (qu < 0 || qu > 5) {
                    if (qu < 0 || qu > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    qu = sc.nextDouble();
                    if (qu >= 0 && qu <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                System.out.println("Ingresa la nota de parcial (10%):");
                pa = sc.nextDouble();
                while (pa < 0 || pa > 5) {
                    if (pa < 0 || pa > 5){
                        System.out.println("La nota ingresada no es valida, ingrese una nota valida");
                    }
                    pa = sc.nextDouble();
                    if (pa >= 0 && pa <= 5){
                        System.out.println("La nota ingresada es valida.");
                    }
                }
                notaP3 = (ta * 0.1) + (qu * 0.1) + (pa * 0.1);
                total = total + notaP3;
                System.out.println("La nota para el primer corte es: " + notaP1);
                System.out.println("La nota para el segundo corte es: " + notaP2);
                System.out.println("La nota para el tercer corte es: " + notaP3);
                System.out.println("La nota definitiva del semestre es: " + d.format(total));
                if (total >= 3 && total <= 5){
                    System.out.println("Usted aprobo el semestre.");
                } else if (total >= 1.9 && total < 3){
                    System.out.println("Usted habilito el semestre.");
                } else if (total >= 0 && total < 1.9){
                    System.out.println("Usted reprobo el semestre.");
                } else {
                    System.out.println("Existe un error en las notas ingresadas.");
                }
                break;
        }
    }
}