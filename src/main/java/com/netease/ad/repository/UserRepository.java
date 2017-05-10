package com.netease.ad.repository;

import com.netease.ad.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by echo on 17-5-10.
 */
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
