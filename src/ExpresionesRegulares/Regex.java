package ExpresionesRegulares;
import java.util.regex.*;


public class Regex {
    public static void main(String[] args) {
        //Strings de ejemplo
        String text1 = "oscuro";
        String text2 = "obscuro";
        String text3 = "claro";

        //ALTERNACION:  unaCosa | laOtra
        System.out.println("Ejemplo alternación 1: " + text1.matches("obscuro|oscuro"));
        System.out.println("Ejemplo alternación 2: " + text2.matches("obscuro|oscuro"));
        System.out.println("Ejemplo alternación 3: " + text3.matches("obscuro|oscuro"));

        //CUANTIFICACIÓN: ?, + o *
        // ? => opcional (el caracter antecesor puede o no estar)
        System.out.println("Ejemplo cuantificador opcional 1: " + text1.matches("ob?scuro"));
        System.out.println("Ejemplo cuantificador opcional 2: " + text2.matches("ob?scuro"));
        System.out.println("Ejemplo cuantificador opcional 3: " + text3.matches("ob?scuro"));

        //+ => 1 o + caracteres antecesores
        String p = "hola";
        String p1 = "hoooola";
        String p2 = "hoooooooooooooooooooooooooooooola";
        String p3 = "hla";
        System.out.println("Ejemplo cuantificador 1 o más 1: " + p.matches("ho+la"));
        System.out.println("Ejemplo cuantificador 1 o más 2: " + p1.matches("ho+la"));
        System.out.println("Ejemplo cuantificador 1 o más 3: " + p2.matches("ho+la"));
        System.out.println("Ejemplo cuantificador 1 o más 4: " + p3.matches("ho+la"));

        //* => 0 o + caracteres antecesores
        System.out.println("Ejemplo cuantificador 0 o más 4: " + p3.matches("ho*la"));


        //AGRUPACIÓN: al igual que en cualquier otra formula, con los () podes agrupar términos

        //Comprobar si el String cadena no acaba con un dígito.
        String tecto = "noterminacondigito";
        String tecto2 = "4stasi0005";
        System.out.println("Prueba sin digito: " + tecto.matches("\\d$"));
        System.out.println("Prueba con digito: " + tecto2.matches("\\d$"));

        //Comprobar si el String cadena no empieza por un dígito.
        System.out.println("Prueba comienza sin digito: " + tecto.matches("^\\d"));
        System.out.println("Prueba comienza con digito 2: " + tecto2.matches("^\\d"));

        String regex = "^(A-Za-z0-9)";
        //Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
        System.out.println("Prueba cadena con 5 a 10 letras mayus o minus1: " + "holaQueTal333".matches(regex));
        System.out.println("Prueba cadena con 5 a 10 letras mayus o minus2: " + "helloooooooo".matches(regex));
        System.out.println("Prueba cadena con 5 a 10 letras mayus o minus3: " + "holaquetal".matches(regex));
        System.out.println("Prueba cadena con 5 a 10 letras mayus o minus4: " + "hola".matches(regex));

        //Validar el ingreso de un DNI (xx-xxx-xxx). 44 746 656
        String validacionDNI = "^(\\d[2])+[(\\d[3])+]$";
        System.out.println("Prueba validación dni 1: " + "44746656".matches(regex));
        System.out.println("Prueba validación dni 2: " + "447656".matches(regex));
        System.out.println("Prueba validación dni 3: " + "44746656666".matches(regex));
        //Guardar en un arraylist una serie de mails, pero antes de ser guardados deben cumplir con las condiciones de las expresiones regulares.
        String validacionGmail = "^([a-zA-Z][4-20])";

        //Comprobar si el String cadena contiene “abc”.
        String validarCadena = "[abc]";
        System.out.println("Prueba validación abc 1: " + "abcsefghijk".matches(regex));
        System.out.println("Prueba validación abc 1: " + "acbsed".matches(regex));
        System.out.println("Prueba validación abc 1: " + "1233232".matches(regex));
    }
}
