package mario.ochoa.bbva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRegistrar_click(View v){
        Intent i = new Intent(MainActivity.this, Registro.class);
        startActivity(i);

    }
    public void btnLogin_click(View v){
        Intent i = new Intent(MainActivity.this, Login.class);
        startActivity(i);
    }
}
