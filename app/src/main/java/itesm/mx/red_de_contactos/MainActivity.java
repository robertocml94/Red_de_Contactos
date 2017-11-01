package itesm.mx.red_de_contactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class MainActivity extends AppCompatActivity {


    CuboidButton btnContactos,btnEmergencia,btnProvedores,btnPersonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContactos = (CuboidButton) findViewById(R.id.btnContactos);
        btnEmergencia = (CuboidButton) findViewById(R.id.btnEmergencia);
        btnProvedores = (CuboidButton) findViewById(R.id.btnProvedores);
        btnPersonal = (CuboidButton) findViewById(R.id.btnPersonal);


        btnContactos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), contactosActivity.class);
                startActivity(intent);
            }

        });
    }
}
