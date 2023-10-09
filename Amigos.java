import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalTime;
import java.util.Date;   // amigos - 1713
class in
{
	static void clear()
	{
		System.out.print("\033[H\033[2J");
       		System.out.flush();
	}
	static void loading()
	{
		String load= ". . . . . . . . . ";
		for(int i=0;i<load.length();i++)
		{
			System.out.print(load.charAt(i));
			sleep(150);
		}
	}
	static void sleep(int n)
	{
		try{
		Thread.sleep(n);
			}
		catch(InterruptedException e)
			{}
	}
	static  Scanner sc = new Scanner(System.in);

	// colors
	static final String red = "\u001B[31m";
	static final String green  = "\u001B[32m";
	static final String  magent = "\u001B[95m";
	static final String blue = "\u001B[34m";
	static final String purple = "\u001B[35m";
	static final String cyan = "\u001B[36m";
	static final String black = "\u001B[30m";
	static final String yellow = "\u001B[93m";
    static final String white = "\033[0;37m";

	//color reset
	static final String reset = "\u001B[0m";
	

    //bright colors
    static final String redbr = "\033[0;91m";  
    static final String greenbr = "\033[0;92m"; 
    static final String whitebr = "\033[0;97m";

    //bright high intensity
    static final String redbri = "\033[1;91m";   // RED
    static final String greenbri = "\033[1;92m";
	static final String bluebri = "\033[0;94m"; 

	//Background colors
	static final String bwhite = "\u001B[107m";
	static String bgreen="\u001B[42m";
	static String byellow="\u001B[43m";
	static String bblue="\u001B[44m";
	static String bpurple="\u001B[45m";
	static String bcyan="\u001B[46m";
	static String change="\u001B[7m";
	static String thick="\u001B[1m";


	//background color reset
	static String breset = "\u001B[49m";

	//underline
	static final String ul = "\u001B[4m";

	//underline reset
	static final String rstul = "\u001B[24m";

	//blinking 
	static final String blink="\u001B[5m";

	//reset blinking
	static final String rstblink = "\u001B[0m";

	//italic
	static final String ital = "\u001B[3m";

	static int  otp(String use)
    {
        int otp=1000+(int)(Math.random()*8999);
        System.out.println(in.whitebr+"\n\t\tAMG - "+otp+" Your "+use+"\n\t\tNote - Please DO NOT share this anyone.\n\n");
        return otp;
    }


}


class user_details
{
    private String username="bestfriend";
    private String password="Amigos@123";
    private String phno="1234567890";
    user_details(String username , String password)
    {
        this.username=username;
        this.password=password;
    }
    user_details (String username,String password,String phno)
    {
        this.username=username;
        this.password=password;
        this.phno=phno;
    }
    void setName(String username)
    {
        this.username=username;
    }
    void setPass(String password)
    {
        this.password=password;
    }
    void setnum(String phno)
    {
        this.phno=phno;
    }
    String getName()
    {
        return username;
    }
    String getPass()
    {
        return password;
    }
    String getPh()
    {
        return phno;
    }
    user_details(){}
}

class USER
{
    static Scanner sc=new Scanner(System.in);
    static user_details x=new user_details();  
    void login()
    {
        System.out.println("\n\n");
        System.out.println(in.cyan+"\t\t\t\t\t\t\t............      W E L C O M E     T O     A M I G O S      ............\n");
        System.out.println(in.yellow+"\t\t\tEnter Account Details : \n");
        System.out.print(in.green+"\t\t\t\tUsername  :  "+in.magent);
        String name = in.sc.nextLine();
        System.out.print(in.green+"\t\t\t\tPassword  :  "+in.magent);
        String pass = in.sc.nextLine();
        if(name.equals(x.getName()) && pass.equals(x.getPass()))
        {
            System.out.println(in.greenbr+"\t\t\t\t\t\t\t\t...........      Login successfull     ...........");
        }
        else if(!(name).equals(x.getName()) || !(pass).equals(x.getPass()))
        {
            System.out.println(in.redbr+"\n\t\t\t\t..........     Invalid Username or Password     ...........\n");
            while(true)
            { 
                System.out.print(in.cyan+"\t\tEnter Your Mobile Number : "+in.magent);
                String no=sc.nextLine();   
                if(no.equals(x.getPh()))
                {
                    System.out.println(in.yellow+"\n\t\t\tChoose options : ");
                    System.out.println(in.green+"\t\t1 . Retry Login");
                    System.out.print("\t\t2 . Reset your Credentials...\n\t\t"+in.magent);
                    String sel=in.sc.nextLine();
                    int n =Integer.parseInt(sel);
                    if(n==1)
                    {
                        login();
                        break;
                    }
                    else if(n==2)
                    {
                        System.out.print(in.cyan+"\n\t\t\tEnter Your Mobile Numer : "+in.magent);
                        String rstph = in.sc.nextLine();
                        if(rstph.equals(x.getPh()))
                        {
                            System.out.print(in.cyan+"\n\t\tPlease Wait We are sending OTP for your Number");
                            in.loading();
                            System.out.println();
                            int sentotp = in.otp("Resetting Username and Password");
                            System.out.print(in.yellow+"\t\t\tEnter Your OTP  : "+in.magent);
                            String user_otp = in.sc.nextLine();
                            if(user_otp.equals(Integer.toString(sentotp)))
                            {
                                    System.out.println(in.yellow+"\n\t\tEnter your Details.......\n");
                                    System.out.print(in.green+"\t\t\tNew Username    :   "+in.magent);
                                    String new_username = in.sc.nextLine();
                                    System.out.print(in.green+"\t\t\tNew Password    :   "+in.magent);
                                    String new_password = in.sc.nextLine();
                                    x = new user_details(new_username, new_password);
                                    System.out.print(in.greenbr+"\n\t\tYou're Redirecting to Login Page ");
                                    in.loading();
                                    System.out.println("\n\n");
                                    login();
                                    break;
                            }
                            else
							{
								System.out.println(in.red+"\t\t\t..........       Incorrect OTP     ............");
								System.out.println(in.green+"\t\t\tOpen the Application Again");
							}

                        }
                        else
                        {
                            System.out.println(in.redbr+"\t\t\t\t............             Invalid Mobile Number             ............\n\n");
                            System.out.println(in.yellow+"\t\t\tChoose one Option : ");
                            System.out.println(in.green+"\t\t1 . Create a new account ");
                            System.out.println("\t\t2 . Re-enter Mobile Number "+in.magent);
                            String opt = in.sc.nextLine();
                            int k = Integer.parseInt(opt);
                            if(k==1)
                            {
                                signup();
                                break;
                            }
                            else    
                                continue;
                        }
                        //if(long==)
                    }
                    else
                    {
                        System.out.println(in.redbr+"\t\tSorry You've Entered Invalid Input.............");
                        System.out.println(in.blue+"\t\t\tOpen the application again............");
                        Verification.ys=false;
                        break;
                    }
                }
                else
                {
                    System.out.println(in.redbr+"\n\t\t\t\t..........      Invalid Mobile Number     ...........");
                    System.out.println(in.yellow+"\t\t\tDo You want to re-enter : ");
                    System.out.println(in.green+"\t\t1 . Yes ");
                    System.out.print(in.red+"\t\t2 . No\n\t\t"+in.magent);
                    String ys = in.sc.nextLine();
                    if(Integer.parseInt(ys)==1)
                            continue;
                    else 
					{   
						Verification.ys=false;
                        break;
					}
                }
            }
        }
    }
	String mobile()
	{
		System.out.print(in.green+"\t\t\t\tMobile Number  :  "+in.magent);
        String phno = sc.nextLine();
		if(phno.length()==10)
		{
			for(int i=0;i<phno.length();i++)
			{
				if(phno.charAt(i)>='0'  &&  phno.charAt(i)<='9')
					continue;
				else
				{
					System.out.println(in.red+"\n\n\t\t\t\t.........     Your Number should contain only Digits   .........");
					System.out.println(in.yellow+"\t\t\t\tDo you want to Re-enter :");
					System.out.println(in.green+"\t\t\t1 . Yes");
					System.out.println(in.red+"\t\t\t2 . No");
					System.out.print("\t\t\t"+in.magent);
					String ys = in.sc.nextLine();
					if(Integer.parseInt(ys)==1)
						return mobile();
					else
					{
						Verification.ys=false;
						return null;
					}
				}
			}
			return phno;
		}
		else
		{
			System.out.println(in.red+"\n\n\t\t\t\t............           Your Number must Contain only 10 Digits            ..........");
			System.out.println(in.yellow+"\t\t\t\tDo you want to Re-enter :");
			System.out.println(in.green+"\t\t\t1 . Yes");
			System.out.println(in.red+"\t\t\t2 . No");
			System.out.print("\t\t\t"+in.magent);
			String ys = in.sc.nextLine();
			if(Integer.parseInt(ys)==1)
				return mobile();
			else
			{
				Verification.ys=false;
				return null;
			}
		}
	}
    void signup()
    {
        System.out.println(in.cyan+"\t\t    W E L C O M E     T O     A M I G O S    \n\n");
        System.out.println(in.yellow+"\t\t\tEnter Account Details : \n");
        System.out.print(in.green+"\t\t\t\tUsername       :  "+in.magent);
        String name = in.sc.nextLine();
        System.out.print(in.green+"\t\t\t\tPassword       :  "+in.magent);
        String pass = in.sc.nextLine();
		if(name.isEmpty() || pass.isEmpty())
		{
			System.out.println(in.red+"\n\n\t\t\t\t\t.........     Username or Password Can't Be empty   ...........");
			System.out.println(in.yellow+"\t\t\t\tDo you want to Re-enter : ");
			System.out.println(in.green+"\t\t\t1 . Yes");
			System.out.println(in.red+"\t\t\t2 . No");
			System.out.print("\t\t\t"+in.magent);
			String ys1 = in.sc.nextLine();
			if(Integer.parseInt(ys1)==1)
			{
				signup();;
				return;
			}
			else
			{
				return;
			}
		}
        
		String phno = mobile();
		if(phno==null)
		{
			Verification.ys=false;
			return;
		}
        x = new user_details(name, pass, phno);
        while(true)
        {
            System.out.print(in.cyan+"\n\t\tPlease Wait We are sending OTP for your Number");
            in.loading();
            System.out.println();
            int sentotp = in.otp("Creating New Account in Amigos");
            System.out.print (in.yellow+"\t\t\tEnter Your OTP  : "+in.magent);
            String user_otp = in.sc.nextLine();
            if(user_otp.equals(Integer.toString(sentotp)))
            {
                in.sleep(500);
                System.out.println(in.greenbr+"\t\t..........     Your Account has been created Successfully       ............\n");
                System.out.println(in.blue+"\t\t  Please log in again ");
                login();
                break;
            }
            else
            {
                System.out.println(in.redbr+"\t\t..........     Invalid OTP     ............");
                System.out.println(in.yellow+"\t\tDo You want to resend  OTP");
                System.out.println(in.green+"\t1 . Yes");
                System.out.println(in.red+"\t2 . No");
				System.out.print("\t");	
                String ys = in.sc.nextLine();
                if(Integer.parseInt(ys)==1)
                    continue;
                else
                {
                    System.out.println(in.redbr+"\t\t...........     Verification Failed     ............");
                    System.out.println(in.blue+"\t\tRe-open the application.....");
                    Verification.ys=false;
                    break;
                }
            }
        }
        
    }

}



class Verification extends USER
{
    static boolean ys = true;
    static Verification user_ob = new Verification();
    boolean  validation()
    {
        System.out.println(in.green+"\n\n\t\t\tChoose options : ");
        System.out.println(in.magent+"\t\t1 . Log In");
        System.out.print(in.purple+"\t\t2 . Sign Up\n\t\t");
        String opt = in.sc.nextLine();
        int op = Integer.parseInt(opt);
        if(op==1)
        {
            user_ob.login();
        }
        else if(op==2)
        {
            user_ob.signup();
        }
        else
        {
            System.out.println(in.redbr+"\n\n\t\t\t..........      Invalid Selection      ............");
            System.out.println(in.yellow+"\t\tDo You want to reselect : ");
            System.out.println(in.green + "\t\t1 . Yes");
            System.out.print(in.red+"\t\tPress any other number to Exit\n\t\t");
            String ys = in.sc.nextLine() ;
            if(Integer.parseInt(ys)==1)
                    validation();
        }
        return ys;
    }
}



        //            A M I G O S

class Amigos
{
    static double final_bill = 0; 
	static Transport trns_obj = new Transport();
	static Amigos Amigos_obj = new Amigos();
    static payment payment_obj = new payment();
    static food food_obj = new food();
	void Main_menu()
	{
		UI.menu();
		System.out.println("\n\n\n\n");
		System.out.print(in.red+"\t\t\t\t C H O O S E       C A T E G O R Y    T H A T    Y O U \' R E     L O O K I N G    F O R : "+in.magent);
		// System.out.println("\t\t");
		String opt = in.sc.nextLine();
		int k = Integer.parseInt(opt);
        in.sleep(500);
		if(k==1)
		{
            in.sleep(100);
            in.clear();
            trns_obj.transport_menu();
		}
		else if(k==2)
		{
            in.sleep(100);
            in.clear();
            food_obj.process();
		}
		else if(k==3)
		{
            in.sleep(100);
            in.clear();
			System.out.println();
			Amazon.object.start();
			String k1 = in.sc.nextLine();

		}
		else
		{
			in.sleep(300);
			System.out.println(in.red+"\t\t\t\t...........     Invalid Selection      ............");
			System.out.println(in.yellow+"\t\t\tDo You want to Reselect.");
			System.out.println(in.green + "\t\t1 . Yes");
			System.out.println(in.red+"\t\tPress any other number to Exit");
			System.out.print("\t\t"+in.magent);
			String ys = in.sc.nextLine() ;
			if(Integer.parseInt(ys)==1)
					Main_menu();
			return;
		}
		System.out.println(in.blue+"\n\n\t\t\tDo You want to Switch to any other Category  --->  Transport or Food or Shopping :  ");
		System.out.println(in.green + "\t\t1 . Yes");
		System.out.print(in.red+"\t\t2 . No \n\t\t"+in.magent);
		String ys = in.sc.nextLine() ;
		if(Integer.parseInt(ys)==1)
		{
			in.clear();
			this.Main_menu();
		}
        else if(Integer.parseInt(ys)==2)
        {

        }
	}
	public static void main(String[] args)
	{
		in.clear();
		System.out.println("  ");
		String[] text = new String[]{
                            "      @@           *@@@@m     m@@@*     *@@@@*       mm@***@m@        mm@**@@m        m@***@m@\n" ,
                            "     m@@m            @@@@    @@@@         @@       m@@*     *@      m@@*    *@@m     m@@    *@\n" ,
                            "    m@*@@!           @ @@   m@ @@         @@       @@*       *      @@*      *@@     *@@@m    \n" ,
                            "   m@  *@@           @  @!  @* @@         @@       @!               @@        @@       *@@@@@m\n" ,
                            "   @@@!@!@@          !  @!m@*  @@         @!       @!m    *@@@@     @@        @@           *@@\n" ,
                            "  !*      @@         !  *!@*   @@         @!       *!@m     @@      *@@      @@*     @@     @@\n" ,
                            "   !!!!@!!@          !  !!!!*  !!         !!       !!!    *!@!!     !@@      !@!     !     *@!\n" ,
                            "  !*      !!         :  *!!*   !!         :!       *:!!     !!      *@!!!    !!!     !!     !!\n" ,
                            ": : :   : :::      : ::: :   : :::      :!: :        ::: : ::         : : : :        :!: : :! \n\n",in.red+
                            "                                                          A P K A          B E S T F R I E N D  "};

    System.out.print(in.green);
    for(int i=0;i<text.length-1;i++)
    {
	System.out.print("\t\t\t\t\t"+in.blink);
        for(int j=0;j<text[i].length();j++)
        {
            System.out.print(text[i].charAt(j));
            in.sleep(5);
        }
    }
		System.out.println(in.rstblink);
		System.out.print("\t\t\t\t\t");
    for(int i=0;i<text[9].length();i++)
    {
        if(text[9].charAt(i)==' ')
            in.sleep(5);
        else
            in.sleep(30);
        System.out.print(text[9].charAt(i));
    }
		
		in.sleep(1000);
		in.sleep(500);
       

		// log in sign up
		if(!Verification.user_ob.validation())
            		return;
        in.sleep(500);
        in.clear();
		Amigos_obj.Main_menu();
        System.out.println(in.reset);
	}

}




class UI
{
    static void menu()
	{
        LocalDate ldt =LocalDate.now();
        int year = ldt.getYear();
        int day = ldt.getDayOfMonth();
        String sday = Integer.toString(day);
        String  week = ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        if(day%10==1)
            sday+="st";
        else if(day%10==2)
            sday+="nd";
        else
            sday+="th";
        String month = ldt.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        
        LocalTime tm = LocalTime.now();
        String time = tm.toString();
        int hrs = Integer.parseInt(time.substring(0, 2));
        String ampm = (hrs>=12)?"PM":"AM";
        if(hrs>=13)
            hrs = hrs-12;
        time = Integer.toString(hrs)+time.substring(2,5)+" "+ampm;
		
		String wel = in.red+"\n\n\n\n\t\t\t\t\t.................."+in.green+"          W E L C O M E       T O        H Y D E R A B A D         "+in.green+in.red+".................";
        for(int i=0;i<wel.length();i++)
        {
            if(wel.charAt(i)==' ' || wel.charAt(i)=='.')
                in.sleep(10);
            else    
                in.sleep(50);
            System.out.print(wel.charAt(i));
        }	
		System.out.println("\n\n\n");
        
		System.out.print(in.red+"\t  _____                   "+in.blue+"_________     ________     ________    ________     ________    ________    ________      ________    _________");                                                System.out.print(in.magent);  System.out.print("       ______________________________\n");        
        System.out.print(in.red+"\t / __  \\                 "+in.blue+"|\\___   ___\\  |\\   __  \\   |\\   __  \\  |\\   ___  \\  |\\   ____\\  |\\   __  \\  |\\   __  \\    |\\   __  \\  |\\___   ___\\");                        System.out.print(in.magent);   System.out.print("   / \\                             \\.\n");
        System.out.print(in.red+"\t|\\/| \\  \\              "+in.blue+"  \\|___ \\  \\_|  \\ \\  \\_\\  \\  \\ \\  \\_\\  \\ \\ \\  \\  \\  \\ \\ \\  \\___ _ \\ \\  \\_\\  \\ \\ \\  \\ \\  \\   \\ \\  \\_\\  \\ \\|__ \\  \\__|");        System.out.print(in.magent);     System.out.printf("  |   |     %s %10s %s           |.\n",in.green,week,in.magent);
        System.out.print(in.red+"\t\\|/ \\ \\  \\            "+in.blue+"        \\ \\  \\    \\ \\   _  _\\  \\ \\   __  \\ \\ \\  \\  \\  \\ \\ \\_____  \\ \\ \\   ____\\ \\ \\  \\ \\  \\   \\ \\   _  _\\    \\ \\  \\");      System.out.print(in.magent);         System.out.printf("     \\__|   %s %15s   %s      |.\n",in.green,(sday+" "+month),in.magent);
        System.out.print(in.red+"\t     \\ \\  \\      ___   "+in.blue+"        \\ \\  \\    \\ \\  \\\\  /   \\ \\  \\ \\  \\ \\ \\  \\  \\  \\ \\|____ \\  \\ \\ \\  \\___|  \\ \\  \\_\\  \\   \\ \\  \\\\  /     \\ \\  \\");    System.out.print(in.magent);      System.out.printf("       |       %s    %4d%s             |.\n",in.green,year,in.magent);       
       System.out.print(in.red+"\t      \\ \\__\\    |\\__\\"+in.blue+"           \\ \\__\\    \\ \\__\\\\_\\    \\ \\__\\ \\__\\ \\ \\__\\  \\__\\   ___\\_\\  \\ \\ \\__\\      \\ \\_______\\   \\ \\__\\\\_\\      \\ \\__\\");     System.out.print(in.magent);   System.out.print("      |                            |.\n");
       System.out.print(in.red+"\t       \\|__|    \\|__|   "+in.blue+"         \\|__|     \\|__||_ |    \\|__| |__|  \\|__|   |__| \\_________\\ \\|__|       \\|_______|    \\|__||_ |      \\|__|");                     System.out.print(in.magent);   System.out.printf("      |          %s%8s      %s    |.\n",in.green,time,in.magent);
        System.out.print(in.red+"\t                           "+in.blue+"                                                          ");                                                                                 System.out.print(in.magent);   System.out.print("\t\t\t\t                                  |                            |.\n");
        System.out.print(in.magent);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%19s               |   _________________________|___",""); 
                System.out.print(in.magent);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%19s               |  /                            /." ,"");
                System.out.print(in.magent);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%19s                      \\_/________%sA m i g o s%s_________/.","",in.whitebr,in.magent);
        // System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");

       
       
        System.out.println("\n");
	in.sleep(500);


	    System.out.println("\t"+in.red+"  _______                  "+in.purple+" ________      ________          ________          _________    ");
        System.out.println("\t"+in.red+" /  ___  \\                "+in.purple+" |\\  _____\\    |\\   __  \\        |\\   __  \\        |\\        \\    ");
        System.out.println("\t"+in.red+"/__/|_/  /|                "+in.purple+"\\ \\  \\__      \\ \\  \\ \\  \\       \\ \\  \\ \\  \\       \\ \\  \\**.  \\   ");
        System.out.println("\t"+in.red+"|__|//  / /                "+in.purple+" \\ \\   __\\     \\ \\  \\ \\  \\       \\ \\  \\ \\  \\       \\ \\  \\  *  \\  ");
        System.out.println("\t"+in.red+"    /  /_/__       ___     "+in.purple+"  \\ \\  \\        \\ \\  \\_\\  \\       \\ \\  \\_\\  \\       \\ \\  \\.*   \\ ");
        System.out.println("\t"+in.red+"   |\\________\\    |\\__\\"+in.purple+"       \\ \\__\\        \\ \\_______\\       \\ \\_______\\       \\ \\________)");
        System.out.println("\t"+in.red+"    \\|_______|    \\|__|  "+in.purple+"      \\|__|         \\|_______|        \\|_______|        \\|________)");
		System.out.println();
		System.out.println("\n");

	in.sleep(500);

        System.out.print("\t"+in.red+" ________                 "+in.green+"________    ___  ___    ________   ________    ________    ___    __________    ________\n");
        System.out.print("\t"+in.red+"|\\_____  \\               "+in.green+"|\\   ____\\  |\\  \\ \\  \\  |\\   __  \\ |\\    __ \\  |\\   __  \\  |\\  \\  |\\   ___   \\  |\\   ____)    \n");
        System.out.print("\t"+in.red+"\\|____|\\ /_              "+in.green+"\\ \\  \\_____ \\ \\  \\ \\  \\ \\ \\  \\ \\  \\ \\ \\  \\_\\ \\ \\ \\  \\_\\  \\ \\ \\  \\ \\ \\  \\   \\  \\ \\ \\  \\___)    \n");
        System.out.print("\t"+in.red+"      \\|\\  \\            "+in.green+"  \\ \\_____  \\ \\ \\   __  \\ \\ \\  \\ \\  \\ \\ \\   ___\\ \\ \\   ____\\ \\ \\  \\ \\ \\  \\   \\  \\ \\ \\  \\   ___  \n");
        System.out.print("\t"+in.red+"     __\\_\\  \\      ___  "+in.green+"   \\|____|\\  \\ \\ \\  \\ \\  \\ \\ \\  \\_\\  \\ \\ \\  \\___| \\ \\  \\___|  \\ \\  \\ \\ \\  \\   \\  \\ \\ \\  \\_()  \\ \n");
        System.out.print("\t"+in.red+"    |\\_______\\    |\\__\\"+in.green+"     ____ __\\  \\ \\ \\__\\ \\__\\ \\ \\_______\\ \\ \\__\\     \\ \\__\\      \\ \\__\\ \\ \\__\\   \\__\\ \\ \\________) \n");
        System.out.print("\t"+in.red+"    \\|_______|    \\|__|  "+in.green+"   |\\_________\\ \\|__| |__|  \\|_______|  \\|__|      \\|__|       \\|__|  \\|__|   |__|  \\|________| \n");
        System.out.print("\t"+in.red+"                           "+in.green+" \\|_________|\n");
    
    
    	in.sleep(500);
    
    }
}




		//transport interface  ---   Metro   and Rapido
