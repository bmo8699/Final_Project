package sample;

public class Player {
    private int id;
    private String name;
    private boolean connected;
    private int point;
    private Piece[] nest = new Piece[4];
    private int dice1=0;
    private int dice2=0;
    private enum color {GREEN, RED, BLUE, YELLOW}
    enum action {MOVE, ROLL,STOP,HOME}
    Player(){
    }
    void set_id(int id){
        this.id = id;
    }
    void set_name(String name){
        this.name = name;
    }
    void activateConnection(boolean act){
        this.connected = act;
    }
    boolean getConnection(){
        return connected;
    }
    void storePoints(int point){
        this.point += point;
    }
    void setColor(color color){
        switch (color){
            case RED:
                for (Piece value : nest) {
                    value.color = "red";
                }
                break;
            case BLUE:
                for (Piece piece : nest) {
                    piece.color = "blue";
                }
                break;
            case GREEN:
                for (Piece piece : nest) {
                    piece.color = "green";
                }
                break;
            case YELLOW:
                for (Piece piece : nest) {
                    piece.color = "yellow";
                }
                break;
        }
    }
    int MovePosition(Piece piece){
        int destination=0;
        destination = piece.getPosition() + dice1 + dice2;
        return destination;
    }
    void roll(Dice[] dice){
        dice = new Dice[2];
        dice1 = dice[0].roll();
        dice2 = dice[1].roll();
    }
    int[] getDices(){
        return new int[]{dice1,dice2};
    }
    void stop(){
        connected = false;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    int getPoint(){
        return point;
    }
    Piece getHorse(){
        return nest[id];
    }
}
