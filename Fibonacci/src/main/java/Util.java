import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;

import javax.swing.*;
import java.util.*;

public class Util {
    public static void main(String[] args) {
        //drawDiagram(coinSetups);
        //System.out.println(coinSetups);
        //drawDiagram(fill());
        //drawDiagram(create2DArray());
        drawDiagram(createList(), "Add Array List");
        drawDiagram(createLinkedList(), "Add Linked");
        drawDiagram(createHashSet(), "Add Hash");
        drawDiagram(linkedListContains(), "Linked Contains");
        drawDiagram(arrayContains(), "Array Contains");
        drawDiagram(removeHash(), "Remove Hashset");
        drawDiagram(removeTree(), "Remove Tree");

    }
        public static final double[][] coinSetups = new double[][]{
                {2,2,5,10,6},
                {2,3,7,22,4},
        };

    public static double[][] removeTree() {
        double[] x = {1, 10, 100, 1000, 10000, 100000, 1000000};
        double[] y = new double[7];
        for (int i = 0; i < x.length; i++){
            TreeSet list = new TreeSet();
            for (int j = 0; j < x[i]; j++){
                list.add(j + 1);
            }
            long startTime = System.nanoTime();
            list.remove(x[i]-1);
            long endTime = System.nanoTime();
            y[i] = (endTime - startTime) / 1000000d;
        }

        return new double[][]{x, y};
        }


    public static double[][] removeHash() {
        double[] x = {1, 10, 100, 1000, 10000, 100000, 1000000};
        double[] y = new double[7];
        for (int i = 0; i < x.length; i++) {
            HashSet list = new HashSet();
            for (int j = 0; j < x[i]; j++) {
                list.add(j + 1);
            }
                long startTime = System.nanoTime();
                list.remove(x[i]-1);
                long endTime = System.nanoTime();
                y[i] = (endTime - startTime) / 1000000d;
            }

            return new double[][]{x, y};
        }
    public static double[][] arrayContains() {
        double[] x = {1,10,100,1000,10000, 100000, 1000000};
        double[] y = new double[7];
        for (int i = 0; i < x.length; i++) {
            ArrayList list = new ArrayList();
            for (int j = 0; j < x[i]; j++) {
                list.add(j+1);
            }
            for (int k = 0; k < x[i]; k++){
                long startTime = System.nanoTime();
                list.contains(0);
                long endTime = System.nanoTime();
                y[i] = (endTime - startTime) /1000000d;

            }
        }
        return new double[][]{x, y};
    }

    public static double[][] linkedListContains() {
        double[] x = {1,10,100,1000,10000, 100000, 1000000};
        double[] y = new double[7];
        for (int i = 0; i < x.length; i++) {
            LinkedList list = new LinkedList();
            for (int j = 0; j < x[i]; j++) {
                list.add(j+1);
            }
            for (int k = 0; k < x[i]; k++){
                long startTime = System.nanoTime();
                list.contains(0);
                long endTime = System.nanoTime();
                y[i] = (endTime - startTime) /1000000d;

            }
        }
        return new double[][]{x, y};
    }

    public static double[][] createHashSet() {
        double[] x = {1,10,100,1000,10000, 100000, 1000000};
        double[] y = new double[7];
        for (int i = 0; i < x.length; i++) {
            HashSet list = new HashSet();
            long startTime = System.nanoTime();
            for (int j = 0; j < x[i]; j++) {
                list.add(j);
            }
            long endTime = System.nanoTime();
            y[i] = (endTime - startTime) /1000000d;
        }
        return new double[][]{x, y};
    }

    public static double[][] createLinkedList() {
        double[] x = {1,10,100,1000,10000, 100000, 1000000};
        double[] y = new double[7];
        for (int i = 0; i < x.length; i++) {
            LinkedList list = new LinkedList();
            long startTime = System.nanoTime();
            for (int j = 0; j < x[i]; j++) {
                list.add(j);
            }
            long endTime = System.nanoTime();
            y[i] = (endTime - startTime) /1000000d;
        }
        return new double[][]{x, y};
    }

    public static double[][] createList() {
        double[] x = {1,10,100,1000,10000, 100000, 1000000};
        double[] y = new double[7];
        for (int i = 0; i < x.length; i++) {
            ArrayList list = new ArrayList<Double>();
            long startTime = System.nanoTime();
            for (int j = 0; j < x[i]; j++) {
                list.add(j);
            }
            long endTime = System.nanoTime();
            y[i] = (endTime - startTime) /1000000d;
        }
        return new double[][]{x, y};
    }



