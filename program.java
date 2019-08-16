public class Main
{
	public static void main(String[] args) {
	    int n=2100;
	    int sum=0, rightmost=0;
	    while(n!=0){
	        rightmost=n%10;
	        sum+=rightmost;
	        n=n/10;
	    }
		System.out.println(sum);
	}
}
