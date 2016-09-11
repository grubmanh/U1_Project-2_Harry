import peasy.*;
int[] heightsaver = new int[100000];

PeasyCam cam;

void setup()
{
  fullScreen(P3D);
  frameRate(1000);
  cam = new PeasyCam(this, 100);
  cam.setMinimumDistance(50);
  cam.setMaximumDistance(500);
  generateHeights(4, 20, 100);
}

void draw()
{
  background(0);
  generateWorld(20, 100);
}

void generateHeights(int maxHeight, int worldWidth, int worldDepth)
{
  for (int heighterizer = 0; heighterizer < ((worldWidth * worldDepth)-1); heighterizer++)
  {
    heightsaver [heighterizer] = (int) random(0, maxHeight);
  }
}

void generateWorld(int worldWidth, int worldDepth)
{
  for (int generateWidth = 1; generateWidth < worldWidth; generateWidth++)
  {
    for (int generateDepth = 1; generateDepth < worldDepth; generateDepth++)
    {
      int heightindex = (generateWidth * generateDepth) - ((worldDepth * (generateWidth - 1)) - 1);
      println(heightindex);
      pushMatrix();
      translate(generateWidth, generateDepth, 0);
      box(1, 1, random(0, heightsaver [heightindex]));
      popMatrix();
    }
  }
}