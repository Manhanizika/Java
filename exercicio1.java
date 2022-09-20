import javax.swing.JOptionPane;

public class exercicio1 {

    public static void main(String[] args) {
        float a, b, c,
         delta,
         raiz1, raiz2;

        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Escreva o valor do coeficiente A")); 
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Escreva o valor do coeficiente B"));
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Escreva o valor do coeficiente C"));

        delta= (b*b)-(4*a*c);

        if(delta >=0){
        raiz1 = -b+(float)(Math.sqrt(delta))/2*a;
        raiz2 = -b-(float)(Math.sqrt(delta))/2*a;
        JOptionPane.showMessageDialog(null,"A raíz (+) é " + raiz1);
        JOptionPane.showMessageDialog(null,"A raíz (-) é " + raiz2);
    }
        else {
            JOptionPane.showMessageDialog(null, "Essas raizes não serão calculadas: ");
        }
    }
}

