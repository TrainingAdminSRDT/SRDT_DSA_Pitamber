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

bool hasCycle(Node *head) {
    Node* slow = head;
    Node* fast = head;

    while (fast && fast->next) {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast)
            return true;
    }

    return false;
}

int main() {
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = head->next;

    cout << (hasCycle(head) ? "Cycle detected" : "No cycle") << endl;

    Node* head2 = new Node(1);
    head2->next = new Node(2);
    head2->next->next = new Node(3);

    cout << (hasCycle(head2) ? "Cycle detected" : "No cycle") << endl;

    return 0;
}
