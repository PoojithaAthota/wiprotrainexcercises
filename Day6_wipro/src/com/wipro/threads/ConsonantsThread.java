package com.wipro.threads;

import java.util.List;

public class ConsonantsThread {

    public Thread getThread(List<String> names) {
        return new Thread(() -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char ch = Character.toLowerCase(name.charAt(0));
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    names.set(i, name.toLowerCase());
                }
            }
        });
    }
}
