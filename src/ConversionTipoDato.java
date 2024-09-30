public class ConversionTipoDato {

    public static void main (String [] args){

        String cadena = "40";
        int numeroCadena = Integer.parseInt(cadena);//convertir un dato de texto a entero
        System.out.println("numeroCadena = " + numeroCadena);

        String numeroDoble ="46.32";
        double numero = Double.parseDouble(numeroDoble);
        System.out.println("numeroDoble = " + numero);

        int numeroDos = 30;
        String cadenaNumero = Integer.toString(numeroDos);//con el toString paso a tipo de dato texto
        System.out.println("cadenaNumero = " + cadenaNumero);
        
        cadenaNumero = String.valueOf(numeroDos);//convierte el int a tipo texto
        System.out.println("cadenaNumero = " + cadenaNumero);
        
        float valorFloat = 3.4f;
        String cadenaFloat = Float.toString(valorFloat);
        System.out.println("cadenaFloat = " + cadenaFloat);

        cadenaFloat = String.valueOf(valorFloat);
        System.out.println("cadenaFloat = " + cadenaFloat);

        int numeroInt = 55;
        float numeroFloat = 55.5f;
        double numeroDouble = 33.4e5;

        String primerPunto = Integer.toString(numeroInt);
        String segundoPunto = Float.toString(numeroFloat);
        String tercerPunto = Double.toString(numeroDouble);

        System.out.println("Los String Son: \n" + primerPunto + "\n" + segundoPunto + "\n" + tercerPunto);

        //Casting en tipo de dato
        int uno = 3332;
        short dos = (short)uno; //se cambia un int a short
        System.out.println("dos = " + dos);
        
        float tres = (float)uno; //se cambia el tipo de dato
        System.out.println("tres = " + tres);
        
    }
}
