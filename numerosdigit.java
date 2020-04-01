import javax.swing.*;
   public class Numerosdigit
   {
      public static void main(String[]Args)
      {
      
      String sTxt =Entre com numeros positivos:";String sTitulo=" Entrada";
      int n1=1;int cont=0;
      while(n1!=0)
      {
      n1=intereger.parseInt(jOptionPane.showInputDialog(null,sTxt,sTitulo,jOptionPane.QUESTION_MESSAGE));
      if((n1>=100)&&(n1<=200))
      {
         cont++;
         }
         
         }
         sTitulo = "Saída";sTxt="A quantidade de numeros digitados,entre 100 e 200 foram ";
         jOptionPane.showMessageDialog(null,sTxt+cont".",sTitulo,jOptionPane.PLAIN_MESSAGE);
     
      
     System.exit(0); 
      
      
      
      }
   }
   
   