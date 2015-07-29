package note.pattern.behavioral.Command.sample.draw;

import note.pattern.behavioral.Command.sample.Drawing;


public class DrawingImpl implements Drawing {

	public void processSome() {
        System.out.println("    - 對圖片作 Some 處理");
    }
    public void processOther() {
        System.out.println("    - 對圖片作 Other 處理");
    }
    public void processAnother() {
        System.out.println("    - 對圖片作 Another 處理");
    }

}
