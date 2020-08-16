package org.sam.api.domain;

import org.sam.api.payload.JoinRequest;

/**
 * Created by melchor
 * Date: 2020/08/11
 * Time: 8:32 PM
 */
public class Member {

    private Long id;
    private String email;
    private String name;
    private String password;

    public Long getId() {
        return id;
    }

    public static Member create(JoinRequest request) {
        Member member = new Member();
        member.setEmail(request.getEmail());
        member.setName(request.getName());
        member.setPassword(request.getPassword());
        return  member;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
