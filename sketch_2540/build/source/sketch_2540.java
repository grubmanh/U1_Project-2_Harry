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

public class sketch_2540 extends PApplet {

// import peasy.*;

// PeasyCam cam;
int posX;
int posY;
int posZ=0;
float r = 0;
float e;
int mouseTracker = 0;
int deltaX, deltaY, initialX, initialY, finalX, finalY;
int freakoutBlocker = 10;


public void setup()
{
  
  posX = width/2;
  posY = height/2;
  // cam = new PeasyCam();
}

public void draw()
{
  background(123);
  pushMatrix();
  translate(posX, posY, posZ);
  mouseWheel();
    if (e > 0)
    {
      posZ += 10;
      e = 0;
    }
    if ( e < 0)
    {
      posZ -= 10;
      e = 0;
    }
      float rotatione = map(mouseX, 0, width, 0, TWO_PI);
      rotateY(rotatione);
      float rotationee = map(mouseY, 0, height, 0, PI);
      rotateX(rotationee);
  box(10);
  popMatrix();
}

public void keyPressed()
{

}

public void mouseWheel(MouseEvent event) {
  e = event.getCount();
}

public int deltaX(int initialX, int finalX)
{
  return finalX - initialX;
}
public int deltaY(int initialY, int finalY)
{
  return finalY - initialY;
}
  public void settings() {  size(300,500,P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_2540" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
