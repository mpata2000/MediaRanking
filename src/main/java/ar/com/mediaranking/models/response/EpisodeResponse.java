package ar.com.mediaranking.models.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class EpisodeResponse {
    Long id;
    @Schema(description = "Episode number", example = "1")
    Integer episodeNumber;
    @Schema(description = "Episode title", example = "Episode 1")
    String title;
    @Schema(description = "Episode description", example = "Episode 1 description")
    String description;
}
