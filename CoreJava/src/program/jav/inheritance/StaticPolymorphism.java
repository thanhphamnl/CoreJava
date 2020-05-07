package program.jav.inheritance;

class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    
    public void disp(char c, long num)  
    {
         System.out.println(c + " "+num);
    }
    
    public void disp(int c)
    {
       System.out.println(c);
    }
}


public class StaticPolymorphism
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10); //?
       obj.disp(5);
   }
}