package calpoly.mduran.proteus.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.content.commons.annotations.ContentId;
import org.springframework.content.commons.annotations.ContentLength;
import org.springframework.content.commons.annotations.MimeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    private @Id @GeneratedValue Long id;
    private String title;
    private Date dateCreated = new Date();

    @ContentId private String contentId;
    @ContentLength private long contentLength;
    @MimeType private String mimeType = "video/mp4";
}
