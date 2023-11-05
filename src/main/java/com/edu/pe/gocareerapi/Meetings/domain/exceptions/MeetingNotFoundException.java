package com.edu.pe.gocareerapi.Meetings.domain.exceptions;

public class MeetingNotFoundException extends RuntimeException{

    public MeetingNotFoundException(Long meetingId){
        super("Meeting with id: " + meetingId + "not found!");
    }
}
