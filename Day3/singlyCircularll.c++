#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int d) {
        data = d;
        next = NULL;
    }
};

void insertNode(Node* &tail, int element, int d) {
    if (tail == NULL) {
        Node* newNode = new Node(d);
        tail = newNode;
        newNode->next = newNode;
        return;
    }

    Node* curr = tail;

    do {
        if (curr->data == element) {
            Node* temp = new Node(d);
            temp->next = curr->next;
            curr->next = temp;
            return;
        }
        curr = curr->next;
    } while (curr != tail);
}

void print(Node* tail) {
    if (tail == NULL) return;
    Node* curr = tail->next;
    do {
        cout << curr->data << " ";
        curr = curr->next;
    } while (curr != tail->next);
    cout << endl;
}

int main() {
    Node* tail = NULL;

    insertNode(tail, 0, 10);
    insertNode(tail, 10, 20);
    insertNode(tail, 20, 30);
    insertNode(tail, 20, 25);

    print(tail);

    return 0;
}
