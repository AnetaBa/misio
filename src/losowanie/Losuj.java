//Zapis i odczyt do pliku

package losowanie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Losuj
{

	public static void main(String[] args) 
	throws IOException
	{
		String misio, misiaczek;
		char wybor=0;
		int a;
		{	
		
			BufferedReader br = new BufferedReader (new
					InputStreamReader(System.in));
			
		
			System.out.println("Podaj 1 lub 2 "); 
			try{
				a = Integer.parseInt(br.readLine());
			}
			catch(Exception ex)
			{
				System.out.println("nie rozumiem, zakladam 1");
				a = 1;
			}
			
			if (a!=1 && a!=2)
			{
				System.out.println("Z³y wybor");
			}
			
			else
			{
				if (a==1) wybor=0;
				if (a==2) wybor=1;
				switch (wybor)
				{
				case 0: 
					System.out.println("Napisz coœ misiowi ");
					FileWriter fw = new FileWriter("mis.txt", true);
					BufferedReader bw = new BufferedReader (new
							InputStreamReader(System.in));	
					misio = (bw.readLine());
					fw.write(misio+"\r\n");
					fw.close();
				break;
				
				case 1:
					System.out.println("Misia mówi: ");
					System.out.println();
					FileReader fr = new FileReader("misio.txt");
					BufferedReader b = new BufferedReader (fr);
					while ((misiaczek = b.readLine()) != null)
					{
						System.out.println(misiaczek);
					}
					fr.close();				
				break;
				}
			}
		}
	}
}