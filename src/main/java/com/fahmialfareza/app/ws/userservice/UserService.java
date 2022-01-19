package com.fahmialfareza.app.ws.userservice;

import com.fahmialfareza.app.ws.ui.model.request.UserDetailsRequestModel;
import com.fahmialfareza.app.ws.ui.model.response.UserRest;

public interface UserService {
	
	UserRest createUser(UserDetailsRequestModel userDesails);
}
