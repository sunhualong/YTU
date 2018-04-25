package cn.itcast.bos.dao.base;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.itcast.bos.domain.system.Role;

public interface RoleDao extends JpaRepository<Role, Integer> {

	@Query("select r from Role r join r.users u where u.id=?")
	List<Role> findByUser(Integer id);

}
