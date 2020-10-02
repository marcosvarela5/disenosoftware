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


    //
    public static void main(String[] args) {

        Card c1 = new Card(11, "red", "spades");
        c1.showCard();
    }
}