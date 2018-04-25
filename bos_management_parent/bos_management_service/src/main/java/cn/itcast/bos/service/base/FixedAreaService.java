package cn.itcast.bos.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.itcast.bos.domain.base.FixedArea;

public interface FixedAreaService {

	void save(FixedArea model);

	Page<FixedArea> findAll(Pageable pageable);

	void associationCourierToFixedArea(String id, Integer courierId, Integer takeTimeId);

}
