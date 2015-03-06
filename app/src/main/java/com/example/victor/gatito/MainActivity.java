package com.example.victor.gatito;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.kl
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    Integer turno=0;

    gato obj=new gato();

    String[] btns=new String[9];


    public void cat(View q){
        turno++;


        Button b1=(Button)findViewById(q.getId());



        if (turno%2!=0){

            b1.setText("X");
            b1.setClickable(false);
        }
        if (turno%2==0){
            b1.setText("O");
            b1.setClickable(false);
        }




        switch (q.getId()){
            case R.id.button:
                btns[0]=b1.getText().toString();
                break;
            case R.id.button2:
                btns[1]=b1.getText().toString();
                break;
            case R.id.button3:
                btns[2]=b1.getText().toString();
                break;
            case R.id.button4:
                btns[3]=b1.getText().toString();
                break;
            case R.id.button5                btns[4]=b1.getText().toString();
                break;
            case R.id.button6:
                btns[5]=b1.getText().toString();
                break;
            case R.id.button7:
                btns[6]=b1.getText().toString();
                break;
            case R.id.button8:
                btns[7]=b1.getText().toString();
                break;
            case R.id.button9:
                btns[8]=b1.getText().toString();
                break;
        }


        if (obj.ver_ganador(btns)!=""&&obj.ver_ganador(btns)!=null){

            AlertDialog.Builder alerta=new AlertDialog.Builder(this);
            alerta.setCancelable(true);
            alerta.setMessage(obj.ver_ganador(btns));
            alerta.show();
        }



    }

}
