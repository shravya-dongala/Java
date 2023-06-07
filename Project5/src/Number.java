public class Number {
	    public static void main(String[] args) {
	        int[] n = {10, 5, 8, 20, 3, 15};

	        int smallest = n[0];
	        int largest = n[0];

	        for (int i = 1; i < n.length; i++) {
	            if (n[i] < smallest) {
	                smallest = n[i];
	            }
	            if (n[i] > largest) {
	                largest = n[i];
	            }
	        }

	        System.out.println("Smallestnumber: " + smallest);
	        System.out.println("Largestnumber: " + largest);
	    }
	}

