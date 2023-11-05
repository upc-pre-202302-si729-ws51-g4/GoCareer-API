package com.edu.pe.gocareerapi.Meetings.domain.model.commands;

import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.SpecialistRecordId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.StudentRecordId;

public record RequestEnrollmentCommand(StudentRecordId studentRecordId, SpecialistRecordId specialistRecordId, Long meetingId) {
}
