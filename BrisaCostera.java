// BRISA COSTERA - AGENCIA DE VIAJES
// CASO DE ESTUDIO A (SEGUNDO CORTE)
// SISTEMA PARA REGISTRAR CLIENTES, TIPO DE MALETA, ACOMPAÑANTES Y VALOR DEL VIAJE. DE UNA AGENCIA DE VIAJES.
// EN CADA BLOQUE VA A APARECER EL REQUISITO QUE CUMPLE (POR EJEMPLO: RNF-05)

// LIBRERIAS
import java.util.Scanner; // TECLADO
import java.time.LocalDate; // FECHA
import java.time.LocalTime; // HORA
import java.io.FileWriter; // CREAR ARCHIVOS
import java.io.BufferedWriter; // ESPACIO - MEMORIA
import java.io.IOException; // ALERTAS
import java.text.NumberFormat; // FORMATO DE MONEDA
import java.util.Locale; // CONFIGURAR EN COP

public class BrisaCostera {
public static void main(String[] args) {

// CREAR EL TECLADO
Scanner teclado = new Scanner (System.in);

// FORMATO DE MONEDA EN PESOS COLOMBIANOS (RNF-03)
NumberFormat formatopesos = NumberFormat.getCurrencyInstance (Locale.forLanguageTag("es-CO"));

// VARIABLES CON EL VALOR DE LAS MALETAS POR PERSONA (DEPENDIENDO SI ES MB O MP) (RD-03)
final double precioMaletaBasica = 285_325.00; // MALETA BASICA (MB)
final double precioMaletaPremium = 325_650.00; // MALETA PREMIUM (MP)

// CREAR LAS VARIABLES DEL CLIENTE (RF-02 AL RF-07)
String nombre = ""; // NOMBRE DEL CLIENTE
long cedula = 0; // CEDULA (CON LONG PORQUE PUEDE TENER 10 DIGITOS)
String fechaViaje = ""; // FECHA DEL VIAJE (EN TEXTO)
String destino = ""; // DESTINO DEL VIAJE
String tipoMaleta = ""; // MB O MP
int acompanantes = 0; // PERSONAS QUE VIAJAN, SE INCLUYE EL CLIENTE AQUI MISMO
double valorViaje = 0; // TARIFA DE LA MALETA * ACOMPAÑANTES (RF-08)

// AVISOS PARA SABER QUE DATOS FALTAN POR REGISTRAR (RF-14)
boolean clienteRegistrado = false; // NOMBRE, CEDULA, FECHA Y DESTINO
boolean maletaRegistrada = false; // TIPO DE MALETA
boolean acompanantesRegistrados = false; // CANTIDAD DE ACOMPAÑANTES

// VARIABLE ENTERA PARA EL MENU
int opcion = 0; // GUARDA LO QUE EL USUARIO ESCOJA


// CICLO CONTINUO QUE REPITE EL MENU HASTA QUE EL VENDEDOR ESCOJA SALIR (RF-01, RF-12)
while (opcion != 7) {

// SE APAGA EN CADA VUELTA, SE ENCIENDE SOLO CUANDO SE ATIENDE UNA OPCION DEL 1 AL 6
boolean opcionAtendida = false;

// MENU PRINCIPAL (RF-01)
System.out.println("=========================================");
System.out.println("     BRISA COSTERA - AGENCIA DE VIAJES   ");
System.out.println("=========================================");
System.out.println("1. REGISTRAR CLIENTE");
System.out.println("2. TIPO DE MALETA");
System.out.println("3. ACOMPAÑANTES");
System.out.println("4. VALOR DEL VIAJE");
System.out.println("5. VISUALIZAR TODA LA INFORMACION");
System.out.println("6. RESPALDO TXT");
System.out.println("7. SALIR");
System.out.println("VENDEDOR INGRESE UNA OPCION:");
opcion = teclado.nextInt(); // AQUI SE GUARDA LA OPCION QUE EL VENDEDOR ESCOJA

// CADA CASE ES UNA OPCION DEL MENU
switch (opcion) {

    // REGISTRAR CLIENTE: NOMBRE, CEDULA, FECHA DEL VIAJE Y DESTINO (RF-02 AL RF-05)
    case 1:
        teclado.nextLine();

        // NOMBRE (RF-02)
        System.out.println("INGRESE EL NOMBRE DEL CLIENTE:");
        nombre = teclado.nextLine();

        // CEDULA: SE REPITE LA PREGUNTA HASTA QUE TENGA ENTRE 6 Y 10 DIGITOS (RF-03, RD-02)
        boolean cedulaValida = false; // APAGADO MIENTRAS LA CEDULA NO SEA CORRECTA
        while (cedulaValida == false) {
            System.out.println("INGRESE LA CEDULA DEL CLIENTE (6 A 10 DIGITOS):");
            cedula = teclado.nextLong();

            // SI ES MAYOR O IGUAL A 100000 (6 DIGITOS) Y MENOR O IGUAL A 9999999999 (10 DIGITOS)
            if (cedula >= 100000) {
                if (cedula <= 9999999999L) {
                    cedulaValida = true;
                }
            }

            // SI SIGUE APAGADO, SE AVISA EL ERROR Y SE VUELVE A PREGUNTAR
            if (cedulaValida == false) {
                System.out.println("ERROR: LA CEDULA DEBE TENER ENTRE 6 Y 10 DIGITOS");
            }
        }

        teclado.nextLine();

        // FECHA DEL VIAJE COMO TEXTO (RF-04)
        System.out.println("INGRESE LA FECHA DEL VIAJE (EJEMPLO 15/12/2026):");
        fechaViaje = teclado.nextLine();

        // DESTINO (PUEDE TENER ESPACIOS) (RF-05)
        System.out.println("INGRESE EL DESTINO DEL VIAJE:");
        destino = teclado.nextLine();

        // SE ENCIENDE EL AVISO: YA HAY CLIENTE REGISTRADO (RF-14)
        clienteRegistrado = true;
        System.out.println("CLIENTE REGISTRADO CORRECTAMENTE");
        opcionAtendida = true;
        break;

    // TIPO DE MALETA: SOLO ACEPTA MB O MP EN MAYUSCULA (RF-06, RD-03)
    case 2:
        System.out.println("TIPO DE MALETA (SE COBRA POR CADA PERSONA QUE VIAJA):");
        System.out.println("MB = MALETA BASICA - " + formatopesos.format(precioMaletaBasica));
        System.out.println("MP = MALETA PREMIUM - " + formatopesos.format(precioMaletaPremium));
        System.out.println("INGRESE MB O MP:");
        String maletaIngresada = teclado.next(); // SE GUARDA APARTE PARA REVISARLA ANTES DE REGISTRARLA

        if (maletaIngresada.equals("MB")) {
            tipoMaleta = maletaIngresada;
            maletaRegistrada = true; // SE ENCIENDE EL AVISO (RF-14)
            System.out.println("MALETA BASICA REGISTRADA");
        }
        else if (maletaIngresada.equals("MP")) {
            tipoMaleta = maletaIngresada;
            maletaRegistrada = true; // SE ENCIENDE EL AVISO (RF-14)
            System.out.println("MALETA PREMIUM REGISTRADA");
        }
        else {
            System.out.println("ERROR: ESCRIBA SOLO MB O MP, EN MAYUSCULA. LA MALETA NO SE REGISTRO");
        }
        opcionAtendida = true;
        break;

    // ACOMPAÑANTES: DEBE SER UN NÚMERO ENTERO MAYOR QUE 0, INCLUYE AL CLIENTE (RF-07)
    case 3:
        System.out.println("INGRESE CUANTAS PERSONAS VIAJAN, CONTANDO AL CLIENTE (MINIMO 1):");
        System.out.println("EJEMPLO: UNA FAMILIA DE 4 PERSONAS ESCRIBE 4");
        int acompanantesIngresados = teclado.nextInt(); // SE GUARDA APARTE PARA REVISARLO ANTES DE REGISTRARLO

        if (acompanantesIngresados > 0) {
            acompanantes = acompanantesIngresados;
            acompanantesRegistrados = true; // SE ENCIENDE EL AVISO (RF-14)
            System.out.println("PERSONAS QUE VIAJAN REGISTRADAS: " + acompanantes);
        }
        else {
            System.out.println("ERROR: LA CANTIDAD DEBE SER UN NUMERO ENTERO MAYOR QUE 0. NO SE REGISTRO");
        }
        opcionAtendida = true;
        break;

    // VALOR DEL VIAJE: TARIFA DE LA MALETA * PERSONAS QUE VIAJAN (RF-08, RF-14, RD-04)
    case 4:
        boolean faltanDatosValor = false; // APAGADO = NO FALTA NADA

        // REVISAR QUE DATOS FALTAN ANTES DE CALCULAR (RF-14)
        if (maletaRegistrada == false) {
            System.out.println("FALTA REGISTRAR EL TIPO DE MALETA (OPCION 2)");
            faltanDatosValor = true;
        }
        if (acompanantesRegistrados == false) {
            System.out.println("FALTA REGISTRAR LAS PERSONAS QUE VIAJAN (OPCION 3)");
            faltanDatosValor = true;
        }

        // SOLO SE CALCULA SI NO FALTA NINGUN DATO
        if (faltanDatosValor == false) {
            if (tipoMaleta.equals("MB")) {
                valorViaje = precioMaletaBasica * acompanantes;
            }
            else {
                valorViaje = precioMaletaPremium * acompanantes;
            }
            System.out.println("VALOR TOTAL DEL VIAJE: " + formatopesos.format(valorViaje));
        }
        opcionAtendida = true;
        break;

    // VISUALIZAR TODA LA INFORMACION DE LA RESERVA (RF-09, RF-14)
    case 5:
        boolean faltanDatosInfo = false; // APAGADO = NO FALTA NADA

        // REVISAR QUE DATOS FALTAN ANTES DE MOSTRAR (RF-14)
        if (clienteRegistrado == false) {
            System.out.println("FALTA REGISTRAR EL CLIENTE (OPCION 1)");
            faltanDatosInfo = true;
        }
        if (maletaRegistrada == false) {
            System.out.println("FALTA REGISTRAR EL TIPO DE MALETA (OPCION 2)");
            faltanDatosInfo = true;
        }
        if (acompanantesRegistrados == false) {
            System.out.println("FALTA REGISTRAR LAS PERSONAS QUE VIAJAN (OPCION 3)");
            faltanDatosInfo = true;
        }

        // SOLO SE MUESTRA SI NO FALTA NINGUN DATO
        if (faltanDatosInfo == false) {
            // SE CALCULA DE NUEVO POR SI CAMBIO LA MALETA O LAS PERSONAS
            if (tipoMaleta.equals("MB")) {
                valorViaje = precioMaletaBasica * acompanantes;
            }
            else {
                valorViaje = precioMaletaPremium * acompanantes;
            }

        System.out.println("=========================================");
        System.out.println("         INFORMACION DE LA RESERVA       ");
        System.out.println("=========================================");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("CEDULA: " + cedula);
        System.out.println("FECHA DEL VIAJE: " + fechaViaje);
        System.out.println("DESTINO: " + destino);
        System.out.println("TIPO DE MALETA: " + tipoMaleta);
        System.out.println("PERSONAS QUE VIAJAN: " + acompanantes);
        System.out.println("VALOR DEL VIAJE: " + formatopesos.format(valorViaje));
        System.out.println("=========================================");
        }
        opcionAtendida = true;
        break;

    // RESPALDO TXT: CREA EL ARCHIVO CON LA INFORMACION DE LA RESERVA (RF-10, RF-15, RNF-01, RNF-04)
    case 6:
        boolean faltanDatosRespaldo = false; // APAGADO = NO FALTA NADA

        // REVISAR QUE DATOS FALTAN ANTES DE CREAR EL ARCHIVO (RF-14)
        if (clienteRegistrado == false) {
            System.out.println("FALTA REGISTRAR EL CLIENTE (OPCION 1)");
            faltanDatosRespaldo = true;
        }
        if (maletaRegistrada == false) {
            System.out.println("FALTA REGISTRAR EL TIPO DE MALETA (OPCION 2)");
            faltanDatosRespaldo = true;
        }
        if (acompanantesRegistrados == false) {
            System.out.println("FALTA REGISTRAR LAS PERSONAS QUE VIAJAN (OPCION 3)");
            faltanDatosRespaldo = true;
        }

        // SOLO SE CREA EL ARCHIVO SI NO FALTA NINGUN DATO
        if (faltanDatosRespaldo == false) {
            // SE CALCULA DE NUEVO POR SI CAMBIO LA MALETA O LAS PERSONAS
            if (tipoMaleta.equals("MB")) {
                valorViaje = precioMaletaBasica * acompanantes;
            }
            else {
                valorViaje = precioMaletaPremium * acompanantes;
            }

// FECHA Y HORA EN QUE SE GENERA EL RESPALDO (RF-15)
// REQUISITO ADICIONAL PROPUESTO POR EL DESARROLLADOR (RF-15)
LocalDate fechaRespaldo = LocalDate.now();
LocalTime horaRespaldo = LocalTime.now();

// CREAR EL ARCHIVO TXT CON NOMBRE FIJO, CADA RESPALDO REEMPLAZA AL ANTERIOR (RF-10, RNF-01)
try {
FileWriter respaldo = new FileWriter("RESPALDO BRISA COSTERA.txt");
BufferedWriter archivo = new BufferedWriter(respaldo);

    archivo.write("=========================================" + "\n");
    archivo.write("   BRISA COSTERA - AGENCIA DE VIAJES     " + "\n");
    archivo.write("         RESPALDO DE LA RESERVA          " + "\n");
    archivo.write("=========================================" + "\n" + "\n");
    archivo.write("NOMBRE: " + nombre + "\n");
    archivo.write("CEDULA: " + cedula + "\n");
    archivo.write("FECHA DEL VIAJE: " + fechaViaje + "\n");
    archivo.write("DESTINO: " + destino + "\n");
    archivo.write("TIPO DE MALETA: " + tipoMaleta + "\n");
    archivo.write("PERSONAS QUE VIAJAN: " + acompanantes + "\n");
    archivo.write("VALOR DEL VIAJE: " + formatopesos.format(valorViaje) + "\n" + "\n");
    archivo.write("=========================================" + "\n");
    archivo.write("FECHA DEL RESPALDO: " + fechaRespaldo + "\n");
    archivo.write("HORA DEL RESPALDO: " + horaRespaldo);
                
    archivo.close();
    respaldo.close();

// CONFIRMAR EN PANTALLA, CON LA FECHA Y LA HORA COMO ULTIMO DATO (RF-10, RF-15)
System.out.println("RESPALDO GENERADO CORRECTAMENTE EN EL ARCHIVO: RESPALDO BRISA COSTERA.txt");
System.out.println("FECHA DEL RESPALDO: " + fechaRespaldo);
System.out.println("HORA DEL RESPALDO: " + horaRespaldo);
    }

// SI FALLA EL ARCHIVO, SE AVISA Y EL PROGRAMA SIGUE CON LOS DATOS DEL CLIENTE (RNF-04)
catch (IOException error) {
    System.out.println("ERROR AL CREAR EL ARCHIVO DE RESPALDO: " + error.getMessage());
    }
}
        opcionAtendida = true;
        break;

    // SALIR DEL SISTEMA, NO PREGUNTA POR "vacaciones" (RF-12)
    case 7:
        System.out.println("GRACIAS POR USAR EL SISTEMA DE BRISA COSTERA !!!");
        break;

    // OPCION NO VALIDA, NO MODIFICA LOS DATOS DEL CLIENTE (RF-13)
    default:
        System.out.println("OPCION NO VALIDA. REVISE EL MENU");
}

// PREGUNTAR SI SE CIERRA LA FACTURA, SOLO DESPUES DE LAS OPCIONES DEL 1 AL 6 (RF-11)
if (opcionAtendida == true) {
    System.out.println("ESCRIBA (vacaciones) PARA CERRAR LA FACTURA O CUALQUIER OTRA PALABRA PARA CONTINUAR:");
    String palabraCierre = teclado.next();

    if (palabraCierre.equals("vacaciones")) {
        // BORRAR LOS DATOS DEL CLIENTE ACTUAL PARA EMPEZAR UNO NUEVO
        nombre = "";
        cedula = 0;
        fechaViaje = "";
        destino = "";
        tipoMaleta = "";
        acompanantes = 0;
        valorViaje = 0;

        // APAGAR LOS INTERRUPTORES (RF-14)
        clienteRegistrado = false;
        maletaRegistrada = false;
        acompanantesRegistrados = false;

        System.out.println("FACTURA CERRADA. YA PUEDE REGISTRAR UN CLIENTE NUEVO.");
    }
}

}


teclado.close(); //CERRAR EL TECLADO


}
}