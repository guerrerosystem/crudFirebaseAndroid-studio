package com.example.crud_firebase;

public class model
{
  String nombre,edad,email,purl;
    model()
    {

    }

    public model(String nombre, String edad, String email, String purl) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.purl = purl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
