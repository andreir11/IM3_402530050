/*
 * [A]98
 * [TA's advise]
 * 1.自行建置類別會建議加入無參數建構子, 以避免程式撰寫時出現問題, Rectangle1(){this(-1,-1,-1,-1);//可以透過this的方式進行物件的initial}.
 * 2.Class內部的properties Ok, 修飾字目前都使用public, 有沒有辦法可以讓他更好更安全呢? (想想看protected, private等修飾字).
 * 3.Rectangle1與Rectangle2其實是做相同的事情, 不需要將其複製另外一份出來, 下方的程式碼我有稍微修改你的程式碼內容(註解部分內容), 請你再看一下.
 * 4.另外toString需要使用overridding的方式去複寫Object class中提供的method, 你的程式碼是建構出另一個method而不是overridding, 此部分酌量扣2分.
 * */

//java homework 1
//rectangle tester
//402530050_胡珂雲����

class Rectangle1 {

	public int height;
	public int width;
	public int y;
	public int x;

	public Rectangle1(int h1, int w1, int y1, int x1) {
		height = h1;
		width = w1;
		y = y1;
		x = x1;

	}

	public int getHeight1() {
		return height;
	}

	public int getWidth1() {
		return width;
	}

	double getArea1() {
		return getHeight1() * getWidth1();
	}

	double getPerimeter1() {
		return 2 * (getHeight1() + getWidth1());
	}

	// this is overridding
	public String toString() {
		return " X = " + x + ", Y = " + y + ", Width = " + width + ", Height = " + height;
	}

	// this is a new method
	public String toString1() {
		return " X = " + x + ", Y = " + y + ", Width = " + width + ", Height = " + height;
	}
}

/*
 * class Rectangle2 {
 * 
 * public int height ; public int width ; public int y ; public int x ;
 * 
 * 
 * public Rectangle2 (int h2, int w2, int y2, int x2){ height = h2; width = w2;
 * y = y2; x = x2;
 * 
 * } public int getHeight2(){ return height; }
 * 
 * public int getWidth2(){ return width; }
 * 
 * double getArea2(){ return getHeight2()*getWidth2(); }
 * 
 * double getPerimeter2(){ return 2 * (getHeight2() + getWidth2()); }
 * 
 * public String toString2(){ return " X = " + x + ", Y = " + y + ", Width = " +
 * width + ", Height = " + height; }
 * 
 * }
 */

public class RectangleTester {

	public static void main(String[] args) {

		Rectangle1 rec1 = new Rectangle1(18, 57, 25, 15);
		Rectangle1 rec2 = new Rectangle1(47, 60, 12, 0);
		// Rectangle2 rec2 = new Rectangle2(47, 60, 12, 0);

		System.out.println();

		System.out.println("java.Rectangle [" + rec1.toString() + " ]");
		// System.out.println("java.Rectangle [" + rec1.toString1() + " ]");

		System.out.println("Area= " + rec1.getArea1());
		System.out.println("Perimeter= " + rec1.getPerimeter1());

		System.out.println();
		System.out.println();

		System.out.println("java.Rectangle [" + rec2.toString() + " ]");
		// System.out.println("java.Rectangle [" + rec2.toString1() + " ]");

		System.out.println("Area= " + rec2.getArea1());
		System.out.println("Perimeter= " + rec2.getPerimeter1());

		// System.out.println("java.Rectangle [" + rec2.toString2() + " ]");
		// System.out.println("Area= " + rec2.getArea2());
		// System.out.println("Perimeter= " + rec2.getPerimeter2());

		System.out.println();
		System.out.println();

		System.out.print("End of Output! ");
	}

}
