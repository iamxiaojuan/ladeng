package ladeng.work.sb.service.serviceImpl;

import ladeng.work.sb.dao.productMapper;
import ladeng.work.sb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private productMapper mapper;


}