interface tkt_book
{
	void display();
	String source();
	String Destination();
	void billing(String src , String Dest);
}

            //  B U S 
class bus
{
    static double bus_bill = 0;
    static int[][] price = {{},{0,0,1399,1299,1599,2549,999,899},{0,1399,0,699,1999,2999,1599,1099},{0,1299,699,0,2549,3099,1449,1099},{0,1599,1999,2049,0,1099,2099,1849},{0,2099,2599,2699,1099,0,2569,2469}};
    static String[] src  = {"","Hyderabad","Bangalore","Tirupati","Mumbai","Delhi"};
    static String[] Dest = {"","Hyderabad","Bangalore","Tirupati","Mumbai","Delhi","Vizag","Vijayawada"};
    static int[] seater= new int[33];
    static int[] sleeper = new int[31];
    static String[] sleep = new String[31];
    static String[] seat = new String[33];
    static{
        for(int i=1;i<=30;i++)
        {
            seater[i]=i;
            sleeper[i]=i;
            if(i<=9){
                
            sleep[i]=" "+ in.green+Integer.toString(i);
            seat[i]=" "+ in.green+Integer.toString(i);
            }
            else{
                
                seat[i]= in.green+Integer.toString(i);
                sleep[i]= in.green+Integer.toString(i);
            }
        }
        seater[31]=31;
        seater[32]=32;
        seat[31]=in.green+"31";
        seat[32]=in.green+"32";
        
    }
    void display()
    {
        System.out.println(in.yellow);
        System.out.print("\t\t\t\t\t\t .-------------------------------------------------------------.\n");
        System.out.print("\t\t\t\t\t\t'------..-------------..----------..----------..----------..--.|\n");
        System.out.print("\t\t\t\t\t\t|       \\            ||          ||          ||           ||  ||\n");
        System.out.print("\t\t\t\t\t\t|        \\ __________||__________||__________||___________||__||\n");
        System.out.print("\t\t\t\t\t\t|   _..   ||  _    _  ||    _   _ || _    _   ||    _    _||  ||\n");
        System.out.print("\t\t\t\t\t\t| (\\)||   || //   //  ||   //  // ||//   //   ||   //   //||  ||\n");
        System.out.print("\t\t\t\t\t\t|_.-----\"''----------''----------''----------''----------''--'|\n");
        System.out.print("\t\t\t\t\t\t |o|      |                       C  V      C O R P     ||==| o|\n");
        System.out.print("\t\t\t\t\t\t | |      |  _-_                          .-.           ||==| O|\n");
        System.out.print("\t\t\t\t\t\t |O|  __  |.'.-.'     _       _         .'.-.'.     __  | \"__=='\n");
        System.out.print("\t\t\t\t\t\t '---------'|( )|'----------------------'|( )|'----------\"\"\n");
        System.out.print("\t\t\t\t\t\t             '-'                          '-'\n");
    }

