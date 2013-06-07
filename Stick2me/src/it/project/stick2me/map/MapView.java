package it.project.stick2me.map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import it.project.stick2me.R;
import it.project.stick2me.menu.MainMenu;
import it.project.stick2me.shop.ShopView;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 04/06/13
 * Time: 13:25
 * To change this template use File | Settings | File Templates.
 */
public class MapView extends Activity {

    private Button backToHome = null;
    private Button backToProfile = null;
    private Button backToShops = null;

    @Override
    public void onCreate(Bundle SavedIstanceState){
        super.onCreate(SavedIstanceState);
        setContentView(R.layout.map);

        backToHome = (Button)findViewById(R.id.map_toHome);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intentHome = new Intent(MapView.this, MainMenu.class);
                startActivity(intentHome);
            }

        });

        backToProfile = (Button)findViewById(R.id.map_toProfile);
        backToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Intent intentProfile = new Intent(MapView.this, ##Profile##.class);
                //startActivity(intentProfile);
            }

        });

        backToShops = (Button)findViewById(R.id.map_toShop);
        backToShops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intentShops = new Intent(MapView.this, ShopView.class);
                startActivity(intentShops);
            }

        });


    }
}

