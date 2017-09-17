import java.awt.*;
import java.applet.*;

public class MiFoto extends Applet{
  private Image i;

  public void init(){
    i=getImage(getDocumentBase(),"foto.jpg");
  }

  public void paint(Graphics g){
    g.drawImage(i,25,25,this);
  }

}
