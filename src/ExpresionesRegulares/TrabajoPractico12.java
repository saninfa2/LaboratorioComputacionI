package ExpresionesRegulares;
import java.lang.reflect.Parameter;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrabajoPractico12 {
    public static void main(String[] args) {
        //Abrimos scanner
        Scanner sc = new Scanner(System.in);

        //------------------------------------------------EJERCICIO 1-----------------------------------------------
        //Validación de Teléfono: Escribe un programa que solicite al usuario su número de teléfono. Utiliza
        //la validación de teléfono proporcionada para garantizar que el número tenga entre 7 y 10 dígitos.
        //Primero pedimos el telefono a validar
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese un número de telefono:");
        String tel = sc.next();

        //Después generamos el patrón, la expresión regular
        String patronTelefono = "[0-9]{7,10}";

        //Creamos un nuevo objeto Pattern para ingresar el patrón, luego otro objeto Matcher donde relacionamos el
        //patrón con la variable a validar
        Pattern patternTel = Pattern.compile(patronTelefono);
        Matcher matcherTel = patternTel.matcher(tel);

        //Por último un condicional para mostrar por pantalla el resultado
        if (matcherTel.matches()) {
            System.out.println("Número de telefono válido");
        } else {
            System.out.println("Número de telefono no válido");
        }

        //------------------------------------------------EJERCICIO 2-----------------------------------------------
        //Validación de CUIL: Crea un programa que pida al usuario su número de CUIL. Utiliza la validación de CUIL
        //proporcionada para verificar que el número tenga exactamente 11 dígitos.
        //Pedimos el cuil a evaluar
        System.out.println("Ejercicio 2");
        System.out.println("Ingrese un número de cuil:");
        String cuil = sc.next();

        //Inicializamos el patrón
        String patronCuil = "[0-9]{11}";

        //Generamos Pattern y Marcher
        Pattern patternCuil = Pattern.compile(patronCuil);
        Matcher matcherCuil = patternCuil.matcher(cuil);

        //Mostramos por pantalla
        if (matcherCuil.matches()) {
            System.out.println("Número de CUIL válido");
        } else {
            System.out.println("Número de CUIL no válido");
        }

        //------------------------------------------------EJERCICIO 3-----------------------------------------------
        //Validación de Correo Electrónico: Desarrolla un programa que solicite una dirección de correo electrónico.
        //Utiliza la validación de correo electrónico proporcionada para asegurarte de que la dirección cumple con un
        //formato de correo electrónico válido.
        System.out.println("Ejercicio 3");
        System.out.println("Ingrese su correo electronico: ");
        String mail = sc.next();

        String patronmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern patternMail = Pattern.compile(patronmail);
        Matcher matcherMail = patternMail.matcher(mail);

        //Mostramos por pantalla
        if (matcherMail.matches()) {
            System.out.println("Correo válido");
        } else {
            System.out.println("Correo no válido");
        }

        //-----------------------------------------EJERCICIO 4---------------------------------------
        //Validación de Nomenclatura: Escribe un programa que requiera al usuario ingresar una nomenclatura de 22 caracteres.
        //Usa la validación de nomenclatura para comprobar que la entrada tiene la longitud y el formato correctos.
        System.out.println("Ejercicio 4");
        System.out.println("Ingrese 22 caracteres se parados por un espacio: ");
        String muchosCaracteres = sc.next();

        String patronCaracteres = "([A-Za-z0-9]{22}+)* ";

        Pattern patternCaracteres = Pattern.compile(patronCaracteres);
        Matcher matcherCaracteres = patternCaracteres.matcher(muchosCaracteres);

        //Mostramos por pantalla
        if (matcherCaracteres.matches()) {
            System.out.println("Caracteres válidos");
        } else {
            System.out.println("Caracteres inválido");
        }


        //-----------------------------------------EJERCICIO 5---------------------------------------
        //Validación de Letras: Crea un programa que pida al usuario ingresar un nombre. Utiliza la validación de letras
        //para asegurarte de que solo contenga letras y tenga entre 7 y 10 caracteres.
        System.out.println("Ejercicio 5");
        System.out.println("Ingrese su nombre");
        String letras = sc.next();

        String patronLetras = "[A-Za-z]{7,10}";

        Pattern patternLetra = Pattern.compile(patronLetras);
        Matcher matcherLetra = patternLetra.matcher(letras);

        //Mostramos por pantalla
        if (matcherLetra.matches()) {
            System.out.println("Nombre válido");
        } else {
            System.out.println("Nombre no válido");
        }

        //-----------------------------------------EJERCICIO 6---------------------------------------
        //Combinación de Validaciones: Desarrolla un programa que solicite al usuario su número de teléfono,
        //CUIL y correo electrónico. Aplica las validaciones adecuadas a cada entrada.
        System.out.println("Ejercicio 6");
        //Validación de número de telefono
        System.out.println("Ingrese un número de telefono:");
        tel = sc.next();

        //Por último un condicional para mostrar por pantalla el resultado
        if (matcherTel.matches()) {
            System.out.println("Número de telefono válido");
        } else {
            System.out.println("Número de telefono no válido");
        }

        //Validación de CUIL
        System.out.println("Ingrese un número de cuil:");
        cuil = sc.next();

        //Mostramos por pantalla
        if (matcherCuil.matches()) {
            System.out.println("Número de CUIL válido");
        } else {
            System.out.println("Número de CUIL no válido");
        }


        //Validación de correo
        System.out.println("Ingrese su correo electronico: ");
        mail = sc.next();

        //Mostramos por pantalla
        if (matcherMail.matches()) {
            System.out.println("Correo válido");
        } else {
            System.out.println("Correo no válido");
        }


        //-----------------------------------------EJERCICIO 7---------------------------------------
        //Validación de Correo Electrónico Múltiple: Escribe un programa que permita al usuario ingresar una lista de
        //correos electrónicos separados por comas. Aplica la validación de correo electrónico a cada dirección y muestra
        //un mensaje de error si alguna de ellas es inválida.
        System.out.println("Ejercicio 7");
        System.out.println("Validación de una lista de correos electronicos");
        String[] listaCorreos= new String[5];
        String entrada = "p";
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un correo electronico: ");
            entrada = sc.nextLine();
            listaCorreos[i] = entrada;

        }

        for (String s: listaCorreos) {
            //Mostramos por pantalla
            if (matcherMail.matches()) {
                System.out.println("Correo válido");
            } else {
                System.out.println("Correo no válido");
            }
        }

        //-----------------------------------------EJERCICIO 8---------------------------------------
        //Validación de Teléfono Internacional: Crea un programa que solicite al usuario un número de teléfono internacional.
        //Utiliza una variante de la validación de teléfono para aceptar números que contengan el prefijo internacional.
        System.out.println("Ejercicio 8");
        //Validación de número de telefono
        System.out.println("Ingrese un número de telefono:");
        String telefono = sc.next();

        //Después generamos el patrón, la expresión regular
        String patronTelefonoInternacional = "^\\+(?:[0-9] ?){6,14}[0-9]$";

        //Creamos un nuevo objeto Pattern para ingresar el patrón, luego otro objeto Matcher donde relacionamos el
        //patrón con la variable a validar
        Pattern patternTelInter = Pattern.compile(patronTelefonoInternacional);
        Matcher matcherTelInter = patternTelInter.matcher(telefono);
        //Por último un condicional para mostrar por pantalla el resultado
        if (matcherTelInter.matches()) {
            System.out.println("Número de telefono internacional válido");
        } else {
            System.out.println("Número de telefono internacionl no válido");
        }

        //-----------------------------------------EJERCICIO 9---------------------------------------
        //Validación de Correo Electrónico Personalizado: Desarrolla un programa que requiera una dirección de correo
        //electrónico. Utiliza una versión personalizada de la validación de correo electrónico que acepte solo dominios
        //de correo electrónico específicos (por ejemplo, "miempresa.com").
        System.out.println("Ejercicio 9");
        System.out.println("Ingrese su correo electronico: ");
        String dominioPermitido = "miempresa.com";
        String mailDominioPersonalidad = sc.next();

        String patronmailPersonalizado = "^[A-Za-z0-9+_.-]+@" + Pattern.quote(dominioPermitido) + "$";

        Pattern patternMailPersonalizado = Pattern.compile(patronmailPersonalizado);
        Matcher matcherMailPersonalizado = patternMailPersonalizado.matcher(mailDominioPersonalidad);

        //Mostramos por pantalla
        if (matcherMailPersonalizado.matches()) {
            System.out.println("Correo con dominio personalizado válido");
        } else {
            System.out.println("Correo con dominio personalizado no válido");
        }

        //-----------------------------------------EJERCICIO 10---------------------------------------
        //Validación de Código Postal: Escribe un programa que pida al usuario su código postal. Utiliza una versión
        //modificada de la validación de letras que permita letras y números, pero asegúrate de que tenga el formato correcto.
        System.out.println("Ejericio 10");
        System.out.println("Ingrese su codigo postal:");
        String codigoPostal = sc.next();

        String patronCodigoPostal = "^[(A-Z){1}]+([0-9]{4})$";

        Pattern patternCodigoPostal = Pattern.compile(patronCodigoPostal);
        Matcher matcherCodigoPostal = patternCodigoPostal.matcher(codigoPostal);

        //Mostramos por pantalla
        if (matcherCodigoPostal.matches()) {
            System.out.println("Código postal válido");
        } else {
            System.out.println("Código postal inválido");
        }

        //-----------------------------------------EJERCICIO 11---------------------------------------
        //Validación de DNI: Crea un programa que solicite al usuario su número de Documento Nacional de Identidad (DNI).
        //Utiliza una versión adaptada de la validación de CUIL para asegurarte de que tenga exactamente 8 dígitos.
        System.out.println("Ejercicio 11");
        System.out.println("Ingrese un número de DNI:");
        String adn = sc.next();

        //Inicializamos el patrón
        String patronAdn = "[0-9]{8}";

        //Generamos Pattern y Marcher
        Pattern patternAdn = Pattern.compile(patronAdn);
        Matcher matcherAdn = patternAdn.matcher(adn);

        //Mostramos por pantalla
        if (matcherAdn.matches()) {
            System.out.println("DNI válido");
        } else {
            System.out.println("DNI inválido");
        }

        //-----------------------------------------EJERCICIO 12---------------------------------------
        //Validación de Usuario: Desarrolla un programa que requiera un nombre de usuario. Utiliza una variante de la
        //validación de letras que permita letras, números y guiones bajos, pero asegúrate de que cumpla con ciertas
        //restricciones de longitud.
        System.out.println("Ejercicio 12");
        System.out.println("Ingrese su usuario: ");
        String usuario = sc.next();

        String patronUsuario = "[A-Za-z0-9_]{7,10}";

        Pattern patternUsuario = Pattern.compile(patronUsuario);
        Matcher matcherUsuario = patternUsuario.matcher(usuario);

        //Mostramos por pantalla
        if (matcherUsuario.matches()) {
            System.out.println("Nombre de usuario válido");
        } else {
            System.out.println("Nombre de usuario no válido");
        }

        //-----------------------------------------EJERCICIO 13---------------------------------------
        //Validación de Fecha: Escribe un programa que solicite al usuario una fecha en formato "dd/mm/aaaa".
        //Utiliza una versión modificada de la validación de letras para comprobar que la entrada tenga el formato de fecha correcto.
        System.out.println("Ejericio 13");
        System.out.println("Ingrese una fecha: ");
        String fecha = sc.next();

        String fechaPatron = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        Pattern patternFecha = Pattern.compile(fechaPatron);
        Matcher matcherFecha = patternFecha.matcher(fecha);

        //Mostramos por pantalla
        if (matcherFecha.matches()) {
            System.out.println("Fecha válida");
        } else {
            System.out.println("Fecha inválida");
        }

        //-----------------------------------------EJERCICIO 14---------------------------------------
        //Validación de Dominio Web: Crea un programa que permita al usuario ingresar nombres de dominio web.
        //Aplica la validación de correo electrónico personalizada para garantizar que solo se acepten nombres de dominio válidos.
        System.out.println("Ejercicio 14");
        String[] listaDominios= new String[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un dominio web: ");
            listaDominios[i] = sc.nextLine();
        }

        for( int j = 0; j < 5; j++){
            String patronListaDominios = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*." + listaDominios[j] + "$";
            String dominioAProbar = sc.nextLine();
            Pattern patternListaDominios = Pattern.compile(patronListaDominios);
            Matcher matcherListaDominios = patternListaDominios.matcher(dominioAProbar);
            if(matcherListaDominios.matches()){
                System.out.println("Dominio valido");
            } else {
                System.out.println("Dominio inválido");
            }
        }

        //-----------------------------------------EJERCICIO 15---------------------------------------
        //Validación de Nombres de Producto: Desarrolla un programa que requiera el nombre de un producto.
        //Utiliza la validación de letras para asegurarte de que solo contenga letras y tenga una longitud mínima de 5 caracteres.
        System.out.println("Ejercicio 15");
        System.out.println("Ingrese el nombre del producto");
        String producto = sc.next();

        String patronProducto = "[A-Za-z]{5,20}";

        Pattern patternProducto = Pattern.compile(patronProducto);
        Matcher matcherProducto = patternProducto.matcher(producto);

        //Mostramos por pantalla
        if (matcherProducto.matches()) {
            System.out.println("Nombre de producto válido");
        } else {
            System.out.println("Nombre de producto no válido");
        }


        //-----------------------------------------EJERCICIO 16---------------------------------------
        //Validación de Contraseña: Crea un programa que requiera una contraseña. Utiliza una versión personalizada de la
        //validación de letras y números que aplique restricciones de longitud y complejidad.
        System.out.println("Ejercicio 16");
        System.out.println("Ingrese su contraseña: ");
        String contasenia = sc.next();

        int longitudMinima = 8;
        String patronContrasenia = "^(?=.*[0-9].*)[a-zA-Z0-9]{8,}$";

        Pattern patternContrasenia = Pattern.compile(patronContrasenia);
        Matcher matcherContrasenia = patternContrasenia.matcher(contasenia);

        //Mostramos por pantalla
        if (matcherContrasenia.matches()) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválido");
        }

    }

}
