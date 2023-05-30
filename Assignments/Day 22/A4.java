import java.util.ArrayList;

class A4 {
    public static void main( String[] args ) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        
		A.add(3);
        A.add(6);
        A.add(3);
        A.add(8);
        A.add(3);

        int maxVal = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > maxVal) {
                maxVal = A.get(i);
            }
        }
        System.out.print("Max : " + maxVal);
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int j = 0; j <= maxVal; j++) {
            ans.add(0);
        }

        for (int k = 0; k < ans.size(); k++) {
            int counteElem = ans.get(A.get(k));
            ans.set(A.get(k), (int) (counteElem + 1));
        }
		
		System.out.print("Max : " + ans.size());

		// String myString = ans.toString();
		// System.out.println(myString);

        // return ans;
        // int index = 0;

        // for ( int l = 0; l < ans.size(); l++ ) {
        // if ( ans.get(l) > 0 ) {
        // for ( int m = 0; m < ans.get(l); m++) {
        // ans.set(index, l);
        // //System.out.print(" i : " + index);
        // if ( index < ans.size() - 1 ) {
        // //System.out.print(" i++ ");
        // index++;
        // }

        // }

        // }
        // }

        // return ans;
    }
}