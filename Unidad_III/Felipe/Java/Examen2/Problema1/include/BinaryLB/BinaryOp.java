package BinaryLB;
import java.util.*;
    public class BinaryOp 
    {
        
        static public void ConvertirBinario(int a)
        {
            ArrayList<Integer> binarios = new ArrayList<Integer>();
            double  binario = 0 ;
            int exp=0, digito=0;
            int numero = a;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);  
                binarios.add(0,digito); 
                exp++;
                numero = numero/2;
        }
        System.out.println("El entero es:"+a);
        System.out.println(binarios);

    
        }

        public int bw_and(int a, int b)
        {
            ConvertirBinario (a);
            ConvertirBinario (b);
            int r = 0;
            r= a&b;
            return r;
        }
        public int bw_or(int a, int b)
        {
            ConvertirBinario (a);
            ConvertirBinario (b);
            int r = 0;
            r= a|b;
            return r;
        }
        public int bw_xor(int a, int b)
        {
            ConvertirBinario (a);
            ConvertirBinario (b);
            int r = 0;
            r= a^b;
            return r;
        }
        public int bw_lshift(int a, int b)
        {
            ConvertirBinario (a);
            ConvertirBinario (b);
            int r = 0;
            r= a<<b;
            return r;
        }
        public int bw_rshift(int a, int b)
        {
            ConvertirBinario (a);
            ConvertirBinario (b);
            int r = 0;
            r= a>>b;
            return r;
        }
    }