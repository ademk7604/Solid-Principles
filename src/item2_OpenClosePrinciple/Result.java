package item2_OpenClosePrinciple;

import java.util.List;

class Result {

    /*
     * Complete the 'getMinServers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER expected_load
     *  2. INTEGER_ARRAY server
     */

    public static int getMinServers(int expected_load, List<Integer> servers) {
        servers.sort((a,b) -> b-a);
        int countServers = 0;
        int currentLoad = 0;
        
        for (int i=0; i< servers.size(); i++){
            while(currentLoad + servers.get(i) <= expected_load){
                currentLoad += servers.get(i);
                countServers++;
            }
            
            if(currentLoad ==expected_load){
                return countServers;
            }
        }    
        return -1;
    }
    public static void main(String[] args){
        List<Integer> servers = List.of(1,2,3);
        int expected_load = 3;
        
        int result = getMinServers(expected_load, servers);
        System.out.println(result);
        
    }

}
