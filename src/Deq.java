class Deq extends Queue {

    public Deq(int capacity) {
        super(capacity);
    }
    public Deq() {
        super();
    }
    // Вернуть индекс предыдущего элемента
    private int backward(int index) {
        index--;
        if (index < 0) {
            index = array.length - 1;
        }
        return index;
    }
    // Добавить число в начало дека
    public void pushFront(int val) {
        if (size == array.length) {
            return;
        }

        head = backward(head);
        array[head] = val;
        size++;
    }
    // Добавить число в конец дека
    public void pushBack(int val)  {
        if (size == array.length) {
            return;
        }

        tail = forward(tail);
        array[tail] = val;
        size++;
    }
    // Удалить первый элемент дека
    public int popFront() throws Exception {
        int val = front();

        head = forward(head);
        size--;

        return val;
    }
    // Удалить последний элемент дека
    public int popBack() throws Exception {
        int val = back();

        tail = backward(tail);
        size--;
        return val;
    }
    // Получить первый элемент дека
    public int front() throws Exception {
        if (empty()) {
            throw new Exception();
        }
        return array[head];
    }
    // Получить последний элемент дека
    public int back() throws Exception {
        if (empty()) {
            throw new Exception();
        }
        return array[tail];
    }
}