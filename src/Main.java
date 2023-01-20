import java.lang.Math;

public class Main {
    public static void main (String[]args) {
        int sum = 0;
        int counter = 0;
        String s = "Hello, TechCodes Intermediate People!! Welcome to our challenge!!";
        char[] arr = s.toCharArray();
        String original = "oQn52Dcyn4GpwPKiIBWrWEFWhJskBZPHQ4EbPW6eXDRDfMB88pq4TxMXxiSPlYUou4ucDGj6DwvQP39lmqGPKzKDVa0PvoKYJMQgsBgT3oM7Oe2LeHuq,hEdlcpZfczWXRyE qA5ZDr1PwaDXC4TJWWBbkeKhLmfYF09ieUHCPqegBVDft9bGXNxNcse3j5OyxUmL8dmhrWrMcA8TYseKgHXDPYYbgpCiEnB6LX7CurbarVO3of5Nlhv1dHdpT4dK5NwLnmDtMKcZlRnVYF1U9vpbDeGHDYXpPsAv9u83iLFXrfnJGUd7gE5BVHj2yU63vv 55W3pUex4XGlEx4xHOcw8hlxVIbvy0uqnUPFrxV8bBY9c0yS8ToO80F49BA8aDtRnbvo57g1eYWbzF617O5RIiPDDwRDEXnjUmVY43GrUe6Jsn8l1Nwi812AMLBiH6B1axNKUU9KRmtdHaK7rV7l41YRDYFILEXlvhxcjMsljOve8pXWVRNTdHO8ancpspT3X33aqbpZYrXKaMAiJoYNcYYIwKF39xqNa2hUn2lpx62inj3op4DfW0ZW1YR2iJHptdIpMNAexJyew2S5MEdYLK5US6yj13BCHPJobcof OEuUpDbGZw4YuTPil7NBGw2TiCziP2GwKiepswxnHW83oLogVHy0qbdborA6IUFGydfRp5cFh5F5mVV0D0olca6jPblHD0HfMJUpBfOmtoxPxxnpB8lhVWecXh9v!FmuNmdrn7P02ULH4p5QK8ZFG2lVpyHG!jb4rBhtYnjIElOGa SIndqn1SCj1kk7lh5PZz809c8HSkskVgCWjzbMHpIukeNmVHH2IgOtK7DPkiVYLsiMvK3Hp2eUTQiUlYUs241KBkXrXyrKE40cdwk6BxoOHXod24LTTU5TQCbQ2SAIJ3LfmAtOQGZHbl6YLsonacz06FWqeKVqfpo NUFlVLdaYYxqVAEJaUe8yt85Dgdmj8lKFKAoSNnR5ZTUEdtDmvsMGqpsLt ppGHy4lNMD9P2YHvklCOqOPo8AnjO6O9AK6UYM8LGM9iUAEpAcjJiWNuWfmlj1MvzCu5GNCAfxwHkeQUSOrKVnW3WXg0ISDsEzllOGlBMwPFrH6rFo38 UPXlkAYiJgcdajfjmxHSlCp1y2PjxizfbcZhc65mYjAV0oSCIG4hq65WEDWzD3z5ZhYG3maOnF7OjxPTUtBiNQ0SVld7AkPD4llpOnxOM1vVD1lpC37SZ0nINYtUv4eKM7tDhxqNsVKC3syUjMAKn8HRPBCT8fPy72gy8PClvSYdeSuUSI1w!ejROoG2pTa!";
        String jumble = "oQn52Dcyn4GpwPKiIBWrWEFWhJskBZPHQ4EbPW6eXDRDfMB88pq4TxMXxiSPlYUou4ucDGj6DwvQP39lmqGPKzKDVa0PvoKYJMQgsBgT3oM7Oe2LeHuq,hEdlcpZfczWXRyE qA5ZDr1PwaDXC4TJWWBbkeKhLmfYF09ieUHCPqegBVDft9bGXNxNcse3j5OyxUmL8dmhrWrMcA8TYseKgHXDPYYbgpCiEnB6LX7CurbarVO3of5Nlhv1dHdpT4dK5NwLnmDtMKcZlRnVYF1U9vpbDeGHDYXpPsAv9u83iLFXrfnJGUd7gE5BVHj2yU63vv 55W3pUex4XGlEx4xHOcw8hlxVIbvy0uqnUPFrxV8bBY9c0yS8ToO80F49BA8aDtRnbvo57g1eYWbzF617O5RIiPDDwRDEXnjUmVY43GrUe6Jsn8l1Nwi812AMLBiH6B1axNKUU9KRmtdHaK7rV7l41YRDYFILEXlvhxcjMsljOve8pXWVRNTdHO8ancpspT3X33aqbpZYrXKaMAiJoYNcYYIwKF39xqNa2hUn2lpx62inj3op4DfW0ZW1YR2iJHptdIpMNAexJyew2S5MEdYLK5US6yj13BCHPJobcof OEuUpDbGZw4YuTPil7NBGw2TiCziP2GwKiepswxnHW83oLogVHy0qbdborA6IUFGydfRp5cFh5F5mVV0D0olca6jPblHD0HfMJUpBfOmtoxPxxnpB8lhVWecXh9v!FmuNmdrn7P02ULH4p5QK8ZFG2lVpyHG!jb4rBhtYnjIElOGa SIndqn1SCj1kk7lh5PZz809c8HSkskVgCWjzbMHpIukeNmVHH2IgOtK7DPkiVYLsiMvK3Hp2eUTQiUlYUs241KBkXrXyrKE40cdwk6BxoOHXod24LTTU5TQCbQ2SAIJ3LfmAtOQGZHbl6YLsonacz06FWqeKVqfpo NUFlVLdaYYxqVAEJaUe8yt85Dgdmj8lKFKAoSNnR5ZTUEdtDmvsMGqpsLt ppGHy4lNMD9P2YHvklCOqOPo8AnjO6O9AK6UYM8LGM9iUAEpAcjJiWNuWfmlj1MvzCu5GNCAfxwHkeQUSOrKVnW3WXg0ISDsEzllOGlBMwPFrH6rFo38 UPXlkAYiJgcdajfjmxHSlCp1y2PjxizfbcZhc65mYjAV0oSCIG4hq65WEDWzD3z5ZhYG3maOnF7OjxPTUtBiNQ0SVld7AkPD4llpOnxOM1vVD1lpC37SZ0nINYtUv4eKM7tDhxqNsVKC3syUjMAKn8HRPBCT8fPy72gy8PClvSYdeSuUSI1w!ejROoG2pTa!";
        for(char ch: arr){
            int i = jumble.indexOf(ch);
            sum += i+counter;
            int len = jumble.substring(0, i+1).length();
            counter+=len;
            jumble = jumble.substring(i+1);
        }
        System.out.println(sum);

        int primeSum = 0;
        for (int i = 2; i<=sum; i++){
            if(prime.isPrime(primeSum)&&primeSum!=0){
                break;
            }
            if (sum%i==0){
                if (prime.isPrime(i)){
                    primeSum+=i;
                }
            }
        }
        System.out.println(primeSum);

        int n = 0;
        int count = 0;
        int finalSum = 0;
        for (int i = 0; i<original.length(); i++){
            if (original.charAt(i)=='5'){
                n+=i;
                count++;
            }
            if (count==5){
                finalSum = n;
            }
        }

        int maxPrime = 2;
        for (int i = 3; i<=finalSum; i++){
            if (prime.isPrime(i) && finalSum%i==0){
                maxPrime = i;
            }
        }
        System.out.println(maxPrime);

    }
}
