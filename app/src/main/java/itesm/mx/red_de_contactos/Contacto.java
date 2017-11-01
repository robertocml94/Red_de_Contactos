package itesm.mx.red_de_contactos;

import android.os.Parcel;
import android.os.Parcelable;


public class Contacto implements Parcelable {

    private String nombre;
    private String numero;
    private String fechaPublicacion;
    private int idImagen;
    private float price;

    //constructor de la clase
    public Contacto(String nombre, String numero, int idImagen){

        this.nombre = nombre;
        this.numero = numero;
        this.idImagen = idImagen;
    }

    protected Contacto(Parcel in) {
        nombre = in.readString();
        numero = in.readString();
        idImagen = in.readInt();
    }


    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getNumero() {

        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(numero);
    }
    public void readFromParcel (Parcel in){

        nombre = in.readString();
        numero = in.readString();
    }

    public int getIdImagen() {

        return idImagen;
    }
    public void setIdImagen(int idImagen) {

        this.idImagen = idImagen;
    }



    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Contacto> CREATOR = new Parcelable.Creator<Contacto>() {
        @Override
        public Contacto createFromParcel(Parcel in) {
            return new Contacto(in);
        }

        @Override
        public Contacto[] newArray(int size) {
            return new Contacto[size];
        }
    };

}
