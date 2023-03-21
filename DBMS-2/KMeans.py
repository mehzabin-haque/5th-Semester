import numpy as np
import matplotlib.pyplot as plt

# Generate random sample data
np.random.seed(123)
num_samples = 100
X = np.random.rand(num_samples, 2)

# Set the number of clusters
k = 3

# Initialize the centroids randomly
centroids = X[np.random.choice(X.shape[0], k, replace=False)]

# Initialize the labels
labels = np.zeros(X.shape[0])

#main algo
for i in range(10):
    # Assign each data point to the nearest centroid
    for j in range(X.shape[0]):
        distances = np.linalg.norm(X[j] - centroids, axis=1)
        labels[j] = np.argmin(distances)
    
    # Update the centroids to be the mean of the data points in each cluster
    for j in range(k):
        centroids[j] = np.mean(X[labels == j], axis=0)

# Plot the data points with different colors for each cluster
colors = ['r', 'g', 'b']
for i in range(len(X)):
    plt.scatter(X[i,0], X[i,1], c=colors[int(labels[i])])

# Plot the centroids as black circles
for i in range(len(centroids)):
    plt.scatter(centroids[i,0], centroids[i,1], marker='o', c='k', s=100)

# Set the x and y axis limits
plt.xlim(0, 1)
plt.ylim(0, 1)

# Show the plot
plt.show()
