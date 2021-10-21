package J05032;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person implements Comparable<Person> {
	private String ten, ngaysinh;
	private long tuoi;
	public Person(String ten, String ngaysinh) {
		super();
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		setTuoi(ngaysinh);
	}
	private void setTuoi(String ngaysinh) {
		String[] tmp = ngaysinh.split("/");
		LocalDate ns = LocalDate.of(Integer.parseInt(tmp[2]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[0]));
		LocalDate now = LocalDate.now();
		this.tuoi = ChronoUnit.YEARS.between(ns, now);
	}
	public long getTuoi() {
		return tuoi;
	}
	@Override
	public String toString() {
		return ten;
	}
	@Override
	public int compareTo(Person o) {
		if(this.getTuoi() < o.getTuoi())
			return 1;
		return -1;
	}
	
	

}
