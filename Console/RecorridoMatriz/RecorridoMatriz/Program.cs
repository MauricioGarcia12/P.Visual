using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RecorridoMatriz
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] array = new int[4,4] { {1,3,5,7},
                                         {4,7,9,7},
                                         {2,6,5,2},
                                         {2,4,5,2}};
            int pos = 3;
            for(int y = 0; y <4; y++)
            {
                for (int x = 0; x < 4; x++)
                {
                    if (y % 2 == 0)
                    {
                       int num = array[x, y];
                        Console.Write(num +" ");
                    }
                    else 
                    {
                        int num = array[pos- x, y];
                        Console.Write(num+" ");
                    }
                }
            }

        }
    }
}
