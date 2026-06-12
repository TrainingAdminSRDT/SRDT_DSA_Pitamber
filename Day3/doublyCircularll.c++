#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* prev;
    Node* next;

    Node(int d) {
        data = d;
        prev = next = NULL;
    }
};

void insert(Node* &head, int d) {
    Node* temp = new Node(d);

    if (head == NULL) {
        head = temp;
        temp->next = temp;
        temp->prev = temp;
        return;
    }

    Node* tail = head->prev;

    tail->next = temp;
    temp->prev = tail;

    temp->next = head;
    head->prev = temp;
}

void print(Node* head) {
    if (head == NULL) return;
    Node* curr = head;
    do {
        cout << curr->data << " ";
        curr = curr->next;
    } while (curr != head);
    cout << endl;
}

int main() {
    Node* head = NULL;

    insert(head, 10);
    insert(head, 20);
    insert(head, 30);
    insert(head, 40);

    print(head);

    return 0;
}