    public static double[][] create2DArray() {
        long startTime;
        long endTime;
        double[] xValues = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
        double[] yValues = new double[8];
        Random rand = new Random();
        for (int i = 0; i < xValues.length; i++) {
            double[] array = new double[(int) xValues[i]];
            startTime = System.nanoTime();
            for (int j = 0; j < xValues[i]; j++) {
                array[j] = rand.nextInt(101);
            }
            endTime = System.nanoTime();
            yValues[i] = (endTime - startTime) / 1000000d;
        }
        return new double[][]{xValues, yValues};
    }

        public static double[][] fill() {
            double[] x = {1,10,100,1000,10000, 100000, 1000000};
            double[] y = new double[7];
            for (int i = 0; i < x.length; i++) {
                double[] array = new double[(int) x[i]];
                long startTime = System.nanoTime();
                for (int j = 0; j < x[i]; j++) {
                    array[j] = j;
                }
                long endTime = System.nanoTime();
                y[i] = (endTime - startTime) /1000000d;
            }
            return new double[][]{x, y};
        }

        public static final Integer DEFAULT_SIZE = 1;
        public static final Integer INCREMENTION = 5;
        public static final Integer NUMBER_OF_ITERATION = 12;
        public static final Integer AVARAGING_COUNT = 25;


        /**
         * Egyenletes eloszlas alajan keszit parameterkent kapott darab egesz
         * szamot.
         */
        private static Random r = new Random(0);

        public static int[] generateSortedList(int n) {
            double sum = 0;
            double[] nums = new double[n];
            for (int i = 0; i < n; i++) {
                sum -= Math.log(r.nextDouble());
                nums[i] = sum;
            }

            for (int i = 0; i < n; i++) {
                nums[i] *= n * 2;
                nums[i] /= sum;
            }

            int[] intNums = new int[n];
            for (int i = 0; i < n; i++) {
                intNums[i] = (int) Math.floor(nums[i]);
            }

            return intNums;
        }

        private static double calcMedian(double[] vector) {
            Arrays.sort(vector);
            return vector[vector.length / 2];

        }

   /* public static double[][] createDataPoints() {
        double[] vector = new double[AVARAGING_COUNT];
        double[][] data = new double[2][NUMBER_OF_ITERATION];
        int inputSize = DEFAULT_SIZE;
        for (int i = 0; i < NUMBER_OF_ITERATION; i++) {
            // inputSize += Config.INCREMENTION;
            inputSize *= INCREMENTION;
            System.out.println(String.format("%d\t%d", i, inputSize));
            int[] input = generateSortedList(inputSize);
            // For assertion
            List<Integer> inputList = new ArrayList<>();
            for (int x:input) inputList.add(x);
            for (int j = 0; j < AVARAGING_COUNT; j++) {
                int key = r.nextInt(inputSize);
                long startTime = System.nanoTime();
                int index = Main.binarySearchWrapper(input, key);
                long endTime = System.nanoTime();
                // assertion that
                assert index == inputList.indexOf(key);
                vector[j] = endTime - startTime;
            }
            data[0][i] = inputSize;
            data[1][i] = calcMedian(vector);
        }
        return data;
    }
    public static boolean testAlgorithm() {
        boolean isSuccessed = true;
        if (Main.binarySearch(new int[]{3, 10, 14, 20, 31, 42}, 14, 0, 5) == 2) {
            System.out.println("1. teszt eset sikeres");
        } else {
            System.out.println("1. teszt eset sikertelen");
            isSuccessed = false;
        }
        if (Main.binarySearch(new int[]{4, 12, 33, 51, 72}, 21, 0, 4) == -1) {
            System.out.println("2. teszt eset sikeres");
        } else {
            System.out.println("2. teszt eset sikertelen");
            isSuccessed = false;
        }
        System.out.println();
        return isSuccessed;
    }*/

        public static void showChart(JFreeChart chart) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame frame = new JFrame("Charts");

                    frame.setSize(600, 400);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);

                    ChartPanel cp = new ChartPanel(chart);

                    frame.getContentPane().add(cp);
                }
            });
        }

        public static void drawDiagram(double[][] data, String name) {
            // Diagram elkeszitese
            DefaultXYDataset ds = new DefaultXYDataset();
            ds.addSeries(name, data);
            JFreeChart chart = ChartFactory.createXYLineChart(name, "input size", "time", ds,
                    PlotOrientation.VERTICAL, true, true, false);

            LogarithmicAxis xAxis = new LogarithmicAxis("input size");

            XYPlot plot = chart.getXYPlot();
            plot.setDomainAxis(xAxis);

            XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer)plot.getRenderer();
            renderer.setSeriesShapesVisible(0, true);

            // Diagram megjelenitese
            showChart(chart);
        }
}
