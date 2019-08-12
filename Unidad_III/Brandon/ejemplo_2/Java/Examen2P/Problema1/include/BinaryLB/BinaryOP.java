package BinaryLB;

import java.*;
import java.util.*;

public class BinaryOP
{
    public BinaryOP()
    {

    }

    public static ArrayList<String> numero2bin(int x)
    {
        ArrayList<String> valor = new ArrayList<String>();
        int pos;

        if (x > 0) {
            while (x > 0)
            {
                if (x % 2 == 0)
                {
                    valor.add(0, "0");
                }
                else
                {
                    valor.add(0, "1");
                }
                x = (int) x / 2;
            }
        }
        else if(x == 0)
        {
            valor.add("0");
        }

        return valor;
    }

    public int bw_and(int a,int b)
    {
        int c = a & b;

        System.out.println("A: [" + numero2bin(a) + "],[" + a + "]");
        System.out.println("B: [" + numero2bin(b) + "],[" + b + "]");
        System.out.println("A&B: [" + numero2bin(c) + "],[" + c + "]");

        return c;

    }

    public int bw_or(int a, int b) {
        int c = a | b;

        System.out.println("A: [" + numero2bin(a) + "],[" + a + "]");
        System.out.println("B: [" + numero2bin(b) + "],[" + b + "]");
        System.out.println("A|B: [" + numero2bin(c) + "],[" + c + "]");
        return c;

    }

    public int bw_xor(int a, int b) {
        int c = a ^ b;

        System.out.println("A: [" + numero2bin(a) + "],[" + a + "]");
        System.out.println("B: [" + numero2bin(b) + "],[" + b + "]");
        System.out.println("A^B: [" + numero2bin(c) + "],[" + c + "]");

        return c;

    }

    public int bw_lshift(int a, int b) {
        int c = a << b;

        System.out.println("A: [" + numero2bin(a) + "],[" + a + "]");
        System.out.println("B: [" + numero2bin(b) + "],[" + b + "]");
        System.out.println("A<<B: [" + numero2bin(c) + "],[" + c + "]");
        return c;

    }

    public int bw_rshift(int a, int b) {
        int c = a >> b;

        System.out.println("A: [" + numero2bin(a) + "],[" + a + "]");
        System.out.println("B: [" + numero2bin(b) + "],[" + b + "]");
        System.out.println("A>>B: [" + numero2bin(c) + "],[" + c + "]");

        return c;

    }

}