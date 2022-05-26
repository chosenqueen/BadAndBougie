package day10_package;

public class SwitchStatement {

	public static void main(String[] args) {
		
		
		String browser = "FIREFOX";

        if (browser == "CHROME") {
            System.out.println("CHROME BROWSER IS SELECTED");

        } else if (browser == "FIREFOX") {

            System.out.println("FIREFOX BROWSER IS SELECTED");
        } else if (browser == "OPERA") {

            System.out.println("OPERA BROWSER IS SELECTED");
        } else if (browser == "SAFARI") {

            System.out.println("SAFARI BROWSER IS SELECTED");
        } else if (browser == "EDGE") {

            System.out.println("EDGE BROWSER IS SELECTED");
        } else if (browser == "IE") {

            System.out.println("IE BROWSER IS SELECTED");

        } else {
            System.out.println("INVALID BROWSER");
        }

        switch (browser) {
        case "CHROME":
            System.out.println("Chrome browser selected");
            break;
        case "FIREFOX":
            System.out.println("FIREFOX BROWSER IS SELECTED");
            break;
        case "OPERA":
            System.out.println("OPERA browser selected");
            break;
        case "EDGE":
            System.out.println("EDGE browser selected");
            break;
        case "IE":
            System.out.println("IE browser selected");
            default :
                System.out.println("INVALID BROWSER");
		}

	}

}
