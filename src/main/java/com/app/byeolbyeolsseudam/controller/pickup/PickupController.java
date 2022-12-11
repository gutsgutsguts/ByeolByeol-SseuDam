package com.app.byeolbyeolsseudam.controller.pickup;

import com.app.byeolbyeolsseudam.domain.pickup.PickupDTO;
import com.app.byeolbyeolsseudam.entity.member.Member;
import com.app.byeolbyeolsseudam.service.pickup.PickupService2;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
@RequestMapping("/pickup/*")
@RequiredArgsConstructor
public class PickupController {

    private final PickupService2 pickupService2;

    @GetMapping("/main")
    public String pickMain(){
        return "/app/pickup/pickMain";
    }

    @GetMapping("/detaildone")
    public String pickDetailDone(){
        return "/app/pickup/pickDetailDone";
    }

    @GetMapping("/wantedlist")
    public String pickWantedList(Model model, Pageable pageable){
        model.addAttribute("pickups", pickupService2.getPickupList());
//        Page<PickupDTO> pickupList = pickupService2.getPickupList3(pageable);
//        model.addAttribute("pickupList", pickupList);
//
//        log.debug("총 element 수 : {}, 전체 page 수 : {}, 페이지에 표시할 element 수 : {}, 현재 페이지 index : {}, 현재 페이지의 element 수 : {}",
//                boardList.getTotalElements(), boardList.getTotalPages(), boardList.getSize(),
//                boardList.getNumber(), boardList.getNumberOfElements());

        return "/app/pickup/pickWantedList";
    }

    @GetMapping("/detail")
    public String pickDetail(Long pickId, Model model){

        return "/app/pickup/pickDetail";
    }

    //    @SessionAttribute("member") Member member
//        log.info(member.getMemberEmail());

    @GetMapping("/acceptedlist")
    public String pickAcceptedList(@SessionAttribute("member") Member member, Model model){
        model.addAttribute("myPickups", pickupService2.getMyPickupList(member.getMemberId()));

        return "/app/pickup/pickAcceptedList";
    }

    @GetMapping("/okdetail")
    public String pickOkDetail(){
        return "/app/pickup/pickOkDetail";
    }



    @GetMapping("/finishedlist")
    public String pickFinishedList(){
        return "/app/pickup/pickFinishedList";
    }

    @GetMapping("/finisheddetail")
    public String pickFinishedDetail(){
        return "/app/pickup/pickFinishedDetail";
    }

}
