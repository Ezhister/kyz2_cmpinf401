
public class MyRectangle {
	private int startX;
	private int startY;
	private int width;
	private int height;
	
	public MyRectangle() {
		startX = 0;
		startY=0;
		width=0;
		height=0;
	}
	public MyRectangle(int X, int Y, int width, int height) {
		this.startX=X;
		this.startY=Y;
		this.width=width;
		this.height=height;
	}
	public int area() {
		int area=this.width * this.height;
		
		return area;
	}
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width : " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	public boolean isInside(int X, int Y) {
		boolean inside = false;
		if(X>=startX && X<=(startX+width) && Y>=startY && Y<=(startY + height)) {
			inside=true;
		}
		
		return inside;
	}
	public void setSize(int newWidth, int newHeight) {
		this.width=newWidth;
		this.height=newHeight;
	}
	
	public void setPosition(int newX, int newY) {
		this.startX = newX;
		this.startY= newY;
	}
}
