package ex0714;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}
class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("gold Wrapping");
	}
}