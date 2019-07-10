package org.openapi;

import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        Search search = new Search();

        search.search("안녕하세요");
    }
}
