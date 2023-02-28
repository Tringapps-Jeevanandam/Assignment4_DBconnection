package dbconnection;
import java.util.*;
import java.util.logging.Logger;

public class database {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            try{
            dbconnection.getInstance();
            Log.info("1.New Connection\n2.Close Connection\n3.Exit\nEnter choice:");
            int option = input.nextInt();
            switch(option){
                case 1: dbconnection.newconnection(); 
                        break;
                case 2: dbconnection.closeconnection(); 
                        break;
                case 3: System.exit(0); 
                        break;
                default: Log.info("Enter correct choice:"); 
                        break;
              }
            }catch(Exception e){
                String exp = "Exception:"+e;
                Log.info(exp);
            }
    
        }
    }
    
}

