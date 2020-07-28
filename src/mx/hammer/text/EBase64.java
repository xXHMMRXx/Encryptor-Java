
package mx.hammer.text;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import mx.hammer.entities.Entidades;


public class EBase64 
{
    
    private String cB64, dB64;

    public EBase64() {}
    
    public void cBase64(Entidades ent)
    {
        
        Base64.Encoder e = Base64.getEncoder();
        this.cB64 = e.encodeToString(ent.getcMensaje().getBytes(StandardCharsets.UTF_8));   
        
        ent.setcMensaje(cB64);
        
    }
   
    public void dBase64(Entidades ent)
    {
        
        Base64.Decoder d = Base64.getDecoder();
        byte[] decodedByteArray = d.decode(ent.getdMensaje());
        this.dB64 = new String(decodedByteArray);   
        
        ent.setdMensaje(dB64);
        
    }
    
}
