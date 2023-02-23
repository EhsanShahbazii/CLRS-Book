## روابط بازگشتی

یک رابطه بازگشتی برای فاکتوریل به صورت زیر است:
```pseudocode
fact(n) {
  if (n == 0)
    return 1;
  else
    return n * fact(n - 1);
}
```
که رابطه بازگشتی آن به صورت زیر می باشد.
```math
T( n) =\begin{cases}
0 & n=0\\
1\ +\ T( n-1) & n\geqslant 1
\end{cases}
```
