package com.example.demo.entity;

public class Friend {

    private Integer id;

    private Integer friendMasterid;

    private Integer friendFriendid;

    private Integer friendRename;

    public Friend(Integer id, Integer friendMasterid, Integer friendFriendid, Integer friendRename) {
        this.id = id;
        this.friendMasterid = friendMasterid;
        this.friendFriendid = friendFriendid;
        this.friendRename = friendRename;
    }

    public Friend() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFriendMasterid() {
        return friendMasterid;
    }

    public void setFriendMasterid(Integer friendMasterid) {
        this.friendMasterid = friendMasterid;
    }

    public Integer getFriendFriendid() {
        return friendFriendid;
    }

    public void setFriendFriendid(Integer friendFriendid) {
        this.friendFriendid = friendFriendid;
    }

    public Integer getFriendRename() {
        return friendRename;
    }

    public void setFriendRename(Integer friendRename) {
        this.friendRename = friendRename;
    }
}