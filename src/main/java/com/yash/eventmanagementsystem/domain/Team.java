package com.yash.eventmanagementsystem.domain;

public class Team
{
    private int teamId;
    private int eventId;
    private String teamName;


    public Team()
    {
    }


    public Team(int teamId, int eventId, String teamName)
    {
        this.teamId = teamId;
        this.eventId = eventId;
        this.teamName = teamName;
    }


    public int getTeamId()
    {
        return teamId;
    }

    public int getEventId()
    {
        return eventId;
    }

    public String getTeamName()
    {
        return teamName;
    }


    public void setTeamId(int teamId)
    {
        this.teamId = teamId;
    }

    public void setEventId(int eventId)
    {
        this.eventId = eventId;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }


    @Override
    public String toString()
    {
        return "Team{" +
                "teamId=" + teamId +
                ", eventId=" + eventId +
                ", teamName='" + teamName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Team team = (Team) obj;
        return teamId == team.teamId &&
                eventId == team.eventId &&
                teamName.equals(team.teamName);
    }

    @Override
    public int hashCode()
    {
        return java.util.Objects.hash(teamId, eventId, teamName);
    }
}