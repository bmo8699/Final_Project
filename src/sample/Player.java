package sample;

public class Player {
    private int id;
    private String name;
    private boolean connected;
    private int point;
    private int nestId;
    private Dice[] dice = new Dice[2];
    private int dice1 = 0;
    private int dice2 = 0;
    Player(){
    }
    Player(int id, String name, boolean connected, int point, int nestid){
        this.id = id;
        this.name = name;
        this.connected = connected;
        this.point = point;
        this.nestId = nestid;
    }
    void setNestId(int id){
        nestId = id;
    }
    int getNestId(){
        return nestId;
    }
    void set_id(int id){
        this.id = id;
    }
    void set_name(String name){
        this.name = name;
    }
    void setConnected(){
        connected = true;
    }
    void setDisconnected(){
        connected = false;
    }
    boolean getConnection(){
        return connected;
    }
    void storePoints(int point){
        this.point += point;
    }
    int movePosition(){
        Piece piece = pick();
        int destination;
        destination = piece.getPosition() + dice1 + dice2;
        return destination;
    }
    int movePosition(Piece piece){
        int destination;
        destination = piece.getPosition() + dice1 + dice2;
        return destination;
    }
    void roll(){
        dice1 = dice[0].roll();
        dice2 = dice[1].roll();
    }
    int[] getDices(){
        return new int[]{dice1,dice2};
    }
    void stop(){
        setDisconnected();
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
    Piece pick(){
        Nest nest = new Nest();
        return nest.getPiece().get(getNestId());
    }
    void deploy(Piece piece){
        piece.setPosition(0);
    }
    void deploy(){
        Piece piece = pick();
        piece.setPosition(0);
    }
}
