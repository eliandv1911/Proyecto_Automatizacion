package co.com.tcs.tallerautomatizacion.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFileTxt {
    public static List<String> ReadData(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int count = 1;
        List<String> dataFileTxt = new ArrayList<String>();
        while((cadena = b.readLine())!=null) {
            dataFileTxt.add(cadena);

        }

        b.close();
        return dataFileTxt;
    }

}
