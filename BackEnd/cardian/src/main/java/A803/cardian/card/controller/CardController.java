package A803.cardian.card.controller;

import A803.cardian.card.data.dto.response.CardCategoryBenefitResponses;
import A803.cardian.card.data.dto.response.EntireTransactionsByMyCardResponse;
import A803.cardian.card.data.dto.response.MyCardInfoResponse;
import A803.cardian.card.data.dto.response.MyCardListResponse;
import A803.cardian.card.repository.CardRepository;
import A803.cardian.card.service.CardService;
import A803.cardian.card.service.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Tag(name = "카드 컨트롤러", description = "카드 관련 정보")
@RequestMapping("/card")
@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
public class CardController {

    private final CardService cardService;
    private final TransactionService transactionService;

//    @ApiResponse({
//            @ApiResponse(responseCode = "200", description = "내 카드 조회 성공"),
//            @ApiResponse(responseCode = "400", description = "내 카드 조회 실패(MEMBER_02)")
//    })
    @Operation(summary = "내 카드 조회", description = "홈 화면에 노출할 내가 가진 카드 리스트를 불러오는 API입니다.")
    @GetMapping("/{member_id}")
    public ResponseEntity<MyCardListResponse> getMyCards(@PathVariable("member_id") Integer memberId){
        MyCardListResponse response = cardService.findMyCards(memberId);
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "내 카드 혜택 조회", description = "내 카드에서 혜택 탭을 선택하면 해당 카드의 혜택 리스트를 불러오는 API입니다.")
    @GetMapping("/{mycard_id}/benefit")
    public ResponseEntity<Map<String, List<CardCategoryBenefitResponses>>> getMeCardBenefit(@PathVariable("mycard_id") Integer mycardId){
        List<CardCategoryBenefitResponses> benefitList = new ArrayList<>();
        benefitList = cardService.findMyCardBenefit(mycardId);
        if(benefitList.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // ErrorResponse를 JSON으로 변환
        }
        Map<String, List<CardCategoryBenefitResponses>> BenefitMap = new HashMap<>();
        BenefitMap.put("benefitList", benefitList);
        return ResponseEntity.status(HttpStatus.OK).body(BenefitMap);
    }

    @Operation(summary = "내 카드 거래내역 조회", description = "카드 이용내역을 불러오는 API입니다.")
    @GetMapping("/{mycard_id}/transaction")
    public ResponseEntity<EntireTransactionsByMyCardResponse> getAllTransactions(@PathVariable("mycard_id") int myCardId) {
        return ResponseEntity.ok(transactionService.getMyCardYearTransactioins(myCardId));
    }

    @Operation(summary = "내 카드 상세 정보 현재 시점 조회", description = "이번 달 카드 상세정보를 불러오는 API입니다.")
    @GetMapping("/{mycard_id}/detail")
    public ResponseEntity<MyCardInfoResponse> getMyCardInfo(@PathVariable("mycard_id") int myCardId) {
        return ResponseEntity.ok(cardService.getMyCardInfo(myCardId));
    }

}