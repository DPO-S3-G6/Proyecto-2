package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.EventListener;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;




public class MenuAdministradorLocal extends JFrame implements ActionListener
{
	private JButton btnGestionarEmple;
    private JButton btnSalir;
    
    public MenuAdministradorLocal()
    {
    	setSize( 750, 600 );
    	setTitle( "BIENVENIDO DEVUELTA ADMIN LOCAL" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        btnGestionarEmple = new JButton ("GESTIONAR EMPLEADOS");
        add(btnGestionarEmple, BorderLayout.CENTER);

        btnSalir = new JButton ("SALIR");
        add(btnSalir, BorderLayout.CENTER);


        btnGestionarEmple.addActionListener( this );
        btnGestionarEmple.setActionCommand( "GE" );
        
        btnSalir.addActionListener( this );
        btnSalir.setActionCommand( "SALIR" );
    	
    }
    

    
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "GE" ))
        {
        	JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GI" );
            //principal.buscarObraPorNombre( );
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
        MenuAdministradorLocal ventana = new MenuAdministradorLocal( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
        



}
