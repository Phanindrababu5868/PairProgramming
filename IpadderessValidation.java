//Driver ruthuparn
//Navigator Phanindrababu

import java.util.Scanner;


/* Problem
Create a class with one method called ValidateIpv4Address.
The method takes a string and return true if it is valid
host assignable IP address and false if not.
IPv4 addresses are 32 bits long and grouped into 4 one byte blocks,
separated by dotted-decimal notation. E.g.
192.168.1.1.
Most IP addresses ending in 0 represent the entire network segment and cannot be used as ho
Most IP addresses ending in 255 represent a broadcast address and cannot be used as a host
There are exceptions, when using subnets, for the sake of this Kata any address
ending in 0 or 255 is not a valid host address.
DO NOT USE REGULAR EXPRESSIONS TO SOLVE THIS KATA.
Examples
IP Address Result
1.1.1.1 --> true
192.168.1.1 --> true
*/

class Ipaddressvalidation
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter Ip Address : ");
        String H = s.next() ;
        if(validation1(H) && validation2(H))
            System.out.println("\nIp Address is true");
        else
            System.out.println("\nIp Address is false");
    }
    public static boolean validation2(String H)
    {
        String h = "" ;
        for(int i = H.length()-1; i>=0; i--)
        {
            if(H.charAt(i) == '.')
                break ;
            else
                h = H.charAt(i)+h;
        }
        int i ;
        try
        {
            i = Integer.parseInt(h);
            if((i == 0 || i == 255)|| (i<0) || !(h.length()>0 && h.length()<=3))
                throw new Exception();
            return true;
        }
        catch(Exception e)
        {
            return false;    }
    }
    public static boolean validation1(String str)
    {
        String h  = "" ;
        boolean B1 = false ;
        int count = 0 ;
        try
        {
            for(int i = 0; i<str.length(); i++)
            {
                if(str.charAt(i) == '.')
                {
                    if(Integer.parseInt(h)>=0 && Integer.parseInt(h)<=999)
                    { B1 = true ; h = "" ; }
                    else
                        throw new Exception();
                    count++;
                }
                else
                    h+= str.charAt(i);
            }
        }
        catch(Exception e)
        {
            return false ;
        }
        if(B1 && count == 3)
            return B1 ;
        return !B1 ;
    }
}
