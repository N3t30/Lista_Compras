public class InsertionSort {
    public static void main(String[] args) {
        new InsertionSort();
    }

    InsertionSort(){
        int [] numeros = {5,2,9,1,5,6};
        System.out.println("vetor desodernado");
        visualizar(numeros);
        Inser(numeros);
        System.out.println("vetor ordenado");
        visualizar(numeros);
    }

    void visualizar(int[] numeros){
        for (int num: numeros){
            System.out.println(num + " ");
        }
        System.out.println();
    }

    void Inser(int[] array){
        for (int i = 1; i < array.length; i++){
            int numeroEmordenacao = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > numeroEmordenacao){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = numeroEmordenacao;
        }
    }
}
