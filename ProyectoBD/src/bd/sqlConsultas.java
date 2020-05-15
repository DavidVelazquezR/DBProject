/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import clases.editTabletrue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uriel
 */
public class sqlConsultas {
 
    public float cortemensual(){
        float corte=0;
        String var=null;
        PreparedStatement ps = null;//Objeto que permite usar declaraciones preparadas por la libreria para un facil acceso a MySql
        ResultSet rs = null;//Muestra Datos almacenados en la BD
        Connection con;//objeto que permite la conexion a la BD(MySql)
        
        try{
            con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
            ps=con.prepareStatement("SELECT (SUM(total)) FROM venta  WHERE MONTH(fecha)=MONTH(CURDATE()) AND DAYOFMONTH(CURDATE())= ?");
            ps.setString(1,"28");
            rs=ps.executeQuery();
            if(rs.last()){
                corte= rs.getFloat(1);
            }            
         return corte;   
        }catch(Exception e){
            System.err.println(e);
         return corte;   
        }                        
    }
    public void visualizar_tabla(JTable tabla, String cant){
        Connection con;//objeto que permite la conexion a la BD(MySql) 
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        Querys q = new Querys();
        DefaultTableModel atm=new editTabletrue();
        String []titulo=new String[] {"ID","Descripcion","Cantidad"};
         
        atm= q.SeleccionTable(con,cant, titulo);
         
         
         tabla.setRowHeight(16);
         tabla.setModel(atm);
         
    }
    
    
}
