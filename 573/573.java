import java.util.Scanner;

class Main{
	Scanner scn = new Scanner(System.in);
	  float H=0.0f,U=0.0f,D=0.0f,F=0.0f,fatique=0.0f,disClimed=0.0f;
	  int day =0;
	
	void input()throws Exception 
	{
		H = Integer.parseInt(scn.next());
		U = Integer.parseInt(scn.next());
		D = Integer.parseInt(scn.next());
		F = Integer.parseInt(scn.next());

	}
     
     void operation()throws Exception 
     {
        boolean loop = true;
       fatique = U * (F*0.01f);
       while(loop)
       {  day++;
       	  //System.out.println("initial height: "+disClimed);
          moveUp();
          
          if(disClimed>H)
          {
          	System.out.println("success on day "+day);
          	//System.exit(1);
          }
          moveDwn();
          if(disClimed<0.0f)
          {
          	System.out.println("failure on day "+day);
          	//System.exit(1);
          }
       }
     }

     void moveUp()
     { 
     	disClimed = disClimed + U ;
     	U= (U - fatique);
     	if(U<0.0f)
     		U=0.0f;
     	//System.out.print("U= "+U);
       
       //System.out.println("after U :"+disClimed);

       
     }

     void moveDwn()
     {
     	disClimed = disClimed - D;
     	//System.out.println("After moving down: "+disClimed);
     }

	public static void main (String...args)throws Exception 
	{
      
       boolean loop = true;

       while(loop)
       { 
          Main obj = new Main();
       	 obj.input();
       	// System.out.println(obj.H+" "+obj.U+" "+obj.D+" "+obj.F+" ");

       	 if(obj.H==0.0f)
       	 	break;
       	 else
       	 {
       	 	obj.operation();
       	 }

       }
      

       
	}

}