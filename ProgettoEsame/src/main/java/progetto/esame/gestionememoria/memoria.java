package progetto.esame.gestionememoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;


import progetto.esame.modelli.*;



public class memoria 
{
	private static ArrayList<Dati>  dati = new ArrayList<Dati>();
	private static ArrayList<Metadata> metadata = new ArrayList<Metadata>();
	
	
	public static ArrayList<Metadata> getArrayMetadata() 
	{
		
		metadata.add(new Metadata("id", "int"));
		metadata.add(new Metadata("media_type", "String"));
		metadata.add(new Metadata("media_url", "String"));
		metadata.add(new Metadata("username", "String"));
		metadata.add(new Metadata("timestamp", "String"));
		return metadata;
	}	
	

}
