 /*
Wafula Felix Sichangi

manual version where the user inputs the hours 
*/ 

package billing.program;

import javax.swing.*;
import java.awt.*;
class BillingProgram{
    public static void main(String [] args){
        double grandtotal;
         JOptionPane.showMessageDialog(null,"The following are the billing rates for our phone company\ncalls made 6.00am-6.00pm is charged at ksh 4.00 per minute\ncalls made 6.00pm-6.00am is charged at ksh 3.00 per minute\ncalls made to other networks charged at 5.00 irrespective of the time\nAn additional 16% vat for calls longer than 2 minutes\n");
         String number=JOptionPane.showInputDialog("Please enter the number of calls made between 6.00am-6.00pm");
          int n=Integer.parseInt(number);
          double total,sum3,totall = 0,sum1=0,sum2=0;
          for(int i=1;i<=n;i++)
          {
             String duration=JOptionPane.showInputDialog("Enter the duration of call  "+i+" in minutes");
             double d1=Double.parseDouble(duration);
             if(d1<=2)
             {
                 total=d1*4;
                 sum1+=total;
             }
             else
             {
                 total=d1*4;
                 totall=total+(0.16*total);
             }
             sum2+=totall;
          }
          sum3=sum1+sum2;
          /*JOptionPane.showMessageDialog(null,"the total bill is "+sum3);*/
          String number1=JOptionPane.showInputDialog("Please enter the number of calls made between 6.00pm-6.00am");
          int n1=Integer.parseInt(number1);
          double totala,sum6,totalb = 0,sum4=0,sum5=0;
          for(int i=1;i<=n1;i++)
          {
             String duration=JOptionPane.showInputDialog("Enter the duration of call  "+i+" in minutes");
             double d1=Double.parseDouble(duration);
             if(d1<=2)
             {
                 totala=d1*3;
                 sum4+=totala;
             }
             else
             {
                 totala=d1*3;
                 totalb=totala+(0.16*totala);
             }
             sum5+=totalb;
          }
          sum6=sum4+sum5;
          /*JOptionPane.showMessageDialog(null,"the total bill is "+sum6);*/
          String number2=JOptionPane.showInputDialog("Please enter the number of calls made to other networks");
          int n2=Integer.parseInt(number2);
          double totalc,totald=0,sum7=0 ,sum8=0,sum9;
          for(int i=1;i<=n2;i++)
          {
            String duration=JOptionPane.showInputDialog("Enter the duration of call  "+i+" in minutes");
            double d1=Double.parseDouble(duration);
             if(d1<=2)
             {
                 totalc=d1*5;
                 sum7+=totalc;
             }
             else
             {
                 totalc=d1*5;
                 totald=totalc+(0.16*totalc);
             }
             sum8+=totald;
          }
          sum9=sum7+sum8;
      /*JOptionPane.showMessageDialog(null,"the total bill is "+sum7);*/
      grandtotal=sum3+sum6+sum9;
      JOptionPane.showMessageDialog(null,"the Grandtotal bill is "+grandtotal);
      
      
    }
}