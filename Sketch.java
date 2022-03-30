import processing.core.PApplet;

public class Sketch extends PApplet {
	
/**
 * A program Sketch.java that draws 4 quadrants with different drawings identically to the sample
 * @author: R.Shiu
 */
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255, 255, 255);
  }

  // Drawing the 10 by 10 grid (top left quadrant)
  public void draw() {
    for(int lineX = width/2; lineX > 0; lineX -= 20){
     line(width/2 , lineX, 0, lineX);
     line(lineX, height/2, lineX, 0);
   }
    
  // Drawing the 5 x 5 purple circles (top right quadrant)
    for(int circleX = 220; circleX <= 380; circleX += 40){
      for(int circleY = 20; circleY < 220; circleY += 40){
        fill(204, 0, 204);
        ellipse(circleX, circleY, 20, 20);
      }
    }

  // Drawing the gradient (bottom left quadrant)
    for(int gradient = 0; gradient <= width/2; gradient++){
      stroke(gradient);
      line(gradient, height/2, gradient, height);
    }

    // Drawing flower pedals (bottom right quadrant)
    stroke(0);
    translate((float) (width * 0.75),(float) (height * 0.75));
    for(int pedal = 1; pedal <= 9; pedal += 1){
      fill(255, 128, 0);
      ellipse(0, 0, 20, 130);
      rotate(radians(45));
    }
    // Drawing the middle circle for the flower (bottom right quadrant)
    fill(0, 153, 0);
    ellipse(0, 0, 30, 30);

}

  
  // define other methods down here.
}