package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//�߻�Ŭ������ ������ �ȵ�
		
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		
		
		NoteBook myNote = new MyNoteBook();
		myNote.display();
		
	}

}
