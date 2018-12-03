package entity;

import java.util.Date;
import java.util.GregorianCalendar;

public class Source {
	private String link;
	private Date date;
	
	public Source(String vs){
        GregorianCalendar gc = new GregorianCalendar();
        
        int year = 2010 + (int)Math.round(Math.random() *(2018 - 2010));
        gc.set(GregorianCalendar.YEAR, year);
        int dayOfYear = 1 + (int)Math.round(Math.random() * (gc.getActualMaximum(GregorianCalendar.DAY_OF_YEAR) - 1));
        gc.set(GregorianCalendar.DAY_OF_YEAR, dayOfYear);
        
        this.date = gc.getTime();
        this.link = vs;
	}
	
	public String getLink(){
		return link;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
