package dbconnection;

import java.util.logging.Logger;
public class dbconnection {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    static int flag = 0;
    static dbconnection con = null;
    private dbconnection(){

    }

     static dbconnection getInstance(){
        if(con == null){
            con = new dbconnection();
        }
        return con;
    }

    static void newconnection(){
        flag = 1;
        Log.info("Connection created: "+con);

    }

    static void closeconnection(){
        con = null;
        flag = 0;
        Log.info("Connection Closed");
    }
}