    void display_places()
    {
        System.out.println("\n\n\t\t\t\t\t\t\t"+in.greenbr+"   Source\t\t\t  "+in.redbr+"Destination\n\n"+in.cyan);
        for(int i=1;i<8;i++)
        {
            if(i<=5)
                System.out.printf("\t\t\t\t\t\t\t%d . %-16s\t\t%d . %-16s\n",i,src[i],i,Dest[i]);
            else 
                System.out.printf("\t\t\t\t\t\t\t   %-16s\t\t%d . %-16s\n","",i,Dest[i]);
            System.out.println();
        }   
    }
    int source()
    {
        System.out.print(in.green+"\t\t\t\tEnter Starting Point  : "+in.magent);
        String src = in.sc.nextLine();
        int n = Integer.parseInt(src);
        if(n<=5 && n!=0)
            return n;
        else    
        {
            System.out.println(in.redbr+"\n\t\t\t\t...........     Invalid Starting Point     ...........\n");
            System.out.println(in.yellow+"\t\t\tDo You want to choose again...\n");
            System.out.println(in.green+"\t\t1 . Yes");
            System.out.print(in.red+"\t\tPress any other number to Exit\n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
            {
                display_places();
                return source();
            }
            else    
                return 0;
        }
    } 
    int Destination()
    {
        System.out.print(in.green+"\t\t\t\tEnter Destination Point  : "+in.magent);
        String src = in.sc.nextLine();
        int n = Integer.parseInt(src);
        if(n<=7 && n!=0)
            return n;
        else    
        {
            System.out.println(in.redbr+"\n\t\t\t\t...........     Invalid Destination Point     ...........\n");
            System.out.println(in.yellow+"\t\t\tDo You want to choose again...\n");
            System.out.println(in.green+"\t\t1 . Yes");
            System.out.print(in.red+"\t\tPress any other number to Exit\n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
            {
                display_places();
                return Destination();
            }
            else    
                return 0;
        }
    }
    void sleeper()
    {
            System.out.println(in.red+"\t\t\t\t\t\t These are the Sleeper Slots those are Avaialable : "+in.green);   
            System.out.println("\t\t\t\t\t\t _________________________       _________________________");
            System.out.println("\t\t\t\t\t\t|                        |      |                        |");
            System.out.println("\t\t\t\t\t\t|     Lower deck         |      |     Upper deck         |");
            System.out.println("\t\t\t\t\t\t|________________________|      |________________________|");
            for(int i=0;i<5;i++)
            {
            System.out.println("\t\t\t\t\t\t|  __          __    __  |      |  __          __    __  |");
            System.out.println("\t\t\t\t\t\t| |  |        |  |  |  | |      | |  |        |  |  |  | |");
            System.out.printf ("\t\t\t\t\t\t| |%-2s|        |%-2s|  |%-2s| |      | |%-2s|        |%-2s|  |%-2s| |\n", sleep[i*3+1],sleep[i*3+2],sleep[i*3+3],sleep[15+sleeper[i*3+1]],sleep[15+sleeper[i*3+2]],sleep[15+sleeper[i*3+3]]);
            System.out.println("\t\t\t\t\t\t| |__|        |__|  |__| |      | |__|        |__|  |__| |");
            }
            System.out.println("\t\t\t\t\t\t|                        |      |                        |");
            System.out.println("\t\t\t\t\t\t|________________________|      |________________________|\n");
            System.out.println("\t\t\t\t\t\t                                                        "+in.red+"  Red    -- > "+in.yellow+" Aready Booked");
            System.out.println("\t\t\t\t\t\t                                                       "+in.green+"   Green  -- > "+in.yellow+" Not Booked Yet");
    }

    void seater()
    {
        System.out.println(in.red+"\t\t\t\t\tThese are seats that are Available Seater : "+in.green);
        System.out.println("\t\t\t\t\t\t ________________________ ");
        System.out.println("\t\t\t\t\t\t|                        |");
        System.out.println("\t\t\t\t\t\t|         Seater         |");
        System.out.println("\t\t\t\t\t\t|________________________|");
       
        for(int i=0;i<8;i++)
        {
        System.out.println("\t\t\t\t\t\t|  __    __    __    __  |");
        System.out.printf ("\t\t\t\t\t\t| |%2s|  |%2s|  |%2s|  |%2s| |\n",seat[i*4+1],seat[i*4+2],seat[i*4+3],seat[i*4+4]);
        System.out.println("\t\t\t\t\t\t| |__|  |__|  |__|  |__| |"); 
        }
        System.out.println("\t\t\t\t\t\t|                        |");
        System.out.println("\t\t\t\t\t\t|________________________|\n\n");
        System.out.println("\t\t\t\t\t\t                                  "+in.red+"  Red    -- > "+in.yellow+" Aready Booked");
        System.out.println("\t\t\t\t\t\t                                  "+in.green+"   Green  -- > "+in.yellow+" Not Booked Yet");
    }

    // 1--sleeper   2--seater  ac nonac  

    void passenger_details(int source, int destination ,int ac , int ss, int n)
    {
        double bill = 0.0;
        String ticket = "AMG23";
        String[][] pass = new String[n+1][4];
        for(int i=1;i<=n;i++)
        {
            System.out.println(in.green+"\t\t\t\tPassenger : "+i);
            System.out.println();
            System.out.print(in.cyan+"\t\t\t\t\tName     :  "+in.magent);
            pass[i][0]  = in.sc.nextLine();
            System.out.print(in.cyan+"\t\t\t\t\tAge      :  "+in.magent);
            pass[i][1] = in.sc.nextLine();
            System.out.print(in.cyan+"\t\t\t\t\tGender   :  "+in.magent);
            pass[i][2] = in.sc.nextLine();
            while(true)
            {
                System.out.print(in.cyan+"\t\t\t\t\tSeat No  :  "+in.magent);
                pass[i][3] = in.sc.nextLine();
                int k = Integer.parseInt(pass[i][3]);
                if((ss==1 && k>=30) || (ss==2 && k>=32) || k<=0)
                {
                    System.out.println(in.redbr+"\t\t\t\t\t...........     Invalid Seat Selection      ..............");
                    System.out.println(in.yellow+"\t\t\t\tChoose again ");
                    System.out.println(in.green+"\t\t\t\tNOTE : Seats available below seat number "+((ss==1)?30:32)+"and Below 1 ");
                    continue;
                }
                if(ss==1)
                {
                    if(sleeper[k]!=0)
                    {
                        sleeper[k]=0;
                        if(k<=9)
                            sleep[k]= " " + in.red+Integer.toString(k)+in.green;
                        else
                            sleep[k]=in.red+Integer.toString(k)+in.green;
                        break;
                    }
                    else
                    {
                        System.out.println(in.redbr+"\t\t\t\tOops! This seat has been Booked .....");
                        System.out.println(in.yellow+"\t\t\t\tChoose another Seat..");
                        continue;
                    }
                    
                }
                if(ss==2)
                {
                    if(seater[k]!=0)
                    {
                        seater[k]=0;
                        if(k<=9)
                            seat[k]= " " + in.red +Integer.toString(k)+in.green;
                        else
                            seat[k]= in.red +Integer.toString(k)+in.green; 
                        break;
                    }
                    else
                    {
                        System.out.println(in.redbr+"\t\t\t\tOops! This seat has been Booked .....");
                        System.out.println(in.yellow+"\t\t\t\tChoose another Seat..");
                        continue;
                    }
                }

            }
            System.out.println();
        }

        //Price Calculations

        double rate =(double) price[source][destination];
        if((ss==1 && ac==2) || (ss==2 && ac==1))
            rate*=1.5;
        else if(ss==1 && ac==1)
            rate*=2;
        bill = rate*n;

        System.out.println(in.blue+"\n\t\t\t\t\t Your Bill : "+in.magent+bill);
        System.out.print(in.green+"\t\t\t\t\t Please Wait you're directing to Billing");
        in.loading();
        if(! Amigos.payment_obj.bank_select(bill))
        {
            System.out.println(in.red+"\n\t\t\t\t...........         Booking Cancelled         ..............");
        }


        System.out.println("\n\t\t\t\t\t\t\t                               P A S S E N G E R S     D E T A I L S                                \n");
        System.out.println("\t\t\t\t\t\t\t\t\t"+in.green+"  Source : "+in.blue+src[source]+in.red+"\t\t\t  Destination : "+in.blue+Dest[destination]+in.cyan);
        System.out.println("\t\t\t\t\t ____________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t|        |                               |              |               |              |                  |                  |");
        System.out.println("\t\t\t\t\t| "+in.yellow+"SL.No."+in.cyan+" |      "+in.yellow+"  Passenger Name       "+in.cyan+"  |  "+in.yellow+"    Age  "+in.cyan+"   |  "+in.yellow+"  Gender     "+in.cyan+"|  "+in.yellow+" Seat No.   "+in.cyan+"|   "+in.yellow+"  Ticket No.  "+in.cyan+" |     "+in.yellow+"  Price    "+in.cyan+"  |");
        System.out.println("\t\t\t\t\t|________|_______________________________|______________|_______________|______________|__________________|__________________|");
        
        for(int i=1;i<=n;i++)
        {
            System.out.println("\t\t\t\t\t|        |                               |              |               |              |                  |                  |");
            System.out.printf("\t\t\t\t\t|  %2d    |    %-25s  |       %2s     |     %-6s    |     %3s      |     %5s%03d     |    %10.2f    |",(i),pass[i][0],pass[i][1],pass[i][2],pass[i][3],ticket,Integer.parseInt(pass[i][3]),rate);
            System.out.println("\n\t\t\t\t\t|________|_______________________________|______________|_______________|______________|__________________|__________________|");
        }
        System.out.println("\t\t\t\t\t|                                                                                                         |                  |");
        System.out.printf("\t\t\t\t\t|                                                                                  Total Price            |    %-13.2f |\n",bill);
        System.out.println("\t\t\t\t\t|_________________________________________________________________________________________________________|__________________|");
    }

   int seat_booking(int ss)
    {
        if(ss==1)
            sleeper();
        else    
            seater();
        System.out.println(in.red+"\t\t\t\tDisclaimer : At time only 6 Seats can be booked.");
        System.out.print(in.redbr+"\t\t\t\tEnter No of tickets that you wanted to Book :   ");
        String tkt = in.sc.nextLine();
        System.out.println();
        int cnt= Integer.parseInt(tkt);
        if(cnt<=6)
                return cnt;
        else
        {
            System.out.println("\t\t\t............      Invalid Selection      ............");
            System.out.println("\t\tDo you want to choose again...");
            System.out.println(in.green+"\t\t1 . Yes ");
            System.out.println(in.red+"\t\t2 . No"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
                    return seat_booking(ss);
            else    
                    return -1;
        }
    }

    int sleeper_seater()
    {
        System.out.println(in.yellow+"\t\t\tChoose the Options : \n");
        System.out.print(in.cyan+"\t\t1 . Sleeper ");
        System.out.print("\t\t2 . Seater\n\t\t"+in.magent);
        String ac = in.sc.nextLine();
        int k = Integer.parseInt(ac);
        if(k==1)
        {
            return 1;
        }
        else if(k==2)
        {
            return 2;
        }
        else
        {
            System.out.println("\t\t\t\t...........      Invalid Selection     ............");
            System.out.println("\t\t\tDo You want to Re-select again or exit");
            System.out.println("\t\t1 . Yes ");
            System.out.print("\t\t2 . No\n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
            {
                return sleeper_seater();
            }
            else    
                return -1;
        }

    }

    int ac()
    {
        System.out.println(in.yellow+"\t\t\tChoose the Options : \n");
        System.out.print(in.cyan+"\t\t1 . A C ");
        System.out.print("\t\t2 . N O N   -  A C\n\t\t"+in.magent);
        String ac = in.sc.nextLine();
        int k = Integer.parseInt(ac);
        if(k==1)
        {
            return 1;
        }
        else if(k==2)
        {
            return 2;
        }
        else
        {
            System.out.println(in.redbr+"\t\t\t\t...........      Invalid Selection     ............");
            System.out.println(in.yellow+"\t\t\tDo You want to Re-select again or exit");
            System.out.println(in.green+"\t\t1 . Yes ");
            System.out.print(in.red+"\t\t2 . No\n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
            {
                return ac();
            }
            else    
                return -1;
        }
    }

    int travels()
    {
        System.out.print(in.cyan+"\n\n\t\t\t\t\t\t");
        in.loading();
        String title = "         C V     T R A N S P O R T S          ";
        for(int i=0;i<title.length();i++)
        {
            System.out.print(title.charAt(i));
            in.sleep(50);
        }
        in.loading();
        System.out.println(in.green+"\n\n");
        System.out.println("\t\t\t\t\t\t\t\t1 . O R A N G E         T R A V E L S \n");   
        System.out.println(in.red+"\t\t\t\t\t\t\t\t2 . C M R               T R A V E L S \n");
        System.out.println(in.blue+"\t\t\t\t\t\t\t\t3 . J A B B A R         T R A V E L S \n");
        System.out.println(in.purple+"\t\t\t\t\t\t\t\t4 . R A J               T R A V E L S \n");
        System.out.println(in.cyan+"\t\t\t\t\t\t\t\t5 . K A V Y A           T R A V E L S \n");
        System.out.println(in.whitebr+"\t\t\t\t\t\t\t\t6 . M E G H A N A       T R A V E L S \n");
        System.out.print(in.yellow+"\n\t\t\t\t\tChoose the Travels from the above   :  "+in.magent);
        String trv = in.sc.nextLine();
        int opt = Integer.parseInt(trv);
        if(opt<=6)
        {
            return opt;
        }
        else
        {
            System.out.println(in.redbr+"\t\t\t\t...........      Invalid Selection     ............");
            System.out.println(in.yellow+"\t\t\tDo You want to Re-select again or exit");
            System.out.println(in.green+"\t\t1 . Yes ");
            System.out.print(in.red+"\t\t2 . No\n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
                return travels();
            else    
                return 0;
        }
    }
    void process()
    {
        display();
        if(travels()==0)
            return;
        display_places();
        int src = source();
        System.out.println();
        int Dest = Destination();
		if(src==Dest)
		{
			System.out.println(in.red+"\n\n\t\t\t\t..........         Invalid Starting Point or Destination Point        ..........");
			System.out.println(in.green+"\t\t\t\tC H O O S E      A G A I N ");
			process();
			return;
		}
        System.out.println();
        if(src!=0 && Dest!=0)
        {
             int ac = ac();
             System.out.println();
             if(ac>0)
             {
                int ss = sleeper_seater();
                System.out.println();
                int n = seat_booking(ss);
                System.out.println();
                if(n!=-1)
                {
                    System.out.println();
                    passenger_details(src, Dest, ac, ss, n);
                }
             }
        }
        System.out.println(in.yellow+"\n\t\t\t\tDo You want to Book the Bus tickets Again.....");
        System.out.println(in.green+"\t\t\t1 . Yes");
        System.out.println(in.red+"\t\t\tPress any number to Exit");
		System.out.print("\t\t\t"+in.magent);
        String ys = in.sc.nextLine();
        if(Integer.parseInt(ys)==1)
            process();
    }
}

			//   t r a i  n 

class train 
{
    

	static String[] coach = {"","S1","S2","S3","S4","S5","S6","S7","S8","S9","S10","B1","B2","B3","A1","A2"};
    static String[][] train = {{"","",""},{"Tirumala Express","Tirupati","TML"},{"Vijaya Express","Vijayawada","VJY"},{"Basava Express","Bangalore","BSV"},{"Basha Express","Mumbai","BSA"},{"Vishaka Express","Vizag","VSK"},{"Uttar Express","New Delhi","UTR"}};
	static double[] price={0,899,659,859,1209,1099,1999};
    static int[] coach_book = new int[16];
    static int[] seat_book = new int[33];
	static String[] berth = {"","UPPER","LOWER","MIDDLE"};
	static double train_bill = 0;
    static {
        for(int i=1;i<33;i++)
        {
            seat_book[i]=i;
            
        }
    }


	void pass(int exp , int comp)
	{
		System.out.print(in.green+"\n\n\t\t\tEnter Number of Passengers : "+in.magent);
		String passenger  = in.sc.nextLine();
		int ps  = Integer.parseInt(passenger);
		double bill = 0.0;
        String ticket = "AMG23"+train[exp][2]; //8
        String[][] pass = new String[ps+1][5];
		double rate = price[exp];
        for(int i=1;i<=ps;i++)
        {
            System.out.println(in.green+"\n\t\t\t\tPassenger : "+i);
            System.out.println();
            System.out.print(in.cyan+"\t\t\t\t\tName     :  "+in.magent)	;
            pass[i][0]  = in.sc.nextLine();
            System.out.print(in.cyan+"\t\t\t\t\tAge      :  "+in.magent);
            pass[i][1] = in.sc.nextLine();
            System.out.print(in.cyan+"\t\t\t\t\tGender   :  "+in.magent);
            pass[i][2] = in.sc.nextLine();
            while(true)
            {
                System.out.print(in.cyan+"\t\t\t\t\tSeat No  :  "+in.magent);
                pass[i][3] = in.sc.nextLine();
                int k = Integer.parseInt(pass[i][3]);
				if(k>32 && k<1)
				{
					System.out.println(in.red+"\t\t\t\t...........        Invalid Seat Selection       ..........");
					System.out.println(in.cyan+"\t\tNOTE : Choose Seat in Range of 1 and 32 ");
					continue;
				}
				if(seat_book[k]!=0)
				{
					seat_book[k]=0;
					pass[i][4]=Double.toString(rate);
					bill+=rate;
					if(k>24)
					{
						pass[i][4]=Double.toString(rate*1.5);
						bill+=(rate*0.5);
					}
					break;
				}
				else
				{
					System.out.println(in.redbr+"\t\t\t\tOops! This seat has been Booked .....");
                    System.out.println(in.yellow+"\t\t\t\tChoose another Seat..");
                    continue;
				}

			}
		}

        System.out.println(in.blue+"\n\t\t\t\t\t Your Bill : "+in.magent+bill);
        System.out.print(in.green+"\t\t\t\t\t Please Wait you're directing to Billing");
        in.loading();
        if(! Amigos.payment_obj.bank_select(bill))
        {
            System.out.println(in.red+"\n\t\t\t\t...........         Booking Cancelled         ..............");
            return;
        }

		System.out.println("\n\t\t\t\t\t\t\t                               P A S S E N G E R S     D E T A I L S                                \n");
		String exp_name = train[exp][0].toUpperCase();
		System.out.print(in.greenbr+"\t\t\t\t\t\t\t\t\t\t\t");
		for(int i=0;i<exp_name.length();i++)
		{
			if(exp_name.charAt(i)==' ')
				System.out.print("     ");
			System.out.print(exp_name.charAt(i)+" ");
		}
		System.out.println(in.reset+"\n");
        System.out.println("\t\t\t\t\t\t\t\t\t"+in.green+"  Source : "+in.blue+"Hyderabad"+in.red+"\t\t\t  Destination : "+in.blue+train[exp][1]+in.cyan);
        System.out.println("\t\t\t\t\t ____________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t|        |                               |              |               |              |                  |                  |");
        System.out.println("\t\t\t\t\t| "+in.yellow+"SL.No."+in.cyan+" |      "+in.yellow+"  Passenger Name       "+in.cyan+"  |  "+in.yellow+"    Age  "+in.cyan+"   |  "+in.yellow+"  Gender     "+in.cyan+"|  "+in.yellow+" Seat No.   "+in.cyan+"|   "+in.yellow+"  Ticket No.  "+in.cyan+" |     "+in.yellow+"  Price    "+in.cyan+"  |");
        System.out.println("\t\t\t\t\t|________|_______________________________|______________|_______________|______________|__________________|__________________|");
        
        for(int i=1;i<=ps;i++)
        {
            System.out.println("\t\t\t\t\t|        |                               |              |               |              |                  |                  |");
            System.out.printf("\t\t\t\t\t|  %2d    |    %-25s  |       %2s     |     %-6s    |     %3s      |   %8s%03d    |    %10s    |",(i),pass[i][0],pass[i][1],pass[i][2],pass[i][3],ticket,Integer.parseInt(pass[i][3]),pass[i][4]);
            System.out.println("\n\t\t\t\t\t|________|_______________________________|______________|_______________|______________|__________________|__________________|");
        }
        System.out.println("\t\t\t\t\t|                                                                                                         |                  |");
        System.out.printf("\t\t\t\t\t|                                                                                  Total Price            |    %-13.2f |\n",bill);
        System.out.println("\t\t\t\t\t|_________________________________________________________________________________________________________|__________________|");

	}

	void seat_sleep()
	{
		System.out.println(in.yellow+"\n\n\t\t\t\tSelect Your Seat and Berth : \n");
		System.out.println(in.red+"\t\t\t\t\t				              S L E E P E R				       											 "+in.cyan);
		System.out.println("\t\t\t\t\t __________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t|                              ||                                ||                               ||                               |");
        System.out.println("\t\t\t\t\t|  _________       _________   ||    _________       _________   ||   _________       _________   ||   _________       _________   |");
        System.out.println("\t\t\t\t\t| |         |     |         |  ||   |         |     |         |  ||  |         |     |         |  ||  |         |     |         |  |");
        System.out.println("\t\t\t\t\t| |         |     |         |  ||   |         |     |         |  ||  |         |     |         |  ||  |         |     |         |  |");
        System.out.println("\t\t\t\t\t| |   25    |     |    26   |  ||   |    27   |     |    28   |  ||  |    29   |     |   30    |  ||  |    31   |     |   32    |  |");
        System.out.println("\t\t\t\t\t| |         |     |         |  ||   |         |     |         |  ||  |         |     |         |  ||  |         |     |         |  |");
        System.out.println("\t\t\t\t\t| |         |     |         |  ||   |         |     |         |  ||  |         |     |         |  ||  |         |     |         |  |");
        System.out.println("\t\t\t\t\t| |_________|     |_________|  ||   |_________|     |_________|  ||  |_________|     |_________|  ||  |_________|     |_________|  |");
        System.out.println("\t\t\t\t\t|                              ||                                ||                               ||                               |");
        System.out.println("\t\t\t\t\t|                              ||                                ||                               ||                               |");
        System.out.println("\t\t\t\t\t|                                                                                                                                  |");
        System.out.println("\t\t\t\t\t|                                                                                                                                  |");
        System.out.println("\t\t\t\t\t|                              ||                                ||                               ||                               |");
        System.out.println("\t\t\t\t\t|  _________       _________   ||    _________       _________   ||   _________       _________   ||   _________       _________   |");
        System.out.println("\t\t\t\t\t| |         |     |         |  ||   |         |     |         |  ||  |         |     |         |  ||  |         |     |         |  |");
        System.out.println("\t\t\t\t\t| |    1    |     |   6     |  ||   |    7    |     |   12    |  ||  |   13    |     |   18    |  ||  |   19    |     |   24    |  |");
        System.out.println("\t\t\t\t\t| |_________|     |_________|  ||   |_________|     |_________|  ||  |_________|     |_________|  ||  |_________|     |_________|  |");
        System.out.println("\t\t\t\t\t| |         |     |         |  ||   |         |     |         |  ||  |         |     |         |  ||  |         |     |         |  |");
        System.out.println("\t\t\t\t\t| |    2    |     |   5     |  ||   |    8    |     |   11    |  ||  |   14    |     |   17    |  ||  |   20    |     |   23    |  |");
        System.out.println("\t\t\t\t\t| |_________|     |_________|  ||   |_________|     |_________|  ||  |_________|     |_________|  ||  |_________|     |_________|  |");
        System.out.println("\t\t\t\t\t| |         |     |         |  ||   |         |     |         |  ||  |         |     |         |  ||  |         |     |         |  |");
        System.out.println("\t\t\t\t\t| |    3    |     |   4     |  ||   |    9    |     |   10    |  ||  |   15    |     |   16    |  ||  |   21    |     |   22    |  |");
        System.out.println("\t\t\t\t\t| |_________|     |_________|  ||   |_________|     |_________|  ||  |_________|     |_________|  ||  |_________|     |_________|  |");
        System.out.println("\t\t\t\t\t|                              ||                                ||                               ||                               |");
        System.out.println("\t\t\t\t\t|                              ||                                ||                               ||                               |");
        System.out.println("\t\t\t\t\t|__________________________________________________________________________________________________________________________________|\n");
		System.out.println(in.red+"\t\t\t\t\t			                              S E A T E R   				       											  ");
		System.out.println(in.redbr+"\t\t\t\t\t\t\t\t\t\t\t\t\t\tN O T E   :    At a time only 4 Seats can be Booked .");
		// System.out.print(in.green+"\n\n\t\t\tC H O O S E     T H E    S E A T     :"+in.magent)awh;
		// System.out.println(in.blue+"\nt\t\t\t  1 . S E A T E R 		    2 . S L E E P E R ");
		// String ss = in.sc.nextLine();
		// int stsl = Integer.parseInt(ss);
		// if(stsl==1)
		// {
		// 	for(int i=1;i<=passengers;i++)
		// 	{
		// 		System.out.println(in.yellow+"\t\t\t 1 . U P P E R 				2 . M I D D L E				3 . L O W E R ");
		// 		System.out.print(in.green+"\n\t\t\tC H O O S E     T H E    B E R T H   :"+in.magent);
		// 		String brt = in.sc.nextLine();
		// 		int br = Integer.parseInt(brt);
		// 	}
		// }
		// String seat = in.sc.nextLine();
		
	}

	int coach()
    {
        System.out.println(in.cyan);
        System.out.println("\t\t\t\t\t _________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t|  _____   _____   _____   _____   _____   _____   _____   _____   _____   _____   _____   _____   _____   _____   _____  |");
        System.out.println("\t\t\t\t\t| |     | |     | |     | |     | |     | |     | |     | |     | |     | |     | |     | |     | |     | |     | |     | |");
        System.out.println("\t\t\t\t\t| | S10 | |  S9 | |  S8 | |  S7 | |  S6 | |  S5 | |  S4 | |  S3 | |  S2 | |  S1 | | B3  | | B2  | | B1  | | A2  | | A1  | |");
        System.out.println("\t\t\t\t\t| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |_____| |");
        System.out.println("\t\t\t\t\t|_________________________________________________________________________________________________________________________|\n\n");

        System.out.print(in.green+"\t\t\t\t\tC H O O S E      T H E     C O A C H    :  "+in.magent);
        String ch = in.sc.nextLine();
        int comp =-1;
        for(int i=1;i<16;i++)
        {
            if(ch.equalsIgnoreCase(coach[i]))
            {
                comp=i;
                break;
            }
        }
        if(comp==-1)
        {
            System.out.println(in.red+"\t\t\t\t..........          Invalid Coach Selection          ...........");
            System.out.println(in.yellow+"\t\t\tDo you want to Re-select the Coach again ..");
            System.out.println(in.green+"\t\t1 . Yes ");
            System.out.print(in.red+"\t\t2 . No \n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
                return coach();
            else    
                return -1;
        }
        return comp;
    }

	int express()
    {
        System.out.println("\r\n" + //
				in.greenbr+in.yellow+"\t\t\t\t      Train Name  \t\t\t\t Starting Point \t\t\t          Destination\n" +in.reset+ //
				in.green+"\t\t\t\t_____________________________________________________________________________________________________________________\n\n"+
				in.cyan+"\r\n" +in.ital+ //
				"\t\t\t\t1 . Tirumala Express      \t\t           Hyderabad  \t\t\t----->                Tirupati\t \n\n" + //
				"\t\t\t\t2 . Vijaya Express        \t\t           Hyderabad  \t\t\t----->                Vijayawada\n\n" + //
				"\t\t\t\t3 . Basava Express        \t\t           Hyderabad  \t\t\t----->                Bangalore\n\n" + //
				"\t\t\t\t4 . Basha Express         \t\t           Hyderabad  \t\t\t----->                Mumbai\n\n" + //
				"\t\t\t\t5 . Vishakha Express      \t\t           Hyderabad  \t\t\t----->                Vizag\n\n" + //
				"\t\t\t\t6 . Uttar Express         \t\t           Hyderabad  \t\t\t----->                New Delhi\n\n" + //
				""+in.reset);
        System.out.print(in.yellow+"\t\t\t\t\tC H O O S E      T H E     T R A I N     :  "+in.magent);
        String tr = in.sc.nextLine();
        int train = Integer.parseInt(tr);
        if(train>=1 && train<=6)
            return train;
        else
        {
            System.out.println(in.red+"\t\t\t\t..........          Invalid Coach Selection          ...........");
            System.out.println(in.yellow+"\t\t\tDo you want to Re-select the Coach again ..");
            System.out.println(in.green+"\t\t1 . Yes ");
            System.out.print(in.red+"\t\t2 . No\n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
                return express();
            else    
                return -1;
        }
	}

   void dispaly()
    {
		System.out.println("                                                                                                                                                 \r\n" + //
				"\t\t\t\t                                                                                                                                                 \r\n" + //
				"\t\t\t\t  ,----..                                  ___                                                                                ___                \r\n" + //
				"\t\t\t\t /   /   \\                ,---.          ,--.'|_                                             ,-.----.                       ,--.'|_              \r\n" + //
				"\t\t\t\t|   :     :              /__./|          |  | :,'   __  ,-.                 ,---,            \\    /  \\    ,---.    __  ,-.  |  | :,'             \r\n" + //
				"\t\t\t\t.   |  ;. /         ,---.;  ; |          :  : ' : ,' ,'/ /|             ,-+-. /  | .--.--.   |   :    |  '   ,'\\ ,' ,'/ /|  :  : ' :  .--.--.    \r\n" + //
				"\t\t\t\t.   ; /--`         /___/ \\  | |        .;__,'  /  '  | |' | ,--.--.    ,--.'|'   |/  /    '  |   | .\\ : /   /   |'  | |' |.;__,'  /  /  /    '   \r\n" + //
				"\t\t\t\t;   | ;            \\   ;  \\ ' |        |  |   |   |  |   ,'/       \\  |   |  ,\"' |  :  /`./  .   : |: |.   ; ,. :|  |   ,'|  |   |  |  :  /`./   \r\n" + //
				"\t\t\t\t|   : |             \\   \\  \\: |        :__,'| :   '  :  / .--.  .-. | |   | /  | |  :  ;_    |   |  \\ :'   | |: :'  :  /  :__,'| :  |  :  ;_     \r\n" + //
				"\t\t\t\t.   | '___           ;   \\  ' .          '  : |__ |  | '   \\__\\/: . . |   | |  | |\\  \\    `. |   : .  |'   | .; :|  | '     '  : |__ \\  \\    `.  \r\n" + //
				"\t\t\t\t'   ; : .'|           \\   \\   '          |  | '.'|;  : |   ,\" .--.; | |   | |  |/  `----.   \\:     |`-'|   :    |;  : |     |  | '.'| `----.   \\ \r\n" + //
				"\t\t\t\t'   | '/  :            \\   `  ;          ;  :    ;|  , ;  /  /  ,.  | |   | |--'  /  /`--'  /:   : :    \\   \\  / |  , ;     ;  :    ;/  /`--'  / \r\n" + //
				"\t\t\t\t|   :    /              :   \\ |          |  ,   /  ---'  ;  :   .'   \\|   |/     '--'.     / |   | :     `----'   ---'      |  ,   /'--'.     /  \r\n" + //
				"\t\t\t\t \\   \\ .'                '---\"            ---`-'         |  ,     .-./'---'        `--'---'  `---'.|                         ---`-'   `--'---'   \r\n" + //
				"\t\t\t\t  `---`                                                   `--`---'                             `---`                                             \r\n" + //
				"\t\t\t\t                                                                                                                                                 ");
		in.sleep(1000);
	  
        System.out.print(in.green+"\n\n\n\t\t\t\t\t  Delhi   \t\t\t\t   _____   "+in.red+"            "+in.purple+"  . . . . . o o o o o\n");
        System.out.print(in.green+"\t\t\t\t\t\t\t\t\t\t  __|[_]|__"+in.red+" ___________"+in.purple+" _______    ____      o\n");
        System.out.print(in.green+"\t\t\t\t\t\t\t\t\t\t |[] [] []|"+in.red+" [] [] [] []"+in.purple+" [_____(__  ][]]_n_n__][.\n");
        System.out.print(in.green+"\t\t\t\t\t\t\t\t\t\t_|________|"+in.red+"_[_________]"+in.purple+"_[________]_|__|________)<\n");
        System.out.print("\t\t\t  Mumbai  \t\t"+in.green+"\t\t\t\t  oo    oo "+in.red+"'oo      oo "+in.purple+"' oo    oo 'oo 0000---oo\\_\n");
        System.out.print(in.whitebr+"\t\t\t\t\t\t\t\t\t\t");
		String part = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
		for(int i=0;i<part.length();i++)
		{
			System.out.print(part.charAt(i));
			in.sleep(25);
		}
		System.out.print("\n\t\t\t\t\t\t\t"+in.blue+in.ul+"Hyderabad"+in.rstul+"\n\n"+in.green);
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Vizag\n");
		System.out.print("\t\t\t\t\t\t\t\t\t\t Vijayawada\n");
		System.out.print("\t\t\t\t\t  Bengalore\n"+in.red);		
		System.out.print("\t\t\t\t\t\t\tTirupati\t\t\t\t"+in.blue+"__________    --->    Starting Point\n\n\n");
		in.sleep(1000);

	}

    void process()
    {
        dispaly();
		int exp = express();
		if(exp!=-1)
		{
			int comp = coach();
			if(comp!=-1)
			{
				seat_sleep();
				pass(exp,comp);
			}
			else	
				return;
		}
		else	
			return;
		System.out.println("\t\t\t\t\tDo you want to Book Train Tickets again : ");
		System.out.println("\t\t\t1 . Yes");
		System.out.println("\t\t\t2 . No");
		String ys = in.sc.nextLine();
		if(Integer.parseInt(ys)==1)
			process();
        // Transport.transport_bill+=train_bill;
		
    }
}







				// ticket printing
class ticket 
{

	void tkt_generate(String src , String Dest , String price, String trans)
	{
         LocalTime tm = LocalTime.now();
        String time = tm.toString();
        int hrs = Integer.parseInt(time.substring(0, 2));
        String ampm = (hrs>=12)?"PM":"AM";
        if(hrs>=13)
            hrs = hrs-12;
        time = Integer.toString(hrs)+time.substring(2,5)+" "+ampm;
		Date currentDate = new Date();
		String s = currentDate.toString();
		String date = in.green+s.substring(4,10)+" "+s.substring(24);
		// String time = in.green+s.substring(11, 16)+" IST";
		System.out.println();
		System.out.println();
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t ___________________________________________________ \n");
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t| %16s                             %9s "+in.blue+"|\n",date,time);
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|                                                 "+in.blue+"  |\n");
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|                    %11s                  "+in.blue+"  |\n",(in.magent+in.ul+"A M I G O S"+in.rstul));
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|                                                "+in.blue+"   |\n");
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|     "+in.magent+"   %-14s          T I C K E T    "+in.blue+"    |\n",trans);
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|                                                  "+in.blue+" |\n");
		// System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|         %10s :  %-20s    |\n","Passenger Name",username);
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|    "+in.yellow+" _________________________________________    "+in.blue+" |\n");
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|    "+in.yellow+"|                                         "+in.yellow+"|   "+in.blue+" |\n");
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|    "+in.yellow+"|    "+in.green+"Starting Point    :  %-16s"+in.yellow+"|   "+in.blue+" |\n",src);
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|    "+in.yellow+"|    "+in.red+"Destination Point :  %-16s"+in.yellow+"|   "+in.blue+" |\n",Dest);
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|    "+in.yellow+"|                                         "+in.yellow+"|   "+in.blue+" |\n");
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|    "+in.yellow+"|    Price             :  %8s        "+in.yellow+"|   "+in.blue+" |\n",price);
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|    "+in.yellow+"|_________________________________________"+in.yellow+"|   "+in.blue+" |\n");
		System.out.printf(in.blue+"\t\t\t\t\t\t\t\t|___________________________________________________|\n");	
        System.out.println(in.yellow+"\n\n\t\t\t\t\t\t\t\t\t\t H A P P Y     J O U R N E Y \n\n");	

	}



}




		// R a p i d o 

class rapido extends ticket implements tkt_book
{

	static String[] one = new String[]{"","HiTech City","Jubliee Hills","J N T U","K P H B","Balanagar","Moosapet","SR Nagar","Ameerpet","Panjagutta","Lakdi-ka-pul","Nampally","Sultan Bazar","Kachegudh"};//one
	static String[] two = new String[]{"","Raidurg","Cable Bridge","Madhapur","Borabanda","Erragadda","Chinthal","Jeedimetla","Kompally","Bolarum","Balaji Nagar","Secundrabad","Munirabad"};//two

	static String rapido_type ="bike";
	// cab bike auto selection

	static double price()
	{
		if(rapido_type.equalsIgnoreCase("Bike"))
			return 15;
		if(rapido_type.equalsIgnoreCase("Auto"))
			return 25;
		if(rapido_type.equalsIgnoreCase("Cab"))
			return 40;
		return 0;
	}
	
	public static void type_select()
	{

		String art1 = "  ______\n" +
						" /|_||_\\`.__\n" +
						"(   _    _ _\\\n" +
						"=`-(_)--(_)-'";
			
			String art2 = "            _\n" +
						"        D/_\n" +
						"        /(_`._,-.\n" +
						" _____(o) `--'(o)_____    \u001B[34m    ___\\_/________\\_/______";

		String[] lines1 = art1.split("\n");
		String[] lines2 = art2.split("\n");

		int maxLength = Math.max(lines1.length, lines2.length);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+in.blue+"         _______");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+in.blue+"        //  ||\\ \\");
		String[] auto = new String[]{"         _____//___||_\\ \\__ ","        )  _          _    \\"," |_/ \\________/ \\___|",""};
		for (int i = 0; i < maxLength; i++) 
		{
					String line1 = i < lines1.length ? lines1[i] : "";
					String line2 = i < lines2.length ? lines2[i] : "";
            	 			System.out.println("\t\t\t\t\t\t\t\t\t"+in.red+line1 + "    " + in.green+line2+in.blue+"   \t\t"+auto[i]); 
		}
        	System.out.println("\n\t\t\t\t\t\t\t\t           "+in.red+""+in.ul+"C A B"+in.rstul + "\t           " + in.green+in.ul+"B I K E"+in.rstul+"                       "+in.blue+in.ul+"A U T O"+in.rstul+in.reset);
		System.out.print("\t\t\t Choose the type of Vehicle : "+in.magent);
		String opt = in.sc.nextLine();
		String[] type = new String[]{"","Cab","bike","auto"};
		int k=10;
		for(int i=1;i<=3;i++)
		{
			if(opt.equalsIgnoreCase(type[i]))
			{
				rapido_type = type[i];
				k=0;
				break;
			}	
		}
		if(k==10)
		{
			System.out.println(in.red+"\t\t\t..........     Invalid Type Selection     ...........");
			System.out.println(in.yellow+"\t\tChoose Again.....");
			System.out.println(in.green+"\t\t1 . Yes");
			System.out.println(in.red+"\t\t2 . No");
			String ys = in.sc.nextLine();
			int ysi = Integer.parseInt(ys);
			if(ysi==1)
				rapido.type_select();
			else 
				return;
		}
		else
		{

			System.out.println("\n\n\n"+in.green);
			in.sleep(1000);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n","","",one[3],"","","","","","",two[12],"");in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n","",one[2],"",one[4],"","","","","","",two[11]);in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n",one[1],"","","",one[5],"","","","",two[10],"");in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n","","","","","",one[6],"","",two[9],"","");in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n","","","","","","",one[8],two[8],"","","");in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n","","","","","","",two[7],one[9],"","","");in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n","","","","","",two[6],"","",one[10],"",one[12]);in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n",two[1],"","","",two[5],"","","","",one[11],"");in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n","",two[2],"",two[4],"","","","","","","");in.sleep(20);
			System.out.printf("\t%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n\n\n\n","","",two[3],"","","","","","","","");in.sleep(20);
			
		}
	}
	

	public void display()
	{
		System.out.println(in.cyan);
		System.out.println("\t\t\t\t\t\t\t\t _______           __        ______    _____   ________        ____   ");
		System.out.println("\t\t\t\t\t\t\t\t|_   __ \\         /  \\      |_   __ \\ |_   _| |_   ___ \\     .'    '.");
		System.out.println("\t\t\t\t\t\t\t\t  | |__) |       / /\\ \\       | |__) |  | |     | |   \\ \\   /  .--.  \\");
		System.out.println("\t\t\t\t\t\t\t\t  |  __ /       / ____ \\      |  ___/   | |     | |    | |  | |    | |");
		System.out.println("\t\t\t\t\t\t\t\t _| |  \\ \\_   _/ /    \\ \\_   _|  |_    _| |_   _| |___.' /  \\  \'--'  /");
		System.out.println("\t\t\t\t\t\t\t\t|____| |___| |____|  |____| |_____|   |_____| |________.'    '.____.' ");
       		System.out.println("");
		rapido.type_select();

	}

	public String source()
	{
		System.out.println(in.purple);
		System.out.println();
		System.out.println();
		System.out.print("\t\t\t\t\t\tEnter the Starting point        :   ");
		String src = in.sc.nextLine();
		
		return src;
	}

	public String Destination()
	{
		System.out.print(in.magent);
		System.out.print("\t\t\t\t\t\tEnter Your Destination Point    :   ");
		String Dest = in.sc.nextLine();
		return Dest;
	}

	public void billing(String src , String Dest)
	{
		String st ="x",en="y";
		int start = 0 , end=15;
		double bill = 0;
		for(int i=1;i<=12;i++)
		{
			if(src.equalsIgnoreCase(one[i]))
			{
				src=one[i];
				start=i;
				st="blue";
			}
			if(Dest.equalsIgnoreCase(one[i]))
			{
				Dest=one[i];
				end=i;
				en="blue";
			}	
		}
		for(int i=1;i<=12;i++)
		{
			if(src.equalsIgnoreCase(two[i]))
			{
				src=two[i];
				start=i;
				st="green";
			}
			if(Dest.equalsIgnoreCase(two[i]))
			{
				Dest=two[i];
				end=i;
				en="green";
			}	
		}
		if(st=="x" || en=="y")
		{
				System.out.println(in.red+"\n\t\t\t..........     Invalid Starting or Destination Point     ...........");
				System.out.println(in.yellow+"\n\t\tDo You want to choose again.....     \n");
				System.out.println(in.green+"\t\t1 . Yes");
				System.out.println(in.red+"\t\t2 . No");
				System.out.print("\t\t"+in.magent);
				String ys = in.sc.nextLine();
				if(Integer.parseInt(ys)==1)
				{
					this.display();
					this.billing(this.source(),this.Destination());
				}
				return;
		}
		else if((st=="blue" && en=="blue") || (st=="grenn" && en=="green"))
		{
			bill += Math.abs(start - end) *rapido.price();
		}
		else	
		{
			if((start >7 && end>7) || (start <=7 && end<=7 ))
			{
				if(start==end)
					bill+=2*rapido.price();
				else	
					bill+= Math.abs(start-end)*2*rapido.price();
			}
			else
				bill+= Math.abs(start-end)*2*rapido.price();

		}
        System.out.println(in.blue+"\n\t\t\t\t\t Your Bill  :  "+in.green+bill);
        in.sleep(1000);
        System.out.print(in.white+"\t\t\t\t\t Please Wait you're directing to Billing ");
        in.loading();
        System.out.println();
		// ticket generate
        if(Amigos.payment_obj.bank_select(bill))
        {
            System.out.println();
            System.out.println(in.white+"\n\n\n\t\t\t\t\tYour Rapido Ticket ");
		    this.tkt_generate(src, Dest, Double.toString(bill), "R A P I D O");

        }
        // Transport.transport_bill+=bill;
	}	

}




		// 	M E T R O  

class metro extends ticket implements tkt_book
{

	//  dispaly
	public void display()
	{
		System.out.println();
			String[] red = new String[]{"KPHB Colony","Kukatpally","Balanagar","Bharat Nagar","Erragadda","SR Nagar","Ameerpet","Panjagutta","Lakdi-ka-pul","Assembly","Nampally","Gandhi Bhavan" , "Osmania","MG Bus Station"};
		for(int i=0;i<14;i++)
		{
			if(i==6)
				continue;
			red[i]=in.red+red[i];
		}
		red[6]=in.ul+red[6]+in.rstul;
		red[13]=in.ul+red[13]+in.rstul;

		String[] blue = new String[]{"Hi Tech City","Durgam Cheruvu","Madhapur","Jublie Hills","YusafGuda","Begumpet","Prakash Nagar","Rasoolpura","Paradise","Secunderabad"};
		for(int i=0;i<10;i++)
			blue[i]=in.blue+blue[i];
		blue[9]=in.ul+blue[9]+in.rstul;
		String[] green = new String[]{"Sultan Bazar","Narayanguda","Chikkadpally","Musheerabad","Gandhi Hospital"};
		for(int i=0;i<=4;i++)
			green[i]=in.green+green[i];
		//System.out.print(in.red);

		System.out.println(in.purple);
		in.sleep(500);
		System.out.println("\t\t\t\t\t\t\t\t ____    ____   _________   _________  _______       ____   ");
		System.out.println("\t\t\t\t\t\t\t\t|_   \\  /   _| |_   ___  | |  _   _  | |_  __ \\    .'     \\");
		System.out.println("\t\t\t\t\t\t\t\t  |   \\/   |     | |_  \\_| |_/ | | \\_|  | |__) |  /  .--.  \\");
		System.out.println("\t\t\t\t\t\t\t\t  | |\\  /| |     |  _|  _      | |      |  __ /   | |    | |");
		System.out.println("\t\t\t\t\t\t\t\t _| |_\\/_| |_   _| |___/ |    _| |_    _| |  \\ \\_ \\  \"--'  /");
		System.out.println("\t\t\t\t\t\t\t\t|_____||_____| |_________|   |_____|  |____| |___| \\.____.' \n\n");

		in.sleep(500);
		String wel =in.green+ "\t\t\t\t\t............      "+in.yellow+" W E L C O M E     T O      H Y D E R A B A D     M E T R O  "+in.green+"    ...........";
		for(int i=0;i<wel.length();i++)
		{
			if(wel.charAt(i)==' ' || wel.charAt(i)=='.')
				in.sleep(30);
			else
				in.sleep(100);
			System.out.print(wel.charAt(i));
		}
		String jun = in.red+red[6].substring(0,4)+in.blue+red[6].substring(4);
		System.out.println("\n\n");
		in.sleep(300);
		System.out.printf("%12s\n",red[0]);in.sleep(30);
		System.out.printf("%12s %12s\12\n","",red[1]);in.sleep(30);
		System.out.printf("%12s %12s %12s\12\n"," "," ",red[2]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s\n\n"," "," ","",red[3]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s\n\n"," "," ",blue[0],"",red[4]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s %12s\n\n"," "," ",blue[1],"","",red[5]);in.sleep(30);
		System.out.printf("%12s %12s %12s %5s %12s %5s %12s %7s %-12s %6s %12s %6s %12s %6s %12s %6s %12s %6s %12s \n\n\n"," ","",blue[2],"",blue[3],"",blue[4],"",jun,"",blue[5],"",blue[6],"",blue[7],"",blue[8],"",blue[9]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s %12s %-12s %75s %12s \n\n\n"," ","","","","","",red[7],"",green[4]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s %12s %-12s %60s %12s \n\n\n"," ","","","","","",red[8],"",green[3]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s %12s %-12s %47s %12s \n\n\n"," ","","","","","",red[9],"",green[2]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s %12s %-12s %12s %21s %12s \n\n\n"," ","","","","","",red[10],"","",green[1]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s %12s %-12s %12s %10s %12s \n\n\n"," ","","","","","",red[11],"","",green[0]);in.sleep(30);
		System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s %-15s \n\n"," ","","","","","",red[12],"",red[13]);in.sleep(30);
		System.out.println(in.purple);
		System.out.println("\t\t__________    --->   Junctions");
		in.sleep(300);

	}

	// source
	public String source()
	{
		System.out.println(in.purple);
		System.out.println();
		System.out.println();
		System.out.print("\t\t\t\t\t\tEnter the Starting point        :   ");
		String src = in.sc.nextLine();
		return src;
	}

	//destination
	public String Destination()
	{
		System.out.print(in.magent);
		System.out.print("\t\t\t\t\t\tEnter Your Destination Point    :   ");
		String Dest = in.sc.nextLine();
		return Dest;
	}

	// billing
	public void billing(String src , String Dest)
	{
		String  st = "x" , en = "y";
		int start = 0, end =19;
		double bill = 0;
		String[] red = new String[]{"","KPHB Colony","Kukatpally","Balanagar","Bharat Nagar","Erragadda","SR Nagar","Ameerpet","Panjagutta","Lakdi-ka-pul","Assembly","Nampally","Gandhi Bhavan" , "Osmania","MG Bus Station"};
		String[] blue = new String[]{"","Hi Tech City","Durgam Cheruvu","Madhapur","Jublie Hills","YusafGuda","Begumpet","Prakash Nagar","Rasoolpura","Paradise","Secunderabad"};
		String[] green = new String[]{"","Sultan Bazar","Narayanguda","Chikkadpally","Musheerabad","Gandhi Hospital"};
		
		//checking for lines
		for(int i=1;i<=14;i++)
		{
			if(src.equalsIgnoreCase(red[i]))
			{
				start = i;
				st = "red";
				src = red[i];
			}
			if(Dest.equalsIgnoreCase(red[i]))
			{
				end = i;
				en = "red";
				Dest = red[i];
			}
		}

		for(int i=1;i<=5;i++)
		{
			if(src.equalsIgnoreCase(green[i]))
			{
				start = i;
				st = "green";
				src = green[i];
			}
				
			if(Dest.equalsIgnoreCase(green[i]))
			{
				end = i;
				en = "green";
				Dest = green[i];
			}	
		}
		
		for(int i=1;i<=10;i++)
		{
			if(src.equalsIgnoreCase(blue[i]))
			{
				start = i;
				st = "blue";
				src = blue[i];
			}
			if(Dest.equalsIgnoreCase(blue[i]))
			{
				end = i;
				en = "blue";
				Dest = blue[i];
			}	
		}

		//billing 
		if( (st=="red" && en=="red") || (st=="green" && en=="green") || (st=="blue" && en=="blue") )
		{
			bill += (double) (Math.abs(start-end)*10);
			//System.out.print("equal");
		}
		else if(st=="blue" && en=="red")
		{
            if(end>7)
                end-=7;
            else
                end=7-end;
            if(start>5)
                start-=5;
            else
                start=6-start;
			bill += (double) (Math.abs((start + end)*10));
		}
		else if(st == "blue" && en == "green")
		{
			if(start<=5 && end <=3)
            {
				start=(6-start)+8;
                bill+=(double) (Math.abs(start+end)*10);
            }
			else if(start<=5 && end>3)
            {
                start=11-start;
                end=6-end;
                bill+=(double) (Math.abs(start+end)*10);

            }
            else
            {
                start=11-start;
                end=6-end;
                bill+=(double) (Math.abs(start+end)*10);
            }
		}
		else if(st=="green" && en=="red")
		{
            if(start>3 && end<=7)
            {
                start=  6-start+5; 
                end = 8-end;
            }
            else 
            {
                end=15-end;
                bill+=(double) (Math.abs(start+end)*10);
                
            }
		}
		else if(st=="green" && en=="blue")
		{
			if(start<=3 && end<=5)
            {
                start = start+8;
                end=6-end;
                bill+=(double) (Math.abs(start+end)*10);
            }
            else
            {
                start = 6-start;
                end=11-end;
                bill+=(double) (Math.abs(start+end)*10);

            }
		}
		else if(st=="red" && en=="blue")
		{
			if(start >=7)
                start=start-7;
            else
                start = 7-start;
            if(end<=5)
                end=6-end;
            else
                end=end-5;
            bill+=(double) (Math.abs(start+end)*10);
		}
		else if(st=="red" && en=="green")
		{
            if(start<=7 && end>3)
            {
                start=7-start+5;
                end = 6-end;
			    bill += (double) (Math.abs(start+end)*10);
            }
            else
            {
                start=15-start;
			    bill += (double) (Math.abs(start+end)*10);
            }
		}
		else if(st=="x" || en == "y")
		{
			System.out.println(in.red+"\n\t\t\t..........     Invalid Starting Point or Destination     ..........");
			System.out.println(in.yellow+"\t\t\tDo You want choose Again......\n");
			System.out.println(in.green+"\t\t1 . Yes ");
			System.out.println(in.red+"\t\t2 . No");
			String ys = in.sc.nextLine();
			if(Integer.parseInt(ys)==1)
			{
				this.display();
				this.billing(this.source(),this.Destination());
			}
			return;
		}
        System.out.println(in.blue+"\n\t\t\t\t\t Your Bill  :  "+in.green+bill);
        in.sleep(1000);
        System.out.print(in.white+"\t\t\t\t\t Please Wait you're directing to Billing ");
        in.loading();
        System.out.println();
        if(Amigos.payment_obj.bank_select(bill))
        {
            System.out.println(in.white+"\n\n\n\t\t\t\t\t\t\tYour Metro Ticket : ");
            this.tkt_generate(src, Dest, Double.toString(bill), "M E T R O");
        }
        else
        {
            System.out.println(in.red+"\t\t\t\t\t............            Booking Cancelled               ............");
            in.sleep(1000);
        }
        // Transport.transport_bill+=bill;
	}

}



			//   T R A N S P O R T 

class Transport
{

    static double transport_bill = 0.0;
	static 	metro metro_obj = new metro();
	static rapido rapido_obj = new rapido();
	static bus bus_obj = new bus();
	static train train_obj = new train();
	static void booking(tkt_book ob)
	{
		ob.display();
		ob.billing(ob.source(),ob.Destination());

	}

	//	Interface 
	void transport_menu()
	{
		// System.out.println(in.bwhite);
		in.sleep(500);
		System.out.println("\n\n\t\t T R A N S P O R T  : \n\n");
		System.out.println("\t				  "  + "\t		    "+in.blue+  "\t            _____________          "+in.purple+"\n\t\t"+in.reset+
			   	   "				  "+"\t		    "+ in.blue+       		"\t /   (AMIGO CVC)   \\      "+in.purple+"\n\t\t"+in.reset+
			   	   "				  "+"\t		    "+ in.blue+       		"\t| _____  ___  _____ |      "+in.purple+"\t               [\\\n\t\t"+in.reset+
			   	   "				  "+"\t		    "+in.blue+	      		"\t||     ||   ||     ||      "+in.purple+"\t          .----' `-----.\n\t\t"+in.reset+
			   	   "				  "+"\t		    "+in.blue+	      		"\t| ----- |   | ----- |      "+in.purple+"\t         //^^^^;;^^^^^^`\\\n\t\t"+in.reset+
			   	   "				  "+"\t		    "+in.blue+       		"\t|       |(M)|       |      "+in.purple+"\t   _____//_____||_____()_\\________\n\t\t"+in.reset+
				    in.red+	           " _______________________      "+in.green+"\t 		      "+in.blue+"\t\t|__00__==121==__00__|      "+in.purple+"\t  /121    :      : ___              `\\\n\t\t"+in.reset+
       				in.red+            "|   |    |    |    | |  \\    "+in.green+"\t			    "+in.blue+"\t   \\ |= |_[] |=| /        "+in.purple+"\t |>   ____;      ;  |/\"><|   ____   _<)\n\t\t"+in.reset+
        			in.red+            "|___|____|____|____|_|___\\   "+in.green+"\t ___ |[]|_n__n_I_c      "+in.blue+"\t    ((         ))      "   +in.purple+"\t\t{____/    \\_________________/    \\____}\n\t\t"+in.reset+
        			in.red+            "| cv corp          | |    \\  "+in.green+"\t |___||__|###|____}     "+in.blue+"\t   //           \\\\    "  +in.purple+"\t\t     \\ '' /                 \\ '' /\n\t\t"+in.reset+
        			in.red+            "`--(o)(o)------------(o)--'   "+in.green+"\t O-O--O-O+++--O-O       "+in.blue+"\t  //             \\\\  "   +in.purple+"\t\t      '--'                   '--'\n\t\t"+in.reset);

		System.out.println();
		System.out.print("\t\t\t"+in.red+"1 . "+in.ul+"B U S"+in.rstul+in.reset);
		System.out.print("\t\t   "+in.green+"2 . "+in.ul+"T R A I N"+in.rstul+in.reset);
		System.out.print("\t\t   "+in.blue+"3 . "+in.ul+"M E T R O"+in.rstul+in.reset);
		System.out.print("\t\t\t  "+in.purple+"4 . "+in.ul+"R A P I D O"+in.rstul+in.reset);

		System.out.print(in.cyan+"\n\n\n\t\tC H O O S E    T H E    T Y P E    O F    T R A N S P O R T    Y O U    N E E D : "+in.magent);
		String type = in.sc.nextLine();
		if(type.equalsIgnoreCase("bus") || type.equals("1"))
		{
            in.sleep(100);
            in.clear();
			bus_obj.process();
		}
		else if(type.equalsIgnoreCase("train") ||  type.equals("2"))
		{
            in.sleep(100);
            in.clear();
			train_obj.process();
		}
		else if(type.equalsIgnoreCase("metro") || type.equals("3"))
		{
            in.sleep(100);
            in.clear();
            booking(metro_obj);
		}
		else if(type.equalsIgnoreCase("rapido") || type.equals("4"))
		{
            in.sleep(100);
            in.clear();
			booking(rapido_obj);
		}
		else
		{
			in.sleep(300);
			System.out.println(in.red+"\n\n\t\t\t\t...........     Invalid Selection      ............");
			System.out.println(in.yellow+"\t\t\tDo You want to Reselect.");
			System.out.println(in.green + "\t\t1 . Yes");
			System.out.println(in.red+"\t\tPress any other number to Exit");
			System.out.print("\t\t"+in.magent);
			String ys = in.sc.nextLine() ;
			if(Integer.parseInt(ys)==1)
			{
				transport_menu();
			}
			return;
		}
		System.out.println("\n\n\t\t\tDo You want to Book any other tickets   --->   Bus or Train or Metro or Rapido  : ");
		System.out.println(in.green + "\t\t1 . Yes");
        System.out.print(in.red+"\t\t2 . No\n\t\t"+in.magent);
		String ys = in.sc.nextLine() ;
		if(Integer.parseInt(ys)==1)
			this.transport_menu();
		// else if(Integer.parseInt(ys)==2)

            

	}
}

						//      f  o   o  d 
class items
{
	static int st_cn = 0;
	static int ds_cn = 0;
	void billing(ArrayList<String> item , double price){}
	void hotel_billing()
	{}


	void nonveg(int selectitem , int quantity)
	{
		double[] cost = new double[]{0,1,299,149,299,399}; 
	
		String[] items = new String[]{"","Chicken Biryani",
						   "Mutton Biryani",
						   "Egg Biryani",
						   "Chicken Mandi",
						   "Mutton Mandi                     "};
		
		double price = cost[selectitem]*quantity;
		ArrayList<String> item = new ArrayList<>();
		item.add(items[selectitem]);//item
		item.add(Integer.toString(quantity));//quantity
		item.add(Double.toString(cost[selectitem]));//single item price
		item.add(Double.toString(cost[selectitem]*quantity));//total=quantity*price;
		this.billing(item,price);
	}
	void veg(int selectitem , int quantity)
	{
		
            double[] cost = new double[]{0,209,179,109,99,169};

          	String[] items =new String[]{"","Kaju Biryani",
						  "Veg Biryani",
						  "Panner Buttermasala",
						  "Veg manchurian",
						  "Veg fried Rice"};

          	double price = cost[selectitem]*quantity;
          	ArrayList<String> item = new ArrayList<>();
		item.add(items[selectitem]);//item
		item.add(Integer.toString(quantity));//quantity
		item.add(Double.toString(cost[selectitem]));//single item price
		item.add(Double.toString(cost[selectitem]*quantity));//total=quantity*price;
		this.billing(item,price);
          	     
	}
	void starters(int selectitem , int quantity)
	{
		 double[] cost = new double[]{0,119,299,179,149,399};
          	String[] items =new String[]{"","chicken lollipops",
						  "Pizza",
						  "Chillichicken",
						  "Chicken 65",
						  "Chicken wings"};

          	double price = cost[selectitem]*quantity;
ArrayList<String> item = new ArrayList<>();
		item.add(items[selectitem]);//item
		item.add(Integer.toString(quantity));//quantity
		item.add(Double.toString(cost[selectitem]));//single item price
		item.add(Double.toString(cost[selectitem]*quantity));//total=quantity*price;
		this.billing(item,price);
	}
	void desserts(int selectitems , int quantity)
	{
		double[] cost = new double[]{0,99,179,59,189,279};

          	String[] items =new String[]{"","Ice cream",
                                               "Rasamalai",
                                               "Fruit salad",
                                               "Sizzler icecream",
                                               "Chocolate cake"};

          	double price = cost[selectitems]*quantity;
		ArrayList<String> item = new ArrayList<>();
		item.add(items[selectitems]);//item
		item.add(Integer.toString(quantity));//quantity
		item.add(Double.toString(cost[selectitems]));//single item price
		item.add(Double.toString(cost[selectitems]*quantity));//total=quantity*price;
		this.billing(item,price);

	}
	void starters_menu()
	{
		int k=1;
		if(items.st_cn==0)
		{
			items.st_cn++;
			System.out.println(in.yellow+"\t\t\t\t\t\t\tDo You  Want to Order Starters :  ");
			System.out.println(in.green+"\t\t\t\t\t\t1 . Yes");
			System.out.println(in.red+"\t\t\t\t\t\t2 . No");
			System.out.print("\t\t\t\t\t\t"+in.magent);
			String ys = in.sc.nextLine();
			k = Integer.parseInt(ys);
		}
		if(k!=1)
			return;
			System.out.println(in.green+"\t\t\t\t\t\t\t            _                    _                       \r\n" + //
			"\t\t\t\t\t\t\t           | |                  | |                      \r\n" + //
			"\t\t\t\t\t\t\t      ___  | |_    __ _   _ __  | |_    ___   _ __   ___ \r\n" + //
			"\t\t\t\t\t\t\t     / __| | __|  / _` | | '__| | __|  / _ \\ | '__| / __|\r\n" + //
			"\t\t\t\t\t\t\t     \\__ \\ | |_  | (_| | | |    | |_  |  __/ | |    \\__ \\\r\n" + //
			"\t\t\t\t\t\t\t     |___/  \\__|  \\__,_| |_|     \\__|  \\___| |_|    |___/\r\n" + //
			"\t\t\t\t\t\t\t                                                         \r\n" + //
			"\t\t\t\t\t\t\t                                                         ");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t    **********  S T A R T E R S ********* \n"+in.reset);
  System.out.println(in.magent+"\t\t\t\t\t\t\t\t1. Chicken Lollipops                  119/-\n");
		System.out.println("\t\t\t\t\t\t\t\t2. Pizza	                      299/-\n");
		System.out.println("\t\t\t\t\t\t\t\t3. Chilli Chicken                     179/-\n");
		System.out.println("\t\t\t\t\t\t\t\t4. Chicken 65                         149/-\n");
		  System.out.println("\t\t\t\t\t\t\t\t5. Chicken Wings                      399/-\n"+in.reset);
		System.out.println();
		System.out.print(in.yellow+"\t\t\t\t\t\tSelect the item : "+in.red);
		String item =in.sc.nextLine();
		System.out.print(in.yellow+"\n\t\t\t\t\t\tEnter the quantity : "+in.red);
		String quan =in.sc.nextLine();
		this.starters(Integer.parseInt(item),Integer.parseInt(quan));
		System.out.println();
		System.out.print(in.green+"\t\t\t\t\t\t\t\t\t1 TO ORDER AGAIN \n\t\t\t\t\t\t\t\t\tPRESS ANY TO CONTINUE\n\t\t\t\t\t\t\t\t\t\t"+in.reset);
		String ar = in.sc.nextLine();
		if(Integer.parseInt(ar)==1)
		{
			starters_menu();
		}
			
		
	}
	void nonveg_menu()
	{
		System.out.println("\t\t\t\t\t\t\t\t                                                   \r\n" + //
		"\t\t\t\t\t\t\t\t                                                   \r\n" + //
		"\t\t\t\t\t\t\t\t _ __     ___    _ __       __   __   ___    __ _  \r\n" + //
		"\t\t\t\t\t\t\t\t| '_ \\   / _ \\  | '_ \\      \\ \\ / /  / _ \\  / _` | \r\n" + //
		"\t\t\t\t\t\t\t\t| | | | | (_) | | | | |      \\ V /  |  __/ | (_| | \r\n" + //
		"\t\t\t\t\t\t\t\t|_| |_|  \\___/  |_| |_|       \\_/    \\___|  \\__, | \r\n" + //
		"\t\t\t\t\t\t\t\t                                             __/ | \r\n" + //
		"\t\t\t\t\t\t\t\t                                            |___/ ");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t**********  N O N - V E G      I T E M S  *********\n"+in.reset);
		       System.out.println(in.blink+in.red+"\t\t\t\t\t\t\t\t     1 . Chicken Biryani                  1/-      (Today'special) \n"+in.reset);
		               System.out.println(in.cyan+"\t\t\t\t\t\t\t\t     2 . Mutton Biryani                  299/-   \n");
		                     System.out.println("\t\t\t\t\t\t\t\t     3 . Egg Biryani                     149/-   \n");
		                     System.out.println("\t\t\t\t\t\t\t\t     4 . Chicken Mandi                   299/-   \n");
	                           System.out.println("\t\t\t\t\t\t\t\t     5 . Mutton Mandi                    399/-   \n"+in.reset);
		       System.out.println();
			System.out.print(in.yellow+"\t\t\t\t\t\tSelect the item : "+in.red);
			String item =in.sc.nextLine();
			System.out.print(in.yellow+"\n\t\t\t\t\t\tEnter the quantity : "+in.red);
			String quan =in.sc.nextLine();
			System.out.println();
			this.nonveg(Integer.parseInt(item),Integer.parseInt(quan));
			
	}				

	void veg_menu()
	{
		System.out.println("\t\t\t\t\t\t\t\t\t__   __   ___    __ _  \r\n" + //
		"\t\t\t\t\t\t\t\t\t\\ \\ / /  / _ \\  / _` | \r\n" + //
		"\t\t\t\t\t\t\t\t\t \\ V /  |  __/ | (_| | \r\n" + //
		"\t\t\t\t\t\t\t\t\t  \\_/    \\___|  \\__, | \r\n" + //
		"\t\t\t\t\t\t\t\t\t                 __/ | \r\n" + //
		"\t\t\t\t\t\t\t\t\t                |___/  \r\n" + //
		"\t\t\t\t\t\t\t\t\t                       ");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t    *********  V E G    I T E M S  ********\n"+in.reset);
     System.out.println(in.green+"\t\t\t\t\t\t\t\t1. Kaju Biryani                          209/-\n");
			System.out.println("\t\t\t\t\t\t\t\t2. Veg Biryani                           179/-\n");
			System.out.println("\t\t\t\t\t\t\t\t3. Panner Butter Masala                  109/-\n");
			System.out.println("\t\t\t\t\t\t\t\t4. Veg Manchurian                         99/-\n");
		 	  System.out.println("\t\t\t\t\t\t\t\t5. Veg Fried Rice                        169/-\n"+in.reset);
		       System.out.println();
			System.out.print(in.yellow+"\t\t\t\t\t\tSelect the item : "+in.red);
			String item = in.sc.nextLine();
			System.out.print(in.yellow+"\n\t\t\t\t\t\tEnter the quantity : "+in.red);
			String quan = in.sc.nextLine();
			System.out.println();
			this.veg(Integer.parseInt(item),Integer.parseInt(quan));

	}
	void items_menu()
     	{
	      System.out.println("\n\n\t\t\t\t\t\t\t* * * * * * * * *        WELCOME TO THE FOOD ITEMS      * * * * * * * * *");
	      System.out.println();
	    System.out.println(in.blink+in.yellow+"\t\t\t\t\t\t\t\tPlease Choose the Option  :  "+in.reset);
        System.out.println("\n\t\t\t\t\t\t1 VEG  \n\t\t\t\t\t\t2 NON-VEG ");
		System.out.print("\t\t\t\t\t\t"+in.magent);
         String food=in.sc.nextLine();
	     int fd  = Integer.parseInt(food);
        if(fd==1)
	     {
			while(true)
			{
				this.veg_menu();
				System.out.println(in.yellow+"\t\t\t\t\t\t\tDO YOU WANT TO ORDER ANY NON-VEG ITEMS : "+in.reset);
				System.out.println("\t\t\t\t\t\t1 . Yes");
				System.out.println("\t\t\t\t\t\t2 . No");
				System.out.println("\t\t\t\t\t\t3 . Order Again");
				System.out.print("\t\t\t\t\t\t"+in.magent);

				String ys = in.sc.nextLine();
				if(Integer.parseInt(ys)==1)
				{
					this.nonveg_menu();
					break;
				}
				else if(Integer.parseInt(ys)==2)
				{
					return;
				}
				else if(Integer.parseInt(ys)==3)
				{
					this.veg_menu();
					break;
				}
				else
				{
					System.out.println(in.redbri+"\t\t\t\t\t...........       Invalid Input       .............");
					System.out.println(in.yellow+"\t\t\t\tDo You want to Re-Select : ");
					System.out.println(in.green+"\t\t\t1 . Yes");
					System.out.println(in.red+"\t\t\t2 . No");
					String ys1 = in.sc.nextLine();
					int n1 = Integer.parseInt(ys1);
					if(n1==1)
						continue;
					break;
				}
			}
		      
	    }
        else if(fd==2)
	    {
			while(true)
			{
				this.nonveg_menu();
				System.out.println(in.yellow+"\t\t\t\t\t\t\tDo YOU WANT TO ORDER ANY VEG ITEMS : "+in.reset);
				System.out.println(in.green+"\t\t\t\t\t\t1 . Yes");
				System.out.println(in.red+"\t\t\t\t\t\t2 . No");
				System.out.println(in.blue+"\t\t\t\t\t\t3 . Again order");
				System.out.print("\t\t\t\t\t\t"+in.magent);
				String ys = in.sc.nextLine();
				if(Integer.parseInt(ys)==1)
				{
					this.veg_menu();
					break;
				}
				else if(Integer.parseInt(ys)==2)
				{
					return;
				}
				else if(Integer.parseInt(ys)==3)
				{
					this.nonveg_menu();
					break;
				}
				else
				{
					System.out.println(in.redbri+"\t\t\t\t\t...........       Invalid Input       .............");
					System.out.println(in.yellow+"\t\t\t\tDo You want to Re-Select : ");
					System.out.println(in.green+"\t\t\t1 . Yes");
					System.out.println(in.red+"\t\t\t2 . No");
					String ys1 = in.sc.nextLine();
					int n1 = Integer.parseInt(ys1);
					if(n1==1)
						continue;
					break;
				}
			}
	     }
      }
	void desserts_menu()
	{
		int k =1;
		if(items.ds_cn==0)
		{
			items.ds_cn++;
			System.out.println(in.yellow+"\t\t\t\t\t\t\tDo You  Want to Order Desserts :  ");
			System.out.println(in.green+"\t\t\t\t\t\t1 . Yes");
			System.out.println(in.red+"\t\t\t\t\t\t2 . No");
			System.out.print("\t\t\t\t\t\t"+in.magent);
			String ys = in.sc.nextLine();
			k = Integer.parseInt(ys);
			if(k>2)
			{
				System.out.println("\t\t\t\t\t...............              Invalid Input             .............");
				System.out.println("\t\t\t\tDo you want to Re-Select : ");
				System.out.println("\t\t\t1 . Yes ");
				System.out.println("\t\t\t2 . No");
				String ys1 = in.sc.nextLine();
				
			}
		}
		if(k!=1)
			return;
		System.out.println("\t\t\t\t\t\t\t\t______                                    _          \r\n" + //
				"\t\t\t\t\t\t\t\t|  _  \\                                  | |         \r\n" + //
				"\t\t\t\t\t\t\t\t| | | |   ___   ___   ___    ___   _ __  | |_   ___  \r\n" + //
				"\t\t\t\t\t\t\t\t| | | |  / _ \\ / __| / __|  / _ \\ | '__| | __| / __| \r\n" + //
				"\t\t\t\t\t\t\t\t| |/ /  |  __/ \\__ \\ \\__ \\ |  __/ | |    | |_  \\__ \\ \r\n" + //
				"\t\t\t\t\t\t\t\t|___/    \\___| |___/ |___/  \\___| |_|     \\__| |___/ \r\n" + //
				"\t\t\t\t\t\t\t\t                                                     \r\n" + //
				"\t\t\t\t\t\t\t\t                                                    ");
		System.out.println("\t\t\t\t\t\t\t\t      *********  D E S S E R T S  *********"+in.reset);
		System.out.println();
   System.out.println(in.red+"\t\t\t\t\t\t\t\t    1. Ice Cream		          99/-\n"); 
		System.out.println("\t\t\t\t\t\t\t\t    2. Rasamalai                         179/-\n");
		System.out.println("\t\t\t\t\t\t\t\t    3. Fruit Salad                        59/-\n");
		System.out.println("\t\t\t\t\t\t\t\t    4. Sizzler Icecream                  189/-\n");
		  System.out.println("\t\t\t\t\t\t\t\t    5. Chocolate Cake                    279/-\n"+in.reset);
		System.out.println();
		System.out.print(in.yellow+"\t\t\t\t\t\tSelect the item : "+in.green);
		String item = in.sc.nextLine();
		System.out.print(in.yellow+"\n\t\t\t\t\t\tEnter the quantity : "+in.green);
		String quan = in.sc.nextLine();
		this.desserts(Integer.parseInt(item),Integer.parseInt(quan));
		System.out.println();
		System.out.print(in.blue+"\t\t\t\t\t\t\t\t\t1 TO ORDER AGIN\n\t\t\t\t\t\t\t\t\tPRESS ANY TO CONTINUE\n\t\t\t\t\t\t\t\t\t\t"+in.reset);
		String ap = in.sc.nextLine();
		if(Integer.parseInt(ap)==1)
		{
			desserts_menu();
		}
	}

}
class meghanarestaurent extends items
{
	static ArrayList<ArrayList<String>> list = new  ArrayList<ArrayList<String>>();

      String bill="";
      double total = 0;
	  
	//@Override
      void billing(ArrayList<String> item , double price)
	{
		for(int i=0;i<list.size();i++)
		{
			if((list.get(i).get(0)).equals(item.get(0)))
			{
				int new_quant = Integer.parseInt(list.get(i).get(1))+Integer.parseInt(item.get(1));
				double new_total = Double.parseDouble(list.get(i).get(3))+Double.parseDouble(item.get(3));
				list.get(i).set(1,Integer.toString(new_quant));
				list.get(i).set(3,Double.toString(Double.parseDouble(list.get(i).get(3))+new_total));
				this.total+=price;
				return;
			}
		}
		list.add(item);
		this.total+=price;
	}

	void meghanadisplay()
	{


	System.out.println(in.blink+in.red+"\t\t\t\t __       __                   __                                                                    __                                                    __     \r\n" + //
                "\t\t\t\t|  \\     /  \\                 |  \\                                                                  |  \\                                                  |  \\    \r\n" + //
                "\t\t\t\t| \u2593\u2593\\   /  \u2593\u2593 ______   ______ | \u2593\u2593____   ______  _______   ______        ______   ______   _______ _| \u2593\u2593_    ______  __    __  ______   ______  _______  _| \u2593\u2593_   \r\n" + //
                "\t\t\t\t| \u2593\u2593\u2593\\ /  \u2593\u2593\u2593/      \\ /      \\| \u2593\u2593    \\ |      \\|       \\ |      \\      /      \\ /      \\ /       \\   \u2593\u2593 \\  |      \\|  \\  |  \\/      \\ /      \\|       \\|   \u2593\u2593 \\  \r\n" + //
                "\t\t\t\t| \u2593\u2593\u2593\u2593\\  \u2593\u2593\u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\\  \u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\ \\\u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\ \\\u2593\u2593\u2593\u2593\u2593\u2593\\    |  \u2593\u2593\u2593\u2593\u2593\u2593\\  \u2593\u2593\u2593\u2593\u2593\u2593\\  \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593\u2593\u2593\u2593\u2593   \\\u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593  | \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\\  \u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\\\u2593\u2593\u2593\u2593\u2593\u2593  \r\n" + //
                "\t\t\t\t| \u2593\u2593\\\u2593\u2593 \u2593\u2593 \u2593\u2593 \u2593\u2593    \u2593\u2593 \u2593\u2593  | \u2593\u2593 \u2593\u2593  | \u2593\u2593/      \u2593\u2593 \u2593\u2593  | \u2593\u2593/      \u2593\u2593    | \u2593\u2593   \\\u2593\u2593 \u2593\u2593    \u2593\u2593\\\u2593\u2593    \\  | \u2593\u2593 __ /      \u2593\u2593 \u2593\u2593  | \u2593\u2593 \u2593\u2593   \\\u2593\u2593 \u2593\u2593    \u2593\u2593 \u2593\u2593  | \u2593\u2593 | \u2593\u2593 __ \r\n" + //
                "\t\t\t\t| \u2593\u2593 \\\u2593\u2593\u2593| \u2593\u2593 \u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593__| \u2593\u2593 \u2593\u2593  | \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593  | \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\u2593    | \u2593\u2593     | \u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593_\\\u2593\u2593\u2593\u2593\u2593\u2593\\ | \u2593\u2593|  \\  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593__/ \u2593\u2593 \u2593\u2593     | \u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593  | \u2593\u2593 | \u2593\u2593|  \\\r\n" + //
                "\t\t\t\t| \u2593\u2593  \\\u2593 | \u2593\u2593\\\u2593\u2593     \\\\\u2593\u2593    \u2593\u2593 \u2593\u2593  | \u2593\u2593\\\u2593\u2593    \u2593\u2593 \u2593\u2593  | \u2593\u2593\\\u2593\u2593    \u2593\u2593    | \u2593\u2593      \\\u2593\u2593     \\       \u2593\u2593  \\\u2593\u2593  \u2593\u2593\\\u2593\u2593    \u2593\u2593\\\u2593\u2593    \u2593\u2593 \u2593\u2593      \\\u2593\u2593     \\ \u2593\u2593  | \u2593\u2593  \\\u2593\u2593  \u2593\u2593\r\n" + //
                "\t\t\t\t \\\u2593\u2593      \\\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593_\\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593   \\\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593   \\\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593     \\\u2593\u2593       \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593\u2593\u2593\u2593\u2593\u2593    \\\u2593\u2593\u2593\u2593  \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593 \\\u2593\u2593       \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593   \\\u2593\u2593   \\\u2593\u2593\u2593\u2593 \r\n" + //
                "\t\t\t\t                     |  \\__| \u2593\u2593                                                                                                                                   \r\n" + //
                "\t\t\t\t                      \\\u2593\u2593    \u2593\u2593                                                                                                                                   \r\n" + //
                "\t\t\t\t                       \\\u2593\u2593\u2593\u2593\u2593\u2593                                                                                                                                    \r\n" + //
                "\t\t\t\t"+in.reset);
	}

	void selection()
	{
		meghanadisplay();
		// System.out.println("\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // System.out.println(in.blink+in.blue+"\t\t\t\t\t\t\t\t>>>>>>>WELCOME TO MEGHNA'S RESTAURENT<<<<<<<"+in.reset);
		// System.out.println("\t\t\t\t\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println();
		System.out.println(in.red+"\t\t\t\t\t\t\t\t...........       H E R E    I S    T H E     M E N U      I T E M S          ........\n");
		System.out.println();
		System.out.println(in.cyan+"\t\t\t\t\t\t\t\t\t\tSTARTERS\n\n\t\t\t\t\t\t\t\t\t\tVEG ITEMS\n\n\t\t\t\t\t\t\t\t\t\tNON-VEG ITEMS\n\n\t\t\t\t\t\t\t\t\t\tDESSERTS\n"+in.cyan);
		System.out.println();
	 	this.starters_menu();
		this.items_menu();
		this.desserts_menu();
		while(true)
		{
			System.out.println(in.yellow+"\t\t\t\t\t\tChoose Options : "+in.reset);
			System.out.println();
			System.out.println(in.purple+"\t\t\t\t\t\t1 . Continue to Billing");
			System.out.println(in.green+"\t\t\t\t\t\t2 . Order Again");
			System.out.println(in.red+"\t\t\t\t\t\t3 . Cancel Order");
			System.out.print("\t\t\t\t\t\t"+in.magent);
			String opt = in.sc.nextLine();
			int k = Integer.parseInt(opt);
			if(k==1)
				hotel_billing();
			else if(k==2)
			{
				items.ds_cn=0;
				items.st_cn=0;
				selection();
			}
			else if(k==3)
			{
				food.m1.bill="";
				food.m1.total=0;
				items.ds_cn=0;
				items.st_cn=0;
			}
			else 
			{
				System.out.println(in.redbri+"\t\t\t\t...........         Invalid Input        ...........");
				System.out.println(in.yellow+"\t\t\t\tDo you want to Re-select");
				System.out.println(in.green+"\t\t\t1 . Yes ");
				System.out.println(in.red+"\t\t\t2. No");
				System.out.print("\t\t\t"+in.magent);
				String ys = in.sc.nextLine();
				if(Integer.parseInt(ys)==1)
					continue;
			
			}
			break;
		}
		food.final_bill += total;
			
	}
	void hotel_billing()
	{
		System.out.println(in.cyan+"\t\t\t\t\t\t\tT O T A L     O R D E R    P A Y M E N T      D E T A I L S   :  \n\n");
		System.out.print(in.thick);
		System.out.println(in.magent+"\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.println(in.change+in.bwhite+in.magent+"\t\t\t\t\t\t                   Items          Quantity                  Cost                     Price             "+in.reset);
		System.out.println(in.change+in.magent+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
		System.out.println("\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		for(int i=0;i<list.size();i++)
		{
				System.out.printf(in.change+"\t\t\t\t\t\t         %-25s  %3s                    %6s          :     %8s              "+in.reset,list.get(i).get(0),list.get(i).get(1),list.get(i).get(2),list.get(i).get(3));
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		}
		
		System.out.println(in.change+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
		double offer  = total*0.1; //  10%
		System.out.println("\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-12s       :     %9.2f             "+in.reset,"","","Total Price",total);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-12s       :     %9.2f             "+in.reset,"","","10% Offer",offer);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		total -=offer;
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-15s    :    %10.2f             "+in.reset,"","","Payable Amount",total);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.println(in.change+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
		System.out.println("\n\n\n");
        System.out.print(in.green+"\t\t\t\t\t Please Wait you're directing to Billing");
        in.loading();
        if(! Amigos.payment_obj.bank_select(total))
        {
            System.out.println(in.red+"\n\t\t\t\t...........         Booking Cancelled         ..............");
        }
        else
        {
            System.out.println(in.green+"\n\n\n\t\t\t\t...........           Thank You For Visiting  Meghana Restaurent          ............");
                   System.out.println(in.purple+"\n\t\t\t\t              .........         Have a Good Day       ........   ");
        }
	}
}
class babaihotel extends items
{
	static ArrayList<ArrayList<String>> list = new  ArrayList<ArrayList<String>>();
	String bill="";
      double total = 0;


	//@Override
       void billing(ArrayList<String> item , double price)
	{
		for(int i=0;i<list.size();i++)
		{
			if((list.get(i).get(0)).equals(item.get(0)))
			{
				int new_quant = Integer.parseInt(list.get(i).get(1))+Integer.parseInt(item.get(1));
				double new_total = Double.parseDouble(list.get(i).get(3))+Double.parseDouble(item.get(3));
				list.get(i).set(1,Integer.toString(new_quant));
				list.get(i).set(3,Double.toString(new_total));
				this.total+=price;
				return;
			}
		}
		list.add(item);
		this.total+=price;
	}

	void babaihoteldisplay()
	{
        System.out.println(in.blink+in.blue+"\t\t\t\t\t\t\t _______           __                __      __    __            __              __ \r\n" + //
                "\t\t\t\t\t\t\t|       \\         |  \\              |  \\    |  \\  |  \\          |  \\            |  \\\r\n" + //
                "\t\t\t\t\t\t\t| \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\ ______ | \u2593\u2593____   ______  \\\u2593\u2593    | \u2593\u2593  | \u2593\u2593 ______  _| \u2593\u2593_    ______ | \u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t| \u2593\u2593__/ \u2593\u2593|      \\| \u2593\u2593    \\ |      \\|  \\    | \u2593\u2593__| \u2593\u2593/      \\|   \u2593\u2593 \\  /      \\| \u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t| \u2593\u2593    \u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\ \\\u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593    | \u2593\u2593    \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\\\\\u2593\u2593\u2593\u2593\u2593\u2593 |  \u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t| \u2593\u2593\u2593\u2593\u2593\u2593\u2593\\/      \u2593\u2593 \u2593\u2593  | \u2593\u2593/      \u2593\u2593 \u2593\u2593    | \u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593  | \u2593\u2593 | \u2593\u2593 __| \u2593\u2593    \u2593\u2593 \u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t| \u2593\u2593__/ \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593__/ \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593    | \u2593\u2593  | \u2593\u2593 \u2593\u2593__/ \u2593\u2593 | \u2593\u2593|  \\ \u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t| \u2593\u2593    \u2593\u2593\\\u2593\u2593    \u2593\u2593 \u2593\u2593    \u2593\u2593\\\u2593\u2593    \u2593\u2593 \u2593\u2593    | \u2593\u2593  | \u2593\u2593\\\u2593\u2593    \u2593\u2593  \\\u2593\u2593  \u2593\u2593\\\u2593\u2593     \\ \u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593  \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593\u2593\u2593\u2593\u2593\u2593  \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593     \\\u2593\u2593   \\\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593    \\\u2593\u2593\u2593\u2593  \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t                                                                                    \r\n" + //
                "\t\t\t\t\t\t\t                                                                                    \r\n" + //
                "                                                                                    \r\n" + //
                "\t\t\t\t\t\t\t"+in.reset);
	}

	void selection()
	{ 
		babaihoteldisplay();
		// System.out.println("\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // System.out.println(in.blink+in.green+"\t\t\t\t\t\t\t\t>>>>>>>WELCOME TO BABAI HOTEL<<<<<<<"+in.reset);
		// System.out.println("\t\t\t\t\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println();
		System.out.println(in.red+"\t\t\t\t\t\t\t\t...........       H E R E    I S    T H E     M E N U      I T E M S          ........\n");
		System.out.println();
		System.out.println(in.cyan+"\t\t\t\t\t\t\t\tSTARTERS\n\t\t\t\t\t\t\t\tVEG ITEMS\n\t\t\t\t\t\t\t\tNON-VEG ITEMS\n\t\t\t\t\t\t\t\tDESSERTS"+in.cyan);
		System.out.println();
		this.starters_menu();
		this.items_menu();
		this.desserts_menu();
		while(true)
		{
			System.out.println(in.yellow+"\t\t\t\t\t\tChoose Options : "+in.reset);
			System.out.println();
			System.out.println(in.purple+"\t\t\t\t\t\t1 . Continue to Billing");
			System.out.println(in.green+"\t\t\t\t\t\t2 . Order Again");
			System.out.println(in.red+"\t\t\t\t\t\t3 . Cancel Order");
			System.out.print("\t\t\t\t\t\t"+in.magent);
			String opt = in.sc.nextLine();
			int k = Integer.parseInt(opt);
			if(k==1)
				hotel_billing();
			else if(k==2)
			{
				items.ds_cn=0;
				items.st_cn=0;
				selection();
			}
			else if(k==3)
			{
				food.m1.bill="";
				food.m1.total=0;
				items.ds_cn=0;
				items.st_cn=0;
			}
			else 
			{
				System.out.println(in.redbri+"\t\t\t\t...........         Invalid Input        ...........");
				System.out.println(in.yellow+"\t\t\t\tDo you want to Re-select");
				System.out.println(in.green+"\t\t\t1 . Yes ");
				System.out.println(in.red+"\t\t\t2. No");
				System.out.print("\t\t\t"+in.magent);
				String ys = in.sc.nextLine();
				if(Integer.parseInt(ys)==1)
					continue;
			
			}
			break;
		}
		food.final_bill += total;
			
		
       }
	void hotel_billing()
	{
		System.out.println(in.cyan+"\t\t\t\t\t\t\tT O T A L     O R D E R    P A Y M E N T      D E T A I L S   :  \n\n");
		System.out.print(in.thick);
		System.out.println(in.magent+"\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.println(in.change+in.bwhite+in.magent+"\t\t\t\t\t\t                   Items          Quantity                  Cost                     Price             "+in.reset);
		System.out.println(in.change+in.magent+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
		System.out.println("\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		for(int i=0;i<list.size();i++)
		{
				System.out.printf(in.change+"\t\t\t\t\t\t         %-25s  %3s                    %6s          :     %8s              "+in.reset,list.get(i).get(0),list.get(i).get(1),list.get(i).get(2),list.get(i).get(3));
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		}
		
		System.out.println(in.change+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
		double offer  = total*0.15; //  15%
		System.out.println("\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-12s       :     %9.2f             "+in.reset,"","","Total Price",total);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-12s       :     %9.2f             "+in.reset,"","","15% Offer",offer);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		total -=offer;
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-15s    :    %10.2f             "+in.reset,"","","Payable Amount",total);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.println(in.change+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
        System.out.println("\n\n\n");
        System.out.print(in.green+"\t\t\t\t\t Please Wait you're directing to Billing");
        in.loading();
        if(! Amigos.payment_obj.bank_select(total))
        {
            System.out.println(in.red+"\n\t\t\t\t...........         Booking Cancelled         ..............");
        }
        else
        {
            System.out.println(in.green+"\n\n\n\t\t\t\t...........           Thank You For Visiting  Babai  Hotel          ............");
           System.out.println(in.purple+"\n\t\t\t\t              .........         Have a Good Day       ........   ");
        }
	}
}
class paradise extends items
{
	static ArrayList<ArrayList<String>> list = new  ArrayList<ArrayList<String>>();
	String bill="";
      double total = 0;

	//@Override
       void billing(ArrayList<String> item , double price)
	{
		for(int i=0;i<list.size();i++)
		{
			if((list.get(i).get(0)).equals(item.get(0)))
			{
				int new_quant = Integer.parseInt(list.get(i).get(1))+Integer.parseInt(item.get(1));
				double new_total = Double.parseDouble(list.get(i).get(3))+Double.parseDouble(item.get(3));
				list.get(i).set(1,Integer.toString(new_quant));
				list.get(i).set(3,Double.toString(new_total));
				this.total+=price;
				return;
			}
		}
		list.add(item);
		this.total+=price;
	}

	void paradise_display()
	{
		 System.out.println("\t\t\t\t\t\t\t\t                                           __ __                   \r\n" + //
                "\t\t\t\t\t\t\t\t                                          |  \\  \\                  \r\n" + //
                "\t\t\t\t\t\t\t\t  ______   ______   ______   ______   ____| \u2593\u2593\\\u2593\u2593 _______  ______  \r\n" + //
                "\t\t\t\t\t\t\t\t /      \\ |      \\ /      \\ |      \\ /      \u2593\u2593  \\/       \\/      \\ \r\n" + //
                "\t\t\t\t\t\t\t\t|  \u2593\u2593\u2593\u2593\u2593\u2593\\ \\\u2593\u2593\u2593\u2593\u2593\u2593\\  \u2593\u2593\u2593\u2593\u2593\u2593\\ \\\u2593\u2593\u2593\u2593\u2593\u2593\\  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\\\r\n" + //
                "\t\t\t\t\t\t\t\t| \u2593\u2593  | \u2593\u2593/      \u2593\u2593 \u2593\u2593   \\\u2593\u2593/      \u2593\u2593 \u2593\u2593  | \u2593\u2593 \u2593\u2593\\\u2593\u2593    \\| \u2593\u2593    \u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t\t| \u2593\u2593__/ \u2593\u2593  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593     |  \u2593\u2593\u2593\u2593\u2593\u2593\u2593 \u2593\u2593__| \u2593\u2593 \u2593\u2593_\\\u2593\u2593\u2593\u2593\u2593\u2593\\ \u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t\t| \u2593\u2593    \u2593\u2593\\\u2593\u2593    \u2593\u2593 \u2593\u2593      \\\u2593\u2593    \u2593\u2593\\\u2593\u2593    \u2593\u2593 \u2593\u2593       \u2593\u2593\\\u2593\u2593     \\\r\n" + //
                "\t\t\t\t\t\t\t\t| \u2593\u2593\u2593\u2593\u2593\u2593\u2593  \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593       \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593 \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\\\u2593\u2593\\\u2593\u2593\u2593\u2593\u2593\u2593\u2593  \\\u2593\u2593\u2593\u2593\u2593\u2593\u2593\r\n" + //
                "\t\t\t\t\t\t\t\t| \u2593\u2593                                                               \r\n" + //
                "\t\t\t\t\t\t\t\t| \u2593\u2593                                                               \r\n" + //
                "\t\t\t\t\t\t\t\t \\\u2593\u2593                                                               \r\n" + //
                "\t\t\t\t\t\t\t\t");
	}

    void selection()
	{	
		paradise_display();
		// System.out.println("\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// System.out.println(in.blink+in.green+"\t\t\t\t\t\t\t\t>>>>>>>WELCOME TO PARADISE RESTAURENT<<<<<<<"+in.reset);
		// System.out.println("\t\t\t\t\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println();
		System.out.println(in.red+"\t\t\t\t\t\t\t\t...........       H E R E    I S    T H E     M E N U      I T E M S          ........\n");
		System.out.println();
		System.out.println(in.cyan+"\t\t\t\t\t\t\t\tSTARTERS\n\t\t\t\t\t\t\t\tVEG ITEMS\n\t\t\t\t\t\t\t\tNON-VEG ITEMS\n\t\t\t\t\t\t\t\tDESSERTS"+in.cyan);
		System.out.println();
		this.starters_menu();
		this.items_menu();
		this.desserts_menu();
		while(true)
		{
			System.out.println(in.yellow+"\t\t\t\t\t\tChoose Options : "+in.reset);
			System.out.println();
			System.out.println(in.purple+"\t\t\t\t\t\t1 . Continue to Billing");
			System.out.println(in.green+"\t\t\t\t\t\t2 . Order Again");
			System.out.println(in.red+"\t\t\t\t\t\t3 . Cancel Order");
			System.out.print("\t\t\t\t\t\t"+in.magent);
			String opt = in.sc.nextLine();
			int k = Integer.parseInt(opt);
			if(k==1)
				hotel_billing();
			else if(k==2)
			{
				items.st_cn=0;
				items.ds_cn=0;	
				selection();
			}
			else if(k==3)
			{
				food.m1.bill="";
				food.m1.total=0;
				items.ds_cn=0;
				items.st_cn=0;
			}
			else 
			{
				System.out.println(in.redbri+"\t\t\t\t...........         Invalid Input        ...........");
				System.out.println(in.yellow+"\t\t\t\tDo you want to Re-select");
				System.out.println(in.green+"\t\t\t1 . Yes ");
				System.out.println(in.red+"\t\t\t2. No");
				System.out.print("\t\t\t"+in.magent);
				String ys = in.sc.nextLine();
				if(Integer.parseInt(ys)==1)
					continue;	
			}
			break;
		}
		food.final_bill += total;
			
	}
	void hotel_billing()
	{
		System.out.println(in.cyan+"\t\t\t\t\t\t\tT O T A L     O R D E R    P A Y M E N T      D E T A I L S   :  \n\n");
		System.out.print(in.thick);
		System.out.println(in.magent+"\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.println(in.change+in.bwhite+in.magent+"\t\t\t\t\t\t                   Items          Quantity                  Cost                     Price             "+in.reset);
		System.out.println(in.change+in.magent+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
		System.out.println("\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		for(int i=0;i<list.size();i++)
		{
				System.out.printf(in.change+"\t\t\t\t\t\t         %-25s  %3s                    %6s          :     %8s              "+in.reset,list.get(i).get(0),list.get(i).get(1),list.get(i).get(2),list.get(i).get(3));
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		}
		
		System.out.println(in.change+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
		double offer  = total*0.2; //  20%
		System.out.println("\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-12s       :     %9.2f             "+in.reset,"","","Total Price",total);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-12s       :     %9.2f             "+in.reset,"","","20% Offer",offer);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		total -=offer;
		System.out.printf(in.change+"\t\t\t\t\t\t    %-30s     %3s              %-15s    :    %10.2f             "+in.reset,"","","Payable Amount",total);
		System.out.println("\t\t\t\t\t\t\t\t"+in.change+"                                                                                                       "+in.reset);
		System.out.println(in.change+"\t\t\t\t\t\t       ___________________________________________________________________________________________     "+in.reset);
        System.out.println("\n\n\n");
        System.out.print(in.green+"\t\t\t\t\t Please Wait you're directing to Billing");
        in.loading();
        if(! Amigos.payment_obj.bank_select(total))
        {
            System.out.println(in.red+"\n\t\t\t\t...........         Booking Cancelled         ..............");
        }
        else
        {
            System.out.println(in.green+"\n\n\n\t\t\t\t...........           Thank You For Visiting  Paradise          ............");
           System.out.println(in.purple+"\n\t\t\t\t             .........         Have a Good Day       ........   ");
        }
	}

}
class food
{
	static double final_bill = 0; 	
	static meghanarestaurent m1=new meghanarestaurent();
	static babaihotel m2=new babaihotel();
	static paradise m3=new paradise();
	

    void food_dispaly()
    {
        String art1 = " _________   ____     ____   ________   \n" +
                      "|_   ___  |.'    \\. .'    \\.|_   ___ \\.\n" +
                      "  | |_  \\_|  .--.  \\  .--.  \\ | |   \\. \\\n" +
                      "  |  _|   | |    | | |    | | | |    | |\n" +
                      " _| |_    \\  \\--'  /  \\--'  /_| |___.' /\n" +
                      "|_____|    \\.____.' \\.____.'|________.' ";
        
        String art2 = "       _....._                       \n" +
                      "    _.:`.--|--.`:._                  \n" +
                      "  .: .'\\o  | o /'. '.               \n" +
                      " // '.  \\ o|  /  o '.\\             \n" +
                      "//'._o'. \\ |o/ o_.-'o\\\\           \n" +
                      "|| o '-.'.\\|/.-' o   ||\n" +
                      "||--o--o-->|           ";

        String[] lines1 = art1.split("\n");
        String[] lines2 = art2.split("\n");

        int maxLength = Math.max(lines1.length, lines2.length);
		System.out.println(in.yellow+in.blink);
        for (int i = 0; i < maxLength; i++) {
            String line1 = i < lines1.length ? lines1[i] : "";
            String line2 = i < lines2.length ? lines2[i] : "";
            if(i==maxLength-1)
                System.out.print("\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t"+line1 + "    " + line2);
			in.sleep(100);
		}	
		System.out.println(in.reset);
		in.sleep(500);
		
    }
    void process()
	{
		food_dispaly();
		System.out.println(in.green+in.ital+in.blink+"\n\n\t\t\t\t\t\t\t\t\t********PLEASE SELECT WHERE YOU HAVE TO ORDER FROM********"+in.reset);
		System.out.println();
		in.sleep(1000);
		food_menu();
		System.out.println(in.blink+in.blue+"\t\t\t\t\t\t\t\t\t>>><<<< THANKS FOR VISTING >>>><<<<<");
		System.out.println("\t\t\t\t\t\t\t\t\t>>>>><<<<<<< VISIT AGAIN >>>>><<<<<"+in.reset);

	}
	static void food_menu()
	{
		
		System.out.println(in.greenbri);
		System.out.println("\n\n\n\t\t\t\t\t  __           __  __                  _                                      _____                 _                                           _    \r\n" + //
        "\t\t\t\t\t /_ |         |  \\/  |                | |                                    |  __ \\               | |                                         | |   \r\n" + //
        "\t\t\t\t\t  | |         | \\  / |   ___    __ _  | |__     __ _   _ __     __ _         | |__) |   ___   ___  | |_    __ _   _   _   _ __    ___   _ __   | |_  \r\n" + //
        "\t\t\t\t\t  | |         | |\\/| |  / _ \\  / _` | | '_ \\   / _` | | '_ \\   / _` |        |  _  /   / _ \\ / __| | __|  / _` | | | | | | '__|  / _ \\ | '_ \\  | __| \r\n" + //
        "\t\t\t\t\t  | |    _    | |  | | |  __/ | (_| | | | | | | (_| | | | | | | (_| |        | | \\ \\  |  __/ \\__ \\ | |_  | (_| | | |_| | | |    |  __/ | | | | | |_  \r\n" + //
        "\t\t\t\t\t  |_|   (_)   |_|  |_|  \\___|  \\__, | |_| |_|  \\__,_| |_| |_|  \\__,_|        |_|  \\_\\  \\___| |___/  \\__|  \\__,_|  \\__,_| |_|     \\___| |_| |_|  \\__| \r\n" + //
        "\t\t\t\t\t                                __/ |                                                                                                                \r\n" + //
        "\t\t\t\t\t                               |___/                                                                                                                 \n\n\n"
        );
		in.sleep(500);

		System.out.println(in.redbri);
System.out.println("\t\t\t\t\t  ___            ____            _               _       _    _           _            _ \r\n" + //
        "\t\t\t\t\t |__ \\          |  _ \\          | |             (_)     | |  | |         | |          | |\r\n" + //
        "\t\t\t\t\t    ) |         | |_) |   __ _  | |__     __ _   _      | |__| |   ___   | |_    ___  | |\r\n" + //
        "\t\t\t\t\t   / /          |  _ <   / _` | | '_ \\   / _` | | |     |  __  |  / _ \\  | __|  / _ \\ | |\r\n" + //
        "\t\t\t\t\t  / /_     _    | |_) | | (_| | | |_) | | (_| | | |     | |  | | | (_) | | |_  |  __/ | |\r\n" + //
        "\t\t\t\t\t |____|   (_)   |____/   \\__,_| |_.__/   \\__,_| |_|     |_|  |_|  \\___/   \\__|  \\___| |_|\r\n" + //
        "\t\t\t\t\t                                                                                         \r\n" + //
        "\t\t\t\t\t                                                                                        \n\n\n");

		System.out.println(in.bluebri);
		in.sleep(500);

System.out.println("\t\t\t\t\t  ____            _____                               _   _               \r\n" + //
        "\t\t\t\t\t |___ \\          |  __ \\                             | | (_)              \r\n" + //
        "\t\t\t\t\t   __) |         | |__) |   __ _   _ __    __ _    __| |  _   ___    ___  \r\n" + //
        "\t\t\t\t\t  |__ <          |  ___/   / _` | | '__|  / _` |  / _` | | | / __|  / _ \\ \r\n" + //
        "\t\t\t\t\t  ___) |    _    | |      | (_| | | |    | (_| | | (_| | | | \\__ \\ |  __/ \r\n" + //
        "\t\t\t\t\t |____/    (_)   |_|       \\__,_| |_|     \\__,_|  \\__,_| |_| |___/  \\___| \r\n" + //
        "\t\t\t\t\t                                                                          \r\n" + //
        "\t\t\t\t\t                                                                          ");

		System.out.print("\t\t\t\t C H O O S E     H O T E L    T O     O R D E R      F O O  D  :  ");
		String ht = in.sc.nextLine();
		int f1=Integer.parseInt(ht);
		if(f1==1)
		{
            in.sleep(100);
            in.clear();
			m1.selection();
		}
		if(f1==2)
		{
            in.sleep(100);
            in.clear();
			m2.selection();
		}
		if(f1==3)
		{
            in.sleep(100);
            in.clear();
			m3.selection();
		
         	}
		else
		{
			System.out.println();
			System.out.println(in.yellow+"\t\t\t\t\t\t\t\tDo You want to Switch to another Restaurent -->  Meghana    or   Babai  or   Paradise");
			System.out.println(in.green+"\t\t\t\t\t\t1 . Yes");
			System.out.println(in.red+"\t\t\t\t\t\t2 . NO");
			System.out.print("\t\t\t\t\t"+in.magent);
			String ot=in.sc.nextLine();
			if(Integer.parseInt(ot)==1)
			{
				in.clear();
				food_menu();
			}
		}
			

	  	System.out.println(in.reset);
	}	
}




interface Shopping
{
	static Scanner sc = new Scanner(System.in);
	int electronics();
	int mobiles();
	int fashion();
	int furniture();
	int jewellery();

}
class Brands 
{
	int Dell()
	{
		int amount = 0;
		System.out.printf(in.red+"\n\n\t\t\t\t\t\t\t\t1.Dell Inspiron 14               ------->              60,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Vostro 15                      ------->              51,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.XPS 13                         ------->            1,55,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.G 15 Gaming Laptop             ------->            1,30,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Laptops : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 60999;
		else if(select == 2)
			amount = 51999;
		else if(select == 3)
			amount = 155999;
		else if(select == 4)
			amount = 130999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Laptops();
		}
		return amount;
	}
	int Hp()
	{
		int amount = 0;  
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.HP ENVY 14                     ------->               1,19,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.HP Spectre 15                  ------->               1,50,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.HP Pavilion 13                 ------->               66,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.HP OMEN Gaming Laptop          ------->               2,49,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Laptops : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 119999;
		else if(select == 2)
			amount = 150999;
		else if(select == 3)
			amount = 66999;
		else if(select == 4)
			amount = 249999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Laptops();
		}
		return amount;	
	}
	int Apple()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.MacBook Air M2                  ------->              1,07,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.MacBook Air M1                  ------->              80,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.MacBook Pro M2 MAX              ------->              3,22,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.MacBook Pro M1                  ------->              1,10,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Laptops : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 107999;
		else if(select == 2)
			amount = 80999;
		else if(select == 3)
			amount = 322999;
		else if(select == 4)
			amount = 110999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Laptops();
		}
		return amount;	
	}
	int Realme()
	{
		int amount = 0;
		System.out.printf(in.cyan+"\n\n\t\t\t\t\t\t\t1.Realme NoteBook i3              ------->              40,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t2.Realme NoteBook i5              ------->              55,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Laptops : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 40999;
		else if(select == 2)
			amount = 55999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Laptops();
		}
		return amount;	
	}
	int ASUS()
	{
		int amount = 0;
		System.out.printf(in.magent+"\n\n\t\t\t\t\t\t\t\t1.ASUS Slim                       ------->              44,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.ASUS TUF Gaming                 ------->              90,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Laptops : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 44999;
		else if(select == 2)
			amount = 90999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n"); 
			amount+=Display.dis_Obj.Laptops();
		}
		return amount;	
	}
	int Boat()
	{
		int amount = 0;
		System.out.printf(in.cyan+"\n\n\t\t\t\t\t\t\t\t1.EarBuds 379-H                   ------->             1499/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.wiredHeadset 978-U              ------->             499/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.NeckBands 123-T                 ------->             1299/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.Boat Speaker 1323               ------->             7999/-\n\n"+in.reset);
		System.out.print(in.yellow+"\t\t\tPlease select number for above Headphones : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 1499;
		else if(select == 2)
			amount = 499;
		else if(select == 3)
			amount = 1299;
		else if(select == 4)
			amount = 7999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Headphones();
		}
		return amount;
	}
	int realme()
	{
		int amount = 0;
		System.out.printf(in.green+"\n\n\t\t\t\t\t\t\t\t1.EarBuds 647-J                   ------->            1999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.wiredHeadset 3T                 ------->            699/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.NeckBands 154-T                 ------->            4999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.real SoundBar 100W              ------->            8999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Headphones : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 1999;
		else if(select == 2)
			amount = 699;
		else if(select == 3)
			amount = 4999;
		else if(select == 4)
			amount = 8999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Headphones();
		}
		return amount;
	}
	int Oneplus()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.EarBuds 379-H                    ------->           4999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.wiredHeadset 978-U               ------->           999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.NeckBands 123-T                  ------->           3399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Headphones : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 4999;
		else if(select == 2)
			amount = 999;
		else if(select == 3)
			amount = 3399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Headphones();
		}
		return amount;
	}
	int Samsung()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.Samsung OLED 334-H                ------->          75,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Samsung Curved 890-U              ------->          89,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Samsung 4k 45-T                   ------->          33,399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Tv's : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 75999;
		else if(select == 2)
			amount = 89999;
		else if(select == 3)
			amount = 33399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Televisions();
		}
		return amount;	
	}
	int LG()
	{
		int amount = 0;
		System.out.printf(in.red+"\n\n\t\t\t\t\t\t\t\t1.LG NanoLED 3984-H 						------->      		85,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.LG Curved 8908-U 						------->      		90,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.LG 4k Android 459-T 						------->      		39,399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Tv's : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 85999;
		else if(select == 2)
			amount = 90999;
		else if(select == 3)
			amount = 39399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Televisions();
		}
		return amount;	
	}
	int Sony()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.Sony Bravia 4k 9635-H  					------->             95,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Sony Curved 9688-U						------->             1,26,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Sony 4k Android 376k3-i 					------->             50,399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Tv's : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 95999;
		else if(select == 2)
			amount = 126999;
		else if(select == 3)
			amount = 50399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.Televisions();
		}
		return amount;	
	}
	int boat()
	{
		int amount = 0;
		System.out.printf(in.green+"\n\n\t\t\t\t\t\t\t\t1.Boat 563 Wifi Calling                    ------->               2,099/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Boat 2k display 8h7-U                    ------->               1,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Boat 4k display + wifi + Android 38d4-i  ------->               4,399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Smartwatch : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 2099;
		else if(select == 2)
			amount = 1999;
		else if(select == 3)
			amount = 4399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.smartWatches();
		}
		return amount;

	}
	int apple()
	{
		int amount = 0;
		System.out.printf(in.cyan+"\n\n\t\t\t\t\t\t\t\t1.Apple Series 8                           ------->              31,099/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Apple 2k display Series 9                ------->              66,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Apple 4k display + GPS                   ------->              80,399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Smartwatch : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 31099;
		else if(select == 2)
			amount = 66999;
		else if(select == 3)
			amount = 80399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.smartWatches();
		}
		return amount;

	}
	int Boult()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.Boult 654 Wifi Calling                   -------->             1,099/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Boult AmoLed display 8747-U              -------->             1,599/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Boult 4k display + wifi  38jsh-i         -------->             2,399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Smartwatch : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 1099;
		else if(select == 2)
			amount = 1599;
		else if(select == 3)
			amount = 2399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Display.dis_Obj.smartWatches();
		}
		return amount;

	}
	int APple()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.Apple Iphone 12 256 Gb                   ------->              39,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Apple Iphone 13 Pro 256 Gb               ------->              1,09,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Apple Iphone 14plus 256 Gb               ------->              79,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.Apple Iphone 14 pro max 512 Gb           ------->              1,23,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Mobile : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 39999;
		else if(select == 2)
			amount = 109999;
		else if(select == 3)
			amount = 79999;
		else if(select == 4)
			amount = 123999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.mobiles();
		}
		return amount;
	}
	int samSung()
	{
		int amount = 0;
		System.out.printf(in.magent+"\n\n\t\t\t\t\t\t\t\t1.Samsung S21 Fe                         ------->               33,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Samsung S23 Ultra                      ------->               1,09,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Samsung S23 Plus                       ------->               89,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.Samsung A54                            ------->               34,999/-\n\n"+in.reset);
		System.out.print(in.yellow+"\t\t\tPlease select number for above Mobile : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 33999;
		else if(select == 2)
			amount = 109999;
		else if(select == 3)
			amount = 89999;
		else if(select == 4)
			amount = 34999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.mobiles();
		}
		return amount;
	}
	int moto()
	{
		int amount = 0;
		System.out.printf(in.green+"\n\n\t\t\t\t\t\t\t\t1.Moto Edge 30                          ------->                30,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Moto Edge 20 pro                      ------->                23,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Moto Edge 30 Ultra                    ------->                49,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.Moto Edge 30 Fusion                   ------->                39,999/-\n\n"+in.reset);
		System.out.print(in.yellow+"\t\t\tPlease select number for above Mobile : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 30999;
		else if(select == 2)
			amount = 23999;
		else if(select == 3)
			amount = 49999;
		else if(select == 4)
			amount = 39999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.mobiles();
		}
		return amount;
	}
	int Redmi()
	{
		int amount = 0;
		System.out.printf(in.cyan+"\n\n\t\t\t\t\t\t\t\t1.Redmi 12                              ------->               23,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Redmi K50i                            ------->               25,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Redmi Note 13                         ------->               28,999/-\n\n"+in.reset);
		System.out.print(in.yellow+"\t\t\tPlease select number for above Mobile : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 23999;
		else if(select == 2)
			amount = 25999;
		else if(select == 3)
			amount = 28999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.mobiles();
		}
		return amount;	
	}
	int onePlus()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.OnePlus Nord 2t                      ------->                25,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.OnePlus 11R                          ------->                38,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.OnePlus 10 pro                       ------->                49,999/-\n\n");
		System.out.println(in.yellow+"\t\t\tPlease select number for above Mobile : "+in.reset);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 25999;
		else if(select == 2)
			amount = 38999;
		else if(select == 3)
			amount = 49999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.mobiles();
		}
		return amount;	
	}
	int Nothing()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.Nothing Phone1                       ------->               33,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Nothing Phone2                       ------->               44,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Mobile : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 33999;
		else if(select == 2)
			amount = 44999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.mobiles();
		}
		return amount;	
	}
	int Shirts()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.Shirt                                ------->                999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.T-Shirt                              ------->                499/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Yellow Shirts                        ------->                799/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.swetter                              ------->                1,599/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Shirt : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 999;
		else if(select == 2)
			amount = 499;
		else if(select == 3)
			amount = 799;
		else if(select == 4)
			amount = 1599;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.fashion();
		}
		return amount;
	}
	int Pants()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.Cotton pants                          -------->              1299/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Jeans Pants                           -------->              699/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.BeggerJeans                           -------->              599/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above pants : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 999;
		else if(select == 2)
			amount = 499;
		else if(select == 3)
			amount = 799;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.fashion();
		}
		return amount;
	}
	int Watches()
	{
		int amount = 0;
		System.out.printf(in.cyan+"\n\n\t\t\t\t\t\t\t\t1.Rolex                                 ------->                1,299/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Fossil                                ------->                1,399/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.FastTrack                             ------->                1,599/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above watches : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 1299;
		else if(select == 2)
			amount = 1399;
		else if(select == 3)
			amount = 1599;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.fashion();
		}
		return amount;
	}
	int perfumes()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.Fogg                                  -------->              299/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.WildStone                             -------->              599/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Villain                               -------->              799/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above perfumes : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 299;
		else if(select == 2)
			amount = 599;
		else if(select == 3)
			amount = 799;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.fashion();
		}
		return amount;
	}
	int Shoes()
	{
		int amount = 0;
		System.out.printf(in.green+"\n\n\t\t\t\t\t\t\t\t1.Spark                                 -------->             999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.WoodLand                              -------->             1,599/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Nivia                                 -------->             899/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.Puma                                  -------->             1,099/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above watches : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 999;
		else if(select == 2)
			amount = 1599;
		else if(select == 3)
			amount = 899;
		else if(select == 4)
			amount = 1099;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.fashion();
		}
		return amount;
	}
	int Sarees()
	{
		int amount = 0;
		System.out.printf(in.green+"\n\n\t\t\t\t\t\t\t\t1.Pure Silk Saree                       ------->              20,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Cotton Saree                          ------->              599/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Silk+Rayon Saree                      ------->              3,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.polyster Saree                        ------->              499/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Sarees : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 20999;
		else if(select == 2)
			amount = 599;
		else if(select == 3)
			amount = 3999;
		else if(select == 4)
			amount = 499;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.fashion();
		}
		return amount;
	}
	int chairs()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.Wodden chair                          ------->              499/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Nilkamal chair                        ------->              139/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Office chair                          ------->              399/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Chairs : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 499;
		else if(select == 2)
			amount = 139;
		else if(select == 3)
			amount = 399;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.furniture();
		}
		return amount;
	}
	int tables()
	{
		int amount = 0;
		System.out.printf(in.blue+"\n\n\t\t\t\t\t\t\t\t1.Nilkaml table                        ------->              499/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Wodden table                         ------->              699/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Office table                         ------->              1099/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above tables : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 499;
		else if(select == 2)
			amount = 699;
		else if(select == 3)
			amount = 1029;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.furniture();
		}
		return amount;
	}
	int sofa()
	{
		int amount = 0;
		System.out.printf(in.green+"\n\n\t\t\t\t\t\t\t\t1.Sofa set                             ------->             1099/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Nilkamal Fabric sofa&Bed             ------->             2599/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Ikea sofa + Bed                      ------->             2999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Sofa : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 1099;
		else if(select == 2)
			amount = 2599;
		else if(select == 3)
			amount = 2999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.furniture();
		}
		return amount;
	}
	int Diamond()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.Cable chain with Diamond Locket        -------->          9,00,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Black Diamond + gold chain             -------->          10,09,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Yellow Diamond                         -------->          15,19,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t4.Green Diamond Ring                     -------->          10,19,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Jewellery : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 9000999;
		else if(select == 2)
			amount = 1009999;
		else if(select == 3)
			amount = 1519999;
		else if(select == 3)
			amount = 1619999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.jewellery();
		}
		return amount;	
	}
	int Gold()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.Ring with Diamond Stone                -------->          5,00,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Chain with doller                      -------->          2,09,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Gold Ring                              -------->          49,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Jewellery : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 500999;
		else if(select == 2)
			amount = 209999;
		else if(select == 3)
			amount = 49999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.jewellery();
		}
		return amount;	
	}
	int Platinum()
	{
		int amount = 0;
		System.out.println(in.blue+"\n\n\t\t\t\t\t\t\t\t1.gold chain with Platinum Doller                -------->            15,10,999/-\n\n");
		System.out.println("\t\t\t\t\t\t\t\t2.Doller with Diamonds                           -------->            2,09,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Jewellery : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 1510999;
		else if(select == 2)
			amount = 209999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.jewellery();
		}
		return amount;	
	}
	int Silver()
	{
		int amount = 0;
		System.out.printf(in.purple+"\n\n\t\t\t\t\t\t\t\t1.Doller                                ------->           8,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Bracelet                              ------->           5,999/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Chain                                 ------->           10,999/-\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select number for above Jewellery : "+in.magent);
		int select = Shopping.sc.nextInt();
		if(select == 1)
			amount = 8999;
		else if(select == 2)
			amount = 5999;
		else if(select == 3)
			amount = 10999;
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.jewellery();
		}
		return amount;	
	}

}

