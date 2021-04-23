package och07;

public class Outer {
	int width  = 10;
	int height = 10;
	
	Outer (int width, int height){
		this.width  = width;
		this.height = height;
	}
	
	// 내부 class
	class Inner{
		int depth = 10;
		public int volume() {
			return width *height *depth;
		}
	}
	
	public Inner getInner() {
		return new Inner();
	}
}
