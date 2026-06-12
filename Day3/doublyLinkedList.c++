#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* prev;
    Node* next;

    Node(int d) {
        data = d;
        prev = NULL;
        next = NULL;
    }
};

void insertAtHead(Node* &head, int d) {
    Node* temp = new Node(d);

    if (head == NULL) {
        head = temp;
        return;
    }

    temp->next = head;
    head->prev = temp;
    head = temp;
}

void insertAtTail(Node* &tail, int d) {
    Node* temp = new Node(d);

    tail->next = temp;
    temp->prev = tail;
    tail = temp;
}

void print(Node* head) {
    while (head) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    Node* head = NULL;
    Node* tail = NULL;

    insertAtHead(head, 10);
    tail = head;
    insertAtHead(head, 20);
    insertAtHead(head, 30);

    print(head);

    insertAtTail(tail, 40);
    insertAtTail(tail, 50);

    print(head);

    return 0;
}
