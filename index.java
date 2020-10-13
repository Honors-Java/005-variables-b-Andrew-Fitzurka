int x = 150;
int y = 150;
int a = 275;
int b = 100;

void setup() {
	size(500, 500);
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

  background(60, 6, 79);
  stroke(0);

  fill(200, 175, 56);
  rectMode(CENTER);
  rect(x, y, a, a);
  fill(255, 25, 39);
  ellipseMode(CENTER);
  ellipse(x, y, b, b);
  
  x = x + 1;
  y = y + 1;
}

void mousePressed() {
  a = a - 10;
  b = b - 5;
}