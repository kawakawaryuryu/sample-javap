# sample-javap

## javacによるコンパイル
```bash
javac Main.java
```

## javapによる逆アセンブル
アセンブリのようなオペコードと命令が出力される
```bash
javap -c Main
```

出力結果例
```
Compiled from "Main.java"
public class Main {
  public Main();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String...);
    Code:
       0: new           #2                  // class Main
       3: dup
       4: invokespecial #3                  // Method "<init>":()V
       7: astore_1
       8: aload_1
       9: iconst_1
      10: iconst_2
      11: invokevirtual #4                  // Method add:(II)I
      14: istore_2
      15: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
      18: iload_2
      19: invokedynamic #6,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
      24: invokevirtual #7                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      27: return

  public int add(int, int);
    Code:
       0: iload_1
       1: iload_2
       2: iadd
       3: ireturn
}
```

## Javaバイトコード参考
- [Javaバイトコード - Wikipedia](https://ja.wikipedia.org/wiki/Java%E3%83%90%E3%82%A4%E3%83%88%E3%82%B3%E3%83%BC%E3%83%89)
- [Java仮想マシン - Wikipedia](https://ja.wikipedia.org/wiki/Java%E4%BB%AE%E6%83%B3%E3%83%9E%E3%82%B7%E3%83%B3)
