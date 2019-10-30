package chap13_project1;

public class HTMLLConverterApp {

	public static void main(String[] args) {
		System.out.println("HTML Converter");
		
		String html = "<h1>Grocery List</h1>\n" +
				 "<ul>\n" +
				 " <li>Eggs</li>\n" +
				 " <li>Milk</li>\n" +
				 " <li>Butter</li>\n" +
				 "</ul>";
		
		System.out.println("\nINPUT\n" + html);
		
		System.out.println("\nOUTPUT");
		String html1 = html.replace("<li>", "*");
		String html2 = html1.replace("</li>", " ");
		String html3 = html2.replace("<ul>\n", "");
		String html4 = html3.replace("<h1>", " ");
		String html5 = html4.replace("</h1>", " ");
		String html6 = html5.replace("</ul>", " ");
		String html7 = html6.trim();
		System.out.println(html7);
		

	}

}
