
/*
 * Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.

"WNEENESENNN"
 */
public class dirPath {
    public static float getShortestPath(String str){
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            char dir=str.charAt(i);
            if(dir == 'n'){
                y++;
            }
            else if(dir == 's'){
                y--;
            }
            else if(dir == 'e'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path= "wneenesennn";
        System.out.println(getShortestPath(path));

    }
    
}
