package Q0408;
import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		list.add(new Board("제목4","내용4"));
		list.add(new Board("제목5","내용5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject+ "\t" + board.content);
		}  //\t 쓰면 자리수 잘맞음
	}

}
