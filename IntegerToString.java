//Driver Phanindrababu
//Navigator Ruthupan

import java.util.Scanner;

public class IntegerToString{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        String str = sc.next();
        int num = 0;
            String s = "";
            boolean bool=true;
            while (num < str.length()) {
                try {
                    s += Integer.parseInt(str.charAt(num++) + "");
                    bool = false;
                } catch (Exception e) {
                    if (!bool)
                        break;
                }
            }
             num = 0 ;
            String s1="";
            if(s.length() == 3)
            {
                s1 = arr1[Integer.parseInt(""+s.charAt(num++))-1];
                s1+= " Hundred ";
            }

            if(s.length() == 4)
            {
                s1 = arr1[Integer.parseInt(""+s.charAt(num++))-1];
                s1+= " Thousand ";
                if(s.charAt(num)!='0')
                {
                    s1+= arr1[Integer.parseInt(""+s.charAt(num++))-1];
                    s1+= " Hundred ";
                }
                else
                    num++;
            }
            String s2 = "" ;
            while(num<s.length())
                s2+=s.charAt(num++);
            if(!(digit2(s2).equals("Zero")))
                s1+= digit2(s2);

            System.out.println(s1);


    }
    static String arr1[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static String digit2(String H)
    {
        if(H.length()==1)
        {
            if(H.charAt(0)=='0')
                return "Zero";
            return arr1[Integer.parseInt(""+H.charAt(0))-1];
        }

        String arr2[] = {"Twent","Thirt","Fourt","Fift","Sixt","Sevent","Eight","Ninet"};
        int num = 0 ;
        String s1 = "" ;
        if(H.charAt(num++)=='1')
        {
            if(H.charAt(num)=='0')
                return "Ten";

            if(H.charAt(num)=='1')
                return "Eleven";

            else if(H.charAt(num)=='2')
                return "Twelve";

            else
                return arr2[Integer.parseInt(""+H.charAt(num--))-2]+"een";
        }
        else
        {
            if(H.charAt(num-1)!='0')
            {
                s1+= arr2[Integer.parseInt(""+H.charAt(num-1))-2]+"y";
                if(H.charAt(num)=='0')
                    return s1;
                s1+= " ";
                return s1+= arr1[Integer.parseInt(""+H.charAt(num))-1];
            }
            else
            {
                if(H.charAt(num)=='0')
                    return "Zero";
                return arr1[Integer.parseInt(""+H.charAt(num))-1];
            }
        }

    }




}
