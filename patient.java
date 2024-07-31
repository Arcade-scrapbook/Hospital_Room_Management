import java.io.*;
public class paitent extends util {
    static String nameb = "";
    static String docb = "";
    static String issueb = "";
    static String amtb = "";
    static String name[];
    static String doc[];
    static String issue[];
    static double amt[];

    static int mp = 0;
    static String col[] = { "Name", "Doctor", "Ammount", "Issue" };

    InputStreamReader r=new InputStreamReader(System.in);  
    BufferedReader sc=new BufferedReader(r);
    String docname[] = { "Dr. Jagdish Patil", "Dr. Surbhi Anand", "Dr. Sanjay Sachdeva" };

    int main_paitent() throws IOException{

        try {
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader sc=new BufferedReader(r);
            paitent ob = new paitent();

            ob.print("", 0);
            ob.rec();
            System.out.println();
            System.out.println(
                "1. Enter Data\n2. Patient List\n3. Patient list based on doctor\n4. Patient based on ammount\n5. Enter Q to return to Home Screen");
            String in = sc.readLine();
            if (in.equalsIgnoreCase("Q")){
                println("", 0);
                return 1;
            }

            int t = Integer.parseInt(in);
            if (t == 1)
                ob.input();
            else if (t == 2)
                ob.display();
            else if (t == 3) {
                ob.println(
                    "Please choose doctors name:\n1. Dr. Jagdish Patil\n2. Dr. Surbhi Anand\n3. Dr. Sanjay Sachdeva",
                    0);
                ob.display(ob.docname[Integer.parseInt(sc.readLine()) - 1]);
            } else if (t == 4) {
                System.out.println("Please ammont to be filtered");
                ob.display(Integer.parseInt(sc.readLine()));
            } else
                main_paitent();

        } catch (Exception e) {
            paitent ob = new paitent();
            ob.err();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {

            }
            try {
                ob.re(100);
            } catch (InterruptedException ie) {
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {

            }
            System.out.println("\f");
            main_paitent();
        }
        return 1;
    }

    public void input()throws IOException {
        println("Enter Name of Paitent", 0);
        String n = sc.readLine();
        println("Please choose doctors name:\n1. Dr. Jagdish Patil\n2. Dr. Surbhi Anand\n3. Dr. Sanjay Sachdeva");
        String dn = docname[Integer.parseInt(sc.readLine()) - 1];
        println("Enter Issue of The Patient");
        String i = sc.readLine();
        println("Enter Fee charged");
        String a = sc.readLine();
        boolean check = false;
        println("Are you sure abbout the data enter\n1. Yes\n2. No", 0);
        println(n + "\t\t" + dn + "\t\t" + i + "\t\t" + a);
        if (Integer.parseInt(sc.readLine()) == 2)
            input();
        else {

            nameb += n + ":";
            docb += dn + ":";
            issueb += i + ":";
            amtb += a + ":";
            refresh();
            println("Data Entered Successfully", 0);
            println("Press Enter to continue.... \nEnter q to quit");
        }
        if (sc.readLine().equalsIgnoreCase("Q"))
            main_paitent();
        else
            input();
    }
    
    public void display()throws IOException {
        int c = 0;
        print("", 0);

        for (int i = 0; i < nameb.length(); i++) {
            if (nameb.charAt(i) == ':')
                c++;
        }
        if (c == 0)
            println("No Data Found", 0);
        else {
            max();
            top();
            for (int i = 0; i < c; i++) {
                System.out
                .print("\n|" + printt(name[i]) + printt(doc[i]) + printt("" + amt[i] + "") + printt(issue[i]));
            }
            line();
        }
        sc.readLine();
        main_paitent();
    }

    public void display(String d) throws IOException{
        print("", 0);
        int c = 0;
        for (int i = 0; i < nameb.length(); i++) {

            if (nameb.charAt(i) == ':')
                c++;
        }
        int t = 0;
        for (int i = 0; i < c; i++)

            if (doc[i].equalsIgnoreCase(d))
                t++;

        if (t == 0)
            println("No Data Found", 0);
        else {
            max();
            top();
            for (int i = 0; i < c; i++)

                if (doc[i].equalsIgnoreCase(d)) {
                    System.out.print("\n|" + printt(name[i]) + printt(doc[i]) + printt("" + amt[i]) + printt(issue[i]));
                }
            line();
        }
        sc.readLine();
        main_paitent();
    }

    public void display(int a)throws IOException {
        print("", 0);
        int c = 0;
        int t = 0;

        for (int i = 0; i < nameb.length(); i++)
            if (nameb.charAt(i) == ':')
                c++;

        for (int i = 0; i < c; i++)
            if (amt[i] == a)
                t++;

        if (t == 0)
            println("No Data Found", 0);
        else {
            max();
            top();
            for (int i = 0; i < c; i++)
                if (amt[i] == a) {
                    System.out.print("\n|" + printt(name[i]) + printt(doc[i]) + printt("" + amt[i]) + printt(issue[i]));
                }
            line();
        }
        sc.readLine();
        main_paitent();
    }

    public void refresh() {
        int c = 0;

        for (int i = 0; i < nameb.length(); i++) {
            if (nameb.charAt(i) == ':')
                c++;
        }
        name = new String[c];
        doc = new String[c];
        issue = new String[c];
        amt = new double[c];
        String wd = "";
        for (int i = 0, w = 0; i < nameb.length(); i++) {
            if (nameb.charAt(i) != ':')
                wd += nameb.charAt(i);
            else {
                name[w] = wd;
                wd = "";
                w++;
            }
        }
}
