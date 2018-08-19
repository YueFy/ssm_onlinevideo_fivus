package usts.service;

import java.util.List;
import usts.pojo.Actor;

public interface ActorService {
    public List<Actor> actorList();
    public List<Actor> getActorListBySex(String sex);
    public List<Actor> findActorBySomeIndex(List<Integer> index);
}
