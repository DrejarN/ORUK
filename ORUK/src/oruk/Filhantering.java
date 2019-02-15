/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Jamie
 */
public class Filhantering {
    
    private static OrukDB db;
    
    
    public Filhantering(OrukDB db) {
        this.db = db;
    }
    
    
}
