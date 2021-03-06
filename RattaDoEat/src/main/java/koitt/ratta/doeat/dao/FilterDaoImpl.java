package koitt.ratta.doeat.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import koitt.ratta.doeat.domain.GalleryListVo;

@Repository
public class FilterDaoImpl implements FilterDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	String path = "koitt.ratta.doeat.mapper.FilterMapper.";

	@Override
	public List<GalleryListVo> changeFilter(String typesForSQL) {
		return sqlSession.selectList(path + "changeFilter", typesForSQL);
	}
	
}
