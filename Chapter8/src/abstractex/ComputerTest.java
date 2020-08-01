package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//추상클래스는 생성이 안됨
		
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		
		
		NoteBook myNote = new MyNoteBook();
		myNote.display();
		
	}

}
