package com.chance.auth.domain.res;

import lombok.Builder;

@Builder
public record JwtTokenResponse(String token) {}