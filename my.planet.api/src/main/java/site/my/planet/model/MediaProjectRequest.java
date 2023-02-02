package site.my.planet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaProjectRequest {
    private long idMedia;
    private String img;
    private String firstVideo;
    private String secondVideo;
    private long idProject;
}
