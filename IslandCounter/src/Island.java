
public class Island {

	public static void main(String[] args) {
		int xSize = 12;
		int ySize = 12;
		
		
		String[][] map = new String[12][7];
		map = mapGeneration();
		printOutMap(map);
		//countLandTiles(map);
		System.out.println("Islands: " + countIslands(map));
	}
	
	//Generate Map
	public static String[][] mapGeneration() {
		String[][] maps = new String[][]
				{{"+","-","-","-","-","-","-","-","-","-","-","+"},	//0	
				{"|","0","0","0","0","0","0","0","0","0","0","|"},	//1
				{"|","0","1","1","0","1","0","0","0","0","0","|"},	//2
				{"|","0","1","1","1","1","0","0","0","0","0","|"},	//3
				{"|","0","0","0","1","0","0","1","1","0","0","|"},	//4
				{"|","0","0","0","0","0","0","0","0","0","0","|"},	//5
				{"|","0","0","0","0","0","0","0","0","0","0","|"},	//6
				{"+","-","-","-","-","-","-","-","-","-","-","+"}};	//7

			
			return maps;
	}
	
	private static void printOutMap(String[][] map) {
		
		//Print out map
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.print("\n");
		}
	}
	
//	private static void countLandTiles(String[][] map) {
//		//Count land tiles of the map
//		int landTiles = 0;
//			for(int i = 0; i < map.length; i++) {
//				for(int j = 0; j < map[i].length; j++) {
//					if(map[i][j] == "1")
//						landTiles++;
//				}
//			}
//			
//		System.out.println("Land Tiles: " + landTiles);
//	}
	
	private static int countIslands(String[][] map) {
		//printOutMap(tempMap);
		//Check for 1's from above
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				//new land Tile 1:
				if(map[i][j] == "1") {
					//Check west
					if(map[i+1][j] == "1")
						map[i+1][j] = "2";
					//Check south
					if(map[i][j+1] == "1")
						map[i][j+1] = "2";
					map[i][j] = "2";
				}else if(map[i][j] == "2") {
					//Check west
					if(map[i+1][j] == "1")
						map[i+1][j] = "2";
					//Check south
					if(map[i][j+1] == "1")
						map[i][j+1] = "2";
				}
			}
		}
				
		//printOutMap(tempMap);
		return 0;	
	}
	
	private static String[][] copyMapArray(String[][] map) {
		int a = map.length;
		int b = map[a].length;
		String[][] mapCopy = new String[a][b];
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				mapCopy[i][j] = map[i][j];
			}
		}
		
		return mapCopy;
	}
}


