package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	private Scanner sc = new Scanner(System.in);
	
	private List<Book> bookList = new ArrayList<Book>();
	
	private List<Book> favorit = new ArrayList<Book>();
	
	{
		
		bookList.add( new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원") );
		bookList.add( new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개") );
		bookList.add( new Book(3333, "역행자", "자청", 17550, "웅진지식하우스") );
		bookList.add( new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들") );
		bookList.add( new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스") );
		
	}
	
	public void displayMenu() {
	
		
		int menu = 0;
		
		do {
			
			try {
				
				System.out.println("\n=== 도서 목록 프로그램 ===\n");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴를 입력하세요 : ");
				menu = sc.nextInt();
				
				switch(menu) {
				
				case 1 : addBook(); break;
				case 2 : selectBook(); break;
				case 3 : updateBook(); break;
				case 4 : deleteBook(); break;
				case 5 : addFavorit(); break;
				case 6 : deleteFavorit(); break;
				case 7 : selectFavorit(); break;
				case 8 : recommandBook(); break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴 번호를 잘못 선택했습니다. 다시 입력해주세요.");
				}
				
			} catch (InputMismatchException e) {
				
				System.out.println("Error : 입력 방식이 올바르지 않습니다. 다시 입력해주세요.");
				sc.nextLine();	// 입력버퍼 개행
				menu = -1;
				
			}
			
			
		} while (menu != 0);
		
	}	
	
	public void addBook() throws InputMismatchException {
		
		System.out.println("\n===== 도서 등록 =====\n");
		System.out.print("도서 번호 : ");
		int bNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String bName = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사 : ");
		String publish = sc.next();
		

		
		if(bookList.add( new Book(bNum, bName, author, price, publish) )) {
			
			System.out.println("등록 완료");
			return;
		} else {
			System.out.println("도서 등록에 실패했습니다.");
		}
		
	}
	
	public void selectBook() {
		
		for(int i = 0; i < bookList.size(); i ++) {
			
			System.out.println( bookList.get(i) );
			
		}
		
	}
	
	public void updateBook() throws InputMismatchException {
		
		System.out.println("\n===== 도서 수정 =====\n");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int input1 = sc.nextInt();
		
		
		boolean flag = false;
		
		for(int i = 0; i < bookList.size(); i ++) {
			
			if(bookList.get(i).getbNum() == input1) {
				flag = true;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				
				System.out.print("어떤 정보를 수정하시겠습니까? : ");
				int input2 = sc.nextInt();
				sc.nextLine();
				
				switch(input2) {
				
				case 1 : 
					System.out.println("===== 도서명 수정 =====");
					System.out.print("수정할 도서명을 입력하세요 : ");
					String name = sc.nextLine();
					bookList.set(i, new Book(bookList.get(i).getbNum(), name, bookList.get(i).getAuthor(),
								bookList.get(i).getPrice(), bookList.get(i).getPublish())); break;
				case 2 :
					System.out.println("===== 도서 저자 수정 =====");
					System.out.print("수정할 도서 저자를 입력하세요 : ");
					String author = sc.nextLine();
					bookList.set(i, new Book(bookList.get(i).getbNum(), bookList.get(i).getbName(), author,
								bookList.get(i).getPrice(), bookList.get(i).getPublish())); break;
				case 3 :
					System.out.println("===== 도서 가격 수정 =====");
					System.out.print("수정할 가격을 입력하세요 : ");
					int price = sc.nextInt();
					bookList.set(i, new Book(bookList.get(i).getbNum(), bookList.get(i).getbName(), bookList.get(i).getAuthor(),
								price, bookList.get(i).getPublish())); break;
				case 4 :
					System.out.println("===== 도서 출판사 수정 =====");
					System.out.print("수정할 도서 출판사를 입력하세요 : ");
					String publish = sc.nextLine();
					bookList.set(i, new Book(bookList.get(i).getbNum(), bookList.get(i).getbName(), bookList.get(i).getAuthor(),
								bookList.get(i).getPrice(), publish)); break;
				case 0 : System.out.println("수정 종료"); break;
				
				}
			} 
		}
		if(!flag) {
			System.out.println("일치하는 도서번호의 도서가 없습니다.");
		}
		
	}
	
	public void deleteBook() throws InputMismatchException {
		
		System.out.println("\n===== 도서 삭제 =====\n");
		System.out.print("삭제할 도서 제목 입력 : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		boolean flag = false;
		
		for(int i = 0; i < bookList.size(); i ++) {
			
			if(bookList.get(i).getbName().equals(name)) {
				
				flag = true;
				System.out.println( bookList.get(i) );
				System.out.print("정말 삭제 하시겠습니까?(y/n) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					bookList.remove(i);
					System.out.println("삭제가 완료되었습니다.");
				} else {
					System.out.println("삭제가 취소되었습니다.");
				}
			}
		}
		if(!flag) {
			System.out.println("검색한 도서명과 일치한 도서가 없습니다.");
		}
	}
	
	public void addFavorit() {
		
		System.out.println("\n===== 즐겨찾기 추가 =====\n");
		System.out.print("즐겨찾기할 저자명 : ");
		sc.nextLine();
		String author = sc.nextLine();
		
		boolean flag = false;
		
		for(int i = 0; i < bookList.size(); i ++) {
			
			if(bookList.get(i).getAuthor().equals(author)) {
				
				flag = true;
				System.out.println( bookList.get(i) );
				System.out.print(author + "의 도서를 즐겨찾기에 추가하시겠습니까?(y/n) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					favorit.add(new Book(bookList.get(i).getbNum(), bookList.get(i).getbName(), bookList.get(i).getAuthor(),
										bookList.get(i).getPrice(), bookList.get(i).getPublish()));
					System.out.println("즐겨찾기 추가가 완료되었습니다.");
				} else {
					System.out.println("즐겨찾기 추가가 취소되었습니다.");
				}
			}
		}
		if(!flag) {
			System.out.println("검색한 저자명과 일치한 도서가 없습니다.");
		}
		
	}
	
	public void deleteFavorit() throws InputMismatchException {
		
		System.out.println("\n===== 즐겨찾기 삭제 =====\n");
		System.out.print("즐겨찾기 삭제할 저자명 : ");
		sc.nextLine();
		String author = sc.nextLine();
		
		boolean flag = false;
		
		for(int i = 0; i < favorit.size(); i ++) {
			
			if(favorit.get(i).getAuthor().equals(author)) {
				
				flag = true;
				System.out.println( favorit.get(i) );
				System.out.print("즐겨찾기 삭제를 하시겠습니까?(y/n) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					favorit.remove(i);
					System.out.println("즐겨찾기 삭제가 완료되었습니다.");
				} else {
					System.out.println("즐겨찾기 삭제가 취소되었습니다.");
				}
			}
		}
		if(!flag) {
			System.out.println("검색한 저자명과 일치한 도서가 즐겨찾기 목록에 없습니다.");
		}
	}
	
	public void selectFavorit() {
		
		System.out.println("\n==== 즐겨찾기 목록 =====\n");
		for(Book fav : favorit) {
			System.out.println( fav );
			
		}
		
	}
	
	public void recommandBook() throws InputMismatchException {
		
		System.out.println("\n==== 추천 도서 =====\n");
		int random = (int) ( Math.random() * bookList.size() );
		System.out.print("추천 도서 : ");
		System.out.println( bookList.get(random) );
		
	}
	
}



















