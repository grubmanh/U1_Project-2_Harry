int posX;
int posY;
int posZ=0;
float r = 0;


void setup()
{
  size(300,500,P3D);
  posX = width/2;
  posY = height/2;
}

void draw()
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

void keyPressed()
{

}

void mouseWheel(MouseEvent event) {
  float e = event.getCount();
  println(e);
}
