package calpoly.mduran.proteus.server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="videos", collectionResourceRel = "videos")
public interface VideoRepository extends JpaRepository<Video, Long> {
}
