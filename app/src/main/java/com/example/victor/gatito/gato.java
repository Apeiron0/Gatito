package com.example.victor.gatito;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 *
 */
public class gato {


    public String ver_ganador(String[] casillas){

        if (casillas[0]==casillas[1]&&casillas[1]==casillas[2]&&casillas[2]!=null)
        {
            return "El ganador es "+casillas[0];
        }

        if (casillas[3]==casillas[4]&&casillas[4]==casillas[5]&&casillas[5]!=null)
        {
            return "El ganador es "+casillas[5];
        }

        if (casillas[6]==casillas[7]&&casillas[7]==casillas[8]&&casillas[8]!=null)
        {
            return "El ganador es "+casillas[8];
        }

        if (casillas[0]==casillas[3]&&casillas[3]==casillas[6]&&casillas[6]!=null)
        {
            return "El ganador es "+casillas[6];
        }

        if (casillas[1]==casillas[4]&&casillas[4]==casillas[7]&&casillas[7]!=null)
        {
            return "El ganador es "+casillas[7];
        }

        if (casillas[2]==casillas[5]&&casillas[5]==casillas[8]&&casillas[8]!=null)
        {
            return "El ganador es "+casillas[8];
        }

        if (casillas[0]==casillas[4]&&casillas[4]==casillas[8]&&casillas[8]!=null)
        {
            return "El ganador es "+casillas[8];
        }

        if (casillas[2]==casillas[4]&&casillas[4]==casillas[6]&&casillas[6]!=null)
        {
            return "El ganador es "+casillas[6];
        }
        if (casillas[0]!=null&&casillas[1]!=null&&casillas[2]!=null&&casillas[3]!=null&&casillas[4]!=null&&casillas[5]!=null&&casillas[6]!=null&&casillas[7]!=null&&casillas[8]!=null)
        {
            return  "EMPATE";
        }

        else return null;

    }


}
