package com.example.solarpanel_proj;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class ExchangeDTO {


    public String sender;
    public String energy;
    public String money;


    public ExchangeDTO(){

    }

    public ExchangeDTO(String sender, String energy, String money) {
        this.sender = sender;
        this.energy = energy;
        this.money = money;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("sender", sender);
        result.put("energy", energy);
        result.put("money",money);

        return result;
    }

}
