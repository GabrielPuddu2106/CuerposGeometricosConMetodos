import java.util.Scanner;

public class CuerposGeometricosMethos {
    static Scanner lector = new Scanner(System.in);

    static double areaLateral, areaTotal, volumen, tang, aBase, area, volumenZona, radio, volumenCasquete;
    static double pBase, apotema, areaBase, altura, diametro, longitud, baseMenor;
    static double ladoMenor, ladoMayor, areaBMAYOR, areaBMENOR, pBMAYOR, pBMENOR;
    static double radioMayor, radioMenor, generatriz;
    static int lados, base, numeroGrados, caras, arista;
    static final double pii = 3.1416;
    static int intentos;

    public static void main(String[] args) throws Exception {
        System.out.println("Menu de opciones");

        System.out.println("1) Prisma");

        System.out.println("2) Cilindro");

        System.out.println("3) Piramide");

        System.out.println("4) Cono");

        System.out.println("5) Esfera");

        System.out.println("6) ZonaEsferica");

        System.out.println("7) CasqueteEsferico");

        System.out.println("8) TroncoDeCono");

        System.out.println("9) TroncoDePiramide");

        System.out.println("10) Hueso_CuñaEsferica");

        System.out.println("11) Ortoedro");

        System.out.println("12) Tetaedro");

        System.out.println("13) Hexaedro");

        System.out.println("14) Octaedro");

        System.out.println("15) Dodecaedro");

        System.out.println("16) Icosaedro");

        System.out.println("17) Salir");

        byte opc = lector.nextByte();

        switch (opc) {
            case 1:
                solucionPrisma();
                System.out.println(" ");
                System.out.println("El PBASE ES:" + pBase);
                System.out.println(" LA TANGENTE ES:" + tang);
                System.out.println("EL APOTEMA ES:" + apotema);
                System.out.println("EL AREA BASE ES:" + aBase);
                System.out.println("El VOLUMEN ES:" + volumen);
                System.out.println("EL AREA LATERAL ES:" + areaLateral);
                System.out.println("EL AREA TOTAL ES:" + areaTotal);

                break;

            case 2:
                solucionCilindro();
                System.out.println(" ");
                System.out.println("EL AREA LATERAL ES:" + areaLateral);
                System.out.println("EL VOLUMEN ES:" + volumen);
                System.out.println("EL AREA TOTAL ES:" + areaTotal);

                break;

            case 3:
                solucionPiramide();
                System.out.println(" ");
                System.out.println("EL AREA LATERAL ES:" + areaLateral);
                System.out.println("EL AREA BASE ES: " + areaBase);
                System.out.println("EL VOLUMEN ES: " + volumen);

                break;

            case 4:
                solucionCono();
                System.out.println("EL AREA LATERAL ES:" + areaLateral);
                System.out.println("EL AREA TOTAL ES:" + areaTotal);
                System.out.println("EL VOLUMEN ES DE:" + volumen);

                break;

            case 5:
                solucionEsfera();
                System.out.println(" ");
                System.out.println("EL AREA ES DE: " + area);
                System.out.println("EL VOLUMEN ES DE: " + volumen);

                break;

            case 6:
                solucionZonaEsferica();
                System.out.println(" ");
                System.out.println("EL AREA DE LA ZONA Y CASQUESTE ES: " + area);
                System.out.println("EL VOLUMEN DE LA ZONA ESFERICA ES:" + volumenZona);

                break;

            case 7:
                solucionCasqueteEsferico();
                System.out.println(" ");
                System.out.println("EL AREA DE LA ZONA Y CASQUESTE ES: " + area);
                System.out.println("EL VOLUMEN DEL CASQUETE ESFERICO ES: " + volumenCasquete);

                break;

            case 8:
                solucionTroncoDeCono();
                System.out.println(" ");
                System.out.println("EL AREA LATERAL ES DE:" + areaLateral);
                System.out.println("EL AREA TOTAL ES :" + areaTotal);
                System.out.println("EL VOLUMEN ES:" + volumen);

                break;

            case 9:
                solucionTroncoDePiramide();
                System.out.println(" ");
                System.out.println("EL AREA LATERAL ES DE:" + areaLateral);
                System.out.println("EL AREA TOTAL ES :" + areaTotal);
                System.out.println("EL VOLUMEN ES:" + volumen);
                System.out.println("EL APOTEMA ES:" + apotema);
                System.out.println("EL PERIMETRO BASE MAYOR ES:" + pBMAYOR);
                System.out.println("EL PERIMETRO BASE MENOR" + pBMENOR);
                System.out.println("EL AREA BASE MAYOR ES:" + areaBMAYOR);
                System.out.println("EL AREA BASE MENOR ES: " + areaBMENOR);

                break;

            case 10:
                solucionHuesoCuñaEsferica();
                System.out.println(" ");
                System.out.println("EL AREA ES: " + area);
                System.out.println("EL VOLUMEN ES :" + volumen);

                break;

            case 11:
                solucionOrtoedro();
                System.out.println(" ");
                System.out.println("EL AREA ES DE: " + area);
                System.out.println("EL DIAMETRO ES:" + diametro);
                System.out.println("EL VOLUMEN ES DE:" + volumen);

                break;

            case 12:
                solucionTetaedro();
                System.out.println(" ");
                System.out.println("EL AREA ES:" + area);
                System.out.println("EL VOLUMEN ES :" + volumen);
                System.out.println("LA ALTURA ES :" + altura);

                break;

            case 13:
                solucionHexaedro();
                System.out.println(" ");
                System.out.println("EL AREA ES DE:" + area);
                System.out.println("EL VOLUMEN ES:" + volumen);
                System.out.println("EL DIAMETRO ES:" + diametro);

                break;

            case 14:
                solucionOctaedro();
                System.out.println(" ");
                System.out.println("EL AREA ES DE: " + area);
                System.out.println("EL VOLUMEN ES DE: " + volumen);

                break;

            case 15:
                solucionDodecaedro();
                System.out.println(" ");
                System.out.println("EL AREA ES DE:" + area);
                System.out.println("EL VOLUMEN ES:" + volumen);

                break;

            case 16:
                solucionIcosaedro();
                System.out.println(" ");
                System.out.println("EL AREA ES DE:" + area);
                System.out.println("EL VOLUMEN ES:" + volumen);

                break;

            case 17:
                System.out.println("17) Salir");

                break;

            default:

                System.out.println("Opcion incorrecta/No valida");
                System.out.println("Saliendo de la app");
        }
        lector.close();
    }

