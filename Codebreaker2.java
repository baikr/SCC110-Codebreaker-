import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class Codebreaker2 implements ActionListener {
//BOARD

      JFrame b = new JFrame();
      //m contains three different panels 
      JPanel m = new JPanel();
      JPanel balls = new JPanel();
      

      private Picture red = new Picture("Colour_0.png");
      private Picture orange = new Picture("Colour_1.png");
      private Picture yellow = new Picture("Colour_2.png");
      private Picture green = new Picture("Colour_3.png");
      private Picture blue = new Picture("Colour_4.png");
      private Picture indigo = new Picture("Colour_5.png");
      private Picture violet = new Picture("Colour_6.png");

      private JButton redbutton = new JButton(red);
      private JButton orangebutton = new JButton(orange);
      private JButton yellowbutton = new JButton(yellow);
      private JButton greenbutton = new JButton(green);
      private JButton bluebutton = new JButton(blue);
      private JButton indigobutton = new JButton(indigo);
      private JButton violetbutton = new JButton(violet);

      private JPanel firstrow = new JPanel();
      private JPanel secondrow= new JPanel();
      private JPanel thirdrow = new JPanel();
      private JPanel fourthrow = new JPanel();
      private JPanel fifthrow = new JPanel();
      private JPanel sixthrow = new JPanel();

      private JLabel row1JLabel = new JLabel(new ImageIcon("Empty.png"));
      private JLabel row2JLabel = new JLabel(new ImageIcon("Empty.png"));
      private JLabel row3JLabel = new JLabel(new ImageIcon("Empty.png"));
      private JLabel row4JLabel = new JLabel(new ImageIcon("Empty.png"));
      private JLabel row5JLabel = new JLabel(new ImageIcon("Empty.png"));
      private JLabel row6JLabel = new JLabel(new ImageIcon("Empty.png"));

      private JPanel scoreone = new JPanel();
      private JPanel scoretwo = new JPanel();
      private JPanel scorethree = new JPanel();
      private JPanel scorefour = new JPanel();
      private JPanel scorefifth = new JPanel();
      private JPanel scoresixth = new JPanel();

      private JLabel[] row = new JLabel[24];
      private JLabel[] correction = new JLabel[24];

      //how do i fill the board from the second row 

      private JLabel [] row1 = new JLabel[4];
      private JLabel [] row2 = new JLabel[4];
      private JLabel [] row3 = new JLabel[4];
      private JLabel [] row4 = new JLabel[4];
      private JLabel [] row5 = new JLabel[4];
      private JLabel [] row6 = new JLabel[4];
      //if index 24, 4,4,4,4,4,4 
      private int index;
      

     // private Guess[] rows = new Guess[6];



      public Codebreaker2(){

        index =0;
      //whole board
        b.setVisible(true);
        b.setTitle("Code Breaker!");
        b.setSize(400,600);
        b.setContentPane(m);
     //   m.setSize(400,600);

      /*  for(int i=0; i<6; i++){
            rows[i] = new Guess();
            JPanel pan = rows[i].getPanel();
            m.add(pan);
        }*/
        
        
        //row1 is the top, row 6 is the bottom aka where we need the game to start 
        for(int h=0; h<4; h++){
            JLabel rowone = new JLabel(new ImageIcon("Empty.png"));
            firstrow.add(rowone);
            row1[h] = rowone;
        }

        JLabel [] row2 = new JLabel[4];
        for(int i=0; i<4; i++){
            JLabel rowtwo = new JLabel(new ImageIcon("Empty.png"));
            secondrow.add(rowtwo);
            row2[i] =rowtwo;
        }
        
        JLabel [] row3 = new JLabel[4];
        for(int j=0; j<4; j++){
            JLabel rowthree = new JLabel(new ImageIcon("Empty.png"));
            thirdrow.add(rowthree);
            row3[j]=rowthree;
        }

        JLabel [] row4 = new JLabel[4];
        for(int k=0; k<4; k++){
            JLabel rowfour = new JLabel(new ImageIcon("Empty.png"));
            fourthrow.add(rowfour);
            row4[k]=rowfour;

        }

        JLabel [] row5 = new JLabel[4];
        for(int l=0; l<4; l++){
            JLabel rowfive = new JLabel(new ImageIcon("Empty.png"));
            fifthrow.add(rowfive);
            row5[l]=rowfive;
        }

        JLabel [] row6 = new JLabel[4];
        for(int m=0; m<4; m++){
            JLabel rowsix = new JLabel(new ImageIcon("Empty.png"));
            sixthrow.add(rowsix);
            row6[m]=rowsix;

        }

        

        GridLayout grid = new GridLayout(1, 7);

        m.setLayout(new GridLayout(7, 1));
        
        balls.setLayout(grid);
  
        balls.add(redbutton);
        balls.add(orangebutton);
        balls.add(yellowbutton);
        balls.add(greenbutton);
        balls.add(bluebutton);
        balls.add(indigobutton);
        balls.add(violetbutton);

        
        GridLayout gridtwo = new GridLayout(1,4);
      

        firstrow.setLayout(gridtwo);
        secondrow.setLayout(gridtwo);
        thirdrow.setLayout(gridtwo);
        fourthrow.setLayout(gridtwo);
        fifthrow.setLayout(gridtwo);
        sixthrow.setLayout(gridtwo);

        GridLayout gridthree = new GridLayout(2,2);

        scoreone.setLayout(gridthree);
        scoretwo.setLayout(gridthree);
        scorethree.setLayout(gridthree);
        scorefour.setLayout(gridthree);
        scorefifth.setLayout(gridthree);
        scoresixth.setLayout(gridthree);


        for(int i=0; i<4; i++){

            JLabel correction = new JLabel(new ImageIcon("Empty.png"));
            scoreone.add(correction);
            
        }

        for(int j=0; j<4; j++){
            JLabel correction = new JLabel(new ImageIcon("Empty.png"));
            scoretwo.add(correction);
        }


        for(int k=0; k<4; k++){
            JLabel correction = new JLabel(new ImageIcon("Empty.png"));
            scorethree.add(correction);
        }

        for(int l=0; l<4; l++){
            JLabel correction = new JLabel(new ImageIcon("Empty.png"));
            scorefour.add(correction);
        }

        for(int m=0; m<4; m++){
            JLabel correction = new JLabel(new ImageIcon("Empty.png"));
            scorefifth.add(correction);
        }

        for(int n=0; n<4; n++){
            JLabel correction = new JLabel(new ImageIcon("Empty.png"));
            scoresixth.add(correction);
        }

        m.add(scoreone);
        m.add(scoretwo);
        m.add(scorethree);
        m.add(scorefour);
        m.add(scorefifth);
        m.add(scoresixth);

        m.add(firstrow);
        firstrow.add(scoreone);
        m.add(secondrow);
        secondrow.add(scoretwo);
        m.add(thirdrow);
        thirdrow.add(scorethree);
        m.add(fourthrow);
        fourthrow.add(scorefour);
        m.add(fifthrow);
        fifthrow.add(scorefifth);
        m.add(sixthrow);
        sixthrow.add(scoresixth);

        m.add(balls);

        redbutton.addActionListener(this);
        orangebutton.addActionListener(this);
        yellowbutton.addActionListener(this);
        greenbutton.addActionListener(this);
        bluebutton.addActionListener(this);
        indigobutton.addActionListener(this);
        violetbutton.addActionListener(this);


    

        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
      //URGENT "add to github repository before monday"

  
     //constructor should be named after the same class 
     //ex) codebreaker-codebreaker

     public void actionPerformed (ActionEvent e){

     // Codebreaker game = new Codebreaker();
      if(e.getSource().equals(redbutton)){
        System.out.println("redbutton button was pressed");
        row1[index].setIcon(red);

        index++;

        
    }

  

    if(e.getSource().equals(orangebutton)){
        System.out.println("orangebutton button was pressed");
        row1[index].setIcon(orange);
    
        index++;
    }

    if(e.getSource().equals(yellowbutton)){
        System.out.println("yellowbutton was pressed");
        row1[index].setIcon(yellow);
        
        index++;
    }

    if(e.getSource().equals(greenbutton)){
        System.out.println("greenbutton was pressed");
        row1[index].setIcon(green);
       
        index++;
    }

    if(e.getSource().equals(bluebutton)){
        System.out.println("bluebutton was pressed");
        row1[index].setIcon(blue);
    
        index++;
    }

    if(e.getSource().equals(indigobutton)){
        System.out.println("indigobutton was pressed");
        row1[index].setIcon(indigo);
      
        index++;
    }

    if(e.getSource().equals(violetbutton)){
        System.out.println("violetbutton was pressed");
        row1[index].setIcon(violet);
       
        index++;
    }








     }


    
    

    

    

  }


