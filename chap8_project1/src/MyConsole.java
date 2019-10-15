public class MyConsole extends Console {
	
	@Override
    public String getString(String prompt) {
		System.out.print(prompt);
        String s = sc.nextLine();

            while (s.equals("")){
                System.out.println("Error! Invalid response. Try again.");
                System.out.print(prompt);
                s = sc.nextLine();
            } 
       return s;
    }

}
