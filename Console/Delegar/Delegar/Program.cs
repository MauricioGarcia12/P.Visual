using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegar
{
    public delegate void delegado(String cadena);
    class Program
    {
        
        static void Main(string[] args)
        {
            delegado d1 = new delegado(MessageOne.message1);

            d1("Este es el mensaje 1");

            d1 = new delegado(MessageTwo.message2);
            d1("Este es el mensaje 2");

        }
    }

    class MessageOne
    {
        public static void message1(String mensaje)
        {
            Console.ForegroundColor = ConsoleColor.Cyan;
            Console.WriteLine( mensaje);
        }
    }

    class MessageTwo
    {
        public static void message2(String mensaje)
        {
            Console.ForegroundColor = ConsoleColor.DarkGreen;
            Console.WriteLine( mensaje);
        }
    }
}
