package t2;

public class Card {

    // Estado - Atributos
    private final Num num;
    private final Color color;
    private final Suit suit;

    /* Los métodos modificadores no se utilizan porque queremos construir una clase inmutable,
    ya que el juego no tendría sentido si las cartas pudiesen cambiar sus atributos durante el juego
     */

    /*public void setNum(int v) {valor = v;}
    public void setColor(String c) {color = c;}
    public void setSuit(String p) {palo = p;}*/

    // Métodos de acceso

 public Num getNum(){return num;}
 public Suit getSuit(){return suit;}
 public Color getColor(){return color;}

    public void showCard() {
        System.out.println("\nYour card is the " + getColor()+ " " + getNum() + " of " + getSuit() + "\n");
    }


    // Constructor
    public Card(Num num, Suit suit, Color color) {

        this.num = num;
        this.color = color;
        this.suit = suit;
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



    @Override
    public int hashCode() {
        int result = num.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + suit.hashCode();
        return result;
    }

    @Override

    public String toString(){
        return "[" + color + " " + num.toString() + " of " + suit +"]";
    }

    public static void main(String[] args) {

        Card c1 = new Card(Num.Ten, Suit.Spades, Color.Black);
        Card c2 = new Card(Num.Eight, Suit.Hearts, Color.Red);
        Card c3 = new Card(Num.King, Suit.Spades, Color.Red);
        Card c4 = new Card(Num.Five, Suit.Hearts, Color.Red);

        // Identical means pointers point the same memory direction - Equals mean that they have the same content");

        // C1 == C2
        if(c1 == c2){
            System.out.println("C1 and C2 are identical");
        }
        else System.out.println("C1 and C2 are not identical");

        if (c1.equals(c2)){
            System.out.println("C1 and C2 are equal");
        }
        else
            System.out.println("C1 and C2 are not equal");

        System.out.println("----------------");

        // C2 == C3

        if(c2 == c3){
            System.out.println("C2 and C3 are identical");
        }
        else
            System.out.println("C2 and C3 are not identical");

        if (c2.equals(c3)){
            System.out.println("C2 and C3 are equal");
        }
        else
            System.out.println("C2 and C3 are not equal");

        System.out.println("----------------");

        // C1 == C3

        if(c1 == c3){
            System.out.println("C1 and C3 are identical");
        }
        else
            System.out.println("C1 and C3 are not identical");

        if (c1.equals(c3)){
            System.out.println("C1 and C3 are equal");
        }
        else
            System.out.println("C1 and C3 are not equal");

        System.out.println("\nc1.hashCode() = " + c1.hashCode());
        System.out.println("c2.hashCode() = " + c2.hashCode());
        System.out.println("c3.hashCode() = " + c3.hashCode() + "\n");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
    }
}