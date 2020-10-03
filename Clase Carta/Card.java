package t2;

public class Card {

    // Estado - Atributos
    private final int num;
    private final String color, suit;

    /* Los métodos modificadores no se utilizan porque queremos construir una clase inmutable,
    ya que el juego no tendría sentido si las cartas pudiesen cambiar sus atributos durante el juego
     */

    /*public void setNum(int v) {valor = v;}
    public void setColor(String c) {color = c;}
    public void setSuit(String p) {palo = p;}*/

    // Métodos de acceso

    public int getNum() {
        return num;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    public void showCard() {
        System.out.println("\nYour card is the " + getColor()+ " " + getNum() + " of " + getSuit() + "\n");
    }


    // Constructor
    public Card(int n, String c, String s) {

        num = n;
        color = c;
        suit = s;
    }

    public Card(Card c){
        num = c.getNum();
        color = c.getColor();
        suit = c.getSuit();
    }

    public boolean equals(Object obj){

        if(obj == null){return false;}
        if(this == obj){return true;}
        if(this.getClass() != obj.getClass()){return false;}

        Card card = (Card)obj;
        if(this.num != card.num){return false;}
        if(!this.suit.equals(card.suit)){return false;}
        return this.color.equals(card.color);

    }

    public static void main(String[] args){

        Card c1 = new Card(11, "red", "spades");
        Card c2 = new Card(11, "red", "spades");
        Card c3 = new Card(4, "negro", "diamond");

        // Identical means pointers point the same memory direction - Equals mean that they have the same content");

        // C1 == C2
        if(c1 == c2){System.out.println("C1 and C2 are identical");}
        else System.out.println("C1 and C2 are not identical");

        if (c1.equals(c2)){System.out.println("C1 y C2 are equal");}
        else System.out.println("C1 and C2 are not equal");

        System.out.println("----------------");

        // C2 == C3

        if(c2 == c3){System.out.println("C2 and C3 are identical");}
        else System.out.println("C2 and C3 are not identical");

        if (c2.equals(c3)){System.out.println("C2 and C3 are equal");}
        else System.out.println("C2 and C3 are not equal");

        System.out.println("----------------");

        // C1 == C3

        if(c1 == c3){System.out.println("C1 and C3 are identical");}
        else System.out.println("C1 and C3 are not identical");

        if (c1.equals(c3)){System.out.println("C1 and C3 are equal");}
        else System.out.println("C1 and C3 are not equal");
    }
}