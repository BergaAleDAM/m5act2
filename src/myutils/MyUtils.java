/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Lluis Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena String cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        
        if (!cadena.equals(resultat)) {
            
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat += cadena.charAt(i);
            }

        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        
        int anyo = Calendar.getInstance().get(Calendar.YEAR)-year;
        int mes = Calendar.getInstance().get(Calendar.MONTH)-month+1;
        int dias = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)-day;
        int resultat = 0;
        
        if(anyo>150 || (anyo>149 && mes < 1 && dias < 1 )){
            resultat = -1;
        }else if (anyo <0 ||(anyo == 0 && (dias == 0 && mes == 0))){
            resultat = -2;
        }else{
            if(mes <0 || (mes == 0 && dias <0 )){
                resultat = anyo-1;
            }else{
                resultat = anyo;
            }
        }
        
        System.out.println(resultat);
       
        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else if(numero <0){
            return -1;
        }else{
            return numero * factorial(numero - 1);
        }
    }
}
