package com.example.in2dm3_03.invocarapps;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("MissingPermission")
    public void boton(View v) {
        Button b = (Button) v;

        if (b.getId() == R.id.buttonWeb) {
            Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));
            startActivity(i1);
        }
        if (b.getId() == R.id.buttonLlamar) {
            Intent i1 = new Intent(Intent.ACTION_CALL);
            i1.setData(Uri.parse("tel:722466004"));

            startActivity(i1);
        }

        if (b.getId()==R.id.buttonLlamada){
            Intent i1=new Intent(Intent.ACTION_DIAL);
            startActivity(i1);
        }
        if (b.getId()==R.id.buttonMarcar){
            Intent i1=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:722466004"));
            startActivity(i1);
        }
        if (b.getId()==R.id.buttonWhatsapp){
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
            startActivity(launchIntent);
        }


        if (b.getId()==R.id.buttonCompartirTexto) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Este es el texto que voy a compartir");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }
    }
}
