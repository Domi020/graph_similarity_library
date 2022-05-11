import networkx as nx
import matplotlib.pyplot as plt
G1 = nx.Graph()
G1.add_node(0)
G1.add_node(1)
G1.add_node(2)
G1.add_node(3)
G1.add_node(4)
G1.add_node(5)
G1.add_node(6)
G1.add_node(7)
G1.add_edge(4, 2)
G1.add_edge(1, 0)
G1.add_edge(5, 2)
G1.add_edge(3, 4)
G1.add_edge(6, 4)
G1.add_edge(3, 0)
G1.add_edge(7, 1)
G1.add_edge(2, 1)
G1.add_edge(0, 1)
G1.add_edge(0, 2)
G1.add_edge(7, 2)
G1.add_edge(3, 1)
G1.add_edge(2, 4)
G1.add_edge(1, 2)
G1.add_edge(4, 6)
G1.add_edge(4, 3)
G1.add_edge(1, 3)
G1.add_edge(1, 7)
G1.add_edge(6, 1)
G1.add_edge(3, 7)
G1.add_edge(7, 3)
G1.add_edge(2, 5)
G1.add_edge(1, 6)
G1.add_edge(0, 3)
G1.add_edge(2, 0)
G1.add_edge(2, 7)
G1.add_edge(0, 6)
G1.add_edge(6, 0)
G2 = nx.Graph()
G2.add_node(0)
G2.add_node(1)
G2.add_node(2)
G2.add_node(3)
G2.add_node(4)
G2.add_node(5)
G2.add_node(6)
G2.add_node(7)
G2.add_edge(4, 2)
G2.add_edge(1, 0)
G2.add_edge(5, 2)
G2.add_edge(3, 4)
G2.add_edge(6, 4)
G2.add_edge(3, 0)
G2.add_edge(7, 1)
G2.add_edge(2, 1)
G2.add_edge(0, 1)
G2.add_edge(0, 2)
G2.add_edge(7, 2)
G2.add_edge(3, 1)
G2.add_edge(2, 4)
G2.add_edge(1, 2)
G2.add_edge(4, 6)
G2.add_edge(4, 3)
G2.add_edge(1, 3)
G2.add_edge(1, 7)
G2.add_edge(6, 1)
G2.add_edge(3, 7)
G2.add_edge(7, 3)
G2.add_edge(2, 5)
G2.add_edge(1, 6)
G2.add_edge(0, 3)
G2.add_edge(2, 0)
G2.add_edge(2, 7)
G2.add_edge(0, 6)
G2.add_edge(6, 0)
plt.figure(1)
nx.draw(G1)
plt.figure(2)
nx.draw(G2)
plt.show()