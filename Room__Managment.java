    import java.io.*;
    
    public class Room__Managment extends paitent {
        static String b[]={"█","█","░","░","░","░","░","░","░","░","░","░","░","░","░","░","█","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░","░"};
        static String room_na[];
        static int no[]={101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125
            ,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150
            ,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175
            ,176,177,178,179,180//genral
    
            ,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225
            ,226,227,228,229,230//semi
    
            ,301,302,303,304,305,306,307,308,309,310//special
    
            ,401,402,403,404,405};
    
        static String name[]={"Tejas","Jagdish","","","","","","","","","","","","","","","HI","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
        static int fc[]={0,25,55,75,85};
        static int fcbt[]={0,20,40,60,70,80,82,84,86,88,90,92,94,96,98,100,102,104,106,108,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126};
        static int fcb[]= {0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};    
        static String floor[]={"First Floor","Second Floor","Third Floor","Fourth Floor"};
        static int mr=0;
        static String room[]={"Genral Ward 1","Genral Ward 2","Genral Ward 3","ICU 1","ICU 2"
            ,"Semi-Special Room 1","Semi-Special Room 2","Semi-Special Room 3","Semi-Special Room 4","Semi-Special Room 5"
            ,"Semi-Special Room 6","Semi-Special Room 7","Semi-Special Room 8","Semi-Special Room 9","Semi-Special Room 10"
            ,"Semi-Special Room 11","Semi-Special Room 12","Semi-Special Room 13","Semi-Special Room 14","Semi-Special Room 15"
            ,"Special Room 1","Special Room 2","Special Room 3","Special Room 4","Special Room 5"
            ,"Special Room 6","Special Room 7","Special Room 8","Special Room 9","Special Room 10"
            ,"Delux Room 1","Delux Room 2","Delux Room 3","Delux Room 4","Delux Room 5"
            };
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader sc=new BufferedReader(r);
    
        public int room_main()throws IOException{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader sc=new BufferedReader(r);
            Room__Managment ob=new Room__Managment();
            int truee=1;
            while(truee==1){
                ob.print("",0);
                ob.bed();
                
                ob.refresher();
                ob.println("What would you like to do?");
                ob.println("1. Display All Data");
                ob.println("2. List All Booked Beds");
                ob.println("3. List Vacant Bed");
                ob.println("4. Book Bed");
                ob.println("5. Enter Q to return to Home Screen");
    
                String c=sc.readLine();
                if(c.equalsIgnoreCase("Q"))
                    return 1;
                int ch= Integer.valueOf(c);
                ob.print("",0);
                if(ch==1)
                    ob.display();
                else if(ch==2)
                    ob.displayb();
                else if(ch==3)
                    ob.displayl();
                else if(ch==4)
                    ob.book();
                
            }
            return 1;
            
        }
        void refresher(){
               
               String t[]={"General Ward 1","General Ward 2","General Ward 3","ICU 1","ICU 2"
            ,b[0]+" "+b[1]+" "+b[2]+" "+b[3]+" "+b[4]+" "    ,b[5]+" "+b[6]+" "+b[7]+" "+b[8]+" "+b[9]+" "    ,b[10]+" "+b[11]+" "+b[12]+" "+b[13]+" "+b[14]+" "    ,b[15]+" "+b[16]+" "+b[17]+" "+b[18]+" "+b[19]+" "    ,b[20]+" "+b[21]+" "+b[22]+" "+b[23]+" "+b[24]
            ,b[25]+" "+b[26]+" "+b[27]+" "+b[28]+" "+b[29]+" ",b[30]+" "+b[31]+" "+b[32]+" "+b[33]+" "+b[34]+" ",b[35]+" "+b[36]+" "+b[37]+" "+b[38]+" "+b[39]+" "," "," "
            ,b[39]+" "+b[40]+" "+b[41]+" "+b[42]+" "+b[43]+" ",b[44]+" "+b[45]+" "+b[46]+" "+b[47]+" "+b[48]+" ",b[49]+" "+b[50]+" "+b[51]+" "+b[52]+" "+b[53]+" "," "," "
            ,b[54]+" "+b[55]+" "+b[56]+" "+b[57]+" "+b[58]+" ",b[59]+" "+b[60]+" "+b[61]+" "+b[62]+" "+b[63]+" ",b[64]+" "+b[65]+" "+b[66]+" "+b[67]+" "+b[68]+" "," "," "
    
            ,"Semi-Special Room 1","Semi-Special Room 2","Semi-Special Room 3","Semi-Special Room 4","Semi-Special Room 5"
            ,b[69]+" "+b[70]+" ",b[71]+" "+b[72]+" ",b[73]+" "+b[74]+" ",b[75]+" "+b[76]+" ",b[77]+" "+b[78]
            ,"Semi-Special Room 6","Semi-Special Room 7","Semi-Special Room 8","Semi-Special Room 9","Semi-Special Room 10"
            ,b[79]+" "+b[80]+" ",b[81]+" "+b[82]+" ",b[83]+" "+b[84]+" ",b[85]+" "+b[86]+" ",b[87]+" "+b[88]
            ,"Semi-Special Room 11","Semi-Special Room 12","Semi-Special Room 13","Semi-Special Room 14","Semi-Special Room 15"
            ,b[89]+" "+b[90]+" ",b[91]+" "+b[92]+" ",b[93]+" "+b[94]+" ",b[95]+" "+b[96]+" ",b[97]+" "+b[98]
    
            ,"Special Room 1","Special Room 2","Special Room 3","Special Room 4","Special Room 5"
            ,b[99],b[100],b[101],b[102],b[103]
            ,"Special Room 6","Special Room 7","Special Room 8","Special Room 9","Special Room 10"
            ,b[104],b[105],b[106],b[107],b[108]
            ,"Delux Room 1","Delux Room 2","Delux Room 3","Delux Room 4","Delux Room 5"
            ,b[109],b[110],b[111],b[112],b[113]};
            room_na=new String[85];
            for(int i=0;i<85;i++)
                room_na[i]=t[i];
        }
    
        public void display()throws IOException{//to display
    
            max();
            for (int i=0;i<floor.length;i++){
    
                line();
                print("\n|");
                if(floor[i].length()%2!=0)
                    floor[i]+=" ";
    
                for (int j = 0; j < (((6*mr)-6) - floor[i].length())/2; j++)
                    print(" ");
                print(floor[i]);
                for (int j = 0; j < (((6*mr)-6) - floor[i].length())/2; j++)
                    print(" ");
                print("|");
                line();
                print("\n|");
                int k=0;
                for (int j=fc[i];j<room_na.length&&j<fc[i+1];j++){
    
                    if(check(j)){
                        print(printt(room_na[j]));
                    }
                    else{
                        print("\n|"+printt(room_na[j]));
    
                    }
                }
                line();
                print("\n\n\n");
            }
            sc.readLine();
        }
    
        public void line() {
            print("\n+");
    
            for (int i = 0; i < (mr) + 2; i++)
                print("-");
            print("+");
            for (int i = 0; i < floor.length; i++) {
    
                for (int j = 0; j < (mr) + 2; j++)
                    print("-");
                print("+");
            }
        }
    
        public void line(int m,int n) {
            print("\n+");
    
            for (int i = 0; i < (m) + 2; i++)
                print("-");
            print("+");
            for (int i = 0; i < n; i++) {
    
                for (int j = 0; j < (m) + 2; j++)
                    print("-");
                print("+");
            }
        }
    
        public void max(){
            for (int i = 0; i < room_na.length; i++)// columbes max
                if (room_na[i].length() > mr)
                    mr = room_na[i].length();
            for (int i = 0; i < floor.length; i++)// columbes max
                if (floor[i].length() > mr)
                    mr = floor[i].length();
        }
    
        public String printt(String s) {
            max();
            String t="";
            if(s.length()==10)
                t=s + " ";
            else if(s.length()==3)
                t=s;
            else
                t=" "+s+" ";
            for (int i = 0; i < mr - s.length(); i++)
                t += " ";
    
            t += "|";
            return t;
        }
    
        public String printt(String s,int m) {
    
            String t="";
    
            t=" "+s+" ";
            for (int i = 0; i < m - s.length(); i++)
                t += " ";
    
            t += "|";
            return t;
        }
    
        boolean check(int j){
    
            if(j==0 || j%5!=0)
                return true;
            for (int i=0;i<fc.length;i++)
                if(fc[i]==j)
                    return true;
            return false;
        }
    
        boolean check(int j ,int c){
    
            if(j==0 || j%5!=0)
                return true;
            for (int i=0;i<fcbt.length;i++)
                if(fcbt[i]==j)
                    return true;
            return false;
        }
    
        void book()throws IOException{
            println("Enter Bed No.",0);
            int i=Integer.parseInt(sc.readLine ());
            if(bedno(i)==-1)
                println ("Unable to book bed no."+bedno(i),0);
            else
                i=bedno(i);
            println("Enter Name of Patient");
            String name=sc.readLine();/******************************************************************
    
             **/
            if(b[i].equals("░")){
                this.b[i]="█";
                this.name[i]=(name);
                println ("Bed no."+no[i]+" booked for "+this.name[i],0);  
            }
            else{
                println ("bed no."+no[i]+" is already booked",0);
    
            }
            sc.readLine();
        }
    
        int bedno(int number) {
            int first = 0;
            int last = no.length - 1;
            int middle = (first + last) / 2;
    
            while (first <= last) {
                if (no[middle] < number) {
                    first = middle + 1;
                } else if (no[middle] == number) {
                    return middle;
                } else {
                    last = middle - 1;
                }
                middle = (first + last) / 2;
            }
            return -1;
        }
    
        void displayb()throws IOException{
            int m=0;
            for (int i = 0; i < name.length; i++)
                if (name[i].length() > m)
                    m = name[i].length();
            if("Bed no.".length()>m)
                m="Bed no.".length();
            if("Name".length()>m)
                m="Name".length();
            line(m,1);
            print("\n|" + printt("Bed no.",m) + printt("Name",m));
            line(m,1);
            for (int i=0;i<114;i++){
                if(!name[i].equals(""))
                    print("\n|"+printt(""+no[i],m)+printt(name[i],m));
            }
            line(m,1);
            sc.readLine();
        }
    
        void displayl()throws IOException{
    
            max();
            for (int i=0;i<room.length;i++){
    
                line();
                print("\n|");
                if(room[i].length()%2!=0)
                    room[i]+=" ";
    
                for (int j = 0; j < (((6*mr)-6) - room[i].length())/2; j++)
                    print(" ");
                print(room[i]);
                for (int j = 0; j < (((6*mr)-6) - room[i].length())/2; j++)
                    print(" ");
                print("|");
                line();
                print("\n|");
                int k=0;
    
                for (int j=fcbt[i];j<no.length&&j<fcbt[i+1];j++){
                    if(j<77){
                        if(check(j,1)){
                            if(b[j]!="█")
                                print(printt((no[j]+""),this.mr));
                            else
                                print(printt("NA",this.mr));
                        }
                        else{
                            if(b[j]!="█")
                                print("\n|"+printt((no[j]+""),this.mr));
                            else
    
                                print("\n|"+printt("NA",this.mr));
                        }
                    }
                    else{
                        if(b[j]!="█")
                            print(printt(no[j]+"",this.mr));
                        else
                            print(printt("NA",this.mr));
    
                    }
    
                }
                for(int s=0;s<(fcb[i]);s++)  
    
                    print(printt("",this.mr));
                line();
                print("\n\n\n");
            }
            sc.readLine();
        }
    }
