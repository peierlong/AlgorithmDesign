package com.peierlong.coursera.v1.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己第一次尝试实现的并查集
 *
 * @author Peiel
 * @version V1.0
 * @date 2020/1/2
 */
public class MyUF implements InterfaceUF {
    private List<List<Integer>> components;

    public MyUF(int N) {
        components = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> component = new ArrayList<>();
            component.add(i);
            components.add(component);
        }
    }

    @Override
    public void union(int p, int q) {
        int pidx = find(p);
        int qidx = find(q);
        if (pidx != qidx) {
            List<Integer> qcomponent = components.get(qidx);
            List<Integer> pcomponent = components.get(pidx);
            pcomponent.addAll(qcomponent);
            components.remove(qidx);
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int find(int p) {
        for (List<Integer> component : components) {
            for (Integer z : component) {
                if (p == z) {
                    return components.indexOf(component);
                }
            }
        }
        return -1;
    }

    @Override
    public int count() {
        return components.size();
    }


    public static void main(String[] args) {
        MyUF uf = new MyUF(8);
        uf.union(1, 4);
        uf.union(4, 5);
        uf.union(2, 3);
        uf.union(2, 6);
        uf.union(3, 6);
        uf.union(3, 7);

        System.out.println(uf.connected(0, 7));
        System.out.println(uf.connected(1, 7));
        System.out.println(uf.connected(1, 5));
        System.out.println(uf.connected(2, 7));

    }

}
