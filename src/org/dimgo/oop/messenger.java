package org.dimgo.oop;

public class messenger {

    public messenger() {
    }

    private String chatingroom;

    private String friend;

    private String text;

    private String profilemessage;

    private int time;

    public void send() {
        System.out.println("메세지를 보냅니다.");
    }

    public void delete() {
        System.out.println("삭제된 메세지입니다.");
    }

    public void friendAdd(String friend) {
        System.out.println(friend + "을(를) 추가했습니다.");
    }

    public void create(String room) {
        System.out.println(room + "을(를) 생성했습니다. ");
    }

    public void ban(String friend) {
        System.out.println(friend + "을(를) 차단했습니다.");
    }

}