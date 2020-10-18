int x = int (random(5, 500));
int y = int (random(5, 500));
int a = int (random(1, 255));
int b = int (random(1, 255));

void setup() {
	size(500, 500);
  fill(a, b, a + b);
  rect(x, y, x, y);
}
  
void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  stroke(0);

  fill(a, b, a + b);
  rect(x, y, x, y);

  fill(int (random(1, 255)), int (random(1, 255)), int (random(1, 255)));
  ellipseMode(CENTER);
  ellipse(pmouseX + (int (random (-30, 30))), pmouseY + (int (random(-30, 30))), 10, 10);
}

void mousePressed() {
  background(255);
  x = int (random(5, 500));
  y = int (random(5, 500));
  a = int (random(1, 255));
  b = int (random(1, 255));
//Rectangle
  fill(a, b, a + b);
  rect(x, y, x, y);
  }