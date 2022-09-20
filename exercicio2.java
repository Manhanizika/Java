import javax.swing.JOptionPane;

public class exercicio2{
public static void main(String[] args) {
    float km, h, velocidade;

km = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite os kilometros")); 
h = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite as horas de viagem"));
velocidade = km/h;
JOptionPane.showMessageDialog(null, "a velocidade do veiculo foi de:" +velocidade + "KM/h");
}
}