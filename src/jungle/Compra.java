package jungle;

import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Compra {
    private int cod_com;
    private static int num_cod_com = 0;
    private DateTimeFormatter fecha_com;
    private List<LineaDeCompra> lista_compra;
    private float precioTotal_com;

    public Compra() {
        this.cod_com = num_cod_com++;
        this.lista_compra = new ArrayList<LineaDeCompra>();
        this.fecha_com = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        this.precioTotal_com = 0;
    }

    public void addTo_compra(LineaDeCompra l) {
        this.lista_compra.add(l);
        this.precioTotal_com += l.getPrecio_lc();
    }

    public void removeFrom_compra(LineaDeCompra l, int i) {
        this.precioTotal_com -= l.getPrecio_lc();
        this.lista_compra.remove(i);
    }

    public String resumen_compra() {
        String cad = new String("RESUMEN DE LA COMPRA\nID\tNOMBRE\tCANTIDAD\tPRECIO\t\n\n");
        for (int i = 0; i < this.lista_compra.size(); i++) {
            String cad1 = this.lista_compra.get(i).getMedicamento().getNombre_med();
            if (cad1.length() >= 8) {
                cad += i + 1;
                cad += "\t";
                cad += this.lista_compra.get(i).getMedicamento().getNombre_med();
                cad += "\t";
                cad += this.lista_compra.get(i).getCantidad_lc();
                cad += "\t";
                cad += this.lista_compra.get(i).getPrecio_lc();
                cad += "\n\n";
            } else {
                cad += i + 1;
                cad += "\t";
                cad += this.lista_compra.get(i).getMedicamento().getNombre_med();
                cad += "\t\t"; // Doble tabulación para alinear
                cad += this.lista_compra.get(i).getCantidad_lc();
                cad += "\t";
                cad += this.lista_compra.get(i).getPrecio_lc();
                cad += "\n\n";
            }
        }
        cad += "\nPRECIO TOTAL: ";
        cad += this.precioTotal_com;
        cad += " euros\n\n";
        return cad;
    }

    public void generateTicket_compra() {
        int n = 1;
        String cad = resumen_compra();
        // Ruta ajustada genéricamente, puedes cambiarla si quieres
        String ruta = "Ticket" + n + ".txt"; 
        
        File f;
        boolean salida = false;
        try {
            do {
                f = new File(ruta);
                if (f.exists()) {
                    n++;
                    ruta = "Ticket" + n + ".txt";
                } else {
                    salida = true;
                }
            } while (salida == false);

            FileWriter Ticket = new FileWriter(ruta);
            Ticket.write(cad);
            Ticket.close();
            System.out.println("Se ha impreso el ticket: " + ruta);
        } catch (IOException e) {
            System.out.println("Error en generarTicket_compra()");
        }
    }

    public int getCod_com() {
        return this.cod_com;
    }

    public DateTimeFormatter getFecha_com() {
        return this.fecha_com;
    }

    public List<LineaDeCompra> getLista_compra() {
        return this.lista_compra;
    }

    public float getPrecioTotal_com() {
        return this.precioTotal_com;
    }
}
