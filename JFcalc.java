import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
public class JFcalc extends JFrame { 
   //Atributos
   
   private String numeros;
   private String accion = "null";
   private boolean actIgual = false;
   private boolean mismOp = true;
   private boolean punt = true;
   private double primNum = 0;
   private double secNum = 0;
   private double resultadoInter= 0;
   
   
   JTextField txtInp;
   JPanel panel;
   JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, sum, rest, mult, div, limp, bor1, igual, punto, salir;
   JLabel resultado, operacion;
   
   public JFcalc() {
      initComponents();
   }
   
   public void initComponents() {
      //Creacion del panel
      JPanel panel = new JPanel() ;
      panel.setLayout(null);
      
      /*Tamaño de la ventana
            Ancho,  alto*/      
      setSize(600, 740);
      //Titulo de la ventana
      setTitle("Calculadora realizada por: Fregoso Leon David"); 
      
      //Textos
      resultado = new  JLabel (" Resultado: ");
      resultado.setBounds(40, 80, 500, 40);
      
      resultado.setFont(new Font("Calisto MT", Font.BOLD, 20));
      
      operacion = new  JLabel (" Operacion: ");
      operacion.setBounds(40, 30, 500, 40);
      operacion.setFont(new Font("Calisto MT", Font.BOLD, 20));
      
      //Caja de texto
      txtInp = new JTextField("0", 20);
      txtInp.setBounds(40, 130, 500, 40);
      txtInp.setFont(new Font("Calisto MT", Font.BOLD, 20));
      txtInp.setEditable(false);
      
      //Botones 
      num0 = new JButton("0");
      num0.setBounds(170, 570, 110, 75);
      
      num1 = new JButton("1");
      num1.setBounds(40, 475, 110, 75);
      
      num2 = new JButton("2");
      num2.setBounds(170, 475, 110, 75);
      
      num3 = new JButton("3");
      num3.setBounds(300, 475, 110, 75);
      
      num4 = new JButton("4");
      num4.setBounds(40, 380, 110, 75);
      
      num5 = new JButton("5");
      num5.setBounds(170, 380, 110, 75);
      
      num6 = new JButton("6");
      num6.setBounds(300, 380, 110, 75);
      
      num7 = new JButton("7");
      num7.setBounds(40, 285, 110, 75);
      
      num8 = new JButton("8");
      num8.setBounds(170, 285, 110, 75);
      
      num9 = new JButton("9");
      num9.setBounds(300, 285, 110, 75);
      
      sum = new JButton("+");
      sum.setBounds(430, 475, 110, 75);
      
      rest = new JButton("-");
      rest.setBounds(430, 380, 110, 75);
      
      mult = new JButton("*");
      mult.setBounds(430, 285, 110, 75);
      
      div = new JButton("/");
      div.setBounds(430, 190, 110, 75);
      
      limp = new JButton("C");
      limp.setBounds(40, 190, 165, 75);
      
      bor1 = new JButton("<-");      
      bor1.setBounds(245, 190, 165, 75);
      
      igual = new JButton("=");
      igual.setBounds(430, 570, 110, 75);
      
      punto  = new JButton(".");
      punto.setBounds(300, 570, 110, 75);
      
      salir = new JButton("Salir");
      salir.setBounds(40, 570, 110, 75);
      
      
      //Adicion de los elementos al panel   
      //Textos
      panel.add(resultado);
      panel.add(operacion);
      
      //Caja de texto
      panel.add(txtInp);
      
      //Numeros y punto
      panel.add(num0);
      panel.add(num1);
      panel.add(num2);
      panel.add(num3);
      panel.add(num4);
      panel.add(num5);
      panel.add(num6);
      panel.add(num7);
      panel.add(num8);
      panel.add(num9);
      panel.add(punto);
      
      //Botones de accion y operacion
      panel.add(sum);
      panel.add(rest);
      panel.add(mult);
      panel.add(div);
      panel.add(limp);
      panel.add(bor1);
      panel.add(igual);
      panel.add(salir);
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      
      setContentPane(panel);
      
      //Hacemos visible la ventana
 	   setVisible(true); 
      
      //Agregamos los listener de los numeros y el punto
      num0.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
         }
      });
      
      num1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
         }
      });
      
      num2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
         }
      });
      
      num3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
         }
      });
      
      num4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
         }
      });
      
      num5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
         }
      });
      
      num6.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
         }
      });
      
      num7.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
         }
      });
      
      num8.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
         }
      });
      
      num9.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
         }
      });
      
      punto.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
         }
      });
      
      //Agregamos los listeners de los Botones de accion y operacion
      limp.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpActionPerformed(evt);
         }
      });
      
      sum.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
         }
      });
      
      rest.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
         }
      });
      
      mult.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
         }
      });
      
      div.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
         }
      });
      
      bor1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                bor1ActionPerformed(evt);
         }
      });
      
      igual.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
         }
      });
      
      salir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
         }
      });
      
   }
   
   //Agregamos los action performed de los numeros y el punto
   private void num0ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {      
         if (txtInp.getText().equals("0")) {
            numeros = "0";
         } else {
            numeros += "0";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num1ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {   
         if (txtInp.getText().equals("0")) {
            numeros = "1";
         } else {
            numeros += "1";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num2ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {   
         if (txtInp.getText().equals("0")) {
            numeros = "2";
         } else {
            numeros += "2";
         }
         txtInp.setText(numeros);
      }      
   }
   
   private void num3ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         if (txtInp.getText().equals("0")) {
            numeros = "3";
         } else {
            numeros += "3";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num4ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {   
         if (txtInp.getText().equals("0")) {
            numeros = "4";
         } else {
            numeros += "4";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num5ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         if (txtInp.getText().equals("0")) {
            numeros = "5";
         } else {
            numeros += "5";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num6ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         if (txtInp.getText().equals("0")) {
            numeros = "6";
         } else {
            numeros += "6";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num7ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         if (txtInp.getText().equals("0")) {
            numeros = "7";
         } else {
            numeros += "7";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num8ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         if (txtInp.getText().equals("0")) {
            numeros = "8";
         } else {
            numeros += "8";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void num9ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         if (txtInp.getText().equals("0")) {
            numeros = "9";
         } else {
            numeros += "9";
         }
         txtInp.setText(numeros);
      }
   }
   
   private void puntoActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         if (punt == true) {
            if (txtInp.getText().equals("0")) {
               numeros = "0.";
            } else {
               numeros += ".";
            }
            txtInp.setText(numeros);
         }
         punt = false;
      }
   }
   
   //Agregamos los action performed de los botones de accion y operacion
   private void limpActionPerformed(java.awt.event.ActionEvent evt) {
      txtInp.setText("0");
      numeros = "";
      operacion.setText(" Operacion: ");
      resultado.setText(" Resultado: ");
      primNum = 0;
      secNum = 0;
      punt = true;
      mismOp = true;
      actIgual = false;
      
   }
   
   private void sumActionPerformed(java.awt.event.ActionEvent evt) {
      if (mismOp == true) {
         actIgual = false;
         primNum = Double.parseDouble(txtInp.getText());
         operacion.setText(" Operacion: " + txtInp.getText() + " + ");
         txtInp.setText("0");
         accion = "sumar";
         
         mismOp = false;
         punt = true;
      }
   }
   private void restActionPerformed(java.awt.event.ActionEvent evt) {
      if (mismOp == true) {
         actIgual = false;
         primNum = Double.parseDouble(txtInp.getText());
         operacion.setText(" Operacion: " + txtInp.getText() + " - ");
         txtInp.setText("0");
         accion = "restar";
         
         mismOp = false;
         punt = true;
      }  
   }
   private void multActionPerformed(java.awt.event.ActionEvent evt) {
      if (mismOp == true) {
         actIgual = false;
         primNum = Double.parseDouble(txtInp.getText());
         operacion.setText(" Operacion: " + txtInp.getText() + " * ");
         txtInp.setText("0");
         accion = "multiplicar";
         
         mismOp = false;
         punt = true;
      }     
   }
   private void divActionPerformed(java.awt.event.ActionEvent evt) {
      if (mismOp == true) {
         actIgual = false;
         primNum = Double.parseDouble(txtInp.getText());
         operacion.setText(" Operacion: " + txtInp.getText() + " / ");
         txtInp.setText("0");
         accion = "dividir";
         
         mismOp = false;
         punt = true;
      }  
   }
   private void bor1ActionPerformed(java.awt.event.ActionEvent evt) {
      if (actIgual == false) {
         int tamaño = numeros.length();
         if (tamaño > 0) {
            if (tamaño == 1) {
               numeros = "0";   
            } else {
               numeros = numeros.substring(0, numeros.length()-1);
            }
            txtInp.setText(numeros);
         }
      }
   }
   
   private void igualActionPerformed(java.awt.event.ActionEvent evt) {
      
      switch(accion) {
         case "sumar":
            secNum = Double.parseDouble(txtInp.getText());
            resultadoInter = primNum + secNum;
            resultado.setText(" Resultado: " + String.format("% .2f", resultadoInter));
            txtInp.setText(String.format("% .2f", resultadoInter));
            accion = "null";
            
            break;
         case "restar":
            secNum = Double.parseDouble(txtInp.getText());
            resultadoInter = primNum - secNum;
            resultado.setText(" Resultado: " + String.format("% .2f", resultadoInter));
            txtInp.setText(String.format("% .2f", resultadoInter));
            accion = "null";
            
            break;
            
         case "multiplicar":
            secNum = Double.parseDouble(txtInp.getText());
            resultadoInter = primNum * secNum;
            resultado.setText(" Resultado: " + String.format("% .2f", resultadoInter));
            txtInp.setText(String.format("% .2f", resultadoInter));
            accion = "null";
            break;
         case "dividir":
            secNum = Double.parseDouble(txtInp.getText());
            if (secNum != 0) {
               resultadoInter = primNum / secNum;
               resultado.setText(" Resultado: " + String.format("% .2f", resultadoInter));
               txtInp.setText(String.format("% .2f", resultadoInter));
               accion = "null";
               break;
            } else {
               JOptionPane.showMessageDialog(this,
                  "No se puede dividir entre 0",
                  "Error",
                  JOptionPane.ERROR_MESSAGE);
               this.dispose();
            }
      }
      operacion.setText(" Operacion: ");
      mismOp = true;
      actIgual = true;
        
   }
   
   private void salirActionPerformed(java.awt.event.ActionEvent evt) {
      this.dispose();
   }
}  