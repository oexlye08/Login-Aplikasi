package com.example.dtsmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    /***menambahkan option menu ke layout yg di tuju***/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=
                getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);  /***optionmenu adalah namna xml***/
        return true;
    }
    /*** Perintah Menu***/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.profil){ /***profil adalah nama id***/
            startActivity(new Intent(this, profil.class));
        } else if (item.getItemId()==R.id.keluar){  /*** keluar nama id***/
            startActivity(new Intent(this, MainActivity.class));
        }
        return true;
    }
}
