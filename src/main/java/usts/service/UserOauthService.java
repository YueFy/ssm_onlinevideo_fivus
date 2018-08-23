package usts.service;

import usts.pojo.UserOauth;

public interface UserOauthService {

    public void insertIntoUO(UserOauth uo);

    public UserOauth login(UserOauth userOauthLogin);
}
