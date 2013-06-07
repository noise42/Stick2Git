package it.project.stick2me.shop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import it.project.stick2me.MainActivity;
import it.project.stick2me.R;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 05/06/13
 * Time: 14:34
 * To change this template use File | Settings | File Templates.
 */
public class ShopView extends Activity{

    @Override
    public void onCreate(Bundle SavedIstanceState){
        super.onCreate(SavedIstanceState);
        setContentView(R.layout.shopview);
    }

}
