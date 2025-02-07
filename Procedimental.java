import javax.swing.*;

public class Procedimental {
    // Variables globales para todo el codigo
    static String[] horas = new String[7];
    static String[] lunes = new String[7];
    static String[] martes = new String[7];
    static String[] miercoles = new String[7];
    static String[] jueves = new String[7];
    static String[] viernes = new String[7];
    static String[] sabado = new String[7];
    static int creditos = 4;

    public static void main(String[] args) {
        inicializarHorario();
        datos_estudiante();
        gestionarMatricula();
        mostrarHorario();
    }

    // Procedimiento para inicializar el horario
    private static void inicializarHorario() {
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
    }

    // Procedimiento para recoger datos del estudiante
    private static void datos_estudiante() {
        int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de identificacion"));
        String nombreCompleto = JOptionPane.showInputDialog("Digite su nombre completo");
    }

    // Procedimiento para gestionar la matrícula de materias
    private static void gestionarMatricula() {
        int opcionCarrera = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite el numero de la carrera a la que pertenece: 1. Criminalistica"));

        if (opcionCarrera == 1) {
            while (creditos != 0) {
                System.out.println("Creditos disponibles = " + creditos);
                mostrarYRegistrarCursos();
            }
        } else {
            System.out.println("No eligio ninguna opcion");
        }
    }

    // Procedimiento para mostrar y registrar cursos
    private static void mostrarYRegistrarCursos() {
        int opcionCurso = Integer.parseInt(JOptionPane.showInputDialog(
                "Selecciones el curso que desee inscribir: \n1. Introduccion a derecho\n2. Laboratorio\n3. Etica profesional\n4. Metodologia de investigacion\n5. Fundamentos de la constitucion"));

        switch (opcionCurso) {
            case 1:
                registrarIntroduccionDerecho();
                break;
            case 2:
                registrarLaboratorio();
                break;
            case 3:
                registrarEticaProfesional();
                break;
            case 4:
                registrarMetodologiaInvestigacion();
                break;
            case 5:
                registrarFundamentosConstitucion();
                break;
            default:
                System.out.println("No eligio ninguna opcion");
                break;
        }
    }

    // Procedimientos para cada materia
    private static void registrarIntroduccionDerecho() {
        System.out.println("Materia: Introduccion a derecho");
        System.out.println("Franja horaria: Lunes: 2:00 - 4:00 PM, Miercoles: 4:00 - 6:00 PM, Viernes: 9:00 - 11:00 AM ");
        if (confirmarRegistro()) {
            lunes[5] = " Introduccion a derecho";
            miercoles[6] = " Introduccion a derecho";
            viernes[3] = " Introduccion a derecho";
            creditos--;
        }
    }

    private static void registrarLaboratorio() {
        System.out.println("Materia: Laboratorio");
        System.out.println("Franja horaria: Martes: 2:00 - 4:00 PM, Jueves: 4:00 - 6:00 PM, Sabado: 9:00 - 11:00 AM ");
        if (confirmarRegistro()) {
            martes[5] = " Laboratorio";
            jueves[6] = "Laboratorio";
            sabado[3] = "Laboratorio";
            creditos--;
        }
    }

    private static void registrarEticaProfesional() {
        System.out.println("Materia: Etica profesional");
        System.out.println("Franja horaria: Lunes: 7:00 - 8:00 AM, Miercoles: 12:00 AM - 2:00 PM, Viernes: 4:00 - 6:00 PM");
        if (confirmarRegistro()) {
            lunes[1] = " Etica profesional";
            miercoles[4] = " Etica profesional";
            viernes[6] = "Etica profesional";
            creditos--;
        }
    }

    private static void registrarMetodologiaInvestigacion() {
        System.out.println("Materia: Metodologia de investigacion");
        System.out.println("Franja horaria: Lunes: 8:00 - 9:00 AM, Miercoles: 12:00 AM - 2:00 PM, Viernes: 4:00 - 6:00 PM");
        if (confirmarRegistro()) {
            lunes[2] = "Metodologia de investigacion";
            miercoles[5] = "Metodologia de investigacion";
            viernes[4] = "Metodologia de investigacion";
            creditos--;
        }
    }

    private static void registrarFundamentosConstitucion() {
        System.out.println("Materia: Fundamentos de la constitucion");
        System.out.println("Franja horaria: Lunes: 2:00 - 4:00 PM, Miercoles: 4:00 - 6:00 PM, Jueves: 9:00 - 11:00 AM ");
        if (confirmarRegistro()) {
            lunes[6] = "Fundamentos de la constitucion";
            miercoles[6] = "Fundamentos de la constitucion";
            jueves[3] = "Fundamentos de la constitucion";
            creditos--;
        }
    }

    // Procedimiento para confirmar registro
    private static boolean confirmarRegistro() {
        int seleccionRegistrar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar la materia? 1.si 0.no"));
        if (seleccionRegistrar != 1) {
            System.out.println("Redirigiendo a la seleccion de materias");
            return false;
        }
        return true;
    }

    // Procedimiento para mostrar el horario
    private static void mostrarHorario() {
        for (int i = 0; i < horas.length; i++) {
            System.out.format("%-20s %-30s %-30s %-30s %-30s %-30s %-30s%n", horas[i], lunes[i], martes[i],
                    miercoles[i], jueves[i], viernes[i], sabado[i]);
        }
    }
}