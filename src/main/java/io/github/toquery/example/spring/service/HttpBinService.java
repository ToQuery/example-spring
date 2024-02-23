package io.github.toquery.example.spring.service;

import jakarta.annotation.Resource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class HttpBinService {

    @Resource
    private RestTemplate restTemplate;


    public Map<String, Object> deploy(Integer deploy) {
        // 接收 Map<String,Object>
        ResponseEntity<Map<String, Object>> response = restTemplate.exchange("https://httpbin.org/delay/{deploy}", HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, Object>>(){}, deploy);
        return response.getBody();
    }
}
