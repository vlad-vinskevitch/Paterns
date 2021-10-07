import org.omg.CORBA.PolicyError;

public class ObjectPool {
    public static void main(String[] args) {
        Pool pool = new Pool();
        PooledObject pooledObject = pool.getPooledObject();


        pool.releasePooledObject(pooledObject);
    }
}
