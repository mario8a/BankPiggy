package mario.ochoa.bbva.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mario.ochoa.bbva.R;

public class ValidacionActivity extends AppCompatActivity {

    private Button enviar;
    private String telefono;
    private EditText campo_telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion);
        enviar = (Button) findViewById(R.id.enviar);
        campo_telefono = (EditText) findViewById(R.id.telefono);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        enviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                telefono = campo_telefono.getText().toString();
                Snackbar.make(view, "Telefono es "+ telefono, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(view.getContext(),DrawerActivity.class);
                    startActivity(intent);
            }
        });

        /*  Intent intent = new Intent (v.getContext(), AcercaDe.class);
                startActivityForResult(intent, 0);
            } */

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
