package calpoly.mduran.proteus.server;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class VideoRepositoryTest {

    @Autowired
    private VideoRepository repository;

    @Test
    public void givenVideoRepository_whenSaveAndRetrieve_thenOk() {
        Video video = repository.save(new Video(null, "test", new Date(), null, 0L, "video/mp4"));
        Video found = repository.findById(video.getId()).get();

        assertNotNull(found);
    }
}
