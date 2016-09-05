import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_953 extends PApplet {

int posX;
int posY;
int posZ=0;
float r = 0;


public void setup()
{
  
  posX = width/2;
  posY = height/2;
}

public void draw()
{
  background(123);
  pushMatrix();
  translate(posX, posY, posZ);

  if ( keyPressed )
  {
    if ( key == 'z')
    {
      posZ += 5;
    }
    if ( key == 'x')
    {
      posZ -=10;
    }
    if ( key == 'r')
    {
      r+=1;
      rotateY(radians(r%360));
//    r += 0.2;
//    (TWO_PI/R%24)
    }
  }
  box(10);
  popMatrix();
}

public void keyPressed()
{

}

public void mouseWheel(MouseEvent event) {
  float e = event.getCount();
  println(e);
}
  public void settings() {  size(300,500,P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_953" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
