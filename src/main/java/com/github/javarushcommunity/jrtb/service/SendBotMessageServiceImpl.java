package com.github.javarushcommunity.jrtb.service;

import com.github.javarushcommunity.jrtb.bot.JavaRushTelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class SendBotMessageServiceImpl implements SendBotMessageService{
    private final JavaRushTelegramBot javarushbot;

    @Autowired
    public SendBotMessageServiceImpl(JavaRushTelegramBot javarushbot){
        this.javarushbot = javarushbot;
    }

    @Override
    public void sendMessage(String chatId, String message){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try{
            javarushbot.execute(sendMessage);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
}
