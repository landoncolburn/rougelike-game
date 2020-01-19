import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Player extends GameObject {

  Handler handler;

  public Player(int x, int y, Handler handler){
    super(x, y, ID.Player);
    this.handler = handler;
  }

  public void tick(){
    x += velX;
    y += velY;

    if(handler.getUp()) velY = -5;
    else if(!handler.getDown()) velY = 0;

    if(handler.getDown()) velY = 5;
    else if(!handler.getUp()) velY = 0;

    if(handler.getRight()) velX = 5;
    else if(!handler.getLeft()) velX = 0;

    if(handler.getLeft()) velX = -5;
    else if(!handler.getRight()) velX = 0;

  }

  public void render(Graphics g){
    g.setColor(Color.blue);
    g.fillRect(x, y, 32, 48);
  }

  public Rectangle getBounds(){
    return new Rectangle(x,y,32,48);
  }

}
