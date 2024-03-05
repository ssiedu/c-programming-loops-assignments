
public class PrimeTestcaseCheck {
    public static void main(String[] args) {
        primenumberprogarm ob1= new primenumberprogarm();
        int count=0,totalpass;
        if(ob1.prime(0)==0)
        {
            count++;
        }
         if(ob1.prime(17)==1)
        {
             count++;
        }
          if(ob1.prime(16)==0)
        {
             count++;
        }
           if(ob1.prime(37)==1)
        {
             count++;
        }
            if(ob1.prime(66)==0)
        {
             count++;
        }
         System.out.println("total case = 5");  
         System.out.println("pass case ="+count); 
    }
    
}
