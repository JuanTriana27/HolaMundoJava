/*
* Juan Esteban Triana
* Curso de Java
* Primer Programa
* */
public class Main {

    //Declaracon de variables
    int numeroUno = 3;

    String cadenaUno = "Cadena 1";

    boolean flagVerdadero = true;

    boolean flagFalse = false;

    double numeroDecimal = 3.1416;

    //Primer Programa
    public static void main (String [] args) {
        // Imprimir "Hola Mundo"
        System.out.println("Hola Mundo");

        // Tipo de dato boolean
        boolean flag = true;
        if (flag) {
            System.out.println("Verdadero");
        }

        // Tipo de dato char
        char caracterUno = 'a';
        System.out.println("Valor: " + caracterUno);

        char porcentaje = '\u0025';
        System.out.println("Valor: " + porcentaje);

        char numeroPorcentaje = 37;
        System.out.println("Valor: " + numeroPorcentaje);

        char porcentajeSimple = '%';
        System.out.println("Valor: " + porcentajeSimple);

        char var1 = 'a' + 4;
        System.out.println("Valor: " + var1);

        // Tipo de dato byte
        byte miByte = 127;
        System.out.println("Valor: " + miByte);

        // Tipo de dato short
        short byteMasGrande = 32767;
        System.out.println("byteMasGrande: " + byteMasGrande);

        // Tipo de dato int
        int entero = 1909999999;
        System.out.println("entero: " + entero);

        // Usando la clase Integer
        int var = Integer.MAX_VALUE;
        int var2 = Integer.MIN_VALUE;
        System.out.println("Valor Máximo: " + var + "\nValor Mínimo: " + var2);

        // Tipo de dato long
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong: " + numeroLong);
        System.out.println("Valor Máximo: " + Long.MAX_VALUE + "\nValor Mínimo: " + Long.MIN_VALUE);

        // Tipo de dato float
        float numeroFlotante = 4.0F;
        float numeroFloat2 = 3560F; // 3.56e3f es el mismo número
        System.out.println("numeroFlotante: " + numeroFloat2);
        System.out.println("Valor Máximo: " + Float.MAX_VALUE + "\nValor Mínimo: " + Float.MIN_VALUE);

        //tipo de dato double
        double numDouble = 3.4028235E38;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor Máximo: " + Double.MAX_VALUE + "\nValor Mínimo: " + Double.MIN_VALUE);

        //Decimal a Binario
        int num = 32;
        String binario = Integer.toBinaryString(num);
        System.out.println("El Numero " + num + " en binario es: " + binario);

        //Binario a Decimal
        String binario2 = "100000";
        int decimal = 0b100000;
        System.out.println("El numero decimal de " + binario2 + " es: " + decimal);

        //Variable que soporte cualquier tipo de dato
        var variable = 3.50e3f;
        System.out.println("variable = " + variable);


    }
}

