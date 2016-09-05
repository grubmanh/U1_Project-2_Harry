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


void setup()
{
  size(300,500,P3D);
  posX = width/2;
  posY = height/2;
  // cam = new PeasyCam();
}

void draw()
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

void keyPressed()
{

}

void mouseWheel(MouseEvent event) {
  e = event.getCount();
}

int deltaX(int initialX, int finalX)
{
  return finalX - initialX;
}
int deltaY(int initialY, int finalY)
{
  return finalY - initialY;
}
