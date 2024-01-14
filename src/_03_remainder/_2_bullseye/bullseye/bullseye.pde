
void setup() {
 
  // set the size of your sketch
  size(800,800);
}

void draw() {
  int col0r=0;
  noStroke();
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  fill(255,0,0);
  ellipse(400,400,800,800);
  for(int size = 800; size>0; size-=50) {
    col0r = 0;
    if (size %100==0) {
      col0r =255;
  }
  fill(col0r,0,0);
  ellipse(400,400,size,size);
  //Use an if statement and remainder to alternate the color of your rings.
  
  
  }
}
