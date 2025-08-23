package com.yash.eventmanagementsystem.domain;

public class TeamMember {
    private int teamMemberId;
    private int teamId;    // FK to Team
    private int userId;    // FK to User
    private String role;   // e.g., Captain, Player, Substitute

    // Default Constructor
    public TeamMember() { }

    // Parameterized Constructor
    public TeamMember(int teamMemberId, int teamId, int userId, String role) {
        this.teamMemberId = teamMemberId;
        this.teamId = teamId;
        this.userId = userId;
        this.role = role;
    }

    // Getters
    public int getTeamMemberId() {
        return teamMemberId;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setTeamMemberId(int teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // toString()
    @Override
    public String toString() {
        return "TeamMember{" +
                "teamMemberId=" + teamMemberId +
                ", teamId=" + teamId +
                ", userId=" + userId +
                ", role='" + role + '\'' +
                '}';
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TeamMember member = (TeamMember) obj;
        return teamMemberId == member.teamMemberId &&
                teamId == member.teamId &&
                userId == member.userId &&
                role.equals(member.role);
    }

    // hashCode()
    @Override
    public int hashCode() {
        return java.util.Objects.hash(teamMemberId, teamId, userId, role);
    }
}
