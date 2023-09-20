package fc.server.palette.purchase.dto.response;

import fc.server.palette.purchase.entity.type.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfferDto {
    private Long id;
    private MemberDto member;
    private String title;
    private Category category;
    private String description;
    private String shopUrl;
    private Integer headCount;
    //todo
    private Integer bookmarkCount;
    //todo
    private Integer currentParticipants;
    //todo image처리
    private Date startDate;
    private Date endDate;
    private Integer price;
    private Boolean isClosing;
    private Integer hits;
    private LocalDateTime created_at;
}