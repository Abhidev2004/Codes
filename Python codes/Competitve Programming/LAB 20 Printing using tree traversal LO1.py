class Node:
    def __init__(self, name):
        self.name=name
        self.left=None
        self.right=None

def preorder(root):
    if root:
        print(root.name, end=" ")
        preorder(root.left)
        preorder(root.right)

n= int(input())

nodes ={}

for _ in range(n):
    node, l, r = map(int, input().split())

    if node not in nodes:
        nodes[node] = Node(node)

    if l != -1:
        nodes[l] = Node(l)
        nodes[node].left = nodes[l]

    if r != -1:
        nodes[r] = Node(r)
        nodes[node].right = nodes[r]

root = nodes[1]
print("File Traversal(Preorder)")
preorder(root)