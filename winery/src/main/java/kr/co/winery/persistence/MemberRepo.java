package kr.co.winery.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.winery.vo.MemberVo;

@Repository
public interface MemberRepo extends JpaRepository<MemberVo, String> {

	
	
	
	
	
}
