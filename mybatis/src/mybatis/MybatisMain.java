package mybatis;


public class MybatisMain {
    public static void main(String[] args) {
        
        Config config;
        config = new Config();
      
      BoardDAO boardDAO = new BoardDAO(config.getSqlSession());
      System.out.println("1.");
      boardDAO.work();
    }

}