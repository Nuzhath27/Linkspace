package com.coll.dao;

import java.util.List;


import com.coll.models.Job;

public interface JobDao {
void addJob(Job job);
List <Job> getAllJobs();
void deleteJob(int id);
Job getJob(int id);
void updateJob(Job job);
}
