package easy;
public class palindrome {

    public static void main(String[] arg){
        int x=121;
        int rev=0;
        int orgX=x;

        if(x<0)
        {
            System.out.println("Negative Number"); 

        }
        else if(x<10)
        {
            System.out.println("it is a single digit so it is always a palindrome");

        }
        else 
        {
            while(x!=0)
            {
                int lstNum=x%10;
                x=x/10;
                rev=rev*10+lstNum;
            }
            if(rev==orgX)
            {
                System.out.println("It is palindrome");

            }
            else {
                System.out.println("it is not a palindrome");
            }

        }

        

    }

}
