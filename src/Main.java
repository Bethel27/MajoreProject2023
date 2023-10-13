public class Main {
    public static void main(String[] args) {
        DataAnalyzer dataAnalyzer = new DataAnalyzer();
        dataAnalyzer.readDataFromFile("data.txt"); // Assume 'data.txt' contains the data

        var data = dataAnalyzer.getData();

        // Convert ArrayList to an array
        int[] dataArray = new int[data.size()];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i] = data.get(i);
        }

        // Sort the data using QuicksortSorter
        quicksortSorter quicksortSorter = new quicksortSorter();
        quicksortSorter.sort(dataArray);

        // Visualize the sorted data
        Visualizer visualizer = new Visualizer();
        visualizer.visualizeData(dataArray);
    }
}