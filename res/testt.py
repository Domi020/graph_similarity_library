import networkx as nx
G1 = nx.Graph()
G1.add_edge(1,2)
G1.add_node(3)
G2 = nx.Graph()
G2.add_edge(1,2)
print("hfdsfsf")
print(nx.graph_edit_distance(G1, G2))
