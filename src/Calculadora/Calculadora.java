package Calculadora;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        Componentes();
    }

    private void Componentes() {

        setTitle("Calculadora v2.2");

        jTextFieldOperacao = new javax.swing.JTextField();
        jPainel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonMais = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldOperacao.setEditable(false);
        jTextFieldOperacao.setFont(new java.awt.Font("Console", 0, 15));
        jTextFieldOperacao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setFont(new java.awt.Font("Console", 0, 15));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Console", 0, 15));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Console", 0, 15));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Console", 0, 15));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Console", 0, 15));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Console", 0, 15));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Console", 0, 15));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Console", 0, 15));
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Console", 0, 15));
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Console", 0, 15));
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonMais.setFont(new java.awt.Font("Console", 0, 15));
        jButtonMais.setText("+");
        jButtonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisActionPerformed(evt);
            }
        });

        jButtonMenos.setFont(new java.awt.Font("Console", 0, 15));
        jButtonMenos.setText("-");
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("Console", 0, 15));
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });
        jButtonDividir.setFont(new java.awt.Font("Console", 0, 15));
        jButtonDividir.setText("/");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Console", 0, 15));
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Console", 0, 18));
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPainel1);
        jPainel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPainel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPainel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0))
        );
        pack();

    }

    //Ação Realizada
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("1"));
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("2"));
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("3"));
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("4"));
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("5"));
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("6"));
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("7"));
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("8"));
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("9"));
    }
    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat("0"));
    }
    private void jButtonMaisActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat(" + "));
    }
    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat(" - "));
    }
    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat(" * "));
    }
    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText(jTextFieldOperacao.getText().concat(" / "));
    }
    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldOperacao.setText("");
    }

    //Estrutura igualdade
    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {
        String[] operacao = jTextFieldOperacao.getText().split(" ");
        double resultado = 0;
        switch (operacao[1]) {
            case "+":
                resultado = Double.parseDouble(operacao[0]) + Double.parseDouble(operacao[2]);
                break;
            case "-":
                resultado = Double.parseDouble(operacao[0]) - Double.parseDouble(operacao[2]);
                break;
            case "*":
                resultado += Double.parseDouble(operacao[0]) * Double.parseDouble(operacao[2]);
                break;
            case "/":
                try {
                    resultado = Double.parseDouble(operacao[0]) / Double.parseDouble(operacao[2]);
                } catch (Exception e) {
                }
                break;
        }

        if (operacao.length > 3) {
            switch (operacao[3]) {
                case "+":
                    resultado += Double.parseDouble(operacao[4]);
                    break;
                case "-":
                    resultado -= Double.parseDouble(operacao[4]);
                    break;
                case "*":
                    resultado *= Double.parseDouble(operacao[4]);
                    break;
                case "/":

                    try {
                        resultado /= Double.parseDouble(operacao[4]);
                    } catch (Exception e) {
                    }
                    break;
            }
        }
        //Maximo 4 operações
        if (operacao.length > 5) {
            switch (operacao[5]) {
                case "+":
                    resultado += Double.parseDouble(operacao[6]);
                    break;
                case "-":
                    resultado -= Double.parseDouble(operacao[6]);
                    break;
                case "*":
                    resultado *= Double.parseDouble(operacao[6]);
                    break;
                case "/":
                    try {
                        resultado /= Double.parseDouble(operacao[6]);
                    } catch (Exception e) {
                    }
                    break;
            }
        }
        jTextFieldOperacao.setText(String.valueOf(resultado));
    }

    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMais;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JPanel jPainel1;
    private javax.swing.JTextField jTextFieldOperacao;

    //PSVM
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
}
