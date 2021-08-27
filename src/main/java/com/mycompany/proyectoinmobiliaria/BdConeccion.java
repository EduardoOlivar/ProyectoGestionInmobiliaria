package com.mycompany.proyectoinmobiliaria;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class BdConeccion {
   Connection conectar = null;

  public Connection conexion (){
      try{

          Class.forName("com.mysql.jdbc.Driver");
          conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestioninmobiliaria","root","");
          System.out.println("coneccion aceptada");

      }catch (ClassNotFoundException | SQLException e){

          System.out.println("Error:" +e);
          JOptionPane.showMessageDialog(null,"No se pudo conectar");
      }
      return conectar;
  }

}