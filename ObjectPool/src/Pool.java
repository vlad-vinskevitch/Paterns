import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

public class Pool {
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();

    public PooledObject getPooledObject(){
        if (free.isEmpty()){
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        }else {
            PooledObject pooledObject = free.get(0);
                used.add(pooledObject);
                free.remove(pooledObject);
                return pooledObject;

        }
    }

    void releasePooledObject(PooledObject pooledObject){
        used.remove(pooledObject);
        free.add(pooledObject);
    }
}
