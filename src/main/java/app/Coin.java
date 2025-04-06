package app;

import java.util.Random;

public class Coin {
    
    private String side;
    public String getSide(){
        return side;
    }
    public void setSide (String side){
        this.side=side;
    }

    private final String CONST_HEADS ="H";
    public String getCONST_HEADS(){return CONST_HEADS;}

    private final String CONST_TAILS ="T";
    public String getCONST_TAILS(){return CONST_TAILS;}

    public void flip(){
        Random random =new Random();
        int RandomVal = random.nextInt(2);
        if (RandomVal==0) {
            setSide(getCONST_HEADS());  
        }
        else{
            setSide(getCONST_TAILS());
        }
    }   
}
