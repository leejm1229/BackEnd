package mybatis;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
        // selectNewPost();
        
        // select byName 호출 ver1 -> 김길동
        // selectbyName();
        
        // select byName 호출 ver2 -> 김관중
        // selectbyName2();
        
        // selectbyNo();
        
        // selectDSQL() -> DynamicSQL 
        selectDSQL();
        
        // insert 호출
        //insertNewPost();
        
        // update
        //updatebyName();
    
        // delete
        // deletebyName();
        
//        selectDynamicSQLif();
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
        String name = "김관중";
        
        List<BoardVO> boardList = 
                sqlSession.selectList("mybatis.BoardDAO.selectbyName2", name);
        
        for(BoardVO board : boardList) {
            System.out.println(board);
        }
        
    }
    
    public void selectbyNo() {
        int no = 10;
        
        Map<String, Object> boardMap = 
                sqlSession.selectOne("mybatis.BoardDAO.selectbyNo2", no);
        
        Set<String> keyset = boardMap.keySet();
        for(String key : keyset) {
            System.out.println(key + " : " + boardMap.get(key));
        }
    }
    
    public void selectDSQL() {
        BoardVO boardVO = new BoardVO();
        // boardVO.setWriter("김길동");
        boardVO.setTitle("두번째 제목");
        
        List<BoardVO> boardList = 
                sqlSession.selectList("mybatis.BoardDAO.selectDSQL", boardVO);
        
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
    public void updatebyName() {
        String name = "김관중";
        sqlSession.update("mybatis.BoardDAO.updatebyName", name);
        sqlSession.commit();
    }
    
    // delete
    public void deletebyName() {
        String name = "김관중";
        sqlSession.update("mybatis.BoardDAO.deletebyName", name);
        sqlSession.commit();
    }
    
    public void selectDynamicSQLif() {
     	List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selctDSQLif1", "좋은아침");
    	
    	for(BoardVO boardVO : boardList) {
    		System.out.println(boardVO);
    	}
    }

}
