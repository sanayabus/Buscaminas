package minesweeper;


/**
 * Determina qué hay en cada celda, una celda no descubierta, una con bandera, una con mina, o un número
 *  del 0 al 8 que indique el número de minas colindantes.
 * @author Santi
 */
public class Cell 
{
    private boolean mine;

    /*
     * The content of a field can be a...
     *  "" - indicating an unknown field
     *  "F" - a flagged field
     *  "M" - a mine
     *  a number ranging from 0 to 8 - indicating the number of surrounding mines
     */

    //Only the content of the Cell is visible to the player.
    private String content;

    //Number of adjacent surrounding mines
    private int surroundingMines;

    
    //----------------------------------------------------------//
/**
 * 
 */
    public Cell()
    {
        mine = false;
        content = "";
        surroundingMines = 0;
    }


    
    //-------------GETTERS AND SETTERS----------------------------//
    /**
     * 
     * @return 
     */
    public boolean getMine()
    {
        return mine;
    }
/**
 * 
 * @param mine 
 */
    public void setMine(boolean mine)
    {
        this.mine = mine;
    }
/**
 * 
 * @return 
 */
    public String getContent()
    {
        return content;
    }
/**
 * 
 * @param content 
 */
    public void setContent(String content)
    {
        this.content = content;
    }
/**
 * 
 * @return 
 */
    public int getSurroundingMines()
    {
        return surroundingMines;
    }
/**
 * 
 * @param surroundingMines 
 */
    public void setSurroundingMines(int surroundingMines)
    {
        this.surroundingMines = surroundingMines;
    }

    //-------------------------------------------------------------//
}
