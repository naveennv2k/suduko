import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.*;


public class Layer extends Frame{
    JTextField label[][];


    JTextField dis;
    JButton button1=new JButton("Click For Answer");

    Layer() {
        setBackground(Color.cyan);

        int[][] arr=new int[][]{  {7, 0, 0, 0, 0, 0, 2, 0, 0},
                {4, 0, 2, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 2, 0, 1, 0, 0, 0},
                {3, 0, 0, 1, 8, 0, 0, 9, 7},
                {0, 0, 9, 0, 7, 0, 6, 0, 0},
                {6, 5, 0, 0, 3, 2, 0, 0, 1},
                {0, 0, 0, 4, 0, 9, 0, 0, 0},
                {5, 0, 0, 0, 0, 0, 1, 0, 6},
                {0, 0, 6, 0, 0, 0, 0, 0, 8}
        };
        JFrame fr = new JFrame("SUDUKO");
        fr.getContentPane().setBackground(Color.PINK );
        fr.setSize(500, 500);
        fr.getContentPane().setLayout(null);
       dis =new JTextField();
       dis.setBackground(Color.cyan);
       dis.setEditable(false);
        dis.setBounds(200,20,70,30);
        fr.add(dis);
        label= new JTextField[10][10];
        fr.setBackground(Color.red);

            button1.setBounds(0,420,200,30);
            fr.add(button1);
            JButton submit=new JButton("SUBMIT");
            submit.setBounds(380,420,100,30);
        fr.add(submit);
        JButton reset=new JButton("Reset");
        reset.setBounds(220,420,100,30);
        fr.add(reset);

        int y=60;
        int x=50;
        int count=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) {

                label[i][j] = new JTextField();
                label[i][j].setBounds(x, y, 20, 20);
                if(arr[i][j]!=0){
                    label[i][j].setEditable(true);
                    label[i][j].setText(String.valueOf(arr[i][j]));
                    label[i][j].setEditable(false);
                }
                else{
                    label[i][j].setEditable(true);
                    label[i][j].setText("");

                }
                count++;
                fr.add(label[i][j]);

                x+=50;
            }
            x = 50;
            y+=40;


        }
        reset.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                int[][] arr=new int[][]{  {7, 0, 0, 0, 0, 0, 2, 0, 0},
                        {4, 0, 2, 0, 0, 0, 0, 0, 3},
                        {0, 0, 0, 2, 0, 1, 0, 0, 0},
                        {3, 0, 0, 1, 8, 0, 0, 9, 7},
                        {0, 0, 9, 0, 7, 0, 6, 0, 0},
                        {6, 5, 0, 0, 3, 2, 0, 0, 1},
                        {0, 0, 0, 4, 0, 9, 0, 0, 0},
                        {5, 0, 0, 0, 0, 0, 1, 0, 6},
                        {0, 0, 6, 0, 0, 0, 0, 0, 8}
                };


            int y=60;
            int x=50;
            int count=0;
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++) {




                    if(arr[i][j]!=0){
                        label[i][j].setEditable(true);
                        label[i][j].setText(String.valueOf(arr[i][j]));
                        label[i][j].setEditable(false);
                    }
                    else{
                        label[i][j].setEditable(true);
                        label[i][j].setText("");

                    }
                    count++;


                    x+=50;
                }
                x = 50;
                y+=40;


            }
            }

                                    @Override
                                    public void mousePressed(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {

                                    }
                                }
        );

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int arr[][]=new int[][]{ { 7, 6, 5, 8, 4, 3, 2, 1, 9 },
                        { 4, 1, 2, 6, 9, 7, 8, 5, 3 },
                        { 9, 3, 8, 2, 5, 1, 7, 6, 4 },
                        { 3, 2, 4, 1, 8, 6, 5, 9, 7 },
                        { 1, 8, 9, 5, 7, 4, 6, 3, 2 },
                        { 6, 5, 7, 9, 3, 2, 4, 8, 1 },
                        { 8, 7, 1, 4, 6, 9, 3, 2, 5 },
                        { 5, 9, 3, 7, 2, 8, 1, 4, 6 },
                        { 2, 4, 6, 3, 1, 5, 9, 7, 8 }
                } ;
                int y=60;
                int x=50;
                int count=0;

                for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++) {




                        label[i][j].setEditable(true);
                            label[i][j].setText(String.valueOf(arr[i][j]));





                        x+=50;
                    }
                    x=50;
                    y+=40;
            }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        submit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                check c=new check(label);
                try {


                if(c.solve(label)==true){
                    dis.setText("VALID");
                }
                else{
                    dis.setText("NOT VALID");
                }
            }catch (Exception e1){
                dis.setText("Error!!!!");
            //    System.out.print(e1);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Layer();
    }


}
