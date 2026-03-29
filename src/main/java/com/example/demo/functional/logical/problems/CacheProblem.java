package com.example.demo.functional.logical.problems;

public class CacheProblem {
    public static void main(String[] args) {
        Integer x1 = 1000;
        Integer x2 = 1000;

        if(x1==x2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
/**
 * Java caches Integer values from -128 to 127 in memory!
 * Anything outside that range?
 * New object. Different reference. == fails!
 *
 * Integer a = 127;
 * Integer b = 127;
 * System.out.println(a == b); // ✅ true — same cache!
 *
 * Integer c = 128;
 * Integer d = 128;
 * System.out.println(c == d); // ❌ false — new objects!
 *
 * // The fix — ALWAYS use .equals()
 * System.out.println(c.equals(d)); // ✅ true — always!
 *
 *
 🔴 Unlearned → Using == to compare Integer objects
 🟢 Relearned → Always use .equals() for Integer comparison


 */