import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Bullet extends GameObject {

  private Handler handler;

  public Bullet(int x, int y, Handler handler, int mx, int my){
    super(x, y, ID.Bullet);
    this.handler = handler;

    velX = (mx-x)/10;
    velY = (my-y)/10;
  }

  public void tick(){
    x+=velX;
    y+=velY;

    for(int i = 0; i<handler.object.size(); i++){
      GameObject tempObject = handler.object.get(i);

      if(tempObject.getID() == ID.Block){
        if(getBounds().intersects(tempObject.getBounds())){
          handler.removeObject(this);
        }
      }
    }
  }

  public void render(Graphics g){
    g.setColor(Color.orange);
    g.fillOval(x, y, 8, 8);
  }

  public Rectangle getBounds(){
    return new Rectangle(x, y, 8, 8);
  }
}