    public static double solucionPrisma() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE LA LONGITUD DEL PRISMA / NO NEGATIVOS");
                longitud = lector.nextDouble();
            } while (longitud <= 0);

            do {
                System.out.println("INGRESE EL NUMERO DE LADOS DEL PRISMA / NO NEGATIVOS");
                lados = lector.nextInt();
            } while (lados <= 0 || lados > 6);

            do {
                System.out.println("INGRESE LA ALTURA DEL PRISMA  / NO NEGATIVOS");
                altura = lector.nextDouble();
            } while (altura <= 0);
            // CALCULO DE DATOS DE ENTRADA

            pBase = lados * altura;
            tang = 360 / (2 * lados);
            apotema = longitud / (2 * Math.tan(tang * 3.1416 / 180));
            aBase = pBase + apotema / 2;
            volumen = aBase + altura;
            areaLateral = pBase * altura;
            areaTotal = areaLateral + 2 * aBase;

            break;
        }
         return areaLateral;
    }

    public static double solucionCilindro() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("Ingrese el Radio");
                radio = lector.nextDouble();

                if (radio > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);

            do {
                System.out.println("INGRESE LA ALTURA");
                altura = lector.nextInt();

                if (altura > 0) {
                    break;

                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVE INGRESAR LA ALTUTA");
                }

            } while (true);

            // PROCESANDO DATOS DE ENTRADA
            areaLateral = 2 * (3.1416) * radio * altura;
            areaTotal = 2 * (3.1416) * radio * (altura + radio);
            volumen = (3.1416) * radio * radio * altura;

            break;

        }
         return areaLateral;
    }

    public static double solucionPiramide() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("Ingrese el Radio");
                radio = lector.nextDouble();

                if (radio > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);

            do {
                System.out.println("INGRESE LA ALTURA");
                altura = lector.nextInt();

                if (altura > 0) {
                    break;

                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVE INGRESAR LA ALTUTA");
                }

            } while (true);

            // PROCESANDO DATOS DE ENTRADA
            areaLateral = 2 * (3.1416) * radio * altura;
            areaTotal = 2 * (3.1416) * radio * (altura + radio);
            volumen = (3.1416) * radio * radio * altura;

            break;

        }
          return areaLateral;
    }

    public static double solucionCono() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE EL RADIO");
                radio = lector.nextDouble();
                if (radio > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);

            do {
                System.out.println("INGRESE LA ALTURA");
                altura = lector.nextDouble();
                if (altura > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR LA ALTURA");
                }

            } while (true);

            do {
                System.out.println("INGRESE LA GENERATRIZ / NO PUEDE SER NEGATIVA");

                generatriz = lector.nextDouble();
            } while (generatriz < 0);
            // PROCESANDO DATOS DE ENTRADA

            areaLateral = (3.1416 * radio * generatriz);
            areaTotal = 3.1416 * radio * (generatriz + radio);
            volumen = (3.1416 * radio * radio * altura) / 3;

            break;
        }
          return areaLateral;
    }

    public static double solucionEsfera() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE EL RADIO");
                radio = lector.nextDouble();
                if (radio > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);

            // OPERACIONES
            area = (4 * 3.1416 * radio * radio);
            volumen = (4 / 3 * 3.1416 * radio * radio * radio);

            break;

        }
          return areaLateral;
    }

    public static double solucionZonaEsferica() {
        for (intentos = 0; intentos < 3; intentos++) {

            do {
                System.out.println("INGRESE LA ALTURA / NO PUEDE SER NEGATIVA");
                altura = lector.nextDouble();
            } while (altura <= 0);
            do {
                System.out.println("INGRESE EL RADIO MAYOR");
                radioMayor = lector.nextDouble();
                if (radioMayor > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);
            do {
                System.out.println("INGRESE EL RADIO MENOR ");
                radioMenor = lector.nextDouble();
            } while (radioMenor <= 0 || radioMenor > radioMayor);
            // PROCESANDO DATOS DE ENTRADA

            area = (2 * 3.1416 * radioMayor * radioMenor);
            volumenZona = 3.1416 * altura
                    * (altura * altura + 3 * radioMenor * radioMenor * 3 * radioMenor * radioMenor);

            break;

        }
         return areaLateral;
    }

    public static double solucionCasqueteEsferico() {
        for (intentos = 0; intentos < 3; intentos++) {

            do {
                System.out.println("INGRESE LA ALTURA");
                altura = lector.nextDouble();
            } while (altura <= 0);
            do {
                System.out.println("INGRESE EL RADIO MAYOR");
                radioMayor = lector.nextDouble();

                if (radioMayor > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);
            do {
                System.out.println("INGRESE EL RADIO MENOR");
                radioMenor = lector.nextDouble();
            } while (radioMenor <= 0 || radioMenor > radioMayor);
            // PROCESANDO DATOS DE ENTRADA

            area = (2 * 3.1416 * radioMayor * radioMenor);
            volumenCasquete = 3.1416 * altura * altura * (3 * radioMayor - altura) / 3;

            break;
        }
         return areaLateral;
    }

    public static double solucionTroncoDeCono() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE EL RADIO MAYOR");
                radioMayor = lector.nextDouble();
                if (radioMayor > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);

            do {
                System.out.println("INGRESE EL RADIO MENOR");
                radioMenor = lector.nextDouble();

                if (radioMenor > 0 && radioMenor < radioMayor) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);

            do {
                System.out.println("INGRESE LA ALTURA/ NO PUEDE SER NEGATIVA");
                altura = lector.nextDouble();
            } while (altura <= 0);
            // OPERACIONES
            generatriz = Math.sqrt(Math.pow(altura, 2) + (radioMayor - radioMenor * 2));
            areaLateral = pii * (radioMayor + radioMenor);
            areaTotal = areaLateral + radioMayor + radioMenor;
            volumen = (1 / 3 * pii * altura * (radioMayor * radioMayor) + (radioMenor * radioMenor)
                    + radioMayor * radioMenor);

            break;
        }
          return areaLateral;
    }

    public static double solucionTroncoDePiramide() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE EL LADO MAYOR");
                ladoMayor = lector.nextDouble();
                if (ladoMayor > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");
                    System.out.println("INGRESE EL LADO MAYOR");

                }
            } while (true);

            do {
                System.out.println("INGRESE EL LADO MENOR");
                ladoMenor = lector.nextDouble();
            } while (ladoMenor <= 0 || ladoMenor > ladoMayor);

            do {
                System.out.println("INGRESE LA ALTURA");
                altura = lector.nextDouble();
                if (altura > 0) {
                    break;
                } else {
                    System.out.println("VALOR INCORRECTO / LA ALTURA NO PUEDE SER NEGATIVA");
                    System.out.println("INGRESE LA ALTURA");

                }

            } while (true);

            // OPERACIONES
            areaBMAYOR = Math.pow(ladoMayor, 2);
            areaBMENOR = Math.pow(ladoMenor, 2);
            apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(ladoMayor, 2));
            pBMAYOR = apotema * ladoMayor;
            pBMENOR = apotema * ladoMenor;
            areaLateral = pBMAYOR + pBMENOR / 2 * apotema;
            areaTotal = areaLateral + areaBMAYOR + areaBMENOR;
            volumen = (1 * altura * (areaBMAYOR + areaBMENOR + Math.sqrt(areaBMAYOR * areaBMENOR)) / 3);

            break;

        }
          return areaLateral;
    }

    public static double solucionHuesoCuñaEsferica() {
        for (intentos = 0; intentos < 3; intentos++) {

            do {
                System.out.println("INGRESE EL RADIO");
                radio = lector.nextDouble();

                if (radio > 0) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL RADIO");
                }

            } while (true);

            do {
                System.out.println("INGRESE EL NUMERO DE GRADOS");
                numeroGrados = lector.nextInt();

                if (numeroGrados > 0 && numeroGrados <= 360) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR EL NUMERO DE GRADOS");
                }

            } while (true);

            // PROCESANDO DATOS DE ENTRADA

            area = (4 * 3.1416 * radio * radio * numeroGrados) / 360;
            volumen = 4 / 3 * (3.1416 * radio * radio * radio * numeroGrados) / 360;

            break;
        }
         return areaLateral;
    }

    public static double solucionOrtoedro() {
        for (intentos = 0; intentos < 3; intentos++) {

            do {
                System.out.println("INGRESE  LA BASE MENOR");
                baseMenor = lector.nextDouble();
            } while (baseMenor <= 0);

            do {
                System.out.println("INGRESE LAS CARAS");
                caras = lector.nextInt();
            } while (caras <= 0);
            // OPERACIONES

            area = 2 * (8 * baseMenor + 8 * caras + baseMenor * caras);
            diametro = Math.sqrt(8 * 8 + baseMenor * baseMenor + caras * caras);
            volumen = 8 * baseMenor * caras;

            break;
        }
         return areaLateral;
    }

    public static double solucionTetaedro() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE LAS ARISTAS");
                arista = lector.nextInt();
                if (arista == 6) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR LAS ARISTAS");
                }

            } while (true);
            // OPERACIONES

            area = Math.pow(arista, 2) * Math.sqrt(3);
            volumen = Math.sqrt(2) / 12 * Math.pow(arista, 3);
            altura = arista * (Math.sqrt(6) / 3);

            break;
        }
          return areaLateral;
    }

    public static double solucionHexaedro() {
        for (intentos = 0; intentos < 3; intentos++) {

            do {
                System.out.println("INGRESE LAS ARISTAS");
                arista = lector.nextInt();
                if (arista == 12) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR LAS ARISTAS");
                }

            } while (true);

            // OPERACIONES
            area = 6 * Math.pow(arista, 2);
            volumen = Math.pow(arista, 3);
            diametro = arista * Math.sqrt(3);

            break;
        }
          return areaLateral;
    }

    public static double solucionOctaedro() {
        for (intentos = 0; intentos < 3; intentos++) {

            do {
                System.out.println("INGRESE LAS ARISTAS");
                arista = lector.nextInt();
                if (arista == 12) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR LAS ARISTAS");
                }

            } while (true);

            // OPERACIONES
            area = (2 * Math.pow(arista, 2) * Math.sqrt(3));
            volumen = Math.sqrt(2) / 3 * Math.pow(arista, 3);

            break;
        }
         return areaLateral;
    }

    public static double solucionDodecaedro() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE LAS ARISTAS");
                arista = lector.nextInt();

                if (arista == 30) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR LAS ARISTAS");
                }

            } while (true);

            // OPERACIONES
            area = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 * Math.sqrt(5));
            volumen = 1 / 4 * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);

            break;
        }
         return areaLateral;
    }

    public static double solucionIcosaedro() {
        for (intentos = 0; intentos < 3; intentos++) {
            do {
                System.out.println("INGRESE LAS ARISTAS");
                arista = lector.nextInt();
                if (arista == 30) {
                    break;
                } else {
                    System.out.println("VALOR INGRESADO INCORRECTO");

                    System.out.println("VUELVA INGRESAR LAS ARISTAS");
                }

            } while (true);

            // OPERACIONES
            area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
            volumen = 5 / 12 * (3 + Math.sqrt(5)) * Math.pow(arista, 3);

            break;
        }
         return areaLateral;
    }

}
