package com.github.javarushcommunity.jrtb.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelegramuserRepository  extends JpaRepository<TelegramUser, String> {
    List<TelegramUser> findAllByActiveTrue();
}
