package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;


import com.edu.pe.gocareerapi.Meetings.domain.model.entities.MeetingItem;
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


}
