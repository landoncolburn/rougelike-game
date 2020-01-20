import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Crate extends GameObject {

  private Handler handler;

  public Crate(int x, int y){
    super(x, y, ID.Crate);
  }

  public void tick(){
    
  }

  public void render(Graphics g){
    g.setColor(Color.CYAN);
    g.fillRect(x, y, 32, 32);
  }

  public Rectangle getBounds(){
    return new Rectangle(x, y, 32, 32);
  }
}
