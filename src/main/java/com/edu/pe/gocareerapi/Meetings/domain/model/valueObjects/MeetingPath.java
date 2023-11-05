package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Meeting;
import com.edu.pe.gocareerapi.Meetings.domain.model.entities.MeetingItem;
import com.edu.pe.gocareerapi.Meetings.domain.model.entities.Reunion;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Embeddable
public class MeetingPath {

    @OneToMany(mappedBy = "meeting")
    private List<MeetingItem> meetingItems;


    public MeetingPath(){
        this.meetingItems = new ArrayList<>();
    }


    public void addItem(Meeting meeting, Reunion reunion){
        MeetingItem lastMeeting = getLastItem();

        MeetingItem meetingItem = new MeetingItem(meeting,reunion,null);
        meetingItems.add(meetingItem);
        if(lastMeeting != null) lastMeeting.updateNextItem(meetingItem);
    }

    public void addItem(Meeting meeting, Reunion reunion, Long nextItem){
        MeetingItem meetingItem = getMeetingItemWithReunionId(nextItem);
        addItem(meeting,reunion, meetingItem.getId());
    }



    private MeetingItem getReunionWithId(Long meetingId){
        return meetingItems.stream()
                .filter(meetingItem -> meetingItem.getId().equals(meetingId))
                .findFirst().orElse(null);
    }


    private MeetingItem getMeetingItemWithReunionId(Long reunionId){
        return meetingItems.stream()
                .filter(meetingItem -> meetingItem.getReunion().getId().equals(reunionId))
                .findFirst().orElse(null);
    }


    private MeetingItem getLastItem() {
        return meetingItems.stream().filter(item -> item.getNextItem() == null).findFirst().orElse(null);
    }


}
