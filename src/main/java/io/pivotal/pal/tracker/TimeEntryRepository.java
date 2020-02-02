package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

//@Repository
public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry any) ;

    public TimeEntry find(long timeEntryId) ;


    public List<TimeEntry> list() ;


    public TimeEntry update(long eq, TimeEntry any) ;


    public void delete(long timeEntryId) ;

}
