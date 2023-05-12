package com.fissionlab.trainig.tracker.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginRequestDTO {

	private String credentials;
	private String provider;

}