package itesm.mx.red_de_contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.widget.GridView;

public class contactosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);

        Contacto anciano1 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano2 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano3 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano4 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano5 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano6 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano7 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano8 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano9 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);
        Contacto anciano10 = new Contacto("Nombre Contacto","8441895674",R.drawable.generic);

        final Contacto contactos[] = {anciano1,anciano2,anciano3,anciano4,anciano5,
                                      anciano6,anciano7,anciano8,anciano9,anciano10};

        GridView gridView = (GridView) findViewById(R.id.gridview);

        GridView gv = (GridView) findViewById(R.id.gridview);
        contactoAdapter contactoAdapter = new contactoAdapter(this, contactos);
        gv.setAdapter(contactoAdapter);



    }
}
