package org.example.admin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name ="user-server")//使用Feign
public interface UserService {
    @GetMapping("test/test/{id}")
    public String getVal(@PathVariable Long id);
}
