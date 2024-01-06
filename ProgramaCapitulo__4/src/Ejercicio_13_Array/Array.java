package Ejercicio_13_Array;

// Cuál es el resultado de la ejecución del siguiente programa:

public class Array {
public static void main(String[] args) {
int[] arrayInt = new int[5];
float[] arrayFloat = new float[5];
Integer[] arrayObjetosInt = new Integer[5];
System.out.println(arrayInt instanceof Object);
System.out.println(arrayInt instanceof int[]);
System.out.println(arrayFloat instanceof Object);
System.out.println(arrayFloat instanceof float[]);
System.out.println(arrayObjetosInt instanceof Object);
System.out.println(arrayObjetosInt instanceof Object[]);
System.out.println(arrayObjetosInt instanceof Integer[]);
}
}

/*
 * 
El resultado es true en las líneas que involucran el operador 
instanceof porque los arrays en Java son considerados objetos y, 
por lo tanto, son instancias de la clase base Object.
 */
