package kr.ac.kopo.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.kopo.board.vo.BoardVO;

@ContextConfiguration(locations = "classpath:config/spring/spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SessionTest {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Test
	public void sessionTemplateTest() {
		assertNotNull(sqlSessionTemplate);
	}

	@Test
	public void boardSelectAllTest() {
		List<BoardVO> boardlist = sqlSessionTemplate.selectList("springboard.board.dao.BoardDAO.selectAll");
		for (BoardVO board : boardlist) {
			System.out.println(board);
		}
	}
	
	@Test
	public void sessionTemplateTest3() {
		
	}

}
