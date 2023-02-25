def adj_list(n, edges):
    graph = [[] for i in range(n)]
    for e in edges:
        a = e[0]
        b = e[1]
        graph[a].append(b)
        graph[b].append(a)
    return graph


class Queue:
    def __init__(self):
        '''Make a new empty queue'''
        self.q = []

    def enqueue(self, o):
        '''add o to the end of the queue'''
        self.q.append(o)

    def dequeue(self):
        '''remove the front element from the queue'''
        return self.q.pop(0)

    def front(self):
        '''return the front element from the queue'''
        return self.q[0]

    def isEmpty(self):
        return len(self.q) == 0

    def size(self):
        return len(self.q)


def bfs(graph, visited):
    q = Queue()
    q.enqueue(0)
    visited[0] = True
    while not q.isEmpty():
        current_node = q.front()
        print(current_node)
        q.dequeue()
        for node in graph[current_node]:
            if visited[node]:
                continue
            q.enqueue(node)
            visited[node] = True


n = 5
edges = [(0, 1),(0, 2),(0, 4),(1, 2),(1, 3),(2, 3)]

graph = adj_list(n, edges)
visited = [False for i in range(n)]

bfs(graph, visited)