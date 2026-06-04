class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // Opcion 1

        // char[] sCharArr = s.toCharArray();
        // char[] tCharArr = t.toCharArray();

        // Arrays.sort(sCharArr);
        // Arrays.sort(tCharArr);

        // return Arrays.equals(sCharArr,tCharArr);

        //Solucion con HashMap -> Solucion 2

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i = 0 ; i < s.length() ; i ++) {
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sCount.equals(tCount);


    }
}
