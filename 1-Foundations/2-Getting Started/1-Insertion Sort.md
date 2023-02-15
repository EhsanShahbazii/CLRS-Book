## 1. مرتب سازی درجی

شبه کد مرتب سازی درجی یا همان `insertion-sort` به صورت زیر است.
```pseudocode
INSERTION-SORT(A)
1 for j = 2 to A:length
2   key = A[j]
3     // Insert A[j] into the sorted sequence A[1 ..j - 1].
4     i = j - 1
5     while i > 0 and A[i] > key
6       A[i + 1] = A[i]
7       i = i - 1
8     A[i + 1] = key
```
در شکل زیر نیز مرتب سازی درجی و منطق آن توضیح داده شده است:

![1-Insertion%20Sort 2-1-1](https://ehsan.storage.iran.liara.space/git-hub/CLRS-Book/%201-Foundations/%202-Getting%20Started/1-Insertion%20Sort/2-1-1.png)

### تحلیل پیچیدگی الگوریتم مرتب سازی درجی
- بدترین عملکرد `O(n^2)`
- بهترین عملکرد `O(n)`
- میانگین عملکرد `O(n^2)`
- بدترین پیچیدگی حافظه ای `O(n)`

### پیاده سازی مرتب سازی درجی
مرتب سازی درجی را می توانیم به صورت زیر با زبان جاوا پیاده سازی کنیم:
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 1, 2, 4, 0, 0, 5, 6, 8, 9};
        int key, i;
        for (int j = 1; j < data.length; j++) {
            key = data[j];
            i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        System.out.println(Arrays.toString(data));
    }
}
```
که خروجی این کد به صورت زیر می باشد:
```console
UnSorted: 1, 1, 2, 4, 0, 0, 5, 6, 8, 9
Sorted: 0, 0, 1, 1, 2, 4, 5, 6, 8, 9
```

### منابع اضافه جهت مطالعه
- [Wikipedia Insertion Sort](https://en.wikipedia.org/wiki/Insertion_sort)
