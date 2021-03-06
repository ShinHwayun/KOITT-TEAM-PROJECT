package koitt.ratta.doeat.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import koitt.ratta.doeat.mapper.ContentMapper;
import koitt.ratta.doeat.domain.ContentVO;

@Repository
public class ContentDaoImpl implements ContentDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<ContentVO> getAll(){
		return sqlSession.getMapper(ContentMapper.class).getAll();
	}
	
	@Override
	public void write(ContentVO vo) {
		sqlSession.insert("write", vo);
	}
	
	@Override
	public ContentVO read(int rIdx) {
		ContentVO vo= sqlSession.selectOne("read", rIdx);
		return vo;
	}
	
	@Override
	public void hitUpdate(int rIdx) {
		sqlSession.update("hitUpdate", rIdx);
	}
	
	@Override
	public void update(ContentVO vo) {
		sqlSession.update("update", vo);
	}
	
	@Override
	public void delete(int rIdx) {
		sqlSession.delete("delete", rIdx);
	}
	
	@Override
	public void likeNumUpdate(int rIdx) {
		sqlSession.update("likeNumUpdate", rIdx);
	}
	
	@Override
	public void scrapNumUpdate(int rIdx) {
		sqlSession.update("scrapNumUpdate", rIdx);
	}
	
}
