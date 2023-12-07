package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.EventListener;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;




public class MenuCliente extends JFrame implements ActionListener
{
	private JButton btnReservarVehi;
	private JButton btnConsultarPerfil;
    private JButton btnVerReserva;
    private JButton btnSalir;
    
    public MenuCliente()
    {
    	setSize( 750, 600 );
    	setTitle( "MENU CLIENTE" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        btnReservarVehi = new JButton ("RESERVAR VEHICULO");
        add(btnReservarVehi, BorderLayout.CENTER);

        btnConsultarPerfil = new JButton ("CONSULTAR PERFIL");
        add(btnConsultarPerfil, BorderLayout.CENTER);

        btnVerReserva = new JButton ("VER RESERVA");
        add(btnVerReserva, BorderLayout.CENTER);

        btnSalir = new JButton ("SALIR");
        add(btnSalir, BorderLayout.CENTER);




        btnReservarVehi.addActionListener( this );
        btnReservarVehi.setActionCommand( "RV" );

        btnConsultarPerfil.addActionListener( this );
        btnConsultarPerfil.setActionCommand( "CP" );
        
        btnVerReserva.addActionListener( this );
        btnVerReserva.setActionCommand( "VR" );
        
        btnSalir.addActionListener( this );
        btnSalir.setActionCommand( "SALIR" );
    	
    }
    
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "RV" ))
        {
        	JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GI" );
            //principal.buscarObraPorNombre( );
        }
        else if (evento.getActionCommand( ).equals( "CP" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GS" );
        }
        else if (evento.getActionCommand( ).equals( "VR" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción SALIR" );
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
        MenuCliente ventana = new MenuCliente( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
        



}
