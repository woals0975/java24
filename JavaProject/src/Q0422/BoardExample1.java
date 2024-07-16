package Q0422;

import java.util.Scanner;

public class BoardExample1 {
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("--------------------------------");
		System.out.printf("%-6%s-12%s-16%s-40s\n", "no","writer","date","title");
		System.out.println("--------------------------------");
		System.out.printf("%-6%s-12%s-16%s-40s\n",
				"1","winter","2022.01.27","게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6%s-12%s-16%s-40s\n",
				"2","winter","2022.01.27","올 겨울은 많이 춥습니다.");
		mainMenu();
	}

	
	public void mainMenu() {
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit ");
		System.out.println("메인 선택: ");
		String menuNo = sc.nextLine();
		System.out.println();
		
		switch(menuNo) {
		case"1" -> create();
		case"2" -> read();
		case"3" -> clear();
		case"4" -> exit();
		}
		
	}
	
	public void create() {
		System.out.println("*** create() 메소드 실행됨");
		list();
	}
	
	public void read() {
		System.out.println("*** read() 메소드 실행됨");
		list();
	}
	
	public void clear() {
		System.out.println("*** clear() 메소드 실행됨");
		list();
	}
	
	public void exit() {
		System.exit(0);
		list();
	}

	public static void main(String[] args) {
		BoardExample1 boardExample = new BoardExample1();
		boardExample.list();
	}
}