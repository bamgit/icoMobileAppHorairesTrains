package bammou.oualid.apphorairestrains;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_rechercher = (Button) findViewById(R.id.buttonRechercher);

        // Lancer l'activé qui contient la lsite aprés le click sur "Rechercher" :
        btn_rechercher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ResultatsListeActivity.class);
                myIntent.putExtra("testkey", "test value");
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}