package com.netease.ad.repository;

import com.netease.ad.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by echo on 17-5-10.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}
