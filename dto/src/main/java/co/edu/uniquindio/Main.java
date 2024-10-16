package co.edu.uniquindio;

import co.edu.uniquindio.DTO.DireccionDTO;
import co.edu.uniquindio.DTO.PersonaDTO;
import co.edu.uniquindio.RECORD.PedidoRecord;
import co.edu.uniquindio.RECORD.PersonaRecord;
import co.edu.uniquindio.RECORD.ProductoRecord;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        DireccionDTO direccionDTO1 = null;
        PersonaDTO personaDTO = new PersonaDTO("Deivi", "Arroyabe", 17, direccionDTO1);
        direccionDTO1 = new DireccionDTO("15", "Mareigua", "Maicao");

        ProductoRecord productoRecord1 = new ProductoRecord("Vapo", 25000.0);
        PedidoRecord pedidoRecord1 = new PedidoRecord(productoRecord1, 5);

        PersonaRecord personaRecord = new PersonaRecord("Natalia", "Espinal", 14);
    }
}    