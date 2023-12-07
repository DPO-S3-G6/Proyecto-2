package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.EventListener;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;




public class MenuAdministradorGeneral extends JFrame implements ActionListener
{
	private JButton btnGestionarInv;
	private JButton btnGestionarSede;
    private JButton btnSalir;
    
    public MenuAdministradorGeneral()
    {
    	setSize( 750, 600 );
    	setTitle( "BIENVENIDO DEVUELTA ADMIN GENERAL" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        btnGestionarInv = new JButton ("GESTIONAR INVENTARIO");
        add(btnGestionarInv, BorderLayout.CENTER);

        btnGestionarSede = new JButton ("GESTIONAR SEDE");
        add(btnGestionarSede, BorderLayout.CENTER);

        btnSalir = new JButton ("SALIR");
        add(btnSalir, BorderLayout.CENTER);


        btnGestionarInv.addActionListener( this );
        btnGestionarInv.setActionCommand( "GI" );
        
        btnGestionarSede.addActionListener( this );
        btnGestionarSede.setActionCommand( "GS" );
        
        btnSalir.addActionListener( this );
        btnSalir.setActionCommand( "SALIR" );
    	
    }
    
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "GI" ))
        {
        	JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GI" );
            //principal.buscarObraPorNombre( );
        }
        else if (evento.getActionCommand( ).equals( "GS" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GS" );
        }
        else if (evento.getActionCommand( ).equals( "SALIR" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción SALIR" );
        }
        
    }
    
    
    public void dispose()
    {
        JOptionPane.showMessageDialog( this, "se guardó la aplicación" );
        System.exit( 0 );
    }
    
    public static void main(String[] args)
    {
        MenuAdministradorGeneral ventana = new MenuAdministradorGeneral( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
        



}
