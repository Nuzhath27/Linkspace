package com.coll.dao;

import com.coll.models.ProfilePicture;

public interface ProfilePictureDao {
void saveOrUpdateProfilePicture(ProfilePicture profilePicture);
ProfilePicture getProfilePicture(String email);
}
