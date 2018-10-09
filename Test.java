public class Test {
	public static void main(String[] args) {
						String aatime;
				        byte randomNumber01;
				        randomNumber01 = (byte)(Math.random()*3+1);
				        
				        switch(randomNumber01) {
				            case 1:
				                String aatime = "I like apples ";
				                break;
				            case 2:
				                String aatime = "I like tomatoes ";
				                break;
				            case 3:
				                String aatime = "I like cheese ";
				                break;
				        }
				        System.out.println(aatime);
				    }
}