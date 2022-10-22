package bammou.oualid.apphorairestrains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultatsListeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_resultats);


        ListView listHoraires = (ListView) findViewById(R.id.listHoraires);
        String[] listeData = getResources().getStringArray(R.array.array_horaires); // voir strings.xml

        // Associer les données à la liste :
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listeData);
        listHoraires.setAdapter(adapter);

        // Evenement click sur in item de la liste :
        listHoraires.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Un petit message qui s'affiche aprés le click sur un item de la liste.
                Toast.makeText(ResultatsListeActivity.this, "Horaire choisi avec succès !", Toast.LENGTH_SHORT).show();

            }
        });
    }
}