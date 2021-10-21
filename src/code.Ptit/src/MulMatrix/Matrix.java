package MulMatrix;

import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int [][] arrayMatrix;
    public Matrix(){

    }
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.arrayMatrix = new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                arrayMatrix[i][j] = sc.nextInt();
        }
    }
    public Matrix trans(){
        Matrix reverse = new Matrix(m,n);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
                reverse.arrayMatrix[i][j] = arrayMatrix[j][i];
        }
        return reverse;
    }
    public Matrix mul(Matrix b){
        Matrix kq = new Matrix(n,b.m);
        for(int i = 0; i < n; i++){
            for(int  j = 0; j < b.m; j++){
                kq.arrayMatrix[i][j] = 0;
                for(int k = 0; k < m; k++){
                    kq.arrayMatrix[i][j] += arrayMatrix[i][k]*b.arrayMatrix[k][j];
                }
            }
        }
        return kq;
    }
    @Override
    public String toString(){
        String kq = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                kq += arrayMatrix[i][j];
                kq += " ";
            }
            if(i < n-1){
                kq += "\n";
            }
        }
        return kq;
    }
}
