/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import Model.Aprendiz;
import interfaz.MeAprendiz;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public class AprendizDao implements MeAprendiz{

    @Override
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoApre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarApre(Aprendiz ap) {
        String sql="insert into Aprendiz(documentoA,Nombrea,ApellidoA,CorreoA,telefonoA)values('"+ap.getDocumentoA()+"','"+ap.getNombreA()+"','"+ap.getApellidoA()+"','"+ap.getCorreoA()+"','"+ap.getTelefonoA()+"')";
        try{
        
        }catch(){
        
        }
        return false;
    }

    @Override
    public boolean actualizarApre(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarApre(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
