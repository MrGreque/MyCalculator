/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorav2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author gabriel.cunha
 */
public class Calculadora extends javax.swing.JFrame {
    
    private boolean on = false;
    private double numberOne;
    private double numberTwo;
    private double result;
    private boolean firstOp = true;
    private int histOp = 1;
    private String lastOp = "";
    private boolean composto = false;
    
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                int codigo = e.getKeyCode();
                int tecla1 = KeyEvent.VK_NUMPAD1;
                int tecla1_1 = KeyEvent.VK_1;
                int tecla2 = KeyEvent.VK_NUMPAD2;
                int tecla2_1 = KeyEvent.VK_2;
                int tecla3 = KeyEvent.VK_NUMPAD3;
                int tecla3_1 = KeyEvent.VK_3;
                int tecla4 = KeyEvent.VK_NUMPAD4;
                int tecla4_1 = KeyEvent.VK_4;
                int tecla5 = KeyEvent.VK_NUMPAD5;
                int tecla5_1 = KeyEvent.VK_5;
                int tecla6 = KeyEvent.VK_NUMPAD6;
                int tecla6_1 = KeyEvent.VK_6;
                int tecla7 = KeyEvent.VK_NUMPAD7;
                int tecla7_1 = KeyEvent.VK_7;
                int tecla8 = KeyEvent.VK_NUMPAD8;
                int tecla8_1 = KeyEvent.VK_8;
                int tecla9 = KeyEvent.VK_NUMPAD9;
                int tecla9_1 = KeyEvent.VK_9;
                int tecla0 = KeyEvent.VK_NUMPAD0;
                int tecla0_1 = KeyEvent.VK_0;
                int enter = KeyEvent.VK_ENTER;
                int enter1 = KeyEvent.VK_EQUALS;
                int mais = 107; //61
                int menos = 109; //45
                int divisao = 111; //59
                int vezes = 106;
                int ponto1 = KeyEvent.VK_PERIOD;
                int ponto1_1 = KeyEvent.VK_COMMA;
                int apagar = 8;
                
