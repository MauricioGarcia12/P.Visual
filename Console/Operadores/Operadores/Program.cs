using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Operadores
{
    class Program
    {
        static void Main(string[] args)
        {
            int a=1, b=0, c=1, d=0;
            for (int i = 0; i < 10; i++)
            {

                if (a > b || c == d)
                {
                    a++;
                    c += a;
                    Console.WriteLine("Valores");
                    Console.WriteLine("a:"+a);
                    Console.WriteLine("b: "+b);
                    Console.WriteLine("c: "+c);
                    Console.WriteLine("d: "+d);

                }
                
                d += 2;
                if (c % 2 == 0)
                {
                    d += 5;
                }
                
                if(c%3==0 && d % 3 == 0)
                {
                    Console.WriteLine("C y D son multiplos de Tres en a="+a);
                }
            }



        }
    }
}
