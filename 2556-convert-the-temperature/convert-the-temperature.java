class Solution {
    public double[] convertTemperature(double cel) {
        double[] arr = new double[2];
        double kelvin = cel + 273.15;
        double Fahrenheit = cel * 1.80 + 32.00;
        arr[0] = kelvin;
        arr[1] =  Fahrenheit;
        return arr;
        
    }
}