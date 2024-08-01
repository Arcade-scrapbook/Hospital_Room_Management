import java.io.*;
public class main extends Room__Managment
{
    public static void main()throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader sc=new BufferedReader(r);
        main ob=new main();
        while(true){
            ob.print("",0);
            ob.admin();
            ob.println("\n\n\n");

            ob.println("Select Department");
            ob.println("1. Reception Console");
            ob.println("2. Bed Concole");
            ob.println("3. Enter Q to return to Exit");
            String c=sc.readLine();
            if(c.equalsIgnoreCase("Q"))
                ob.exit();
            int ch= Integer.valueOf(c);
            ob.print("",0);
            if(ch==1)
                ob.main_paitent();
            else if(ch==2)
                ob.room_main();

        }
    }

    void exit() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader sc=new BufferedReader(r);
        println("Are you sure you want to Exit\nYour progress may no be saved\n\nEnter\n1. To Exit\n2. Cancel",0);
        if(Integer.valueOf(sc.readLine())==1)
        {
            ex();
            System.exit(0);
        }
    }
}
