package com.example.sosikmemberservice.repository;

import com.example.sosikmemberservice.dto.request.RequestLogout;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

public interface RefreshTokenRepository {
    void save(final String token,final String memberIdentifier);

    Optional<String> findTokenByMemberIdentifier(final String refreshToken);

    String logout(final RequestLogout memberIdentifier);




}
