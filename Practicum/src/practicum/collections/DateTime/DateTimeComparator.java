package practicum.collections.DateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        int cmp = (dt1.year - dt2.year);
        if (cmp == 0) {
            cmp = (dt1.month - dt2.month);
            if (cmp == 0) {
                cmp = (dt1.day - dt2.day);
                if (cmp == 0) {
                    cmp = (dt1.hours - dt2.hours);
                    if (cmp == 0) {
                        cmp = (dt1.minutes - dt2.minutes);
                        if (cmp == 0) {
                            cmp = (dt1.seconds - dt2.seconds);
                        }
                    }
                }
            }
        }
        return cmp;

    }

}
