package mx.hammer.usb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import mx.hammer.entities.Entidades;

public class EUSB {

    private String rutaArchivos, vd2;
    Vector<String> v = new Vector<String>();
    Vector<String> vd = new Vector<String>();
    int x = 0;

    public EUSB() {
    }

    public void lArchivos(Entidades ent) {

       
        File f = new File(ent.getRutaDevice());
       
        if (f.exists()) {

            File[] arch = f.listFiles();

            for (int i = 0; i < arch.length; i++) {

                if (arch[i].isDirectory()) {

                    vd2 = arch[i].getParent() + "/" + arch[i].getName();
                    vd.add(vd2);
                    

                } else {
  
                    
                    rutaArchivos = arch[i].getParent() + "/" + arch[i].getName();
                    v.add(rutaArchivos);

                }

            }
            

        } else {

            JOptionPane.showMessageDialog(null, "*** El path no existe ***");

        }
        
        if(x == vd.size()){
  
                //System.out.println(""+v.size());
                 
             }
        
        while(x < vd.size()){
            
            vd2 = (String) vd.elementAt(x);
            ent.setRutaDevice(vd2);
            x++;

            lArchivos(ent);   
        }  
   
   }
    

    public void cUSB(Entidades ent) {
        
        int i=0;
        String vector;
        
        while(i < v.size()){
            
           vector = (String) v.elementAt(i); 
           ent.setRutaArchivos(vector);
           System.out.println(""+ent.getRutaArchivos());
           

        try {
            
                FileInputStream file = new FileInputStream(ent.getRutaArchivos());
                FileOutputStream outStream = new FileOutputStream(ent.getRutaArchivos() + ".hmmr");
                byte k[] = "***xXHAMMERXx***".getBytes();
                SecretKeySpec key = new SecretKeySpec(k, "AES");
                Cipher enc = Cipher.getInstance("AES");
                enc.init(Cipher.ENCRYPT_MODE, key);
                CipherOutputStream cos = new CipherOutputStream(outStream, enc);
                byte[] buf = new byte[1024];
                int read;
                while ((read = file.read(buf)) != -1) {
                    cos.write(buf, 0, read);
                }
                file.close();
                outStream.flush();
                cos.close();
                File fl = new File(ent.getRutaArchivos());

                if (fl.exists()) {

                    fl.delete();

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            i++;
        }

    }

    public void dUSB(Entidades ent) {

        int a = 0, b = 0;
        int i=0;
        String vector;
        
        while(i < v.size()){
            
           vector = (String) v.elementAt(i); 
           ent.setRutaArchivos(vector);
           System.out.println(""+ent.getRutaArchivos());
        
            String hmmr = ent.getRutaArchivos();
            a = hmmr.length();
            b = a - 5;
            String nRuta = hmmr.substring(0, b);

            try {

                    FileInputStream file = new FileInputStream(ent.getRutaArchivos());
                    FileOutputStream outStream = new FileOutputStream(nRuta);
                    byte k[] = "***xXHAMMERXx***".getBytes();
                    SecretKeySpec key = new SecretKeySpec(k, "AES");
                    Cipher enc = Cipher.getInstance("AES");
                    enc.init(Cipher.DECRYPT_MODE, key);
                    CipherOutputStream cos = new CipherOutputStream(outStream, enc);
                    byte[] buf = new byte[1024];
                    int read;
                    while ((read = file.read(buf)) != -1) {
                        cos.write(buf, 0, read);
                    }

                    file.close();
                    outStream.flush();
                    cos.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                File fl = new File(ent.getRutaArchivos());

                if (fl.exists()) {

                    fl.delete();

                }
                
                i++;

            }
        
    }

}
