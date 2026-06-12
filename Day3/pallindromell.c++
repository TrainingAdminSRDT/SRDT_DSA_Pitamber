#include <iostream>
#include <vector>
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

bool isPalindrome(Node* head) {
    vector<int> v;

    while (head) {
        v.push_back(head->data);
        head = head->next;
    }

    int i = 0, j = v.size() - 1;

    while (i < j) {
        if (v[i] != v[j])
            return false;
        i++;
        j--;
    }

    return true;
}

int main() {
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(2);
    head->next->next->next = new Node(1);

    cout << (isPalindrome(head) ? "Palindrome" : "Not a palindrome") << endl;

    Node* head2 = new Node(1);
    head2->next = new Node(2);
    head2->next->next = new Node(3);

    cout << (isPalindrome(head2) ? "Palindrome" : "Not a palindrome") << endl;

    return 0;
}
