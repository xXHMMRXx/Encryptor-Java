
package mx.hammer.text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.hammer.entities.Entidades;


public class EHammer 
{
    
    private int cont;
    private String temp, nMsj;
    private char cAt, cAt2;
    
    public EHammer() {}
    
    public void cHammer(Entidades ent)
    {
        
        temp = ent.getcMensaje();
        cont = temp.length();
        
        char [] nHammer = new char [cont];
        
        for (int i = 0; i < cont; i++) 
        {
            
            cAt = temp.charAt(i);
            
            if(temp != null){
                
                if(cAt == 'A')
                    
                    nHammer[i] = 'æ';
                
                if(cAt == 'B')
                    
                    nHammer[i] = '*';
                
                if(cAt == 'C')
                    
                    nHammer[i] = '<';
                    
                if(cAt == 'D')
                    
                    nHammer[i] = '©';
                
                if(cAt == 'E')
                    
                    nHammer[i] = 'þ';
                
                if(cAt == 'F')
                    
                    nHammer[i] = 'Ç';
                
                if(cAt == 'G')
                    
                    nHammer[i] = 'Ø';
                
                if(cAt == 'H')
                    
                    nHammer[i] = '!';
                
                if(cAt == 'I')
                    
                    nHammer[i] = '+';
                
                if(cAt == 'J')
                    
                    nHammer[i] = 'Ð';
                
                if(cAt == 'K')
                    
                    nHammer[i] = '/';
                
                if(cAt == 'L')
                    
                    nHammer[i] = '§';
                
                if(cAt == 'M')
                    
                    nHammer[i] = '?';
                
                if(cAt == 'N')
                    
                    nHammer[i] = '$';
                
                if(cAt == 'Ñ')
                    
                    nHammer[i] = '£';
                
                if(cAt == 'O')
                    
                    nHammer[i] = '¦';
                
                if(cAt == 'P')
                    
                    nHammer[i] = '¬';
                
                if(cAt == 'Q')
                    
                    nHammer[i] = '@';
                
                if(cAt == 'R')
                    
                    nHammer[i] = 'ı';
                
                if(cAt == 'S')
                    
                    nHammer[i] = 'Æ';
                
                if(cAt == 'T')
                    
                    nHammer[i] = '¥';
                
                if(cAt == 'U')
                    
                    nHammer[i] = ':';
                
                if(cAt == 'V')
                    
                    nHammer[i] = '-';
                
                if(cAt == 'W')
                    
                    nHammer[i] = '^';
                
                if(cAt == 'X')
                    
                    nHammer[i] = 'º';
                
                if(cAt == 'Y')
                    
                    nHammer[i] = 'Õ';
                
                if(cAt == 'Z')
                    
                    nHammer[i] = '±';
                
                if(cAt == '0')
                    
                    nHammer[i] = '¶';
                
                if(cAt == '1')
                    
                    nHammer[i] = 'Ö';
                
                if(cAt == '2')
                    
                    nHammer[i] = 'f';
                    
                if(cAt == '3')
                    
                    nHammer[i] = 'C';
                    
                if(cAt == '4')
                    
                    nHammer[i] = '{';
                    
                if(cAt == '5')
                    
                    nHammer[i] = '╝';  
                    
                if(cAt == '6')
                    
                    nHammer[i] = '¨';
                    
                if(cAt == '7')
                    
                    nHammer[i] = '%';
                    
                if(cAt == '8')
                    
                    nHammer[i] = '═';
                    
                if(cAt == '9')
                    
                    nHammer[i] = '≡';
                
                if(cAt == ' ')
                    
                    nHammer[i] = '#';
                    
                
                
            }else{
                
                System.out.println("*** Error al cifrar ***");
                
            }
 
        }
        
        StringBuffer sb = new StringBuffer();
            
            for (int j = 0; j < nHammer.length; j++) 
                       
                sb = sb.append(nHammer[j]);

            nMsj = sb.toString();
            ent.setcMensaje(nMsj);

            cont = 0;
            temp = null;
            nMsj= null;
      
    }
    
