package it.project.stick2me.network;

/**
 * Created with IntelliJ IDEA.
 * User: Chai
 * Date: 30/05/13
 * Time: 16.13
 * To change this template use File | Settings | File Templates.
 */
/*questa classe è pensata per gestire le connessioni col server.
   Tutti i metodi dovrebbero venir implementati qui */
public class NetworkConnection {
    boolean connected = false;
    boolean logged = false;

    public NetworkConnection(){

    }

    public boolean connect(){
       //connect to server to check username and account

        return connected;
    }

    public boolean login(String username, String password){
        //login operations performed here

         return logged;
    }

}
