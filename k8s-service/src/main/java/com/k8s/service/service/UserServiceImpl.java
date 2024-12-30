package com.k8s.service.service;

import org.openapitools.api.UserApi;
import org.openapitools.model.User;
import org.springframework.web.bind.annotation.RestController;

import com.openapi.common.OpenAPIResponse;

@RestController
public class UserServiceImpl implements UserApi {

  public OpenAPIResponse<User> userGet(Integer id) {
    User user = new User().id(id).name("Test Name");
    return OpenAPIResponse.ok(user);
  }

  public Void userPost(UserPostRequest userPostRequest) {
    User user = new User().id(id).name("Test Name");
    return OpenAPIResponse.ok(null);
  }
}