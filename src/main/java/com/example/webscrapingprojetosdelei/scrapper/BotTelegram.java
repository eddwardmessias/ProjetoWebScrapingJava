package com.example.webscrapingprojetosdelei.scrapper;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotTelegram extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Teste201bot";
    }

    @Override
    public String getBotToken() {
        return "1811963946:AAH4eyTBKp2TfF2zCxWWunEvaFIGe8sADDk";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            Message message = update.getMessage();

            if (message.hasText()){

                String text = message.getText();

                if (text.equals("/start")){
                    System.out.println("Olá Mundo!");

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Selecione novamente Start p/ ter acesso aos projetos!");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(message.getChatId());
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}
