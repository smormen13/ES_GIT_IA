package jungle;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class LineaDeCompra
{
private int cod_linea_compra;
private static int num_cod_lc = 0;
private int cantidad_linea_compra;
private float precio_linea_compra;
private Medicamento m;
public LineaDeCompra(int cantidad_, Medicamento m_)
{
 this.cod_linea_compra = num_cod_lc++;
this.cantidad_linea_compra = cantidad_;
 this.m = m_;
this.precio_linea_compra = this.m.getPrecioMedicamento() *
this.cantidad_linea_compra;
}
//Metodos observadores
public int getCod_linea_compra()
{
 return this.cod_linra_compra;
}
public int getCantidad_linea_compra()
{
 return this.cantidad_linea_compra;
}
public float getPrecio_linea_compra()
{
 return this.precio_linea_compra;
}
public Medicamento getMedicamento()
{
 return this.m;
}
 private int cod_lc;
 private int cantidad_lc;
 private float precio_lc;
 private Medicamento m;
 public LineaDeCompra(int cantidad_, Medicamento m_)
 {
 this.cantidad_lc = cantidad_;
 this.m = m_;
 this.precio_lc = this.m.getPrecioMedicamento() * this.cantidad_lc;
 }
 public int getCod_lc()
 {
 return this.cod_lc;
 }
 public int getCantidad_lc()
 {
 return this.cantidad_lc;
 }
 public float getPrecio_lc()
 {
 return this.precio_lc;
 }
 public Medicamento getMedicamento()
 {
 return this.m;
 }
}
