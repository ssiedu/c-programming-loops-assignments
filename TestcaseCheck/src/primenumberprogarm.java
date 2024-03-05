
/*
1. write a program to check number is prime or not.
Test case 1
input :- 0
output :- notprime
Test case 2
input :- 17
output :- prime
Test case 3
input :- 16
output :- notprime
Test case 4
input :- 37
output :- prime
Test case 5
input :- 66
output :- notprime

*/
public class primenumberprogarm {
    int prime(int num)
    {
        // return 0 for "not prime" or 1 for "prime"
            for(int i=2;i<=(num/2);i++)
            {
                if(num%i==0)
                {
                    return 0;
                }
            }
            return 1;
        
        
    }
}
