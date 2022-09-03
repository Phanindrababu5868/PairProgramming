//Driver Phanindrababu
//Navigator Ruthuparn
//parenthese([]) validation


import java.util.Scanner;

public class ParentheseValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int num=0;
        int count=0;
        while(num<s.length()){
            if(s.charAt(num)=='[')
                count++;
            if(s.charAt(num)==']')
                count--;
            num++;
        }
        num=0;
        boolean B1 = false, B2 = B1 ;
        while(num<s.length())
        {
            if(s.charAt(num)=='[')
            {  B1 = true ;
                break;
            }

            if(s.charAt(num)==']')
            {  B2 = true ;
                break;
            }
            num ++;
        }
        num = 0;
        if(count==0 && B1){
            while(num<s.length()){
                if(s.charAt(num++)=='['){
                    while(num<s.length() && s.charAt(num)!=']'){
                        if (s.charAt(num)=='[' )
                            count++;
                        if (s.charAt(num)==']' )
                            count--;
                        num++;
                    }
                    if(count<0){

                        System.out.println("Brackets not are Equal");
                        break;
                    }
                    count=0;
                }
            }
        }
        else{
            System.out.println("Brackets not are Equal");}
        if(num==s.length())
            System.out.println("Brackets are equal");


    }
}