                if(codigo == tecla1 || codigo == tecla1_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"1");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"1");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"1");
                        }
                    }
                } else if(codigo == tecla2 || codigo == tecla2_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"2");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"2");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"2");
                        }
                    }
                } else if(codigo == tecla3 || codigo == tecla3_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"3");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"3");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"3");
                        }
                    }
                } else if(codigo == tecla4 || codigo == tecla4_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"4");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"4");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"4");
                        }
                    }
                } else if(codigo == tecla5 || codigo == tecla5_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"5");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"5");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"5");
                        }
                    }
                } else if(codigo == tecla6 || codigo == tecla6_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"6");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"6");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"6");
                        }
                    }
                } else if(codigo == tecla7 || codigo == tecla7_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"7");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"7");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"7");
                        }
                    }
                } else if(codigo == tecla8 || codigo == tecla8_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"8");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"8");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"8");
                        }
                    }
                } else if(codigo == tecla9 || codigo == tecla9_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"9");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"9");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"9");
                        }
                    }
                } else if(codigo == tecla0 || codigo == tecla0_1){
                    if (on == true) {
                        if(firstOp == true){
                            jLabelOp.setText(jLabelOp.getText()+"0");
                        } else if(composto == false){
                            jLabelOp.setText("");
                            jLabelOp.setText(jLabelOp.getText()+"0");
                            composto = true;
                        } else{
                            jLabelOp.setText(jLabelOp.getText()+"0");
                        }
                    }
                } else if(codigo == enter || codigo == enter1){
                    igual();
                } else if(codigo == mais){
                    if (on == true){
                        if(lastOp == "" || lastOp == "Soma" || lastOp == "Igual"){
                            
                            soma();
                        } else if(lastOp == "Subtracao"){
                            subtracao();
                            firstOp = true;
                            soma();
                        } else if (lastOp == "Divisao"){
                            divisao();
                            firstOp = true;
                            soma();
                        } else if (lastOp == "Multiplicacao"){
                            multiplicacao();
                            firstOp = true;
                            soma();
                        } else {
                            firstOp = true;
                            igual();
                        }
                    }
                } else if(codigo == vezes){
                    if(on == true){
                        if(lastOp == "" || lastOp == "Multiplicacao" || lastOp == "Igual"){
                            multiplicacao();
                        } else if(lastOp == "Soma"){
                            soma();
                            firstOp = true;
                            multiplicacao();
                        } else if (lastOp == "Divisao"){
                            divisao();
                            firstOp = true;
                            multiplicacao();
                        } else if (lastOp == "Subtracao"){
                            subtracao();
                            firstOp = true;
                            multiplicacao();
                        } else {
                            firstOp = true;
                            igual();
                        }
                    }
                } else if(codigo == menos){
                    if (on == true){
                        if(lastOp == "" || lastOp == "Subtracao" || lastOp == "Igual"){
                            subtracao();
                        } else if(lastOp == "Soma"){
                            soma();
                            firstOp = true;
                            subtracao();
                        } else if (lastOp == "Divisao"){
                            divisao();
                            firstOp = true;
                            subtracao();
                        } else if (lastOp == "Multiplicacao"){
                            multiplicacao();
                            firstOp = true;
                            subtracao();
                        } else {
                            firstOp = true;
                            igual();
                        }
                    }
                } else if(codigo == divisao){
                    if (on == true){
                        if(lastOp == "" || lastOp == "Divisao" || lastOp == "Igual"){
                            divisao();
                        } else if(lastOp == "Soma"){
                            soma();
                            firstOp = true;
                            divisao();
                        } else if (lastOp == "Subtracao"){
                            subtracao();
                            firstOp = true;
                            divisao();
                        } else if (lastOp == "Multiplicacao"){
                            multiplicacao();
                            firstOp = true;
                            divisao();
                        } else {
                            firstOp = true;
                            igual();
                        }
                    }
                } else if(codigo == ponto1 || codigo == ponto1_1){
                    if(on == true){
                        jLabelOp.setText(jLabelOp.getText()+".");
                    }
                } else if(codigo == apagar){
                    if(jLabelOp.getText().length() > 0){
                        jLabelOp.setText(jLabelOp.getText().substring(0, jLabelOp.getText().length()-1));
                        if(lastOp == "Igual"){
                            numberOne = 0;
                            numberTwo = 0;
                            result = 0;
                            firstOp = true;
                        }
                    }
                }
            }
        });
    }
    
    public void limpaHistorico(){
        jLabelH1.setText("");
        jLabelH2.setText("");
        jLabelH3.setText("");
        jLabelH4.setText("");
        jLabelH5.setText("");
        jLabelH6.setText("");
        histOp = 1;
    }
    
    public void soma(){
        if (firstOp == true){
            numberOne = Double.parseDouble(jLabelOp.getText());
            jLabelOp.setText("");
            firstOp = false;
            lastOp = "Soma";
            
        } else {
            numberTwo = Double.parseDouble(jLabelOp.getText());
            result = numberOne + numberTwo;
            
            String nulo = "";
            if(jLabelH1.equals(nulo) == false && histOp == 1){
                jLabelH1.setText(numberOne + " + " + numberTwo + " = " + result);
                histOp = 2;
            } else if(jLabelH2.equals(nulo) == false && histOp == 2){
                jLabelH2.setText(numberOne + " + " + numberTwo + " = " + result);
                histOp = 3;
            } else if(jLabelH3.equals(nulo) == false && histOp == 3){
                jLabelH3.setText(numberOne + " + " + numberTwo + " = " + result);
                histOp = 4;
            } else if(jLabelH4.equals(nulo) == false && histOp == 4){
                jLabelH4.setText(numberOne + " + " + numberTwo + " = " + result);
                histOp = 5;
            } else if(jLabelH5.equals(nulo) == false && histOp == 5){
                jLabelH5.setText(numberOne + " + " + numberTwo + " = " + result);
                histOp = 6;
            } else if(jLabelH6.equals(nulo) == false && histOp == 6){
                jLabelH6.setText(numberOne + " + " + numberTwo + " = " + result);
                histOp = 7;
            } else{
                jLabelH1.setText(numberOne + " + " + numberTwo + " = " + result);
                jLabelH2.setText("");
                jLabelH3.setText("");
                jLabelH4.setText("");
                jLabelH5.setText("");
                jLabelH6.setText("");
                histOp = 2;
            }
            
            numberOne = result;
            jLabelOp.setText(String.valueOf(result)); 
            composto = false;
            lastOp = "Soma";
        }
    }
        
    public void subtracao(){
        if (firstOp == true){
            numberOne = Double.parseDouble(jLabelOp.getText());
            jLabelOp.setText("");
            firstOp = false;
            lastOp = "Subtracao";
            
        } else{
            numberTwo = Double.parseDouble(jLabelOp.getText());
            result = numberOne - numberTwo;
            
            String nulo = "";
            if(jLabelH1.equals(nulo) == false && histOp == 1){
                jLabelH1.setText(numberOne + " - " + numberTwo + " = " + result);
                histOp = 2;
            } else if(jLabelH2.equals(nulo) == false && histOp == 2){
                jLabelH2.setText(numberOne + " - " + numberTwo + " = " + result);
                histOp = 3;
            } else if(jLabelH3.equals(nulo) == false && histOp == 3){
                jLabelH3.setText(numberOne + " - " + numberTwo + " = " + result);
                histOp = 4;
            } else if(jLabelH4.equals(nulo) == false && histOp == 4){
                jLabelH4.setText(numberOne + " - " + numberTwo + " = " + result);
                histOp = 5;
            } else if(jLabelH5.equals(nulo) == false && histOp == 5){
                jLabelH5.setText(numberOne + " - " + numberTwo + " = " + result);
                histOp = 6;
            } else if(jLabelH6.equals(nulo) == false && histOp == 6){
                jLabelH6.setText(numberOne + " - " + numberTwo + " = " + result);
                histOp = 7;
            } else{
                jLabelH1.setText(numberOne + " - " + numberTwo + " = " + result);
                jLabelH2.setText("");
                jLabelH3.setText("");
                jLabelH4.setText("");
                jLabelH5.setText("");
                jLabelH6.setText("");
                histOp = 2;
            }
            
            numberOne = result;
            jLabelOp.setText(String.valueOf(result)); 
            composto = false;
            lastOp = "Subtracao";
        }
        
    }
    
    public void igual(){
        if(lastOp == "Soma" && firstOp == false){
            soma();
            firstOp = true;
            lastOp = "Igual";
        } else if(lastOp == "Subtracao" && firstOp == false){
            subtracao();
            firstOp = true;
            lastOp = "Igual";
        } else if(lastOp == "Divisao" && firstOp == false){
            divisao();
            firstOp = true;
            lastOp = "Igual";
        } else if(lastOp == "Multiplicacao" && firstOp == false){
            multiplicacao();
            firstOp = true;
            lastOp = "Igual";
        }
    }
    
    public void divisao(){
        if (firstOp == true){
            numberOne = Double.parseDouble(jLabelOp.getText());
            jLabelOp.setText("");
            firstOp = false;
            lastOp = "Divisao";
            
        } else{
            numberTwo = Double.parseDouble(jLabelOp.getText());
            result = numberOne / numberTwo;
            
            String nulo = "";
            if(jLabelH1.equals(nulo) == false && histOp == 1){
                jLabelH1.setText(numberOne + " / " + numberTwo + " = " + result);
                histOp = 2;
            } else if(jLabelH2.equals(nulo) == false && histOp == 2){
                jLabelH2.setText(numberOne + " / " + numberTwo + " = " + result);
                histOp = 3;
            } else if(jLabelH3.equals(nulo) == false && histOp == 3){
                jLabelH3.setText(numberOne + " / " + numberTwo + " = " + result);
                histOp = 4;
            } else if(jLabelH4.equals(nulo) == false && histOp == 4){
                jLabelH4.setText(numberOne + " / " + numberTwo + " = " + result);
                histOp = 5;
            } else if(jLabelH5.equals(nulo) == false && histOp == 5){
                jLabelH5.setText(numberOne + " / " + numberTwo + " = " + result);
                histOp = 6;
            } else if(jLabelH6.equals(nulo) == false && histOp == 6){
                jLabelH6.setText(numberOne + " / " + numberTwo + " = " + result);
                histOp = 7;
            } else{
                jLabelH1.setText(numberOne + " / " + numberTwo + " = " + result);
                jLabelH2.setText("");
                jLabelH3.setText("");
                jLabelH4.setText("");
                jLabelH5.setText("");
                jLabelH6.setText("");
                histOp = 2;
            }
            
            numberOne = result;
            jLabelOp.setText(String.valueOf(result));
            composto = false;
            lastOp = "Divisao";
        }
    }
    
    public void multiplicacao(){
        if (firstOp == true){
            numberOne = Double.parseDouble(jLabelOp.getText());
            System.out.println(numberOne);
            jLabelOp.setText("");
            firstOp = false;
            lastOp = "Multiplicacao";
            
        } else{
            numberTwo = Double.parseDouble(jLabelOp.getText());
            result = numberOne * numberTwo;
            
            String nulo = "";
            if(jLabelH1.equals(nulo) == false && histOp == 1){
                jLabelH1.setText(numberOne + " x " + numberTwo + " = " + result);
                histOp = 2;
            } else if(jLabelH2.equals(nulo) == false && histOp == 2){
                jLabelH2.setText(numberOne + " x " + numberTwo + " = " + result);
                histOp = 3;
            } else if(jLabelH3.equals(nulo) == false && histOp == 3){
                jLabelH3.setText(numberOne + " x " + numberTwo + " = " + result);
                histOp = 4;
            } else if(jLabelH4.equals(nulo) == false && histOp == 4){
                jLabelH4.setText(numberOne + " x " + numberTwo + " = " + result);
                histOp = 5;
            } else if(jLabelH5.equals(nulo) == false && histOp == 5){
                jLabelH5.setText(numberOne + " x " + numberTwo + " = " + result);
                histOp = 6;
            } else if(jLabelH6.equals(nulo) == false && histOp == 6){
                jLabelH6.setText(numberOne + " x " + numberTwo + " = " + result);
                histOp = 7;
            } else{
                jLabelH1.setText(numberOne + " x " + numberTwo + " = " + result);
                jLabelH2.setText("");
                jLabelH3.setText("");
                jLabelH4.setText("");
                jLabelH5.setText("");
                jLabelH6.setText("");
                histOp = 2;
            }
            
            numberOne = result;
            jLabelOp.setText(String.valueOf(result));
            composto = false;
            lastOp = "Multiplicacao";
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelTela = new javax.swing.JPanel();
        jLabelOp = new javax.swing.JLabel();
        jPanelHistorico = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelH1 = new javax.swing.JLabel();
        jLabelH2 = new javax.swing.JLabel();
        jLabelH3 = new javax.swing.JLabel();
        jLabelH4 = new javax.swing.JLabel();
        jLabelH5 = new javax.swing.JLabel();
        jLabelH6 = new javax.swing.JLabel();
        jBtPower = new javax.swing.JPanel();
        jLabelPower = new javax.swing.JLabel();
        jBtApagar = new javax.swing.JPanel();
        jLabelApagar = new javax.swing.JLabel();
        jBtC = new javax.swing.JPanel();
        jLabelC = new javax.swing.JLabel();
        jBtResult = new javax.swing.JPanel();
        jLabelResult = new javax.swing.JLabel();
        jBtDiv = new javax.swing.JPanel();
        jLabelDiv = new javax.swing.JLabel();
        jBtMult = new javax.swing.JPanel();
        jLabelMult = new javax.swing.JLabel();
        jBtSub = new javax.swing.JPanel();
        jLabelSub = new javax.swing.JLabel();
        jBtSoma = new javax.swing.JPanel();
        jLabelSoma = new javax.swing.JLabel();
        jBtPonto = new javax.swing.JPanel();
        jLabelPonto = new javax.swing.JLabel();
        jBt0 = new javax.swing.JPanel();
        jLabel0 = new javax.swing.JLabel();
        jBt9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jBt8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jBt7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jBt6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jBt5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jBt4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jBt3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jBt2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBt1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelPower = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Gran Kener Calculator");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelOp.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanelTela.add(jLabelOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 380, 90));

        jPanel1.add(jPanelTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 400, 110));

        jPanelHistorico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelHistorico.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 10));
        jPanelHistorico.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, 10));
        jPanelHistorico.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 240, 10));
        jPanelHistorico.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 10));
        jPanelHistorico.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 240, 10));

        jLabelH1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanelHistorico.add(jLabelH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 240, 40));

        jLabelH2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanelHistorico.add(jLabelH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 40));

        jLabelH3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanelHistorico.add(jLabelH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, 40));

        jLabelH4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanelHistorico.add(jLabelH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, 40));

        jLabelH5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanelHistorico.add(jLabelH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 40));

        jLabelH6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelH6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanelHistorico.add(jLabelH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 230, 40));

        jPanel1.add(jPanelHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 260, 370));

        jBtPower.setBackground(new java.awt.Color(153, 0, 0));
        jBtPower.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtPower.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPower.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPower.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPower.setText("Power On/Off");
        jLabelPower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPowerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPowerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPowerMouseExited(evt);
            }
        });
        jBtPower.add(jLabelPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        jPanel1.add(jBtPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, 30));

        jBtApagar.setBackground(new java.awt.Color(153, 0, 0));
        jBtApagar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtApagar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelApagar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelApagar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelApagar.setText("<");
        jLabelApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelApagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelApagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelApagarMouseExited(evt);
            }
        });
        jBtApagar.add(jLabelApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBtApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 80, 80));

        jBtC.setBackground(new java.awt.Color(153, 0, 0));
        jBtC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelC.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelC.setForeground(new java.awt.Color(255, 255, 255));
        jLabelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelC.setText("C");
        jLabelC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCMouseExited(evt);
            }
        });
        jBtC.add(jLabelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 80, 80));

        jBtResult.setBackground(new java.awt.Color(153, 0, 0));
        jBtResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelResult.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelResult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResult.setText("=");
        jLabelResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelResultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelResultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelResultMouseExited(evt);
            }
        });
        jBtResult.add(jLabelResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 160));

        jPanel1.add(jBtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 80, 160));

        jBtDiv.setBackground(new java.awt.Color(153, 0, 0));
        jBtDiv.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtDiv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDiv.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelDiv.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDiv.setText("/");
        jLabelDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDivMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDivMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDivMouseExited(evt);
            }
        });
        jBtDiv.add(jLabelDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBtDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 80, 80));

        jBtMult.setBackground(new java.awt.Color(153, 0, 0));
        jBtMult.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtMult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMult.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMult.setText("x");
        jLabelMult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMultMouseExited(evt);
            }
        });
        jBtMult.add(jLabelMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBtMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 80, 80));

        jBtSub.setBackground(new java.awt.Color(153, 0, 0));
        jBtSub.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtSub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSub.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelSub.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSub.setText("-");
        jLabelSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSubMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSubMouseExited(evt);
            }
        });
        jBtSub.add(jLabelSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBtSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, 80));

        jBtSoma.setBackground(new java.awt.Color(153, 0, 0));
        jBtSoma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtSoma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSoma.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelSoma.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSoma.setText("+");
        jLabelSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSomaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSomaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSomaMouseExited(evt);
            }
        });
        jBtSoma.add(jLabelSoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBtSoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 80, 80));

        jBtPonto.setBackground(new java.awt.Color(153, 0, 0));
        jBtPonto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtPonto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPonto.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelPonto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPonto.setText(".");
        jLabelPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPontoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPontoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPontoMouseExited(evt);
            }
        });
        jBtPonto.add(jLabelPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBtPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 80, 80));

        jBt0.setBackground(new java.awt.Color(153, 0, 0));
        jBt0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel0.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(255, 255, 255));
        jLabel0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0.setText("0");
        jLabel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel0MouseExited(evt);
            }
        });
        jBt0.add(jLabel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 80));

        jPanel1.add(jBt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 160, 80));

        jBt9.setBackground(new java.awt.Color(153, 0, 0));
        jBt9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jBt9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 80));

        jBt8.setBackground(new java.awt.Color(153, 0, 0));
        jBt8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jBt8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, 80));

        jBt7.setBackground(new java.awt.Color(153, 0, 0));
        jBt7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jBt7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 80));

        jBt6.setBackground(new java.awt.Color(153, 0, 0));
        jBt6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jBt6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 80, 80));

        jBt5.setBackground(new java.awt.Color(153, 0, 0));
        jBt5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jBt5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 80));

        jBt4.setBackground(new java.awt.Color(153, 0, 0));
        jBt4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jBt4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 80));

        jBt3.setBackground(new java.awt.Color(153, 0, 0));
        jBt3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jBt3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 80, 80));

        jBt2.setBackground(new java.awt.Color(153, 0, 0));
        jBt2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jBt2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 80, 80));

        jBt1.setBackground(new java.awt.Color(153, 0, 0));
        jBt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBt1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jBt1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jPanel1.add(jBt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 80));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Power:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, 30));

        jPanelPower.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanelPowerLayout = new javax.swing.GroupLayout(jPanelPower);
        jPanelPower.setLayout(jPanelPowerLayout);
        jPanelPowerLayout.setHorizontalGroup(
            jPanelPowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanelPowerLayout.setVerticalGroup(
            jPanelPowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 90, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/celular2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 70, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coroa.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 70, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carta1.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 70, 70));

        jLabel15.setFont(new java.awt.Font("Harlow Solid Italic", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(216, 5, 5));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Gabriel Calculator v2.0");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 740, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jBt1.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jBt1.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"1");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"1");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"1");
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"2");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"2");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"2");
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jBt2.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jBt2.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"3");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"3");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"3");
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jBt3.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jBt3.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"4");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"4");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"4");
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jBt4.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jBt4.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"5");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"5");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"5");
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jBt5.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jBt5.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"6");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"6");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"6");
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jBt6.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jBt6.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"7");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"7");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"7");
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jBt7.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jBt7.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"8");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"8");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"8");
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jBt8.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jBt8.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"9");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"9");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"9");
            }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jBt9.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jBt9.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel0MouseClicked
        if (on == true) {
            if(firstOp == true){
                jLabelOp.setText(jLabelOp.getText()+"0");
            } else if(composto == false){
                jLabelOp.setText("");
                jLabelOp.setText(jLabelOp.getText()+"0");
                composto = true;
            } else{
                jLabelOp.setText(jLabelOp.getText()+"0");
            }
        }
    }//GEN-LAST:event_jLabel0MouseClicked

    private void jLabel0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel0MouseEntered
        jBt0.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabel0MouseEntered

    private void jLabel0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel0MouseExited
        jBt0.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabel0MouseExited

    private void jLabelPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPontoMouseClicked
        if(on == true){
            jLabelOp.setText(jLabelOp.getText()+".");
        }
    }//GEN-LAST:event_jLabelPontoMouseClicked

    private void jLabelPontoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPontoMouseEntered
        jBtPonto.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelPontoMouseEntered

    private void jLabelPontoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPontoMouseExited
        jBtPonto.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelPontoMouseExited

    private void jLabelSomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSomaMouseClicked
        if (on == true){
            if(lastOp == "" || lastOp == "Soma" || lastOp == "Igual"){
                soma();
            } else if(lastOp == "Subtracao"){
                subtracao();
                firstOp = true;
                soma();
            } else if (lastOp == "Divisao"){
                divisao();
                firstOp = true;
                soma();
            } else if (lastOp == "Multiplicacao"){
                multiplicacao();
                firstOp = true;
                soma();
            } else {
                firstOp = true;
                igual();
            }
        }
    }//GEN-LAST:event_jLabelSomaMouseClicked

    private void jLabelSomaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSomaMouseEntered
        jBtSoma.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelSomaMouseEntered

    private void jLabelSomaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSomaMouseExited
        jBtSoma.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelSomaMouseExited

    private void jLabelSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubMouseClicked
        if (on == true){
            if(lastOp == "" || lastOp == "Subtracao" || lastOp == "Igual"){
                subtracao();
            } else if(lastOp == "Soma"){
                soma();
                firstOp = true;
                subtracao();
            } else if (lastOp == "Divisao"){
                divisao();
                firstOp = true;
                subtracao();
            } else if (lastOp == "Multiplicacao"){
                multiplicacao();
                firstOp = true;
                subtracao();
            } else {
                firstOp = true;
                igual();
            }
        }
    }//GEN-LAST:event_jLabelSubMouseClicked

    private void jLabelSubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubMouseEntered
        jBtSub.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelSubMouseEntered

    private void jLabelSubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubMouseExited
        jBtSub.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelSubMouseExited

    private void jLabelMultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMultMouseClicked
        if(on == true){
            if(lastOp == "" || lastOp == "Multiplicacao" || lastOp == "Igual"){
                multiplicacao();
            } else if(lastOp == "Soma"){
                soma();
                firstOp = true;
                multiplicacao();
            } else if (lastOp == "Divisao"){
                divisao();
                firstOp = true;
                multiplicacao();
            } else if (lastOp == "Subtracao"){
                subtracao();
                firstOp = true;
                multiplicacao();
            } else {
                firstOp = true;
                igual();
            }
        }
    }//GEN-LAST:event_jLabelMultMouseClicked

    private void jLabelMultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMultMouseEntered
        jBtMult.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelMultMouseEntered

    private void jLabelMultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMultMouseExited
        jBtMult.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelMultMouseExited

    private void jLabelDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDivMouseClicked
        if (on == true){
            if(lastOp == "" || lastOp == "Divisao" || lastOp == "Igual"){
                divisao();
            } else if(lastOp == "Soma"){
                soma();
                firstOp = true;
                divisao();
            } else if (lastOp == "Subtracao"){
                subtracao();
                firstOp = true;
                divisao();
            } else if (lastOp == "Multiplicacao"){
                multiplicacao();
                firstOp = true;
                divisao();
            } else {
                firstOp = true;
                igual();
            }
        }
    }//GEN-LAST:event_jLabelDivMouseClicked

    private void jLabelDivMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDivMouseEntered
        jBtDiv.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelDivMouseEntered

    private void jLabelDivMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDivMouseExited
        jBtDiv.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelDivMouseExited

    private void jLabelResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResultMouseClicked
        igual();
    }//GEN-LAST:event_jLabelResultMouseClicked

    private void jLabelResultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResultMouseEntered
        jBtResult.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelResultMouseEntered

    private void jLabelResultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResultMouseExited
        jBtResult.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelResultMouseExited

    private void jLabelCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCMouseClicked
        if(on == true){
            numberOne = 0;
            numberTwo = 0;
            result = 0;
            firstOp = true;
            limpaHistorico();
            jLabelOp.setText("");
        }
    }//GEN-LAST:event_jLabelCMouseClicked

    private void jLabelCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCMouseEntered
        jBtC.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelCMouseEntered

    private void jLabelCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCMouseExited
        jBtC.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelCMouseExited

    private void jLabelApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelApagarMouseClicked
        if(jLabelOp.getText().length() > 0){
            jLabelOp.setText(jLabelOp.getText().substring(0, jLabelOp.getText().length()-1));
            numberOne = 0;
            numberTwo = 0;
            result = 0;
            firstOp = true;
        }
    }//GEN-LAST:event_jLabelApagarMouseClicked

    private void jLabelApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelApagarMouseEntered
        jBtApagar.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelApagarMouseEntered

    private void jLabelApagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelApagarMouseExited
        jBtApagar.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelApagarMouseExited

    private void jLabelPowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPowerMouseClicked
        if(on == false){
            on = true;
            jPanelPower.setBackground(Color.green);
        } else if (on == true){
            on = false;
            jPanelPower.setBackground(Color.red);
            numberOne = 0;
            numberTwo = 0;
            result = 0;
            firstOp = true;
            limpaHistorico();
            jLabelOp.setText("");
        }
    }//GEN-LAST:event_jLabelPowerMouseClicked

    private void jLabelPowerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPowerMouseEntered
        jBtPower.setBackground(new Color(102,0,0));
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelPowerMouseEntered

    private void jLabelPowerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPowerMouseExited
        jBtPower.setBackground(new Color(153,0,0));
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelPowerMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBt0;
    private javax.swing.JPanel jBt1;
    private javax.swing.JPanel jBt2;
    private javax.swing.JPanel jBt3;
    private javax.swing.JPanel jBt4;
    private javax.swing.JPanel jBt5;
    private javax.swing.JPanel jBt6;
    private javax.swing.JPanel jBt7;
    private javax.swing.JPanel jBt8;
    private javax.swing.JPanel jBt9;
    private javax.swing.JPanel jBtApagar;
    private javax.swing.JPanel jBtC;
    private javax.swing.JPanel jBtDiv;
    private javax.swing.JPanel jBtMult;
    private javax.swing.JPanel jBtPonto;
    private javax.swing.JPanel jBtPower;
    private javax.swing.JPanel jBtResult;
    private javax.swing.JPanel jBtSoma;
    private javax.swing.JPanel jBtSub;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelApagar;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelDiv;
    private javax.swing.JLabel jLabelH1;
    private javax.swing.JLabel jLabelH2;
    private javax.swing.JLabel jLabelH3;
    private javax.swing.JLabel jLabelH4;
    private javax.swing.JLabel jLabelH5;
    private javax.swing.JLabel jLabelH6;
    private javax.swing.JLabel jLabelMult;
    private javax.swing.JLabel jLabelOp;
    private javax.swing.JLabel jLabelPonto;
    private javax.swing.JLabel jLabelPower;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelSoma;
    private javax.swing.JLabel jLabelSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHistorico;
    private javax.swing.JPanel jPanelPower;
    private javax.swing.JPanel jPanelTela;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
