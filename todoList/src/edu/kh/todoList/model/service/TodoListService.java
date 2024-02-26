package edu.kh.todoList.model.service;

import java.time.LocalDateTime;
import java.util.Map;

// Service : 
// 데이터 가공, 로직 처리 등의 기능을 제공하는 역할

public interface TodoListService {

	/** 할 일 목록 반환 서비스
	 * @return todoList + 완료된 일 개수
	 */
	public abstract Map<String, Object> todoListFullView();
	// 인터페이스이기 때문에 추상메서드
	// (public abstract) 

	/** 날짜 포맷을 변환해서 반환
	 * @param regDate
	 * @return yyyy-mm-dd HH:mm:ss 형태 날짜 반환
	 */
	public abstract String dateFormat(LocalDateTime regDate);

	/** 전달 받은 index 번째 todo 반환
	 * @param index
	 * @return index 번째 todo 상세 정보, 없으면 null 반환
	 */
	public abstract String todoDetailView(int index);

	/**	할 일 추가 서비스
	 * @param title
	 * @param content
	 * @return 추가된 index 번호, 혹은 -1
	 */
	public abstract int todoAdd(String title, String content) throws Exception;

	/** 할 일 완료 여부 변경하기 (O <-> X)
	 * @param index
	 * @return 해당 index 요소의 완료 여부가 변경되면 true
	 * 		   index 요소가 없으면 false
	 */
	public abstract boolean todoComplete(int index) throws Exception;

	/**	할 일 수정 서비스
	 * @param index
	 * @param title
	 * @param content
	 * @return 수정 성공 true, 실패 false
	 */
	public abstract boolean todoUpdate(int index, String title, String content) throws Exception;

	/** 할 일 삭제 서비스
	 * @param index
	 * @return 삭제 성공 시 삭제된 할 일의 title 반환
	 * 			실패 시 null 반환
	 */
	public abstract String todoDelete(int index) throws Exception;

	
	
}
