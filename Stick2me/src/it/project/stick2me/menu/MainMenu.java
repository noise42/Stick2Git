package it.project.stick2me.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import it.project.stick2me.MainActivity;
import it.project.stick2me.shop.ShopView;
import it.project.stick2me.map.MapView;
import it.project.stick2me.R;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 04/06/13
 * Time: 13:46
 * To change this template use File | Settings | File Templates.
 */
public class MainMenu extends Activity {

    private Button back = null;
    private Button shopTest = null;
    private Button mapTest = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        back = (Button)findViewById(R.id.backToLogin);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        shopTest = (Button)findViewById(R.id.shopTest);
        shopTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentShop = new Intent(MainMenu.this, ShopView.class);
                startActivity(intentShop);
            }
        });

        mapTest = (Button)findViewById(R.id.mapTest);
        mapTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMap = new Intent(MainMenu.this, MapView.class);
                startActivity(intentMap);
            }
        });
    }
}
