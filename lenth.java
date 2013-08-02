package getlenth;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lenth 
{
    static int count = 0;
    static float mile  = 0;
    static float yard  = 0;
    static float inch  =0;
    static float foot = 0;
    static float fath = 0;
    static float furlong = 0;
	public static void main(String[] args)
	{
		 //System.out.println(System.getProperty("user.dir")+"/src/input.txt");
		 String inputpath = System.getProperty("user.dir")+"/src/input.txt";
		 String outputpath = System.getProperty("user.dir")+"/src/output.txt";
		 try {
	            // read file content from file

	           // StringBuffer sb= new StringBuffer("");
	            
	            FileReader reader = new FileReader(inputpath);
	            BufferedReader br = new BufferedReader(reader);
	            // write string to file
	            FileWriter writer = new FileWriter(outputpath);
	            BufferedWriter bw = new BufferedWriter(writer);
	            
	           
	            String str = null;
	            while((str = br.readLine()) != null) 
	            {
	            	count++;
	                 switch(count)
	                 {
	                 case 1:
	                	 String[] milestr = str.split("=");
	                	 String[] milestr1 = milestr[1].split(" ");
	                	 mile = Float.valueOf(milestr1[1]);
	                	// System.out.println(mile);
	                	 break;
	                 case 2:
	                	 String[] yardstr = str.split("=");
	                	 String[] yardstr1 = yardstr[1].split(" ");
	                	 yard = Float.valueOf(yardstr1[1]);
	                	// System.out.println(yard);
	                	 break;
	                 case 3:
	                	 String[] inchstr = str.split("=");
	                	 String[] inchstr1 = inchstr[1].split(" ");
	                	 inch = Float.valueOf(inchstr1[1]);
	                	// System.out.println(inch);
	                	 break;
	                 case 4:
	                	 String[] footstr = str.split("=");
	                	 String[] footstr1 = footstr[1].split(" ");
	                	 foot = Float.valueOf(footstr1[1]);
	                	// System.out.println(foot);
	                	 break;
	                 case 5:
	                	 String[] fathstr = str.split("=");
	                	 String[] fathstr1 = fathstr[1].split(" ");
	                	 fath = Float.valueOf(fathstr1[1]);
	                	// System.out.println(fath);
	                	 break;
	                 case 6:
	                	 String[] furlongstr = str.split("=");
	                	 String[] furlongstr1 = furlongstr[1].split(" ");
	                	 furlong = Float.valueOf(furlongstr1[1]);
	                	// System.out.println(furlong);
	                	 break;
	                 case 7:
	                	 StringBuffer sb= new StringBuffer("");
	                	 sb.append("455164259@qq.com");
	                	 //bw.write(sb.toString());
	                	 bw.append(sb.toString());
	                	 bw.append("\r\n");
	                	
	                	 break;
	                 default:
	                	 if((str.indexOf(String.valueOf('-')) != -1) || (str.indexOf(String.valueOf('+')) != -1) )
	                	 {
	                		String[] sliped = str.split(" ");
	                		int strsize = sliped.length;
	                		 switch(strsize)
	                		 {
	                		 case 5:
                				 float  first = Float.valueOf(sliped[0]);
                				 float  second = Float.valueOf(sliped[3]);
                				 float danwei1 = 0;
                				 float danwei2 = 0;
	                			 if(sliped[2].equals("+"))
	                			 {
	                				 danwei1 = Tochange(sliped[1]);
	                				 danwei2 = Tochange(sliped[4]);
	                				 float sum = first * danwei1 + second * danwei2;
	                				 System.out.println(sum);
	                				 float b = (float)(Math.round(sum*100))/100; 
	                				 //String sumstr = String.valueOf(b);
	                				 String sumstr = String.format("%.2f", b);
	                				 StringBuffer sb1= new StringBuffer("");
	                				 sb1.append(sumstr +" m");
	                				 bw.append("\r\n");
	                				 bw.append(sb1.toString());
	                				 
	                			 }
	                			 else if(sliped[2].equals("-"))
	                			 {
	                				 danwei1 = Tochange(sliped[1]);
	                				 danwei2 = Tochange(sliped[4]);
	                				 float sum = first * danwei1 - second * danwei2;
	                				 System.out.println(sum);
	                				 float b = (float)(Math.round(sum*100))/100; 
	                				 //String sumstr = String.valueOf(b);
	                				 String sumstr = String.format("%.2f", b);
	                				 StringBuffer sb2= new StringBuffer("");
	                				 sb2.append(sumstr +" m");
	                				 bw.append("\r\n");
	                				 bw.append(sb2.toString());
	                				 
	                				 
	                			 }
	                			 
	                			 
	                			 break;
	                		 case 8:
                				 float  mfirst = Float.valueOf(sliped[0]);
                				 float  msecond = Float.valueOf(sliped[3]);
                				 float  mthread = Float.valueOf(sliped[6]);
                				 float mdanwei1 = Tochange(sliped[1]);
                				 float mdanwei2 = Tochange(sliped[4]);
                				 float mdanwei3 = Tochange(sliped[7]);
                				 float sum = 0;
                				 if(sliped[2].equals("+") && sliped[5].equals("+"))
                				 {
                					  sum = mfirst * mdanwei1 + msecond * mdanwei2 + mthread*mdanwei3;
                				 }
                				 else if(sliped[2].equals("-") && sliped[5].equals("-"))
                				 {
                					  sum = mfirst * mdanwei1 - msecond * mdanwei2 + mthread*mdanwei3;
                				 }
                				 else if(sliped[2].equals("+") && sliped[5].equals("-"))
                				 {
                					  sum = mfirst * mdanwei1 + msecond * mdanwei2 - mthread*mdanwei3;
                				 }
                				 else if(sliped[2].equals("-") && sliped[5].equals("+"))
                				 {
                					  sum = mfirst * mdanwei1 - msecond * mdanwei2 + mthread*mdanwei3;
                				 }
                				 
                				 float b = (float)(Math.round(sum*100))/100; 
                				// String sumstr = String.valueOf(b);
                				 String sumstr = String.format("%.2f", b);
                				 StringBuffer sb3= new StringBuffer("");
                				 sb3.append(sumstr +" m");
                				 bw.append("\r\n");
                				 bw.append(sb3.toString());
                				 
	                			 break;
	                		 }
	                		
	                	 }
	                	 else if(str.length() > 4)
	                	 {
	                		 String[] sliped1 = str.split(" ");
	                		 float  first = Float.valueOf(sliped1[0]);
	                		 float danwei1 = 0;
	                		 danwei1 = Tochange(sliped1[1]);
            				 float sum = first * danwei1;
            				 System.out.println(sum);
            				 float b = (float)(Math.round(sum*100))/100;
            				 String result = String.format("%.2f", b);
            				// String sumstr = String.valueOf(b);
            				 StringBuffer sb1= new StringBuffer("");
            				 sb1.append(result +" m");
            				 bw.append("\r\n");
            				 bw.append(sb1.toString());
            				
	                	 }
	                	 break;

	                	 
	                 }
                	 

	            }
	           
	            br.close();
	            reader.close();
	           

	            bw.close();
	            writer.close();
	      }
	      catch(FileNotFoundException e)
	      {
	                  e.printStackTrace();
	            
	      }
	       catch(IOException e)
	       {
	             e.printStackTrace();
	      }
	}
	public static float Tochange(String danwei)
	{
		float danwei1 =0 ;
		 if(danwei.indexOf("mile") != -1)
		 {
			 danwei1 = mile;
		 }
		 else if(danwei.indexOf("yard") != -1)
		 {
			 danwei1 = yard;
		 }
		 else if(danwei.indexOf("inch") != -1)
		 {
			 danwei1 = inch;
		 }
		 else if((danwei.indexOf("foot") != -1) || (danwei.indexOf("feet") != -1))
		 {
			 danwei1 = foot;
		 }
		 else if(danwei.indexOf("fath") != -1)
		 {
			 danwei1 = fath;
		 }
		 else if(danwei.indexOf("furlong") != -1)
		 {
			 danwei1 = furlong;
		 }
		 return danwei1;
		
	}
	 
}
