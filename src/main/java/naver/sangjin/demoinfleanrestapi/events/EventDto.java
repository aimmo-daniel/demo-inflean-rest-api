package naver.sangjin.demoinfleanrestapi.events;

import lombok.*;

import java.time.LocalDateTime;

// 입력값을 제한하기 위해 event 클래스와 분리
// id 또는 입력 데이터로 계산해야 하는 값들은 입력을 받지 않아야 한다.
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class EventDto {

    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location; // (optional) 이게 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice; // (optional)
    private int limitOfEnrollment;

}
