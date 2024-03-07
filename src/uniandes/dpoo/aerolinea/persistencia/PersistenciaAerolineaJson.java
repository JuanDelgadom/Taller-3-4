package uniandes.dpoo.aerolinea.persistencia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {
	
	public PersistenciaAerolineaJson() {
		
	}
	public void cargarAerolinea(String archivo, Aerolinea aerolinea) throws IOException, InformacionInconsistenteException {
		 String jsonCompleto = new String( Files.readAllBytes( new File( archivo ).toPath( ) ) );
		 JSONObject raiz = new JSONObject( jsonCompleto );
	}
	public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException {
		JSONObject jobject = new JSONObject( );


        // Escribir la estructura JSON en un archivo
        PrintWriter pw = new PrintWriter( archivo );
        jobject.write( pw, 2, 0 );
        pw.close( );
	}

}
