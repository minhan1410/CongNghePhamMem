1. 
```java
public static double[] PTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0 && c != 0) {
                return null;
            }
            if (c == 0) {
                return new double[] { 0 };
            }
            return new double[] { -c / b };
        }

        if (a + b + c == 0) {
            return new double[] { 1, c / a };
        } else if (a - b + c == 0) {
            return new double[] { -1, -c / a };
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0)
            return null;
        else if (delta == 0) {
            return new double[] { -b / (2 * a), -b / (2 * a) };
        }

        return new double[] { (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a) };
    }
```

2. Sử dụng hàm sqrt() trong java.lang.Math

3. Khi dùng sqrt() cần lưu ý:
* Nếu đối số là NaN hoặc nhỏ hơn 0, thì kết quả là NaN.
* Nếu đối số là infinity, thì kết quả là infinity.

4. Nó có thể tái sủ dụng

5. Cần lưu ý: 
* Chương trình không thể tính những phương trình có hệ số lớn`(hệ số < căn(Double.MAX_VALUE))`
* Nếu hàm trả về null thì phương trình vô nghiệm