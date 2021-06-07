package com.example.spring5jokesappv2.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteServiceImpl implements ChuckNorrisQuoteService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
