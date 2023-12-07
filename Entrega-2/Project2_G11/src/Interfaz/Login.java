package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.EventListener;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;




public class Login extends JFrame implements ActionListener
{
	private JButton btnNombreCom;
	private JButton btnUsuario;
    private JButton btnContraseña;
    private JButton btnResgistrarse;
    
    public Login()
    {
    	setSize( 750, 600 );
    	setTitle( "BIENVENIDO" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        btnNombreCom = new JButton ("NOMBRE COMPLETO");
        add(btnNombreCom, BorderLayout.CENTER);

        btnUsuario = new JButton ("USUARIO");
        add(btnUsuario, BorderLayout.CENTER);

        btnContraseña = new JButton ("CONTRASEÑA");
        add(btnContraseña, BorderLayout.CENTER);

        btnResgistrarse = new JButton ("REGISTRARSE");
        add(btnResgistrarse, BorderLayout.CENTER);




        btnNombreCom.addActionListener( this );
        btnNombreCom.setActionCommand( "NC" );
        
        btnUsuario.addActionListener( this );
        btnUsuario.setActionCommand( "U" );
        
        btnContraseña.addActionListener( this );
        btnContraseña.setActionCommand( "C" );

        btnResgistrarse.addActionListener( this );
        btnResgistrarse.setActionCommand( "R" );
    	
    }
    
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "NC" ))
        {
        	JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GI" );
            //principal.buscarObraPorNombre( );
        }
        else if (evento.getActionCommand( ).equals( "U" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GS" );
        }
        else if (evento.getActionCommand( ).equals( "C" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción SALIR" );
        }
        else if (evento.getActionCommand( ).equals( "R" ))
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
        Login ventana = new Login( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
        



}
