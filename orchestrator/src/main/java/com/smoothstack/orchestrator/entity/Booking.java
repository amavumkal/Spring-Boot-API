package com.smoothstack.orchestrator.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Booking {

	private Long bookingId;

	@NonNull
	private Boolean isActive;

	@NonNull
	private String stripeId;

}
