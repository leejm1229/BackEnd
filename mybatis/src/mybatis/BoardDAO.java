package mybatis;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class BoardDAO {

    private SqlSession sqlSession;
    
    public BoardDAO() {
        
    }
    
    public BoardDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
    // db에 sql 호출
    public void work() {    
        
        // select all 호출
         selectNewPost();
        
        // select byName 호출
//        selectbyName();
    	
//         select byName2 호출
//         selectbyName2();
        
    	// selectbyNo 호출 
//    	selectbyNo();
    	
        // insert 호출
//        insertNewPost();
//    	updateNo();
//    	deleteNo();
    }
    
    // select
    public void selectNewPost() {
        List<BoardVO> boardList = 
                sqlSession.selectList("mybatis.BoardDAO.selectAll");
        
        for(BoardVO boardVO : boardList) {
            System.out.println(boardVO);
        }
        
    }
    public void selectbyName() {
        BoardVO boardVO = new BoardVO();
        boardVO.setWriter("김길동");
        
        List<BoardVO> boardList = 
                sqlSession.selectList("mybatis.BoardDAO.selectbyName", boardVO);
        
        for(BoardVO board : boardList) {
            System.out.println(board);
        }
    }
    
    public void selectbyName2() {
        List<BoardVO> boardList = 
                sqlSession.selectList("mybatis.BoardDAO.selectbyName2", "김길동");
        
        for(BoardVO board : boardList) {
            System.out.println(board);
        }
    }
    
    public void selectbyNo() {
        List<BoardVO> boardList = 
                sqlSession.selectList("mybatis.BoardDAO.selectbyNo", 10);
        
        for(BoardVO board : boardList) {
            System.out.println(board);
        }
    }
    
    // insert
    public void insertNewPost() {
        //sqlSession.insert("mybatis.BoardDAO.insertNewPost");
        
        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("두번째 제목");
        boardVO.setWriter("김길동");
        boardVO.setContent("내용입니다");
        sqlSession.insert("mybatis.BoardDAO.insertNewPost2", boardVO);
        
        sqlSession.commit();
    }
    
    // update
    public void updateNo() {	
    	sqlSession.update("mybatis.BoardDAO.updatebyNo", 5);
    	sqlSession.commit();
    }
    
 // delete
    public void deleteNo() {
    	sqlSession.update("mybatis.BoardDAO.deletebyNo", 3);
    	sqlSession.commit();
    }
    

}