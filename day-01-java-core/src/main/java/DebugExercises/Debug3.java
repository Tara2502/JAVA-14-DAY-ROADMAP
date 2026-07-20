package DebugExercises;

public class Debug3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i--){
            System.out.println(i);
        }
    }
}


/*
what we used to debug this :-breakpoint and step over(multiple times).
why loop never stops?
ans- Because i is decreasing (i--) while the condition is i <= 5.
what should be corrected ?
ans - change i-- to i++.
*/
