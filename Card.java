/** 
 * Class that writes out long- handed definition of card value
 * solution to Horstmann Ch. 5 P5.2
 * @author Darren "DJ. Otie." Davis
 * @version 11-18-2013
 * */

public class Card
{
 private String value;
 private String suit;
 
 /**
      Constructs a card type and suit of a deck of cards.
      @param notation the string describing the card
   */
  public Card (String notation)
   {
    if (notation.length() == 2)
    {
      value = notation.substring(0,1);
      suit = notation.substring(1);
    }
    else if (notation.length() == 3)
    {
      value= notation.substring(0,2);
      suit = notation.substring(2);
  }
    else if (notation.length() <= 1)
    {
     value = "unknown"; 
    }
  }
    /**
      Get the description of the type and suit of the card.
      @return the description of the the card
   */
   public String getDescription()
   {
      String output = "";
      
      if (value.equals("unknown"))
      {
       output = "unknown"; 
      }

        else if( value.equalsIgnoreCase("A"))
        {
             output = "Ace";
        }
        else if( value.equalsIgnoreCase("2"))
        {
             output = "Two";
        }
        else if( value.equalsIgnoreCase("3"))
        {
             output = "Three";
        }
        else if( value.equalsIgnoreCase("4"))
        {
             output = "Four";
        }
        else if( value.equalsIgnoreCase("5"))
        {
             output = "Five";
        }
        else if( value.equalsIgnoreCase("6"))
        {
             output = "Six";
        }
        else if( value.equalsIgnoreCase("7"))
        {
             output = "Seven";
        }
        else if( value.equalsIgnoreCase("8"))
        {
             output = "Eight";
        }
        else if( value.equalsIgnoreCase("9"))
        {
             output = "Nine";
        }
        else if( value.equalsIgnoreCase("10"))
        {
             output = "Ten";
        }
        else if( value.equalsIgnoreCase("J"))
        {
             output = "Jack";
        }
        else if( value.equalsIgnoreCase("Q"))
        {
             output = "Queen";
        }
        else if( value.equalsIgnoreCase("K"))
        {
             output = "King";
        }
        else
        {
         output = "unknown"; 
        }
        
        if( suit.equalsIgnoreCase("C"))
        {
          output += " of Clubs";
        }
          
        if( suit.equalsIgnoreCase("S"))
        {
          output += " of Spades";
        }
        if( suit.equalsIgnoreCase("D"))
        {
          output += " of Diamonds";
        }
        if( suit.equalsIgnoreCase("H"))
        {
          output += " of Hearts";
        }

      return output;
   }

}