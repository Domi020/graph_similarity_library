import networkx as nx
G1 = nx.Graph()
G1.add_node(1)
G1.add_node(2)
G1.add_node(3)
G1.add_edge(3, 2)
G1.add_edge(2, 3)
G2 = nx.Graph()
G2.add_node(1)
G2.add_node(2)
nx.graph_edit_distance(G1, G2)