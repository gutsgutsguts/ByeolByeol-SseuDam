package com.app.byeolbyeolsseudam.repository.pickupAccept;

import com.app.byeolbyeolsseudam.domain.pickup.PickupDTO;
import com.app.byeolbyeolsseudam.domain.pickupAccept.PickupAcceptDTO;
import com.app.byeolbyeolsseudam.entity.pickupAccept.PickupAccept;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PickupAcceptRepository extends JpaRepository<PickupAccept, Long> {
//    Page<PickupAcceptDTO> findAllByMemberMemberIdAndPickup_PickupStatus_수거중(@Param("memberId") Long memberId, Pageable pageable);
//    Page<PickupAcceptDTO> findAllByPickupPickupStatus_수거완료AndMember_MemberId(@Param("memberId") Long memberId, Pageable pageable);
}
