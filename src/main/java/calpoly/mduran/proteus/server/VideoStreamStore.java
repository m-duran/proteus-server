package calpoly.mduran.proteus.server;

import org.springframework.content.commons.repository.ContentStore;
import org.springframework.content.rest.StoreRestResource;

@StoreRestResource
public interface VideoStreamStore extends ContentStore<Video, String> {
}
