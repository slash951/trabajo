package cl.slash.trabajo;

public class ListaProducto {
    private String idProducto;
    private String Nombre;
    private String precio;


    public ListaProducto()
    {
        this.idProducto="";
        this.Nombre="";
        this.precio="";
    }
    public ListaProducto(String idProducto, String Nombre, String precio)
    {
        this.idProducto=idProducto;
        this.Nombre=Nombre;
        this.precio=precio;
    }
    public String getIdProducto(){return idProducto;}
    public void setIdProducto(){this.idProducto=idProducto;}
    public String getNombre(){return Nombre;}
    public void setNombre(){this.Nombre=Nombre;}
    public String getPrecio(){return precio;}
    public void setPrecio(){this.precio=precio;}



}
