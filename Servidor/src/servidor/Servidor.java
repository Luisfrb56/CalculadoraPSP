package servidor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {
        try {
            /*
            Creamos el socket y el bind por el que nos conectaremos al host, aceptando las conexiones.
            */
            System.out.println("Creando socket servidor");

            ServerSocket serverSocket = new ServerSocket();

            System.out.println("Realizando el bind");

            InetSocketAddress addr = new InetSocketAddress("localhost", 6666);
            serverSocket.bind(addr);

            System.out.println("Aceptando conexiones");

            Socket newSocket = serverSocket.accept();

            System.out.println("Conexion recibida");
            /*
            Tras recibir la conexion y crear los parametros de Input y Output stream
            creo dos parametros uno que sea el resultado de la operación y otro el mensaje que mandaremos 
            además guardaremos cada dato del array en un mensaje de tipo byte para tratarlos de uno en uno
            los leemos con is.read y los guardamos en una variable, los datos numericos de la operacion en
            tipo float porque la división o la raiz puede dar decimales y el operador en un tipo int.
            */
            String resultado=null;
            String mensajeIda=null;
            InputStream is = newSocket.getInputStream();
            OutputStream os = newSocket.getOutputStream();
            byte[] mensaje=new byte[1];
            byte[] mensaje2 = new byte[1];
            byte[] mensaje3=new byte[1];
            is.read(mensaje);
            Double a=Double.valueOf(mensaje[0]);
            is.read(mensaje2);
            
            Integer b=Integer.valueOf(mensaje2[0]);
            System.out.println(b);
            is.read(mensaje3);
            Double c=Double.valueOf(mensaje3[0]);
            
            
            /*
            ahora tratamos los operadores, cada operacion tiene un codigo con la que si el mensaje recibido es igual a uno
            de estos codigos hara una u otra y mandara el resultado. 101=suma, 102=resta, 103=multiplicación, 104=división, 105=raiz.
            Con os.write mandaremos el resultado directamente o si queremos un mensaje mas largo podemos enviar el mensajeIda pero como
            esto vamos a mostrarlo por interfaz, el resultado solo nos llega.
            */
            System.out.println("Enviando Resultado");   
            if(b==101){
               resultado=String.valueOf(a+c);
               mensajeIda=("El resultado de la suma es: "+resultado);
                
               os.write(resultado.getBytes());
            }else if(b==102){
                resultado=String.valueOf(a-c);
                mensajeIda=("El resultado de la resta es: "+resultado);
                os.write(resultado.getBytes());
            }else if(b==103){
                resultado=String.valueOf(a*c);
                mensajeIda=("El resultado de la multiplicación es: "+resultado);
                os.write(resultado.getBytes());
            }else if(b==104){
                resultado=String.valueOf(a/c);
                mensajeIda=("El resultado de la división es: "+resultado);
                os.write(resultado.getBytes());
            }else if(b==105){
               resultado=String.valueOf(Math.sqrt(a));
               mensajeIda=("El resultado de la Raiz es: "+resultado);
               os.write(resultado.getBytes());
            }
            /*
            Ahora cerramos el socket y el servidor para terminar la conexion cliente-servidor.
            */
            System.out.println("Cerrando el nuevo socket");

            newSocket.close();

            System.out.println("Cerrando el socket servidor");

            serverSocket.close();

            System.out.println("Terminado");

        } catch (IOException e) {

        }
    }
    
}
