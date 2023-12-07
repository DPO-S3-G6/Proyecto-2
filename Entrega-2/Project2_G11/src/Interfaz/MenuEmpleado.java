package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.EventListener;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;




public class MenuEmpleado extends JFrame implements ActionListener
{
	private JButton btnCrearReserva;
	private JButton btnGestionarDis;
    private JButton btnSalir;
    
    public MenuEmpleado()
    {
    	setSize( 750, 600 );
    	setTitle( "BIENVENIDO DEVUELTA EMPLEADO" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        btnCrearReserva = new JButton ("CREAR RESERVA");
        add(btnCrearReserva, BorderLayout.CENTER);

        btnGestionarDis = new JButton ("GESTIONAR DISPONIBILIDAD");
        add(btnGestionarDis, BorderLayout.CENTER);

        btnSalir = new JButton ("SALIR");
        add(btnSalir, BorderLayout.CENTER);


        btnCrearReserva.addActionListener( this );
        btnCrearReserva.setActionCommand( "CR" );
        
        btnGestionarDis.addActionListener( this );
        btnGestionarDis.setActionCommand( "GD" );
        
        btnSalir.addActionListener( this );
        btnSalir.setActionCommand( "SALIR" );
    	
    }
    
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "CR" ))
        {
        	JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GI" );
            //principal.buscarObraPorNombre( );
        }
        else if (evento.getActionCommand( ).equals( "GD" ))
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
        MenuEmpleado ventana = new MenuEmpleado( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
        



}