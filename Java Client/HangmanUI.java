import HangmanGame.*;           
import org.omg.CosNaming.*;  
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;      
import java.util.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.*;
import java.applet.Applet;

public class HangmanUI extends javax.swing.JFrame {

	private static String name;
	private static String word;
	private static String image = "";
	private static int life;
    private static Hangman hangman;
    private static String message = "";
    String line = "";
    
	
	
    public HangmanUI(Hangman hangman, String name, String word) {
        initComponents();
        this.hangman=hangman;
        this.name=name;
        this.word=word;
        this.message="The word is " +word+". Do you want to play again?";
        this.life=hangman.getCurrentLife(name);
        nameField.setText(name);
        for(int i = 0; i < word.length(); i++) {
          line += "_ ";
        }
        wordField.setText(line);
    }
    
    private void updateWord(String replacement){
        wordField.setText(replacement);
    }
    public void setImage(int life){
        if(life==5){
            this.image="/1.png";
        } else if(life==4){
            this.image="/2.png";
        } else if(life==3){
            this.image="/3.png";
        } else if(life==2){
            this.image="/4.png";
        } else if(life==1){
            this.image="/5.png";
        } else if(life==0){
            this.image="/6.png";
        }
    }
    private void anotherGame(){
        this.word = hangman.newGame(name);
        this.line = "";
        this.life = hangman.getCurrentLife(name);
        this.message="The word is " +word+". Do you want to play again?";
        for(int i = 0; i < word.length(); i++) {
          line += "_ ";
        }
        wordField.setText(line);
        aButton.setEnabled(true);
        cButton.setEnabled(true);
        bButton.setEnabled(true);
        dButton.setEnabled(true);
        eButton.setEnabled(true);
        fButton.setEnabled(true);
        gButton.setEnabled(true);
        hButton.setEnabled(true);
        iButton.setEnabled(true);
        jButton.setEnabled(true);
        kButton.setEnabled(true);
        lButton.setEnabled(true);
        nButton.setEnabled(true);
        mButton.setEnabled(true);
        oButton.setEnabled(true);
        pButton.setEnabled(true);
        qButton.setEnabled(true);
        rButton.setEnabled(true);
        sButton.setEnabled(true);
        tButton.setEnabled(true);
        uButton.setEnabled(true);
        vButton.setEnabled(true);
        wButton.setEnabled(true);
        xButton.setEnabled(true);
        yButton.setEnabled(true);
        zButton.setEnabled(true);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png")));
    }
    
   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        aButton = new javax.swing.JButton();
        wordField = new javax.swing.JTextField();
        cButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        nameField.setEditable(false);
        wordField.setEditable(false);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel1.setText("Name:");

        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.setName(""); 
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        aButton.setText("A");
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });
        
        wordField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        wordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);


        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        bButton.setText("B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });

        dButton.setText("D");
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });


        eButton.setText("E");
          eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });


        fButton.setText("F");
          fButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonActionPerformed(evt);
            }
        });


        gButton.setText("G");
          gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });


        hButton.setText("H");
          hButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hButtonActionPerformed(evt);
            }
        });


        iButton.setText("I");
          iButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButtonActionPerformed(evt);
            }
        });


        jButton.setText("J");
          jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });


        kButton.setText("K");
          kButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonActionPerformed(evt);
            }
        });


        lButton.setText("L");
          lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });


        nButton.setText("N");
          nButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nButtonActionPerformed(evt);
            }
        });


        mButton.setText("M");
          mButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonActionPerformed(evt);
            }
        });


        oButton.setText("O");
          oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });


        pButton.setText("P");
          pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });


        qButton.setText("Q");
          qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });


        rButton.setText("R");
          rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });


        sButton.setText("S");
          sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });


        tButton.setText("T");
          tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });


        uButton.setText("U");
          uButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uButtonActionPerformed(evt);
            }
        });


        vButton.setText("V");
          vButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vButtonActionPerformed(evt);
            }
        });


        wButton.setText("W");
          wButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wButtonActionPerformed(evt);
            }
        });


        xButton.setText("X");
          xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });


        yButton.setText("Y");
          yButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yButtonActionPerformed(evt);
            }
        });


        zButton.setText("Z");
          zButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zButtonActionPerformed(evt);
            }
        });


         jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); 
        jLabel2.setText("Hangman nowee-oppa Special Edition");

        jPanel1.setPreferredSize(new java.awt.Dimension(165, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(gButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(oButton)
                                        .addGap(4, 4, 4)
                                        .addComponent(pButton)
                                        .addGap(6, 6, 6)))
                                .addGap(12, 12, 12))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wordField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField)))
                        .addGap(34, 34, 34)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aButton)
                            .addComponent(bButton)
                            .addComponent(cButton)
                            .addComponent(dButton)
                            .addComponent(eButton)
                            .addComponent(fButton)
                            .addComponent(gButton)
                            .addComponent(hButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iButton)
                            .addComponent(jButton)
                            .addComponent(kButton)
                            .addComponent(lButton)
                            .addComponent(mButton)
                            .addComponent(nButton)
                            .addComponent(oButton)
                            .addComponent(pButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qButton)
                            .addComponent(rButton)
                            .addComponent(sButton)
                            .addComponent(tButton)
                            .addComponent(uButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vButton)
                            .addComponent(wButton)
                            .addComponent(xButton)
                            .addComponent(yButton)
                            .addComponent(zButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }                        

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {
            if(hangman.letterGuess(name, 'a')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'a') {
                    replacement += ('a' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
            this.life=hangman.getCurrentLife(name);
            setImage(life);
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));
			aButton.setEnabled(false);
            String wordGuess=line.replaceAll("\\s","");    
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'b')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'b') {
                    replacement += ('b' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));       
		bButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");    
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'c')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'c') {
                    replacement += ('c' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));
		cButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }
    
    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'd')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'd') {
                    replacement += ('d' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));       
		dButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");    
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'e')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'e') {
                    replacement += ('e' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		eButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'f')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'f') {
                    replacement += ('f' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));       
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'g')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'g') {
                    replacement += ('g' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		gButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'h')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'h') {
                    replacement += ('h' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                    
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));       
		hButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'i')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'i') {
                    replacement += ('i' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		iButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'j')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'j') {
                    replacement += ('j' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		jButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void kButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'k')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'k') {
                    replacement += ('k' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));       
		kButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'l')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'l') {
                    replacement += ('l' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		lButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'm')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'm') {
                    replacement += ('m' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		mButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void nButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'n')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'n') {
                    replacement += ('n' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		nButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'o')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'o') {
                    replacement += ('o' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		oButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'p')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'p') {
                    replacement += ('p' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		pButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'q')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'q') {
                    replacement += ('q' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		qButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'r')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'r') {
                    replacement += ('r' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		rButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 's')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 's') {
                    replacement += ('s' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		sButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 't')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 't') {
                    replacement += ('t' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		tButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'u')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'u') {
                    replacement += ('u' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		uButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'v')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'v') {
                    replacement += ('v' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		vButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'w')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'w') {
                    replacement += ('w' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		wButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'x')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'x') {
                    replacement += ('x' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		xButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'y')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'y') {
                    replacement += ('y' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		yButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {
         if(hangman.letterGuess(name, 'z')) {
                String replacement = "";
                for(int i = 0; i < word.length(); i++) {
                  if(word.charAt(i) == 'z') {
                    replacement += ('z' + " ");
                  } else {
                    if(i == 0) {
                      replacement += line.substring(0,2);
                    } else {
                      replacement += line.substring(i * 2, (i + 1) * 2);
                    }
                  }
                }
                this.line = replacement;
                updateWord(line);
              } else {
                
              }
        this.life=hangman.getCurrentLife(name);
        setImage(life);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));        
		zButton.setEnabled(false);
        String wordGuess=line.replaceAll("\\s","");     
        if(wordGuess.equals(word)){
                this.life=0;
                this.message="Congrats! Do you want to play again?";
            }
            if(life==0){
                int reply = JOptionPane.showConfirmDialog(null, message, "Game over", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  anotherGame();
                }
                else {
                   JOptionPane.showMessageDialog(null, "Thanks For playing");
                   hangman.endGame(name);
                    System.exit(0);
                }
            }
    }

   
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanUI(hangman,name,word).setVisible(true);
            }
        });
    }

    private javax.swing.JButton aButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton dButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JButton mButton;
    private javax.swing.JButton nButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton tButton;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JTextField wordField;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
}
