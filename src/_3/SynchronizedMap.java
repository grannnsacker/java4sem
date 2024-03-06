package _3;

import java.util.*;

public class SynchronizedMap<K, V> implements Map<K, V> {
    private final HashMap<K, V> hashmap = new HashMap<>();

    @Override
    synchronized public int size() {
        return hashmap.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return hashmap.isEmpty();
    }

    @Override
    synchronized public boolean containsKey(Object key) {
        return hashmap.containsKey(key);
    }

    @Override
    synchronized public boolean containsValue(Object value) {
        return hashmap.containsValue(value);
    }

    @Override
    synchronized public V get(Object key) {
        return hashmap.get(key);
    }

    @Override
    synchronized public V put(K key, V value) {
        return hashmap.put(key, value);
    }

    @Override
    synchronized public V remove(Object key) {
        return hashmap.remove(key);
    }

    @Override
    synchronized public void putAll(Map<? extends K, ? extends V> m) {
        hashmap.putAll(m);
    }

    @Override
    synchronized public void clear() {
        hashmap.clear();
    }

    @Override
    synchronized public Set<K> keySet() {
        return hashmap.keySet();
    }

    @Override
    synchronized public Collection<V> values() {
        return hashmap.values();
    }

    @Override
    synchronized public Set<Entry<K, V>> entrySet() {
        return hashmap.entrySet();
    }

}
