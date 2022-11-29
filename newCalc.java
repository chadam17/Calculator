import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ventana extends JFrame {
	private JFrame jf;
	private JPanel jp1,jp2,jp3;
	private JTextField jtf;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnPunto;
	private JButton btnLimpiar;
	private JButton btnBorrar;
	private JButton btnIgual;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnProducto;
	private JButton btnDividir;
	private JButton btnElevar;
	private JButton btnParentesisI;
	private JButton btnParentesisD;
	private JButton btnResto;
	private JButton btnPi;
	private JButton btnE;
	private JButton btnRoot;
	private double op1;
    private char operador = ' ';
	private final double e = Math.E;
	private final double π = Math.PI;

	public ventana()
	{
		jf = new JFrame("Calculadora");
		jp1 = new JPanel(new FlowLayout());
		jp2 = new JPanel(new GridLayout(5,5));
		jp3 = new JPanel();
		jp3.setLayout(new BorderLayout());
		jp3.add(jp1, BorderLayout.NORTH);
		jp3.add(jp2, BorderLayout.CENTER);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jtf = new JTextField("						");
//		jtf.setHorizontalAlignment(SwingConstants.RIGHT);
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		btnPunto = new JButton(".");
		btnLimpiar = new JButton("C");
		btnBorrar = new JButton("←");
		btnIgual = new JButton("=");
		btnSuma = new JButton("+");
		btnResta = new JButton("-");
		btnProducto = new JButton("x");
		btnDividir = new JButton("/");
		btnElevar = new JButton("^");
		btnParentesisI = new JButton("(");
		btnParentesisD = new JButton(")");
		btnResto = new JButton("%");
		btnPi = new JButton("π");
		btnE = new JButton("e");
		btnRoot = new JButton("√");
//		jf.add(jp1);
//		jf.add(jp2);
		jf.add(jp3);
		jp1.add(jtf);
		jp2.add(btn7);
		jp2.add(btn8);
		jp2.add(btn9);
		jp2.add(btnDividir);
		jp2.add(btnLimpiar);
		jp2.add(btn4);
		jp2.add(btn5);
		jp2.add(btn6);
		jp2.add(btnProducto);
		jp2.add(btnBorrar);
		jp2.add(btn1);
		jp2.add(btn2);
		jp2.add(btn3);
		jp2.add(btnResta);
		jp2.add(btnResto);
		jp2.add(btn0);
		jp2.add(btnPunto);
		jp2.add(btnIgual);
		jp2.add(btnSuma);
		jp2.add(btnElevar);
		jp2.add(btnParentesisI);
		jp2.add(btnParentesisD);
		jp2.add(btnPi);
		jp2.add(btnE);
		jp2.add(btnRoot);
		jf.pack();
		btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn0ActionPerformed();
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed();
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed();
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed();
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed();
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed();
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6ActionPerformed();
            }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7ActionPerformed();
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8ActionPerformed();
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn9ActionPerformed();
            }
        });
        btnParentesisI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnParentesisIActionPerformed();
            }
        });
        btnParentesisD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnParentesisDActionPerformed();
            }
        });
        btnPunto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPuntoActionPerformed();
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgualActionPerformed();
            }
        });
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumaActionPerformed();
            }
        });
        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestaActionPerformed();
            }
        });
        btnProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnProductoActionPerformed();
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDividirActionPerformed();
            }
        });    
        btnElevar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnElevarActionPerformed();
            }
        });  
        btnResto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestoActionPerformed();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLimpiarActionPerformed();
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBorrarActionPerformed();
            }
        });
		btnPi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPiActionPerformed();
            }
        });
		btnE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEActionPerformed();
            }
        });
        btnRoot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRootActionPerformed();
            }
        });
	}
	public void btn0ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "0");
    } 
    public void btn1ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "1");
    }  
    public void btn2ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "2");
    }  
    public void btn3ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "3");
    }  
    public void btn4ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "4");
    }  
    public void btn5ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "5");
    }  
    public void btn6ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "6");
    }  
    public void btn7ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "7");
    }  
    public void btn8ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "8");
    }  
    public void btn9ActionPerformed() {                                    
        jtf.setText(jtf.getText() + "9");
    } 
    public void btnParentesisIActionPerformed() {                                    
        jtf.setText(jtf.getText() + "(");
    }  
    public void btnParentesisDActionPerformed() {                                    
        jtf.setText(jtf.getText() + ")");
    }    
    public void btnPuntoActionPerformed() {                                        
        if (!jtf.getText().contains("."))
            jtf.setText(jtf.getText() + ".");
        String s = jtf.getText();
        if (s.charAt(0) == '.')
        {
            s = '0' + s;
            jtf.setText(s);
        }      
    }
    public void btnIgualActionPerformed() {                                        
        double op2 = Double.parseDouble(jtf.getText());
        double result=0;
        switch (operador)
        {
            case '+': result = op1 + op2;break;
            case '-': result = op1 - op2;break;
            case '*': result = op1 * op2;break;
            case '/': result = op1 / op2;break;
            case '%': result = op1 % op2;break;
            case '^': result = Math.pow(op1,op2);break;
            default: result = op2;
        }
        jtf.setText(String.valueOf(result));
        operador = ' ';
    }  
    public void btnSumaActionPerformed() {                                       
        op1 = Double.parseDouble(jtf.getText());
        jtf.setText("");
        operador = '+';
    } 
    public void btnRestaActionPerformed() {                                        
        op1 = Double.parseDouble(jtf.getText());
        jtf.setText("");
        operador = '-';
    }  
    public void btnProductoActionPerformed() {                                           
        op1 = Double.parseDouble(jtf.getText());
        jtf.setText("");
        operador = '*';
    }
    public void btnDividirActionPerformed() {                                          
        op1 = Double.parseDouble(jtf.getText());
        jtf.setText("");
        operador = '/';
    }  
    public void btnElevarActionPerformed() {                                       
        op1 = Double.parseDouble(jtf.getText());
        jtf.setText("");
        operador = '^';
    } 
    public void btnRestoActionPerformed() {                                       
        op1 = Double.parseDouble(jtf.getText());
        jtf.setText("");
        operador = '%';
    }
    public void btnLimpiarActionPerformed() {                                    
        jtf.setText("");
    } 
    public void btnBorrarActionPerformed() {                                    
        String s = jtf.getText();
        String s2 = "";
        for (int i=0; i < s.length()-1; i++)
        	s2 += s.charAt(i);
        jtf.setText(s2);	 
    } 
	public void btnPiActionPerformed() {                                    
        jtf.setText(jtf.getText() + π);
    } 
	public void btnEActionPerformed() {                                    
        jtf.setText(jtf.getText() + e);
    } 
    public void btnRootActionPerformed() {                                    
        double n = Double.parseDouble(jtf.getText());
        jtf.setText(String.valueOf(Math.sqrt(n)));
    } 
}
public class newCalc {
	public static void main(String[] args) {
		ventana v = new ventana();
	}
}
