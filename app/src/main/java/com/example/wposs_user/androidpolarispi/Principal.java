package com.example.wposs_user.androidpolarispi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Toolbar toolbar= findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_base, menu);
        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_perfil:
                startActivity(new Intent(this, Perfil.class));
                finish();
                return true;
            case R.id.action_stock:
              //  startActivity(new Intent(this, Stock.class));
                verStock();
                return true;
            case R.id.action_consultar_terminales_reparadas:
                startActivity(new Intent(this, Consultar_terminales_reparadas.class));
                verTerminalesReparados();
                return true;
            case R.id.action_productividad:
                startActivity(new Intent(this, Productividad.class));
                verProductividad();
                return true;
            case R.id.action_cerrar_sesion:
                //startActivity(new Intent(this, Login.class));
                cerrarSesion();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void verPerfil(){

    }

    public void verStock(){

    }

    public void verTerminalesReparados(){

    }

    public void verProductividad(){

    }

    public void cerrarSesion(){

    }
}
