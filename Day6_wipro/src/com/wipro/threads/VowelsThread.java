package com.wipro.threads;

import java.util.List; 

public class VowelsThread {

    public Thread getThread(List<String> names) {
        return new Thread(() -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char ch = Character.toLowerCase(name.charAt(0));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    names.set(i, name.toUpperCase());
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

