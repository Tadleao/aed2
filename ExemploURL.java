import java.io.*;
import java.net.*;
import java.util.*;

class ExemploURL {
   public static String getHtml(String endereco){
      URL url;
      InputStream is = null;
      BufferedReader br;
      String resp = "", line;

      try {
         url = new URL(endereco);
         is = url.openStream();  // throws an IOException
         br = new BufferedReader(new InputStreamReader(is));

         while ((line = br.readLine()) != null) {
            resp += line + "\n";
         }
      } catch (MalformedURLException mue) {
         mue.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } 

      try {
         is.close();
      } catch (IOException ioe) {
         // nothing to see here

      }

      return resp;
   }
   public static void main(String[] args) {
      String endereco, html, np;
	  Scanner sc = new Scanner(System.in);
	  np = sc.nextLine();
      endereco = sc.nextLine();
      html = getHtml(endereco);
	  while(!(np.length() == 3 && np.charAt(0)== 'F' && np.charAt(1)=='I' && np.charAt(2)=='M'))
	  {
	  int[] x = new int[25];
	  for(int i = 0; i<html.length();i++)
	  {
		if(html.charAt(i) == 'a')
		{x[0]++;}
		else if(html.charAt(i) == 'e')
		{x[1]++;}
		else if(html.charAt(i) == 'i')
		{x[2]++;}
		else if(html.charAt(i) == 'o')
		{x[3]++;}
		else if(html.charAt(i) == 'u')
		{x[4]++;}
		else if(html.charAt(i) == 'á')
		{x[5]++;}	
		else if(html.charAt(i) == 'é')
		{x[6]++;}	
		else if(html.charAt(i) == 'í')
		{x[7]++;}
		else if(html.charAt(i) == 'ó')
		{x[8]++;}	
		else if(html.charAt(i) == 'ú')
		{x[9]++;}
		else if(html.charAt(i) == 'à')
		{x[10]++;}
		else if(html.charAt(i) == 'è')
		{x[11]++;}
		else if(html.charAt(i) == 'ì')
		{x[12]++;}
		else if(html.charAt(i) == 'ò')
		{x[13]++;}
		else if(html.charAt(i) == 'ù')
		{x[14]++;}
		else if(html.charAt(i) == 'ã')
		{x[15]++;}
		else if(html.charAt(i) == 'õ')
		{x[16]++;}
		else if(html.charAt(i) == 'â')
		{x[17]++;}
		else if(html.charAt(i) == 'ê')
		{x[18]++;}
		else if(html.charAt(i) == 'î')
		{x[19]++;}
		else if(html.charAt(i) == 'ô')
		{x[20]++;}
		else if(html.charAt(i) == 'û')
		{x[21]++;}
		else if((html.charAt(i) != 'a' &&  html.charAt(i) != 'e' &&  html.charAt(i) != 'i' &&  html.charAt(i) != 'o' &&  html.charAt(i) != 'u' && html.charAt(i) != 'A' &&  html.charAt(i) != 'E' &&  html.charAt(i) != 'I' &&  html.charAt(i) != 'O' &&  html.charAt(i) != 'U') && (html.charAt(i) >= 'a' &&  html.charAt(i) <= 'z'))
		{x[22]++;}
		else if(html.charAt(i) == '<' && html.charAt(i+1) == 'b' && html.charAt(i+2) == 'r' && html.charAt(i+3) == '>')
		{x[23]++;}
		else if(html.charAt(i) == '<' && html.charAt(i+1) == 't' && html.charAt(i+2) == 'a' && html.charAt(i+3) == 'b' && html.charAt(i+4) == 'l' && html.charAt(i+5) == 'e' && html.charAt(i+6) == '>')
		{x[24]++;}	
}
System.out.println("a(" + x[0] +") e(" + x[1] + ") i(" + x[2] + ") o(" + x[3] +") u(" + x[4] + ") á(" + x[5] +") é(" + x[6]+") í(" + x[7]+") ó(" + x[8]+") ú(" + x[9]+") à(" + x[10]+") è("+ + x[11]+") ì(" + x[12]+") ò(" + x[13]+") ù(" + x[14]+") ã(" + x[15]+") õ(" + x[16]+")  â(" + x[17]+") ê(" + x[18]+") î(" + x[19]+") ô(" + x[20]+") û(" + x[21]+") consoante(" + x[22]+") <br>(" + x[23]+") <table>(" + x[24] + ") " + np);
np = sc.nextLine();
if(!(np.length() == 3 && np.charAt(0)== 'F' && np.charAt(1)=='I' && np.charAt(2)=='M'))
{
      endereco = sc.nextLine();
      html = getHtml(endereco);
}
   }
   }
}
