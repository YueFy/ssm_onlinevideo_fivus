package usts.service;

import usts.pojo.Director;

import java.util.List;

public interface DirectorService {
    public List<Director> findAllDirector();
    public List<Director> findDirectorBySomeIndex(List<Integer> index);
}