class Display extends Brands
{
	static Display dis_Obj = new Display();
	int Laptops()
	{
		int amount = 0;
		System.out.println(in.cyan+"\n\n\t\t\tAvailable Brands are : \n");
		System.out.printf(in.green+"\n\t\t\t\t\t\t1.Dell.   \t2.Hp.   \t3.Apple.   \t4.RealMe.  \t5.ASUS.  \n\n\n");
		System.out.print(in.yellow+"\t\t\tEnter a number for required Brand : "+in.magent);
		int brand = Shopping.sc.nextInt();
		switch(brand)
		{
			case 1 : amount = Dell();
					break;
			case 2 : amount = Hp();
					break;
			case 3 : amount = Apple();
					break;
			case 4 : amount = Realme();
					break;
			case 5 : amount = ASUS();
					break;
			default : System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
					amount+=Amazon.object.Selection();
					
		}
		return amount;
	}
	int Headphones()
	{
		int amount = 0;
		System.out.println(in.magent+"\n\n\t\t\tAvailable Brands are : ");
		System.out.printf(in.red+"\n\t\t\t\t\t\t1.Boat.     2.Realme.     3.Oneplus.\n");
		System.out.print(in.yellow+"\t\t\tEnter a number for above available brands : "+in.magent);
		int brand = Shopping.sc.nextInt();
		if(brand == 1)
		{
			amount = Boat();
		}
		else if(brand == 2)
		{
			amount = realme();
		}
		else if(brand == 3)
		{
			amount = Oneplus();
		}
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.Selection();
		}
		return amount;
	}
	int Televisions()
	{
		int amount = 0;
		System.out.println(in.purple+"\n\n\t\t\tAvailable Brands are : ");
		System.out.printf("\n\t\t\t\t\t\t1.Samsung.     2.LG.     3.Sony.\n");
		System.out.print(in.yellow+"\t\t\tEnter a number for above available brands : "+in.magent);
		int brand = Shopping.sc.nextInt();
		if(brand == 1)
		{
			amount = Samsung();
		}
		else if(brand == 2)
		{
			amount = LG();
		}
		else if(brand == 3)
		{
			amount = Sony();
		}
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.Selection();
		}
		return amount;
	}
	int chargers()
	{
		int amount = 0;
		System.out.printf(in.bluebri+"\n\n\t\t\t\t\t\t\t\t1.Type-c to USB 	               ------->            149/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t2.Type-B to USB 	               ------->            129/-\n\n");
		System.out.printf("\t\t\t\t\t\t\t\t3.Type-c to Type-c                     ------->            229/-\n\n");
		System.out.print(in.cyan+"\t\t\tEnter a number for requird Cable : "+in.magent);
		int input = Shopping.sc.nextInt();
		if(input == 1)
		{
			amount = 149;
		}
		else if(input == 2)
		{
			amount = 129;
		}
		else if(input == 3)
		{
			amount = 229;
		}
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Amazon.object.Selection();
		}
		return amount;
	}
	int smartWatches()
	{
		int amount = 0;
		System.out.println(in.green+"\n\n\t\t\tAvailable Brands are : \n");
		System.out.printf(in.cyan+"\n\t\t\t\t\t\t1.Boat.     2.Apple.     3.Boult.\n\n");
		System.out.print(in.yellow+"\t\t\tEnter a number for above available brands : "+in.magent);
		int brand = Shopping.sc.nextInt();
		if(brand == 1)
		{
			amount = boat();
		}
		else if(brand == 2)
		{
			amount = apple();
		}
		else if(brand == 3)
		{
			amount = Boult();
		}
		else{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");	
			amount+=Amazon.object.Selection();
		}
		return amount;
	}
}
class Amazon extends Display implements Shopping
{
	static int  dis_con = 0;
	static int k=0;
	int amount = 0;
	static int total_Amount = 0;
	static Amazon object = new Amazon();
	public int electronics()
	{
		int amount = 0;
		System.out.print(in.green+"\t\t\t\t\t\t\tE)eeeeee L)       E)eeeeee   C)ccc  T)tttttt R)rrrrr   O)oooo  N)n   nn I)iiii   C)ccc   S)ssss  \n");in.sleep(333);
        System.out.print("\t\t\t\t\t\t\tE)       L)       E)        C)         T)    R)    rr O)    oo N)nn  nn   I)    C)   cc S)    ss \n");in.sleep(333);
        System.out.print("\t\t\t\t\t\t\tE)eeeee  L)       E)eeeee  C)          T)    R)  rrr  O)    oo N) nn nn   I)   C)        S)ss    \n");in.sleep(333);
        System.out.print("\t\t\t\t\t\t\tE)       L)       E)       C)          T)    R) rr    O)    oo N)  nnnn   I)   C)            S)  \n");in.sleep(333);
        System.out.print("\t\t\t\t\t\t\tE)       L)       E)        C)         T)    R)   rr  O)    oo N)   nnn   I)    C)   cc S)    ss \n");in.sleep(333);
        System.out.print("\t\t\t\t\t\t\tE)eeeeee L)llllll E)eeeeee   C)ccc     T)    R)    rr  O)oooo  N)    nn I)iiii   C)ccc   S)ssss  \n\n\n"+in.reset);in.sleep(333);
		System.out.println(in.green+"\n\n\t\t\tPlease select Electronic Gadgets : \n\n");
		System.out.printf(in.cyan+"\t\t\t\t\t\t\t   1.Laptops&Desktops.\t2.Headphones&Speakers.\t3.Televisions.\t4.Chargers&Cables.   5.SmartWatches.\n\n\n");
		System.out.print(in.yellow+"\t\t\tSelect your requirement : "+in.magent);	
		int Button1 = Shopping.sc.nextInt();
		if(Button1 == 1)
		{
			amount = Laptops();
		}
		else if(Button1 == 2)
		{
			amount = Headphones();
		}
		else if(Button1 == 3)
		{
			amount = Televisions();
		}
		else if(Button1 == 4)
		{
			amount = chargers();
		}
		else if(Button1 == 5)
		{
			amount = smartWatches();
		}
		else 
		{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n");
			amount+=Selection();
		}
		return amount;
	}
	public int mobiles()
	{
		int amount = 0;
		System.out.println(in.cyan+"\t\t\t\t\t\t\t\t\t\tMM     MM  OOOOOOO  BBBBBBBB  IIII LL       EEEEEEEE  SSSSSS  ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMMM   MMM OO     OO BB     BB  II  LL       EE       SS    SS ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMMMM MMMM OO     OO BB     BB  II  LL       EE       SS       ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMM MMM MM OO     OO BBBBBBBB   II  LL       EEEEEE    SSSSSS  ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMM     MM OO     OO BB     BB  II  LL       EE             SS ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMM     MM OO     OO BB     BB  II  LL       EE       SS    SS ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t\tMM     MM  OOOOOOO  BBBBBBBB  IIII LLLLLLLL EEEEEEEE  SSSSSS  \n\n\n"+in.reset);
		System.out.println(in.blue+"\n\n\t\t\tPlease select Brand : \n\n");
		System.out.printf(in.green+"\t\t\t\t\t\t\t 1.Apple.    2.Samsung.    3.Motorola.    4.Redmi.   5.Oneplus.    6.Nothing.\n\n\n");
		System.out.print(in.yellow+"\t\t\tSelect your requirement : "+in.magent);	
		int Button2 = Shopping.sc.nextInt();
		if(Button2 == 1)
		{
			amount = APple();
		}
		else if(Button2 == 2)
		{
			amount = samSung();
		}
		else if(Button2 == 3)
		{
			amount = moto();
		}
		else if(Button2 == 4)
		{
			amount = Redmi();
		}
		else if(Button2 == 5)
		{
			amount = onePlus();
		}
		else if(Button2 == 6)
		{
			amount = Nothing();
		}
		else 
		{
			System.out.println(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n\n");
			amount+=Selection();
		}
		return amount;
	}
	public int fashion()
	{
		int amount = 0;
		System.out.println(in.cyan+"\t\t\t\t\t\t\t\t\t\t  __              _      _               ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t\t / _|  __ _  ___ | |__  (_)  ___   _ __  ");in.sleep(200);
        System.out.println("\t\t\t\t\t\t\t\t\t\t| |_  / _` |/ __|| '_ \\ | | / _ \\ | '_ \\ ");in.sleep(100);
        System.out.println("\t\t\t\t\t\t\t\t\t\t|  _|| (_| |\\__ \\| | | || || (_) || | | |");in.sleep(50);
        System.out.println("\t\t\t\t\t\t\t\t\t\t|_|   \\__,_||___/|_||_| |_| \\___/ |_| |_|\n\n\n"+in.reset);
		System.out.println(in.red+"\n\n\t\t\tPlease select Categories : \n\n");
		System.out.printf(in.green+"\t\t\t\t\t\t    1.Shirts&T-Shirts.    2.Pants.    3.Watches.    4.perfumes.    5.Shoes.    6.Sarees.\n\n\n");
		System.out.print(in.yellow+"\t\t\tSelect your requirement : "+in.magent);	
		int Button3 = Shopping.sc.nextInt();
		if(Button3 == 1)
		{
			amount = Shirts();
		}
		else if(Button3 == 2)
		{
			amount = Pants();
		}
		else if(Button3 == 3)
		{
			amount = Watches();
		}
		else if(Button3 == 4)
		{
			amount = perfumes();
		}
		else if(Button3 == 5)
		{
			amount = Shoes();
		}
		else if(Button3 == 6)
		{
			amount = Sarees();
		}
		else 
		{
			System.out.println(in.purple+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n\n");
			amount+=Selection();
		}
		return amount;
	}

	public int furniture()
	{
		int amount = 0;
		System.out.println(in.red+"\t\t\t        _____                                                                                                                                         _____   ");in.sleep(300);
        System.out.println("\t\t\t ____  \\    \\ ______   _____    ___________      _____    _____      ____________    ________    ________ ______   _____    ___________         _____\\    \\  ");in.sleep(270);
        System.out.println("\t\t\t \\   \\ /____/|\\     \\  \\    \\   \\          \\    |\\    \\   \\    \\    /            \\  /        \\  /        \\\\     \\  \\    \\   \\          \\       /    / |    | ");in.sleep(250);
        System.out.println("\t\t\t  |  |/_____|/ \\    |  |    |    \\    /\\    \\    \\\\    \\   |    |  |\\___/\\  \\\\___/||\\         \\/         /|\\    |  |    |    \\    /\\    \\     /    /  /___/| ");in.sleep(220);
        System.out.println("\t\t\t  |  |    ___   |   |  |    |     |   \\_\\    |    \\\\    \\  |    |   \\|____\\  \\___|/| \\            /\\____/ | |   |  |    |     |   \\_\\    |   |    |__ |___|/ ");in.sleep(180);
        System.out.println("\t\t\t  |   \\__/   \\  |    \\_/   /|     |      ___/      \\|    \\ |    |         |  |     |  \\______/\\   \\     | | |    \\_/   /|     |      ___/    |       \\       ");in.sleep(150);
        System.out.println("\t\t\t /      /\\___/| |\\         \\|     |      \\  ____    |     \\|    |    __  /   / __   \\ |      | \\   \\____|/  |\\         \\|     |      \\  ____ |     __/ __    ");in.sleep(120);
        System.out.println("\t\t\t/      /| | | | | \\         \\__  /     /\\ \\/    \\  /     /\\      \\  /  \\/   /_/  |   \\|______|  \\   \\       | \\         \\__  /     /\\ \\/    \\|\\    \\  /  \\   ");in.sleep(90);
        System.out.println("\t\t\t|_____| /\\|_|/   \\ \\_____\\/    \\/_____/ |\\______| /_____/ /______/||____________/|            \\  \\___\\       \\ \\_____\\/    \\/_____/ |\\______|| \\____\\/    |  ");in.sleep(60);
        System.out.println("\t\t\t |     |/          \\ |    |/___/||     | | |     ||      | |     | ||           | /             \\ |   |        \\ |    |/___/||     | | |     || |    |____/|  ");in.sleep(30);
        System.out.println("\t\t\t |_____|            \\|____|   | ||_____|/ \\|_____||______|/|_____|/ |___________|/               \\|___|         \\|____|   | ||_____|/ \\|_____| \\|____|   | |  ");in.sleep(10);
        System.out.println("\t\t\t                         |___|/                                                                                      |___|/                         |___|/   \n\n\n"+in.reset);
		System.out.println(in.cyan+"\t\t\tPlease select categories : \n\n\n");
		System.out.printf(in.green+"\t\t\t\t\t\t  1.Chairs.    2.Tables.    3.Sofa&Bed.\n\n\n");	
		System.out.print(in.yellow+"\t\t\tSelect your required furniture : "+in.magent);	
		int Button4 = Shopping.sc.nextInt();
		if(Button4 == 1)
		{
			amount = chairs();
		}
		else if(Button4 == 2)
		{
			amount = tables();
		}
		else if(Button4 == 3)
		{
			amount = sofa();
		}
		else 
		{
			System.out.println(in.blue+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n\n");
			amount+=Selection();
		}
		return amount;
	}
	public int jewellery()
	{
		System.out.println(in.yellow+"\t\t\t\t                                                                                                                                 ");in.sleep(333);
        System.out.println("\t\t\t\t        ____      ______     _____                ______    ____         ____             ______        _____    _____      _____ ");in.sleep(333);
        System.out.println("\t\t\t\t       |    | ___|\\     \\   |\\    \\   _____   ___|\\     \\  |    |       |    |        ___|\\     \\   ___|\\    \\  |\\    \\    /    /|");in.sleep(333);
        System.out.println("\t\t\t\t       |    ||     \\     \\  | |    | /    /| |     \\     \\ |    |       |    |       |     \\     \\ |    |\\    \\ | \\    \\  /    / |");in.sleep(333);
        System.out.println("\t\t\t\t       |    ||     ,_____/| \\/     / |    || |     ,_____/||    |       |    |       |     ,_____/||    | |    ||  \\____\\/    /  /");in.sleep(333);
        System.out.println("\t\t\t\t ____  |    ||     \\--'\\_|/ /     /_  \\   \\/ |     \\--'\\_|/|    |  ____ |    |  ____ |     \\--'\\_|/|    |/____/  \\ |    /    /  / ");in.sleep(333);
        System.out.println("\t\t\t\t|    | |    ||     /___/|  |     // \\  \\   \\ |     /___/|  |    | |    ||    | |    ||     /___/|  |    |\\    \\   \\|___/    /  /  ");in.sleep(333);
        System.out.println("\t\t\t\t|    | |    ||     \\____|\\ |    |/   \\ |    ||     \\____|\\ |    | |    ||    | |    ||     \\____|\\ |    | |    |      /    /  /   ");in.sleep(333);
        System.out.println("\t\t\t\t|\\____\\|____||____ '     /||\\ ___/\\   \\|   /||____ '     /||____|/____/||____|/____/||____ '     /||____| |____|     /____/  /    ");in.sleep(333);
        System.out.println("\t\t\t\t| |    |    ||    /_____/ || |   | \\______/ ||    /_____/ ||    |     |||    |     |||    /_____/ ||    | |    |    |`    | /     ");in.sleep(333);
        System.out.println("\t\t\t\t \\|____|____||____|     | / \\|___|/\\ |    | ||____|     | /|____|_____|/|____|_____|/|____|     | /|____| |____|    |_____|/      ");in.sleep(333);
        System.out.println("\t\t\t\t                    |_____|           \\|____|/       |_____|                                   |_____|                               \n\n\n"+in.reset);in.sleep(333);

		int amount = 0;
		System.out.println(in.blue+"\t\t\tplease select categories : \n\n");
		System.out.printf(in.green+"\t\t\t\t\t\t    1.Diamonds.    2.Gold.    3.Platinum.    4.Silver.\n\n\n");
		System.out.print(in.yellow+"\t\t\tSelect your requird Jewellery : "+in.magent);	
		int Button5 = Shopping.sc.nextInt();
		if(Button5 == 1)
		{
			amount = Diamond();
		}
		else if(Button5 == 2)
		{
			amount = Gold();
		}
		else if(Button5 == 3)
		{
			amount = Platinum();
		}
		else if(Button5 == 4)
		{
			amount = Silver();
		}
		else 
		{
			System.out.println(in.green+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n\n\n");
			amount+=Selection();
		}
		return amount;
	}
	void dispaly_shop()
	{
		System.out.println(in.blue+"\t\t\t\t\t .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. ");in.sleep(333);
        System.out.println("\t\t\t\t\t| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |");in.sleep(330);
        System.out.println("\t\t\t\t\t| | _____  _____ | || |  _________   | || |   _____      | || |     ______   | || |     ____     | || | ____    ____ | || |  _________   | |");in.sleep(327);
        System.out.println("\t\t\t\t\t| ||_   _||_   _|| || | |_   ___  |  | || |  |_   _|     | || |   .' ___  |  | || |   .'    `.   | || ||_   \\  /   _|| || | |_   ___  |  | |");in.sleep(324);
        System.out.println("\t\t\t\t\t| |  | | /\\ | |  | || |   | |_  \\_|  | || |    | |       | || |  / .'   \\_|  | || |  /  .--.  \\  | || |  |   \\/   |  | || |   | |_  \\_|  | |");in.sleep(321);
        System.out.println("\t\t\t\t\t| |  | |/  \\| |  | || |   |  _|  _   | || |    | |   _   | || |  | |         | || |  | |    | |  | || |  | |\\  /| |  | || |   |  _|  _   | |");in.sleep(318);
        System.out.println("\t\t\t\t\t| |  |   /\\   |  | || |  _| |___/ |  | || |   _| |__/ |  | || |  \\ `.___.'\\  | || |  \\  `--'  /  | || | _| |_\\/_| |_ | || |  _| |___/ |  | |");in.sleep(315);
        System.out.println("\t\t\t\t\t| |  |__/  \\__|  | || | |_________|  | || |  |________|  | || |   `._____.'  | || |   `.____.'   | || ||_____||_____|| || | |_________|  | |");in.sleep(312);
        System.out.println("\t\t\t\t\t| |              | || |              | || |              | || |              | || |              | || |              | || |              | |");in.sleep(309);
        System.out.println("\t\t\t\t\t| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |");in.sleep(306);
        System.out.println("\t\t\t\t\t '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");in.sleep(303);
		System.out.println("\t\t\t\t\t\t\t\t\t .----------------.  .----------------.    .----------------.  .----------------. ");in.sleep(300);
        System.out.println("\t\t\t\t\t\t\t\t\t| .--------------. || .--------------. |  | .--------------. || .--------------. |");in.sleep(297);
        System.out.println("\t\t\t\t\t\t\t\t\t| |  _________   | || |     ____     | |  | |     ______   | || | ____   ____  | |");in.sleep(294);
        System.out.println("\t\t\t\t\t\t\t\t\t| | |  _   _  |  | || |   .'    `.   | |  | |   .' ___  |  | || ||_  _| |_  _| | |");in.sleep(291);
        System.out.println("\t\t\t\t\t\t\t\t\t| | |_/ | | \\_|  | || |  /  .--.  \\  | |  | |  / .'   \\_|  | || |  \\ \\   / /   | |");in.sleep(288);
        System.out.println("\t\t\t\t\t\t\t\t\t| |     | |      | || |  | |    | |  | |  | |  | |         | || |   \\ \\ / /    | |");in.sleep(285);
        System.out.println("\t\t\t\t\t\t\t\t\t| |    _| |_     | || |  \\  `--'  /  | |  | |  \\ `.___.'\\  | || |    \\ ' /     | |");in.sleep(282);
        System.out.println("\t\t\t\t\t\t\t\t\t| |   |_____|    | || |   `.____.'   | |  | |   `._____.'  | || |     \\_/      | |");in.sleep(279);
        System.out.println("\t\t\t\t\t\t\t\t\t| |              | || |              | |  | |              | || |              | |");in.sleep(276);
        System.out.println("\t\t\t\t\t\t\t\t\t| '--------------' || '--------------' |  | '--------------' || '--------------' |");in.sleep(273);
        System.out.println("\t\t\t\t\t\t\t\t\t '----------------'  '----------------'    '----------------'  '----------------' ");in.sleep(270);
		System.out.println("\t\t\t\t .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .-----------------. .----------------. ");in.sleep(267);
        System.out.println("\t\t\t\t| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |");in.sleep(264);
        System.out.println("\t\t\t\t| |    _______   | || |  ____  ____  | || |     ____     | || |   ______     | || |   ______     | || |     _____    | || | ____  _____  | || |    ______    | |");in.sleep(261);
        System.out.println("\t\t\t\t| |   /  ___  |  | || | |_   ||   _| | || |   .'    `.   | || |  |_   __ \\   | || |  |_   __ \\   | || |    |_   _|   | || ||_   \\|_   _| | || |  .' ___  |   | |");in.sleep(258);
        System.out.println("\t\t\t\t| |  |  (__ \\_|  | || |   | |__| |   | || |  /  .--.  \\  | || |    | |__) |  | || |    | |__) |  | || |      | |     | || |  |   \\ | |   | || | / .'   \\_|   | |");in.sleep(255);
        System.out.println("\t\t\t\t| |   '.___`-.   | || |   |  __  |   | || |  | |    | |  | || |    |  ___/   | || |    |  ___/   | || |      | |     | || |  | |\\ \\| |   | || | | |    ____  | |");in.sleep(252);
        System.out.println("\t\t\t\t| |  |`\\____) |  | || |  _| |  | |_  | || |  \\  `--'  /  | || |   _| |_      | || |   _| |_      | || |     _| |_    | || | _| |_\\   |_  | || | \\ `.___]  _| | |");in.sleep(249);
        System.out.println("\t\t\t\t| |  |_______.'  | || | |____||____| | || |   `.____.'   | || |  |_____|     | || |  |_____|     | || |    |_____|   | || ||_____|\\____| | || |  `._____.'   | |");in.sleep(246);
        System.out.println("\t\t\t\t| |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |");in.sleep(243);
        System.out.println("\t\t\t\t| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |");in.sleep(240);
        System.out.println("\t\t\t\t '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' \n\n"+in.reset);in.sleep(237);
	}
	int Selection()
	{
		if(dis_con==0)
		{
			dis_con++;
			dispaly_shop();
		}
		int amount = 0;
		System.out.println(in.blue+"\t\t\t\t\t\tAvaialable Categories : \n");
		System.out.printf(in.cyan+"\t\t\t\t\t\t\t\t   1.Electronics.\t2.Mobiles.   \t3.Fashion.        4.Furniture.          5.Jewellery.\n\n");
		System.out.print(in.yellow+"\t\t\tPlease select Categories : "+in.magent);
		int selection = Shopping.sc.nextInt();
		System.out.println("\n\n");
		if(selection == 1)
		{
			amount = electronics();
		}
		else if(selection == 2)
		{
			amount = mobiles();
		}
		else if(selection == 3)
		{
			amount = fashion();
		}
		else if(selection == 4)
		{
			amount = furniture();
		}
		else if(selection == 5)
		{
			amount = jewellery();
		}
		else
		{
			System.out.printf(in.red+"\t\t\t\t\t\t\t\t\t..........     I N V A L I D   S E L E C T I O N    ............"+in.reset+"\n\n\n");
			System.out.println(in.yellow+"\t\t\tDo You want to Re-select : \n");
			System.out.println(in.green+"\t\t\t\t\t1 . Yes");
			System.out.print(in.red+"\t\t\t\t\t2 . No\n\t\t\t\t"+in.reset);
			int ys = Shopping.sc.nextInt();
			if(ys==1)
				return Selection();
		}
		return amount;
	}
	
	float billing_gst(int pay_amount)
	{
		System.out.printf(in.green+"\n\n\t\t\tYour total Amount is      :  %12.2f \n\n",(double)pay_amount);in.sleep(333);
		float gst = (float)(pay_amount * 0.05); 
		System.out.printf(in.magent+"\t\t\tGST on products is        :  %12.2f\n\n",gst);in.sleep(330);
		float CGST = (float)(pay_amount * 0.025);
		System.out.printf(in.cyan+"\t\t\tCGST on products is       :  %12.2f\n",CGST);in.sleep(327);
		float total_Amnt = pay_amount+gst+CGST;
		System.out.println(in.white+"\t\t       ____________________________________________\n");
		System.out.printf(in.blue+"\t\t\tYour payable amount is    :  %12.2f\n",total_Amnt);in.sleep(324);
		System.out.println(in.white+"\t\t       ____________________________________________\n");
		return total_Amnt;
	}
	void billing(int amount,int quantity)
	{
		if(amount!=0)
		{
			this.amount = amount;
			total_Amount += this.amount*quantity;
			System.out.println(in.purple+"\n\t\t\tYour Item price     :  "+in.cyan+this.amount);
			   System.out.println(in.purple+"\t\t\tYour total amount   :  "+in.cyan+Amazon.total_Amount);
			System.out.println(in.yellow+"\n\n\t\t\t\t\tChoose Options : \n");
			System.out.println(in.green+"\t\t\t\t1 . Continue for Billing"+in.red+" \n\t\t\t\tPress any other number to Cancel the Order");
			System.out.print("\t\t\t\t"+in.magent);
			int ys = in.sc.nextInt();
			if(ys==1)
			{
				String dup = in.sc.nextLine();
				float pay_amount = billing_gst(total_Amount);
				   if(Amigos.payment_obj.bank_select(pay_amount))
				{
					System.out.println(in.green+"\n\n\n\t\t\t\t...........           Thank You for Purchasing         ...........\n");
					System.out.println(in.cyan+"\t\t\t\t         ...........     Have a nice Day    ............");
					total_Amount=0;
				}
			}
			else
				total_Amount=0;
		}
		else
			Selection();

	}
	void process()
	{
		int k = Selection();
		if(k!=0)
		{
			System.out.print(in.cyan+"\t\t\tEnter your quantity : "+in.magent);
			int quant = sc.nextInt();
			billing(k, quant);
			System.out.println(in.yellow+"\n\n\t\t\t\t\tDo you want to Shop again.......\n");
			System.out.println(in.green+"\t\t\t\t1 . Yes");
			System.out.print(in.red+"\t\t\t\t2 . No\n\t\t\t\t"+in.magent);
			int ys = Shopping.sc.nextInt();
			if(ys==1)
					process();
		}
		System.out.println(in.reset);
	}
	void start()
	{
		Amazon.object.process();
		System.out.println(in.green+"\t\t\t\t\t\t\t\t..........        T H A N K S     F O R    V I S I T I N G    C V     S H O P P I N G       .............");
		dis_con=0;
	}
}


        // P A Y M E N T 
interface pay{
    int getPin();
    void setPin(int pin);
    double get_bal();
    boolean withdraw(double bal);
}



class sbi implements pay
{
    private int sbi_pin = 0000;
    
    private double sbi_bal=50000.0;

    // S B I
    public int getPin()
    {
        return sbi_pin;
    }
    public void setPin(int sbi_pin)
    {
        this.sbi_pin=sbi_pin;
    }

    public double get_bal()
    {
        return sbi_bal;
    }

    public boolean withdraw(double sbi_bal)
    {
        if(this.sbi_bal<sbi_bal)
            return false;
        else
        {
            this.sbi_bal-=sbi_bal;
            return true;
        }
    }

}

    // K O T A K
class kotak  implements pay
{
    private int kotak_pin = 1111;

    private double kotak_bal=1000000000.0d;
    public int getPin()
    {
        return kotak_pin;
    }
    public void setPin(int kotak_pin)
    {
        this.kotak_pin=kotak_pin;
    }

    public double get_bal()
    {
        return kotak_bal;
    }
    public boolean withdraw(double kotak_bal)
    {
        if(this.kotak_bal<kotak_bal)
            return false;
        else    
        {
            this.kotak_bal-=kotak_bal;
            return true;
        }
    }


}

    // I C I C I
class icici  implements pay
{
    private int icici_pin = 1235;

    private double icici_bal=1000000.0;
    public int getPin()
    {
        return icici_pin;
    }
    public void setPin(int icici_pin)
    {
        this.icici_pin=icici_pin;
    }

    public double get_bal()
    {
        return icici_bal;
    }
    
    public boolean withdraw(double icici_bal)
    {
        if(this.icici_bal<icici_bal)
            return false;
        else   
        {
            this.icici_bal-=icici_bal;
            return true;
        }
    }
}
class payment 
{
    static sbi sbi_obj  = new sbi();
    static kotak kotak_obj = new kotak();
    static icici icici_obj = new icici();

    void bal_dispaly(pay obj,String bank)
    {
        System.out.println(in.yellow+"\t\t\tDo you want to Display the amount in Your Account....");
        System.out.println(in.green+"\t\t1 . Yes ");
        System.out.print(in.red+"\t\t2 . No \n\t\t"+in.magent);
        String ys = in.sc.nextLine();
        if(Integer.parseInt(ys)==1)
            System.out.printf("%s\n\t\t\t\t\tYour %8s Account Balance is  :  %10.2f\n",in.green,bank,obj.get_bal());

    }

    boolean validation(pay obj,double bill , String bank)
    {
        System.out.print(in.green+"\n\t\t\t\t\t\tEnter "+bank+" account Pin : "+in.magent);
        String pn = in.sc.nextLine();
        int pin = Integer.parseInt(pn);
        if(pin==obj.getPin())
        {
            if(obj.withdraw(bill))
            {
                System.out.println(in.green+"\n\n\t\t\t\t...........            Transaction Successful         ...........\n");
                bal_dispaly(obj, bank);
                return true;
            }
            else
            {
                System.out.println(in.red+"\n\t\t\t\t............             Insuffiecient Funds in Your Account         .............\n");
                System.out.println(in.yellow+"\t\t\tDo you want to switch to another bank");
                System.out.println(in.green+"\t\t1 . Yes ");
                System.out.print(in.red+"\t\t2 . No \n\t\t"+in.magent);
                String ys = in.sc.nextLine();
                if(Integer.parseInt(ys)==1)
                    return bank_select(bill);
                else    
                {
                    System.out.println(in.red+"\t\t\t\t............            Transaction Failed          ............");
                    return false;
                }
            }
        }
        else
        {
            System.out.println(in.red+"\t\t\t\t...........            Incorrect Pin          .............");
            System.out.println(in.yellow+"\t\t\tChoose Options : ");
            System.out.println(in.blue+"\t\t1 . Re-enter Pin");
            System.out.println("\t\t2 . Reset Pin");
            System.out.print("\t\tPress any number to Exit the Application\n\t\t"+in.magent);
            String opt = in.sc.nextLine();
            int ch = Integer.parseInt(opt);
            if(ch==1)
                return validation(obj,bill,bank);
            else if(ch==2)
            {
                while(true)
                {
                    System.out.print(in.green+"\t\t\t\tEnter Your Mobile Number : "+in.magent);
                    String phno = in.sc.nextLine();
                    if(phno.equals(USER.x.getPh()))
                    {
                        int sent_otp = in.otp("For Resetting the Pin of "+bank+" Bank");
                        System.out.print(in.cyan+"\t\t\t\tEnter the OTP : "+in.magent);
                        String str_otp = in.sc.nextLine();
                        int enter_otp=Integer.parseInt(str_otp);
                        if(sent_otp==enter_otp)
                        {
                            System.out.print(in.cyan+"\t\t\t\tEnter Your New Pin : "+in.magent);
                            String npin = in.sc.nextLine();
                            int new_pin = Integer.parseInt(npin);
                            obj.setPin(new_pin);
                            System.out.println(in.greenbr+"\n\t\t\t\t.............          Pin changed Successfully         ...................\n"+in.reset);
                            System.out.print(in.cyan+"\t\t\tPlease wait you're  directing to the Billing");
                            in.loading();
                            System.out.println();
                            return validation(obj, bill, bank);
                        }
                        System.out.println(in.redbr+"\t\t\t\t............       +6      Incorrect OTP             ............\n\n");
                        System.out.println(in.yellow+"\t\t\tDo you want to Re-send : ");
                        System.out.println(in.green+"\t\t1 . Yes");
                        System.out.print(in.red+"\t\tPress any number to exit"+in.magent);
                        String ys = in.sc.nextLine();
                        if(Integer.parseInt(ys)==1)
                            continue;
                        return false;
                    }
                    else
                    {
                        System.out.println(in.redbr+"\t\t\t\t............             Invalid Mobile Number             ............\n\n");
                        System.out.println(in.yellow+"\t\t\tDo you want to Re-enter : ");
                        System.out.println(in.green+"\t\t1 . Yes");
                        System.out.println(in.red+"\t\tPress any number to exit");
                        String ys = in.sc.nextLine();
                        if(Integer.parseInt(ys)==1)
                            continue;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    boolean bank_select(double bill)
    {
        System.out.println(in.white+"\n\n\t\t\t\t\t............         W E L C O M E     T O       "+in.change+"CharanPe"+in.reset+in.white+"       ............\n");
        System.out.println(in.yellow+"\t\t\tChoose the Bank to Pay the Bill : \n");
        System.out.println(in.green+in.change+"\t\t\t\t1 . S B I "+in.reset);System.out.println();
        System.out.println(in.cyan+in.change+"\t\t\t\t2 . K O T A K"+in.reset);System.out.println();
        System.out.print(in.purple+in.change+"\t\t\t\t3 . I C I C I"+in.reset+" \n\n\t\t\t\t"+in.magent);
        String opt = in.sc.nextLine();
        int bank = Integer.parseInt(opt);
        if(bank==1)
                return validation(sbi_obj,bill, " SBI ");
        else if(bank==2)
                return validation(kotak_obj,bill, " Kotak ");
        else if(bank==3)
                return validation(icici_obj, bill, " ICICI ");
        else 
        {
            System.out.println(in.red+"\t\t\t\t.............            Invalid Selection            ............");
            System.out.println(in.yellow+"\t\t\tDo you want Re-select");
            System.out.println(in.green+"\t\t1 . Yes ");
            System.out.print(in.red+"\t\t2 . No \n\t\t"+in.magent);
            String ys = in.sc.nextLine();
            if(Integer.parseInt(ys)==1)
                return bank_select(bill);
            return false;
        }
    }
}