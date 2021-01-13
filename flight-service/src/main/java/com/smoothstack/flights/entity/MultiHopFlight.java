package com.smoothstack.flights.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MultiHopFlight {
    private Flight leg1;
    private Flight leg2;
}
