package pp.gomez.com.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView mostrar = (TextView) findViewById(R.id.mostrar);
        Button Cont = (Button) findViewById(R.id.Cont);
        Cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contador++;
                mostrar.setText("Contador: "+contador);
            }
        });



    }

    @Override protected void onStart() {
        TextView proceso = (TextView) findViewById(R.id.proceso);
        super.onStart();
        proceso.setText("Mostrar");
    }

    @Override protected void onResume() {
        TextView proceso = (TextView) findViewById(R.id.proceso);
        super.onResume();
        proceso.setText("Interactuando");
    }

    @Override protected void onPause() {
        TextView proceso = (TextView) findViewById(R.id.proceso);
        proceso.setText("Segundo Plano");
        super.onPause();
    }

    @Override protected void onStop() {
        TextView proceso = (TextView) findViewById(R.id.proceso);
        super.onStop();
        proceso.setText("No mas visible");
    }

    @Override protected void onRestart() {
        TextView proceso = (TextView) findViewById(R.id.proceso);
        super.onRestart();
        proceso.setText("Vuelve a ser presentada");

    }

    @Override protected void onDestroy() {
        TextView proceso = (TextView) findViewById(R.id.proceso);
        super.onDestroy();
        proceso.setText("Sera destruida");

    }



}


