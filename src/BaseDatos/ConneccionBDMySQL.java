package BaseDatos;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConneccionBDMySQL {
    
    public String db = "fenix";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    
    public ConneccionBDMySQL()
    {
        
    }// termina ConexionMySQL
    public Connection Conectar()
    {
        Connection link = null;
        try 
        {
           //cargamos el Driver MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            //creamos un enlace hacia la base de datos
            link = DriverManager.getConnection(this.url,this.user,this.pass);
            
        }//Termina Try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e); 
        }//termina catch
        return link;
    }// termina public Conection
    }// termina class ConexionMySQL