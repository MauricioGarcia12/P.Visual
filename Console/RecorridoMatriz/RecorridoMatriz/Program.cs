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
            int num=3;

            for(int y = 0; y <array.Length; y++)
            {
                for(int x = 0; x <array.Length; x++)
                {
                    if (y % 2 == 0)
                    {
                        num = array[x, y];
                        Console.WriteLine(num);
                    }
                    else
                    {
                        num = array[num- x, y];
                        Console.WriteLine(num);
                    }
                }
            }

        }
    }
}
