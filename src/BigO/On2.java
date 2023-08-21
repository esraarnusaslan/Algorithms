package BigO;

//imput buyuklugunun karesi ile dogru orantili . Nested for mesela

public class On2 {  //0(n^2) --> Quadratic Compexity  eleman sayisinin karesi ile dogru olan olarak gecen sure

    public static void main(String[] args) {

        int count=0;

        int [] arr={2,3,4,1,6,4,3};
        for (int i=0;i<arr.length; i++){
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[i]+arr[j]);
                count++;
            }
        }
        System.out.println("toplam islem sayisi: " + count);// eleman sayisinin karesini aliyor


    }

}
