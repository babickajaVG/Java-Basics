// а куда делись пакеты))))

	import java.util.Comparator;

	public class ComparatorbyYear implements Comparator<Book> {
	        @Override
	        public int compare(Book o1, Book o2) {
	            if(o1.getYear() < o2.getYear()){
	                return -1;
	            }
	            else if(o1.getYear() == o2.getYear()){
	                return 0;
	            }
	            else return 1;
	        }
	    }

