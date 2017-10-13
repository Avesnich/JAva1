/*
 Задача состоит в следующем
Имеется программа с операторами System.out.print и логическими операторами 
в качестве аргумента. При выводе, оператор выводит TRUE или FALSE. Задача:
необходимо изменить программу так, чтобы вместо TRUE и FALSE программы выводила  1 или 0.
 */
package java1;

/**
 *
 * @author Алексей
 */
class Java1 {
 public static void main (String args[]){
  boolean p, q;
  boolean w, x, y, z; // Переменые для измененного участка кода
  byte a = 0, b = 0, c = 0, d = 0; // 
  
  ////////////////////////// Неизмененный участок кода из книги, где программа выводи TRUE и FALSE
  System.out.println ("P\tQ\tAND\tOR\tXOR\tNOT");
  
  p = true; q = true;
  System.out.print (p + "\t" + q + "\t");
  System.out.print ((p&q) + "\t" + (p|q) + "\t");
  System.out.println ((p^q) + "\t" + (!p));
  
  
  p = true; q= false;
  System.out.print (p + "\t" + q + "\t");
  System.out.print ((p&q) + "\t" + (p|q) + "\t");
  System.out.println ((p^q) + "\t" + (!p));
  
  p = false; q = true;
  System.out.print (p + "\t" + q + "\t");
  System.out.print ((p&q) + "\t" + (p|q) + "\t");
  System.out.println ((p^q) + "\t" + (!p));
 
  p = false; q = false;
  System.out.print (p + "\t" + q + "\t");
  System.out.print ((p&q) + "\t" + (p|q) + "\t");
  System.out.println ((p^q) + "\t" + (!p));
  System.out.println ();
  
  ///////////////////////// Измененный код в соответствии с заданием. где программа выводит 1 или 0
  p = true; q = true;
  
  // Значения выражений boolean присваиваются переменным boolean. (Сделано для удобства) 
  w = p&q; x = p|q; y = p^q; z = !p; 
  
  // На входе переменные byte, равные 0, меняются на 1 если булевы переменные истинны
  if (w) a = 1; if (x) b = 1; if (y) c = 1; if (z) d = 1; 
  
  System.out.print (p + "\t" + q + "\t");
  System.out.print (a + "\t" + b + "\t");
  System.out.println (c + "\t" + d);
  
  a = 0; b = 0; c = 0; d = 0; // Обнуление перменных byte для следующего цикла
 ///////////////////////////////////////////////////////////
  p = true; q= false;
  
  w = p&q; x = p|q; y = p^q; z = !p;
  
  if (w) a = 1; if (x) b = 1; if (y) c = 1; if (z) d = 1;
  
  System.out.print (p + "\t" + q + "\t");
  System.out.print (a + "\t" + b + "\t");
  System.out.println (c + "\t" + d);
 
  a = 0; b = 0; c = 0; d = 0;
  ///////////////////////////////////////////////////////////
  p = false; q = true;
  
  w = p&q; x = p|q; y = p^q; z = !p;
  
  if (w) a = 1; if (x) b = 1; if (y) c = 1; if (z) d = 1;
  
  System.out.print (p + "\t" + q + "\t");
  System.out.print (a + "\t" + b + "\t");
  System.out.println (c + "\t" + d);
  
  a = 0; b = 0; c = 0; d = 0;
 /////////////////////////////////////////////////////////////
  p = false; q = false;
  
  w = p&q; x = p|q; y = p^q; z = !p;
  
  if (w) a = 1; if (x) b = 1; if (y) c = 1; if (z) d = 1;
  
  System.out.print (p + "\t" + q + "\t");
  System.out.print (a + "\t" + b + "\t");
  System.out.println (c + "\t" + d);
  
             
        } // Метод main
   
   } //Класс Java1