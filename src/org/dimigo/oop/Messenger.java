package org.dimigo.oop;

public class Messenger {
    public Messenger() { }
    private String id;
    private int friendNumber;
    private String name;
    private String profile;
    private String phoneNumber;

    public void addFriend() {
        System.out.println("친구가 추가되었습니다.");
    }
    public void deleteFriend() {
        System.out.println("친구가 삭제되었습니다.");
    }
    public boolean send(String message) {
        System.out.printf("<%s>라는 메시지가 전송되었습니다.",message);
        return true;
    }
    public boolean makeRoom() {
        System.out.println("방이 만들어졌습니다. 대화를 나누세요!");
        return true;
    }
    public boolean logout() {
        System.out.println("로그아웃되었습니다.");
        return true;
    }
    public boolean login() {
        System.out.println("로그인되었습니다.");
        return true;
    }

}