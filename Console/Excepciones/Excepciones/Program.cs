using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Excepciones
{
    class Program :System.Exception
    {
        public static List<String> miLista;
        static void Main(string[] args)
        {
            
               //miLista = new List<string>();
           

            try
            {
                miLista.Add("Objeto");
                metodoExcepcion();
            }
            catch (Exception ex)
            {
                Console.WriteLine("No se creo el objeto");
            }
            Console.ReadLine();

        }
        private static void metodoExcepcion()
        {
            throw new Exception("Algo salío mal");
        }
    }
}
