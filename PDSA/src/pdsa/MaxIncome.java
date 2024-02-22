/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdsa;

/**
 *
 * @author User
 */
public class MaxIncome {
    double[] income;
    int n;

    public MaxIncome() {
        income = new double[100];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void insert(double serviceIncome) {
        n++;
        income[n] = serviceIncome;
        heapifyUp(n);
    }

    public void heapifyUp(int k) {
        while (k > 1 && income[k] > income[k / 2]) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    public void swap(int i, int j) {
        double temp = income[i];
        income[i] = income[j];
        income[j] = temp;
    }

    public void tempDisplay() {
        for (int c = 1; c <= n; c++) {
            System.out.println("Value: " + income[c]);
        }
    }

    public double maxIncome() {
        return income[1];
    }
}


