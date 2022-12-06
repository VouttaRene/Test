public class ChristmasTree {

	private double maxWeight;
	private double currentWeight = 0;
	private int decorationCount = 0;

	private Object[] decorations;
	private char[][] tree;
	
	/**
	 * constructor for object definition
	 * @param size
	 * @param maxWeight
	 */

	public ChristmasTree(int size, double maxWeight) {

		this.maxWeight = maxWeight;

		decorations = new Object[(int) Math.pow(size, 2)]; // 1 + 3 + 5 + ... = n^2

		// Initialize triangular 2-dimensional Array to make it look like a Christmas Tree
		tree = new char[size][];

		for (int width = 0; width < size; width++) {
			tree[width] = new char[2 * width + 1];
		}

		// Fill every space with "empty branches"
		for (int height = 0; height < tree.length; height++) {
			for (int width = 0; width < tree[height].length; width++) {
				tree[height][width] = ',';
			}
		}
	}
	
	/**
	 * 
	 * check if weight of all decorations is smaller/equals the weight limit
	 * @param weight
	 * @return
	 */

	public boolean weightCheck(double weight) {
		return currentWeight + weight <= maxWeight;
	}

	/**
	 * Places a decoration inside the Christmas Tree. Placement must be between 1
	 * and decoration.length.
	 * 
	 * @param decoration
	 * @param placement
	 */
	
	public void decorate(Object decoration, int placement) {

		if (decorationCount < decorations.length) {

			if (decoration instanceof ChristmasBall || decoration instanceof Candle || decoration instanceof CandyCane) {

				if (decoration instanceof ChristmasBall && weightCheck(((ChristmasBall) decoration).getWeight())) {

					if (placeInsideTree(decoration, placement, 'o')) {
						decorations[decorationCount++] = decoration;
						currentWeight += ((ChristmasBall) decoration).getWeight();
						System.out.println("Ball has been placed at position " + placement + ".");
					}

				} else if (decoration instanceof Candle && weightCheck(((Candle) decoration).getWeight())) {

					if (((Candle) decoration).isElectric()) {
						if (placeInsideTree(decoration, placement, 'I')) {
							decorations[decorationCount++] = decoration;
							currentWeight += ((Candle) decoration).getWeight();
							System.out.println("Electric Candle has been placed at position " + placement + ".");
						}
					} else {
						if (placeInsideTree(decoration, placement, 'i')) {
							decorations[decorationCount++] = decoration;
							currentWeight += ((Candle) decoration).getWeight();
							System.out.println("Real Candle has been placed at position " + placement + ".");
						}
					}

				} else if (decoration instanceof CandyCane && weightCheck(((CandyCane) decoration).getWeight())) {

					if (placeInsideTree(decoration, placement, 'r')) {
						decorations[decorationCount++] = decoration;
						currentWeight += ((CandyCane) decoration).getWeight();
						System.out.println("Candy Cane has been placed at position " + placement + ".");
																											
					}

				} else {
					System.out.println("The decoration is too heavy, the tree couldn't hold it anymore.");
				}

			} else {

			System.out.println("Sorry, but this is no Christmas decoration.");
			}

		} else {
			System.out.println("There is no more space left on the tree.");
		}
	}

	/**
	 * Places the representational character for the decoration inside the 2
	 * dimensional char array. Placement comes from decorate() and must be between 1
	 * and decoration.length.
	 * 
	 * @param decoration
	 * @param placement
	 * @param representer
	 */
	
	private boolean placeInsideTree(Object decoration, int placement, char representer) {

		if (placement <= decorations.length && placement > 0) {

			int heightSegment = 0;
			int widthSegment = 0;

			// Determine Coordinate for Placement
			for (int height = 0; 0 < placement && height < tree.length; height++) {

				for (int width = 0; 0 < placement && width < tree[height].length; width++) {
					placement--;
					widthSegment++;

				}
				if (placement > 0) {
					heightSegment++;
					widthSegment = 0;
				}

			}
			if (widthSegment > 0)
				widthSegment--;

			// Place representation character at Placement
			if (tree[heightSegment][widthSegment] == ',') {
				tree[heightSegment][widthSegment] = representer;
				return true;

			} else {
				System.out.println("Sorry, this place is already taken!");
			}

		} else {
			System.out.println("This place is outside of the tree.");
		}
		return false;
	}

	/**
	 * Printing all free spaces on console	
	 */
	
	public void freeSpaces() {
		if (decorationCount < decorations.length) {

			int placement = 1;

			int placesLeft = decorations.length - decorationCount;

			System.out.print("Free positions left: ");

			for (int height = 0; height < tree.length; height++) {

				for (int width = 0; width < tree[height].length; width++) {
					if (tree[height][width] == ',') {
						System.out.print(placement);
						placesLeft--;
						if (placesLeft > 0) {
							System.out.print(", ");
						}
					}
					placement++;
				}
			}

			System.out.println(".");

		} else {
			System.out.println("There are no more free spaces.");
		}
	}

	
	
	/**
	 * Printing all decorations on console
	 */
	
	public void printTreeContent() {							
		for (int i = 0; i < decorationCount; i++) {
			System.out.println(decorations[i]);
		}
	}


	/**
	 * Prints the number of current decorations on the tree and also the maximum
	 * amounts of decorations that are possible.
	 */
	
	public String toString() {
		return "The tree has " + decorationCount + " of possible " + decorations.length
				+ " decorations. It can also hold " + (maxWeight - currentWeight) + "g more weight.";
	}
	
	/**
	 * Prints a char representation of the Christmas Tree on console
	 */
	
	public void printAsciiTree() {

		// star top
		for (int width = 0; width < tree.length; width++) {
			System.out.print(" ");
		}
		System.out.println("*");

		// tree
		for (int height = 0; height < tree.length; height++) {

			for (int placeholder = 0; placeholder < (tree.length - height - 1); placeholder++) {
				System.out.print(" ");
			}

			System.out.print("/");

			for (int width = 0; width < height * 2 + 1; width++) {

				System.out.print(tree[height][width]);
			}

			System.out.print("\\");
			System.out.println();
		}

		// root
		for (int width = 0; width < tree.length - 1; width++) {
			System.out.print("^");
		}
		System.out.print("[_]");
		for (int width = 0; width < tree.length - 1; width++) {
			System.out.print("^");
		}
		System.out.println();
	}
}
