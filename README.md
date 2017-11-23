# Алгоритмы

## Структура данных 
Структура данных — программная единица, позволяющая хранить и обрабатывать множество однотипных и/или логически связанных данных в вычислительной технике. Для добавления, поиска, изменения и удаления данных структура данных предоставляет некоторый набор функций, составляющих её интерфейс.

Link [wiki][data-structure-wiki].

### Список (List)
Связный список — базовая динамическая структура данных в информатике, состоящая из узлов, каждый из которых содержит как собственно данные, так и одну или две ссылки («связки») на следующий и/или предыдущий узел списка. Принципиальным преимуществом перед массивом является структурная гибкость: порядок элементов связного списка может не совпадать с порядком расположения элементов данных в памяти компьютера, а порядок обхода списка всегда явно задаётся его внутренними связями.

Link [wiki][list-wiki].

#### Односвязный список
![alt text][list-one-image] 

Линейный однонаправленный список — это структура данных, состоящая из элементов одного типа, связанных между собой последовательно посредством указателей. Каждый элемент списка имеет указатель на следующий элемент. Последний элемент списка указывает на NULL. Элемент, на который нет указателя, является первым (головным) элементом списка. Здесь ссылка в каждом узле указывает на следующий узел в списке. В односвязном списке можно передвигаться только в сторону конца списка. Узнать адрес предыдущего элемента, опираясь на содержимое текущего узла, невозможно.

#### Двусвязный список 
![alt text][list-two-image]

Здесь ссылки в каждом узле указывают на предыдущий и на последующий узел в списке. Как и односвязный список, двусвязный допускает только последовательный доступ к элементам, но при этом дает возможность перемещения в обе стороны. В этом списке проще производить удаление и перестановку элементов, так как легко доступны адреса тех элементов списка, указатели которых направлены на изменяемый элемент.

#### Кольцевой связный список 
![alt text][list-ring-image]

Разновидностью связных списков является кольцевой (циклический, замкнутый) список. Он тоже может быть односвязным или двусвязным. Последний элемент кольцевого списка содержит указатель на первый, а первый (в случае двусвязного списка) — на последний. Как правило, такая структура реализуется на базе линейного списка. С каждым кольцевым списком дополнительно хранится указатель на первый элемент. В этом списке ссылки на NULL не встречается.

### Очередь (Queue)
![alt text][queue-image]

Очередь — абстрактный тип данных с дисциплиной доступа к элементам «первый пришёл — первый вышел» (FIFO, First In — First Out). Добавление элемента (принято обозначать словом enqueue — поставить в очередь) возможно лишь в конец очереди, выборка — только из начала очереди (что принято называть словом dequeue — убрать из очереди), при этом выбранный элемент из очереди удаляется.

Link [wiki][queue-wiki].

### Стек (Stack)
![alt text][stack-image]

Стек (англ. stack — стопка; читается стэк) — абстрактный тип данных, представляющий собой список элементов, организованных по принципу LIFO (англ. last in — first out, «последним пришёл — первым вышел»).
Чаще всего принцип работы стека сравнивают со стопкой тарелок: чтобы взять вторую сверху, нужно снять верхнюю.

Link [wiki][stack-wiki].

### Куча (Heap)
![alt text][heap-image]

В компьютерных науках куча — это специализированная структура данных типа дерево, которая удовлетворяет свойству кучи: если B является узлом-потомком узла A, то ключ(A) ≥ ключ(B). Из этого следует, что элемент с наибольшим ключом всегда является корневым узлом кучи, поэтому иногда такие кучи называют max-кучами (в качестве альтернативы, если сравнение перевернуть, то наименьший элемент будет всегда корневым узлом, такие кучи называют min-кучами). Не существует никаких ограничений относительно того, сколько узлов-потомков имеет каждый узел кучи, хотя на практике их число обычно не более двух. Куча является максимально эффективной реализацией абстрактного типа данных, который называется очередью с приоритетом. Кучи имеют решающее значение в некоторых эффективных алгоритмах на графах, таких, как алгоритм Дейкстры на d-кучах и сортировка методом пирамиды.

Link [wiki][heap-wiki].

## Сортировки
### Пузырьковая
## Перевод систем исчисления
## Динамическое программирование

[data-structure-wiki]: https://ru.wikipedia.org/wiki/Структура_данных
[list-wiki]: https://ru.wikipedia.org/wiki/Связный_список
[queue-wiki]: https://ru.wikipedia.org/wiki/Очередь_(программирование)
[stack-wiki]: https://ru.wikipedia.org/wiki/Стек
[heap-wiki]: https://ru.wikipedia.org/wiki/Куча_(структура_данных)

[list-one-image]: https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Single_linked_list.png/800px-Single_linked_list.png "Single linked"
[list-two-image]: https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Doubly_linked_list.png/800px-Doubly_linked_list.png "Doubly linked"
[list-ring-image]: https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Circurlar_linked_list.png/800px-Circurlar_linked_list.png "Circurlar linked"
[queue-image]: https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Data_Queue.svg/440px-Data_Queue.svg.png "Queue"
[stack-image]: https://upload.wikimedia.org/wikipedia/commons/2/23/Stack_preview.png "Stack"
[heap-image]: https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Max-Heap.svg/480px-Max-Heap.svg.png "Heap"
