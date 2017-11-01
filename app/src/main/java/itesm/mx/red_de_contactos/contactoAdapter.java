package itesm.mx.red_de_contactos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class contactoAdapter extends BaseAdapter {

    private final Context mContext;
    private final Contacto[] contactos;

    // 1
    public contactoAdapter(Context context, Contacto[] contactos) {
        this.mContext = context;
        this.contactos = contactos;
    }

    // 2
    @Override
    public int getCount() {
        return contactos.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final Contacto contacto = contactos[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.cell, null);
        }

        // 3
        final ImageView ivImagen = (ImageView) convertView.findViewById(R.id.image_contacto);
        final TextView tvTitulo = (TextView)convertView.findViewById(R.id.nombre_contacto);

        // 4
        ivImagen.setImageResource(contacto.getIdImagen());
        tvTitulo.setText(contacto.getNombre());
        return convertView;
    }
}
