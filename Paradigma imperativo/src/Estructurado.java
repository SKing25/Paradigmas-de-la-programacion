import javax.swing.JOptionPane;

public class Estructurado {

    public static void main(String[] args) {

        int identificacion;
        String nombreCompleto;
        int seleccion;
        int creditos = 4;
        int opcionCarrera;
        int opcionCurso;
        int seleccionRegistrar;
        String carrera;

        String[] horas = new String[7];
        String[] lunes = new String[7];
        String[] martes = new String[7];
        String[] miercoles = new String[7];
        String[] jueves = new String[7];
        String[] viernes = new String[7];
        String[] sabado = new String[7];

        // Registro de datos guia del horario

        horas[0] = "Horas";
        horas[1] = "7:00 - 8:00 AM";
        horas[2] = "8:00 - 9:00 AM";
        horas[3] = "9:00 - 11:00 AM";
        horas[4] = "12:00 AM - 2:00 PM";
        horas[5] = "2:00 - 4:00 PM";
        horas[6] = "4:00 - 6:00 PM";
        lunes[0] = "LUNES";
        martes[0] = "MARTES";
        miercoles[0] = "MIERCOLES";
        jueves[0] = "JUEVES";
        viernes[0] = "VIERNES";
        sabado[0] = "SABADO";

        identificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de identificacion"));
        nombreCompleto = JOptionPane.showInputDialog("Digite su nombre completo");
        opcionCarrera = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la carrera a la que pertenece:" +
                " \n1. Criminalistica"));

        switch (opcionCarrera) {

            case 1:
                carrera = "Criminalistica";
                while (creditos != 0) {
                    System.out.println("Creditos disponibles = " + creditos);
                    opcionCurso = Integer.parseInt(JOptionPane.showInputDialog("Selecciones el curso que desee inscribir:" +
                            " \n1. Introduccion a derecho, \n2. Laboratorio, \n3. Etica profesional, \n4. Metodologia de" +
                            " investigacion, \n5. Fundamentos de la constitucion "));

                    switch (opcionCurso) {

                        case 1:
                            System.out.println("Materia: Introduccion a derecho");
                            System.out.println("Franja horaria: Lunes: 2:00 - 4:00 PM, Miercoles: 4:00 - 6:00 PM, Viernes:" +
                                    " 9:00 - 11:00 AM ");
                            seleccionRegistrar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar la materia?" +
                                    " 1.si 0.no"));

                            if (seleccionRegistrar == 1) {
                                lunes[5] = "Introduccion a derecho";
                                miercoles[6] = "Introduccion a derecho";
                                viernes[3] = "Introduccion a derecho";
                                creditos -= 1;
                            } else {
                                System.out.println("Redirigiendo a la seleccion de materias");
                            }
                            break;

                        case 2:
                            System.out.println("Materia: Laboratorio");
                            System.out.println("Franja horaria: Martes: 2:00 - 4:00 PM, Jueves: 4:00 - 6:00 PM, Sabado:" +
                                    " 9:00 - 11:00 AM ");
                            seleccionRegistrar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar la materia?" +
                                    " 1.si 0.no"));

                            if (seleccionRegistrar == 1) {
                                martes[5] = " Laboratorio";
                                jueves[6] = "Laboratorio";
                                sabado[3] = "Laboratorio";
                                creditos -= 1;
                            } else {
                                System.out.println("Redirigiendo a la seleccion de materias");
                            }
                            break;

                        case 3:
                            System.out.println("Materia: Etica profesional");
                            System.out.println("Franja horaria: Lunes: 7:00 - 8:00 AM, Miercoles: 12:00 AM - 2:00 PM, Viernes:" +
                                    " 4:00 - 6:00 PM");
                            seleccionRegistrar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar la materia?" +
                                    " 1.si 0.no"));

                            if (seleccionRegistrar == 1) {
                                lunes[1] = "Etica profesional";
                                miercoles[4] = "Etica profesional";
                                viernes[6] = "Etica profesional";
                                creditos -= 1;
                            } else {
                                System.out.println("Redirigiendo a la seleccion de materias");
                            }
                            break;

                        case 4:
                            System.out.println("Materia: Metodologia de investigacion");
                            System.out.println("Franja horaria: Lunes: 8:00 - 9:00 AM, Miercoles: 2:00 - 4:00 PM, Viernes: " +
                                    "12:00 AM - 2:00 PM");
                            seleccionRegistrar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar la materia?" +
                                    " 1.si 0.no"));

                            if (seleccionRegistrar == 1) {
                                lunes[2] = "Metodologia de investigacion";
                                miercoles[5] = "Metodologia de investigacion";
                                viernes[4] = "Metodologia de investigacion";
                                creditos -= 1;
                            } else {
                                System.out.println("Redirigiendo a la seleccion de materias");
                            }
                            break;

                        case 5:
                            System.out.println("Materia: Fundamentos de la constitucion");
                            System.out.println("Franja horaria: Lunes: 2:00 - 4:00 PM, Miercoles: 4:00 - 6:00 PM, Jueves:" +
                                    " 9:00 - 11:00 AM ");
                            seleccionRegistrar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar la materia?" +
                                    " 1.si 0.no"));

                            if (seleccionRegistrar == 1) {
                                lunes[6] = "Fundamentos de la constitucion";
                                miercoles[6] = "Fundamentos de la constitucion";
                                jueves[3] = "Fundamentos de la constitucion";
                                creditos -= 1;
                            } else {
                                System.out.println("Redirigiendo a la seleccion de materias");
                            }
                            break;

                        default:
                            System.out.println("No eligio ninguna opcion");
                            break;
                    }
                }
                for (int i = 0; i < horas.length; i++) {
                    System.out.format("%-20s %-30s %-30s %-30s %-30s %-30s %-30s%n", horas[i], lunes[i], martes[i],
                            miercoles[i], jueves[i], viernes[i], sabado[i]);
                }

                break;
            default:
                System.out.println("No eligio ninguna opcion");
                break;
        }
    }
}