    public void dHammer(Entidades ent)
    {
        
        temp = ent.getdMensaje();
        cont = temp.length();
        
        char [] nHammer = new char [cont];
        
        for (int i = 0; i < cont; i++) 
        {
            
            cAt2 = temp.charAt(i);
            
            if(temp != null){
                
                if(cAt2 == 'æ')
                    
                    nHammer[i] = 'A';
                
                if(cAt2 == '*')
                    
                    nHammer[i] = 'B';
                
                if(cAt2 == '<')
                    
                    nHammer[i] = 'C';
                    
                if(cAt2 == '©')
                    
                    nHammer[i] = 'D';
                
                if(cAt2 == 'þ')
                    
                    nHammer[i] = 'E';
                
                if(cAt2 == 'Ç')
                    
                    nHammer[i] = 'F';
                
                if(cAt2 == 'Ø')
                    
                    nHammer[i] = 'G';
                
                if(cAt2 == '!')
                    
                    nHammer[i] = 'H';
                
                if(cAt2 == '+')
                    
                    nHammer[i] = 'I';
                
                if(cAt2 == 'Ð')
                    
                    nHammer[i] = 'J';
                
                if(cAt2 == '/')
                    
                    nHammer[i] = 'K';
                
                if(cAt2 == '§')
                    
                    nHammer[i] = 'L';
                
                if(cAt2 == '?')
                    
                    nHammer[i] = 'M';
                
                if(cAt2 == '$')
                    
                    nHammer[i] = 'N';
                
                if(cAt2 == '£')
                    
                    nHammer[i] = 'Ñ';
                
                if(cAt2 == '¦')
                    
                    nHammer[i] = 'O';
                
                if(cAt2 == '¬')
                    
                    nHammer[i] = 'P';
                
                if(cAt2 == '┌')
                    
                    nHammer[i] = '@';
                
                if(cAt2 == 'ı')
                    
                    nHammer[i] = 'R';
                
                if(cAt2 == 'Æ')
                    
                    nHammer[i] = 'S';
                
                if(cAt2 == '¥')
                    
                    nHammer[i] = 'T';
                
                if(cAt2 == ':')
                    
                    nHammer[i] = 'U';
                
                if(cAt2 == '-')
                    
                    nHammer[i] = 'V';
                
                if(cAt2 == '^')
                    
                    nHammer[i] = 'W';
                
                if(cAt2 == 'º')
                    
                    nHammer[i] = 'X';
                
                if(cAt2 == 'Õ')
                    
                    nHammer[i] = 'Y';
                
                if(cAt2 == '±')
                    
                    nHammer[i] = 'Z';
                
                if(cAt2 == '¶')
                    
                    nHammer[i] = '0';
                
                if(cAt2 == 'Ö')
                    
                    nHammer[i] = '1';
                
                if(cAt2 == 'f')
                    
                    nHammer[i] = '2';
                    
                if(cAt2 == 'C')
                    
                    nHammer[i] = '3';
                    
                if(cAt2 == '{')
                    
                    nHammer[i] = '4';
                    
                if(cAt2 == '╝')
                    
                    nHammer[i] = '5';  
                    
                if(cAt2 == '¨')
                    
                    nHammer[i] = '6';
                    
                if(cAt2 == '%')
                    
                    nHammer[i] = '7';
                    
                if(cAt2 == '═')
                    
                    nHammer[i] = '8';
                    
                if(cAt2 == '≡')
                    
                    nHammer[i] = '9';
                
                if(cAt2 == '#')
                    
                    nHammer[i] = ' ';
                
                
            }else{
                
                System.out.println("*** Error al decifrar ***");
                
            }
 
        }
        
        StringBuffer sb = new StringBuffer();
            
            for (int j = 0; j < nHammer.length; j++) 
            {
                       
                sb = sb.append(nHammer[j]);
                
            }

            nMsj = sb.toString();
            ent.setdMensaje(nMsj);

    }
    
}
