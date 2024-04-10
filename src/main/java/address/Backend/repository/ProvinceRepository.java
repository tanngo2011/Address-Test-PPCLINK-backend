package address.Backend.repository;

import address.Backend.entity.Province;
import address.Backend.entity.Ward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProvinceRepository extends
        JpaRepository<Province, Long>,
        JpaSpecificationExecutor<Province>

{






}
