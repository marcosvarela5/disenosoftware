package t2;

enum Num {Ace("A"),
    Two("2"),
    Three("3"),
    Four("4"),
    Five("5"),
    Six("6"),
    Seven("7"),
    Eight("8"),
    Nine("9"),
    Ten("10"),
    Jack("J"),
    Queen("Q"),
    King("K");

    private final String abreviatura;

    Num(String abreviatura){
    this.abreviatura = abreviatura;
    }
    @Override
    public String toString(){
    return abreviatura;
    }
}