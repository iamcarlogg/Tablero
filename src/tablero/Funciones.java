/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.util.Random;

/**
 *
 * @author carlo
 */
public class Funciones {
    public static int getRandomNumber(int min, int max) 
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
