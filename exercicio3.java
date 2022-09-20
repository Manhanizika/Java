import javax.swing.JOptionPane;

public class exercicio3 {
    
    public static void main(String[] args) {
        float preco_prod, prestmensal, juros, valorfina;
        int parcelas;
        preco_prod = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto a vista: ")); 
        parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de parcelas que deseja: "));

        switch (parcelas) {
            case 1:
                juros = 0;
                break;
            case 2:
            case 3:
                juros = 10;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                juros = 20;
                break;
            default:
                juros = -1;
        }

        if (parcelas <= 1){
            JOptionPane.showMessageDialog(null, "Numero de Parcelas invalido");
        }
        else {
            valorfina = preco_prod + preco_prod * juros / 100 ;
            prestmensal = valorfina / parcelas;
            JOptionPane.showMessageDialog(null, "o valor final do produto é: " + valorfina );
            JOptionPane.showMessageDialog(null, "o valor das parcelas mensais são de: " + prestmensal);
            }
        }
        }
