
public class CircleRecursion {
	//Must use processing program to run this
	/*void setup() {
		  size(640,360);
		}
		 
		void draw() {
		  background(255);
		  drawCircle(width/2,height/2,200);
		}
		 
		void drawCircle(float x, float y, float radius) {
		  stroke(0);
		  noFill();
		  ellipse(x, y, radius, radius);
		  if(radius > 2) {       base case 
		    // drawCircle() calls itself twice, creating a branching effect. For every circle, a smaller circle is drawn to the left and the right.
		    drawCircle(x + radius/2, y, radius/2);
		    drawCircle(x - radius/2, y, radius/2);
		 
		  }
		}

*/
}
/*
void setup() {
	  size(640,360);
	}
	 
	void draw() {
	  background(255);
	  drawCircle(width/2,height/2,200);
	}
	 
	void drawCircle(float x, float y, float radius) {
	  ellipse(x, y, radius, radius);
	  if(radius > 8) {
	    drawCircle(x + radius/2, y, radius/2);
	    drawCircle(x - radius/2, y, radius/2);
	    drawCircle(x, y + radius/2, radius/2);
	    drawCircle(x, y - radius/2, radius/2);
	  }
	}
*/