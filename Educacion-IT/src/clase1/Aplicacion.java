package clase1;

public class Aplicacion {


    public static void main(String[] args) {
        short s;
        int i = 10;

        float f = 3.4f;

        boolean b = true;

        char c = 'r';

        char[] cadenaArray = new char[5];
        cadenaArray[0]='U';

        String cadena = "Una cadena";

        boolean resultado;

        resultado = true;


        if (i > 4) {
            System.out.println("La variable i es mayor a 4");
        } else {
            System.out.println("La variable i es menor o igual a 4");
        }


        int d = 2;
        switch (d) {
            case 1:
                System.out.println("La variable i es igual a 1");
                break;
            case 2:
                System.out.println("La variable i es igual a 2");
                break;
            case 3:
                System.out.println("La variable i es igual a 3");
            default:
                System.out.println("No es ninguna");

        }




        int j = 5;
        System.out.println("j: "+j);
        int x = j++;
        System.out.println("x: "+x);
        System.out.println("j: "+j);
        int z = ++j;
        System.out.println("j: "+j);
        System.out.println("z: "+z);

        int suma = j + x + z;
        System.out.println("suma:" + suma);
        System.out.println("suma:" + (j + x + z));



        int[] vector = new int[] {1,3,4,565,6,5,5,4,3,3};

        for (int y = 0; y < vector.length ; ++y) {
            System.out.println("posicion:"+ y + " valor:" + vector[y]);
        }

        int y = 0;
        while ( y < vector.length) {
            System.out.println("posicion:"+ y + " valor:" + vector[y]);
            y++;
        }



    }


}
