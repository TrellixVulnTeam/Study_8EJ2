package com.memo.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// *********** ArrayList == Database 
// Database는 model에서만 접근해야한다
public class Memo_Model implements Memo_Model_I{
	
	private final String DB_DIR = "c:/workspaces/Java/database";
	private final String DB_FILE = "memo.txt";
	
	private File database = null;
	
	// Database의 역할을 하는 ArrayList
	ArrayList<Memo_Object> memoList = new ArrayList<Memo_Object> ();
	
	// 생성자 new했을때 실행되는 영역
	public Memo_Model() {
		File dir = new File(DB_DIR);
		if(!dir.exists()) {
			dir.mkdirs(); // 경로상에 디렉토리가 없으면 자동생성
		}
		File file = new File(DB_DIR + File.separator + DB_FILE);
		if(!file.exists()) {
			try {
				file.createNewFile();
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		database = file;
	}
	
	private final String COLUMN_SEP = "::";
	
	// View에서 입력받은  Memo_Object형태를 Controller에서 받아서  ArrayList에 넣기
	@Override
	public void createList(Memo_Object memo) {
		memo.setNo(memoList.size() + 1);
		
		try (FileOutputStream os = new FileOutputStream(database, true);){
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String row = memo.getNo() + COLUMN_SEP + memo.getName() + COLUMN_SEP + memo.getContent() + COLUMN_SEP + memo.getDataTime() + "\n";
			
			bw.append(row);
			bw.flush();
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		memoList.add(memo);
	}

	// View에서 입력받은 int 값과  memo값을 Controller에서 받아 ArrayList에 있는 해당 memo를 수정
	@Override
	public void updateList(int number, Memo_Object memo) {
		memoList.get(number - 1).setContent(memo.getContent());
		memoList.get(number - 1).setDataTime(memo.getDataTime());
	}

	// View에서 입력받은 int 값을 Controller에서 받아 ArrayList안의 memo를 삭제 후 ArrayList안에 있는 memo의 No값을 재정의
	@Override
	public void deleteList(int number) {

		memoList.remove(number - 1);
		for(int i = number - 1; i < memoList.size(); i++) {
			memoList.get(i).setNo(memoList.get(i).getNo() - 1);
		}
	}

	// ArrayList값을 Controller에 반환해준다.
	@Override
	public ArrayList<Memo_Object> getList() {
		// 1. 읽는 스트림을 연다.
		try(FileInputStream fis = new FileInputStream(database)) {
			// 2. 실제 파일 인코딩을 바꿔주는 래퍼 클래스를 사용
			InputStreamReader isr = new InputStreamReader (fis, "UTF-8");
			// 3. 버퍼처리
			BufferedReader br = new BufferedReader(isr);
			
			String row;
			// 새로운 줄을 한줄씩 읽어서 row에 저장하고
			// 더 이상 읽을 데이터가 없으면 null 이 리턴되므로 로직이 종료된다.
			
			while ((row=br.readLine()) !=null ) {
				
				String tempRow[] = row.split(COLUMN_SEP);
				// tempRow[0] = 1
				// tempRow[1] = 1
				// tempRow[2] = 1
				// tempRow[3] = 1
				
				/*
				Memo memo = new Memo();
				memo.no = Integer.parseInt(tempRow[0]);
				memo.name = Integer.parseInt(tempRow[1]);
				memo.content = Integer.parseInt(tempRow[2]);
				memo.datetime = Integer.parseInt(tempRow[3]);
				*/
				
				//list.add(memo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return memoList;
	}

	// View에서 입력받은 int 값을 Controller에서 받아 ArrayList의 값을 빼낸 후 Controller에 반환
	@Override
	public Memo_Object searchList(int number) {
		return memoList.get(number - 1);
	}


}
