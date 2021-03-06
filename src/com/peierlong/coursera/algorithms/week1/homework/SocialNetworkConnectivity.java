package com.peierlong.coursera.algorithms.week1.homework;

import com.peierlong.coursera.algorithms.week1.union_find.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 friendship.log :
 201711010101 1 2
 201711010102 2 3
 201711010103 4 5
 201711010104 1 10
 201711010105 11 7
 201711010106 12 3
 201711010107 17 24
 201711010108 6 8
 201711010109 9 2
 201711010110 3 11
 201711010111 7 18
 201711010112 19 22
 201711010113 7 6
 201711010114 13 14
 201711010115 16 19
 201711010116 15 1
 201711010117 13 7
 201711010118 11 12
 201711010119 0 9
 201711010120 3 21
 201711010121 4 24
 201711010122 14 2
 201711010123 17 1
 201711010124 19 23
 201711010125 20 16
 201711010125 20 24
 201711010111 7 18
 201711010112 19 22
 201711010113 7 6
 201711010114 13 14
 201711010115 16 19
 201711010116 15 1
 201711010117 13 7
 201711010118 11 12
 *
 *
 */
public class SocialNetworkConnectivity {

    public static void main(String[] args) {
        int lineNumber = 25;
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(lineNumber);
        while (StdIn.hasNextLine()) {
            String line = StdIn.readLine();
            if (line != null && !line.equals("")) {
                String[] str = line.split(" ");
                StdOut.println("union : " + str[1] + " " + str[2]);
                uf.union(Integer.valueOf(str[1]), Integer.valueOf(str[2]));
                StdOut.println(uf.count());
                if (uf.count() == 1) {
                    StdOut.println("the earliest connected time is :" + str[0]);
                    return;
                }
            }
        }
    }
}
