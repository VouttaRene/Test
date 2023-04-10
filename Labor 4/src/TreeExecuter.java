/**
 * 
 * @author René Voutta
 * @email u38509@hs-harz.de
 * @matrikel 31145
 *
 */
public class TreeExecuter {

	public static void main(String[] args) {
		//Create new Tree
		int treeSize = 7;
		int maxTreeWeight = 70;
		ChristmasTree christmasTree = new ChristmasTree(treeSize, maxTreeWeight);
		
		//Create new Christmas Balls(radius, color, pattern, weight)
		ChristmasBall redBall = new ChristmasBall(2, "red", "none", 2.0);
		ChristmasBall goldBall = new ChristmasBall(3, "gold", "striped", 2.5);
		
		//Create new CandyCanes(sugarAmount, weight)
		CandyCane smallCane = new CandyCane(9.4, 15);
		CandyCane bigCane = new CandyCane(15.2, 21.5);
		
		//Create Candles(size, color, electric, weight)
		Candle realCandle = new Candle(6, "warm white", false, 32.2);
		Candle electricCandle = new Candle(4, "white", true, 42.3);
		
		
	//Print Out
		//Part 1: Description
		System.out.println("WELCOME TO THE GREAT CHRISTMAS TREE DECORATION!\n_______________________________");
		System.out.println("Calorie counter of general candy Cane object: " + Math.round(smallCane.calorieCounter(smallCane.getWeight())) + "kcal");
		
		// Volume Calculation
		System.out.println("Volume calculation of general christmas ball object: " + Math.round(redBall.volumeChristmasBall(redBall.getRadius())) + 
							"\n_______________________________");
		
		//Part 2: Decoration placement
		System.out.println("\nYOUR DECORATION PLACEMENTS\n");
		//Random decoration
		for(int i = 1; i < Math.pow(treeSize, 2); i++) {
			int random = (int)(Math.random()*10);
			switch(random) {
			case 0:
				//Check if weight can hold the ball
				if(christmasTree.weightCheck(redBall.getWeight()))
					christmasTree.decorate(redBall, i);
				break;
			case 1:
				//Check if weight can hold the ball
				if(christmasTree.weightCheck(goldBall.getWeight()))
					christmasTree.decorate(goldBall, i);
				break;
			case 2:
				//Check if weight can hold the candy cane
				if(christmasTree.weightCheck(smallCane.getWeight()))
					christmasTree.decorate(smallCane, i);
				break;
			case 3:
				//Check if weight can hold the candy cane
				if(christmasTree.weightCheck(bigCane.getWeight()))
					christmasTree.decorate(bigCane, i);
				break;
			case 4:
				//Check if weight can hold the candle
				if(christmasTree.weightCheck(electricCandle.getWeight()))
					christmasTree.decorate(electricCandle, i);
				break;
			case 5:
				//Check if weight can hold the candle
				if(christmasTree.weightCheck(realCandle.getWeight()))
					christmasTree.decorate(realCandle, i);
				break;
			default:
				break;
			}
		}
		
		
		System.out.println("\n_______________________________\n\nHERE IS YOUR CHRISTMAS TREE\n");
		christmasTree.printAsciiTree();
		System.out.println();
		christmasTree.freeSpaces();
		System.out.println(christmasTree.toString());
		System.out.println("_______________________________\n\nTHE TREE CONSISTS OF THE FOLLOWING DECORATIONS\n");
		christmasTree.printTreeContent();
	}
}
