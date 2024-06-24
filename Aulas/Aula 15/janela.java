
package graficot1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class Janela extends JFrame implements ActionListener, MouseListener{
    
    private JPopupMenu puMenu;
    
    private JMenu menuForma;
    private JMenu menuCor;
    
    
    private JMenuItem itemForma1;
    private JMenuItem itemForma2;
    private JMenuItem itemForma3;
    
    private JMenuItem itemCor1;
    private JMenuItem itemCor2;
    private JMenuItem itemCor3;
    
    private Desenho desenho;
    
    int itemForma;
    int tipoCor;
    
    Janela(){
        puMenu = new JPopupMenu();
        
        menuForma = new JMenu("Forma");
        menuCor = new JMenu("Cor");
        
        itemForma1 = new JMenuItem("Triângulo");
        itemForma2 = new JMenuItem("Circulo");
        itemForma3 = new JMenuItem("Retângulo");
        
        itemCor1 = new JMenuItem("Vermelho");
        itemCor2 = new JMenuItem("Azul");
        itemCor3 = new JMenuItem("Verde");
       
        menuForma.add(itemForma1);
        menuForma.add(itemForma2);
        menuForma.add(itemForma3);
        
        menuCor.add(itemCor1);
        menuCor.add(itemCor2);
        menuCor.add(itemCor3);
        
        puMenu.add(menuForma);
        puMenu.add(menuCor);
        
        this.addMouseListener(this);
        
        itemForma1.addActionListener(this);
        itemForma2.addActionListener(this);
        itemForma3.addActionListener(this);
        
        itemCor1.addActionListener(this);
        itemCor2.addActionListener(this);
        itemCor3.addActionListener(this);
        
        desenho = new Desenho();
        
        this.setTitle("Desenho");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
         this.add( desenho);
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
                 if(e.getSource() == itemForma1){
            itemForma = 1;
            
        }else if(e.getSource() == itemForma2){
            itemForma = 2;
        }else if(e.getSource() == itemForma3){
            itemForma = 3;
        
    }   

            if(e.getSource() == itemCor1){
            tipoCor = 1;
            
        }else if(e.getSource() == itemCor2){
            tipoCor = 2;
        }else if(e.getSource() == itemCor3){
            tipoCor = 3;
        
    }  
            
 }

        
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
