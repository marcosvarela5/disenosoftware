package datatime;

public class YearUtilities {

    // Método para comprobar si un año es bisiesto (divisible entre 4) o no con las siguientes excepciones
    // Un año NO es bisiesto si es divisible por 100
    // Si el año es divisible entre 400, será bisiesto

    public static boolean isleap(int year){

        if(year == 0)
            throw new IllegalArgumentException(); // Consideramos que en nuestro sistema no existe el año cero
                                                 // para lanzar una excepción

        if(year % 4 == 0)
            if(year % 100 == 0)
                if(year % 400 == 0)
                return true;
               else return false;
            else return true;
        else return false;
    }
}

