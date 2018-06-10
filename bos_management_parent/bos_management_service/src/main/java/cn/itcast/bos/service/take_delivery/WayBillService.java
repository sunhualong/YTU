package cn.itcast.bos.service.take_delivery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.itcast.bos.domain.take_delivery.WayBill;

public interface WayBillService {
    
    public void save(WayBill model);

    public Page<WayBill> pageQuery(Pageable pageable);

    public void delete(String wayBillIds);

}
