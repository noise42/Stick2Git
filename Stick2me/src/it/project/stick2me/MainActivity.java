package it.project.stick2me;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.*;
import android.content.Intent;
import it.project.stick2me.menu.MainMenu;
import it.project.stick2me.menu.MainMenu;
import it.project.stick2me.network.NetworkConnection;
//import com.kinvey.android.Client;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private static final String TAG = "it.project.stick2me.MainActivity";

    private Button debugNoLogin = null;

    private Button login = null;
    private TextView register = null;
    private TextView alert = null;
    private EditText username_field = null;
    private EditText password_field = null;
    private NetworkConnection net = new NetworkConnection();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        alert = (TextView)findViewById(R.id.alert);
        username_field = (EditText)findViewById(R.id.edit_user);
        password_field = (EditText)findViewById(R.id.edit_password);

        //Tasto shortcut per vedere
        debugNoLogin = (Button)findViewById(R.id.buttonNoLogin);
        debugNoLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainMenu.class );
                startActivity(intent);
            }
        });


        login = (Button)findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                if(checkInput() == 1){
                    String user = username_field.getText().toString();
                    String password = password_field.getText().toString();
                     if(logInUser(user,password)){
                         alert.setText("SUCCESSFULLY LOGGED");
                         alert.setVisibility(View.VISIBLE);
                     }{
                        alert.setText("Impossible to login");
                        alert.setVisibility(View.VISIBLE);
                    }
                }else{
                      alert.setText("Fields are empty");
                    alert.setVisibility(View.VISIBLE);
                }
            }
        });


    }

    //final Client mKinveyClient = new Client.Builder("kid_TebvwgGxtf", "c2a3d00dd6c344549116369792226db8",this.getApplicationContext()).build();




    private int checkInput(){
        username_field = (EditText)findViewById(R.id.edit_user);
        password_field = (EditText)findViewById(R.id.edit_password);
        if(username_field.getText().toString() != null || password_field.getText().toString() != null){
            Log.d(TAG,"input corrected");
           return 1;
        }else{
            return 0;
        }
    }
    private boolean logInUser(String username, String password){
        boolean logged = false;
         if(net.connect()){
             Log.d(TAG,"connected");
             try {
                 logged = net.login(username,password);
             } catch (Exception e){
                 e.printStackTrace();
             }
         }


        return false;
    }



}
