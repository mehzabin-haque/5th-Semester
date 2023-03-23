#include <iostream>
#include <vector>
#include <cmath>
#include <cstdlib>
#include <ctime>

using namespace std;

// Function to generate random data
vector<vector<double>> generateData(int n, int dim) {
    vector<vector<double>> data(n, vector<double>(dim, 0.0));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < dim; j++) {
            data[i][j] = rand() % 100;
        }
    }
    return data;
}

// Function to calculate Euclidean distance
double distance(vector<double> a, vector<double> b) {
    double dist = 0.0;
    for (int i = 0; i < a.size(); i++) {
        dist += pow(a[i] - b[i], 2);
    }
    return sqrt(dist);
}

// Function to find the nearest centroid
int findNearestCentroid(vector<double> point, vector<vector<double>> centroids) {
    double minDist = distance(point, centroids[0]);
    int index = 0;
    for (int i = 1; i < centroids.size(); i++) {
        double dist = distance(point, centroids[i]);
        if (dist < minDist) {
            minDist = dist;
            index = i;
        }
    }
    return index;
}
// Function to update the centroids of the clusters
vector<vector<double>> updateCentroids(vector<vector<vector<double>>>& clusters) {
    vector<vector<double>> newCentroids;
    for (int i = 0; i < clusters.size(); i++) {
        vector<double> centroid(clusters[i].size(), 0);
        for (int j = 0; j < clusters[i].size(); j++) {
            for (int k = 0; k < clusters[i][j].size(); k++) {
                centroid[k] += clusters[i][j][k];
            }
        }
        for (int k = 0; k < centroid.size(); k++) {
            centroid[k] /= clusters[i].size();
        }
        newCentroids.push_back(centroid);
    }
    return newCentroids;
}

// Function to perform K-means clustering
vector<vector<double>> kMeansClustering(vector<vector<double>> dataset, int k) {
    // Initialize the centroids randomly
    vector<vector<double>> centroids;
    for (int i = 0; i < k; i++) {
        centroids.push_back(dataset[rand() % dataset.size()]);
    }

    while (true) {
        // Create the clusters
        vector<vector<vector<double>>> clusters(k);
        for (int i = 0; i < dataset.size(); i++) {
            int index = findNearestCentroid(dataset[i], centroids);
            clusters[index].push_back(dataset[i]);
        }

        // Update the centroids
        vector<vector<double>> newCentroids = updateCentroids(clusters);

        // Check if the centroids have changed
        if (newCentroids == centroids) {
            break;
        }
        else {
            centroids = newCentroids;
        }
    }

    return centroids;
}

// Driver function
int main() {
    // Seed the random number generator
    srand(time(NULL));

    // Generate random data
    vector<vector<double>> dataset = generateData(100, 2);

    // Number of clusters
    int k = 3;

    // Perform K-means clustering
    vector<vector<double>> centroids = kMeansClustering(dataset, k);

   for (int i = 0; i < centroids.size(); i++) {
        cout << "Centroid " << i << ": ";
        for (int j = 0; j < centroids[i].size(); j++) {
            cout << centroids[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}