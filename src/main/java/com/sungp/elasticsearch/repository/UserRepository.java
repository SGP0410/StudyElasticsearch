package com.sungp.elasticsearch.repository;

import com.sungp.elasticsearch.entity.User;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sungp
 * @description: TODO
 * @date 2022年11月01日 11:54
 */
@Repository
public interface UserRepository extends ElasticsearchRepository<User, Long> {
}
