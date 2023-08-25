import javax.swing.*;

public class check {

    JTextField[][] lab;
    check(JTextField[][] lab){
        lab=lab;
    }
    boolean ck(JTextField[][] lab,int x,int y,int val){
        for(int i=0;i<9;i++){
            if(i!=x){
                if(Integer.parseInt(lab[i][y].getText())==val){
                    return false;
                }
            }
            if(i!=y){
                if(Integer.parseInt(lab[x][i].getText())==val){
                    return false;
                }
            }

        }
        for(int i=(x/3)*3;i<((x/3)+1)*3;i++){
            for(int j=(y/3)*3;j<((y/3)+1)*3;j++){
                if(i!=x && j!=y){
                    if(Integer.parseInt(lab[i][j].getText())==val){
                        return false;
                    }
                }

            }
        }
        return true;
    }
    boolean solve(JTextField[][] lab){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(Integer.parseInt(lab[i][j].getText())<=9){
                if(ck(lab,i,j,Integer.parseInt(lab[i][j].getText()))){
                    continue;
                }
                else{
                    return false;
                }}else {
                    return false;
                }
            }
        }
        return true;
    }
}
